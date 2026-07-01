FROM python:3.12-slim

# Directorio de trabajo
WORKDIR /workspace

# Versión de ANTLR
ENV ANTLR_VERSION=4.13.2

# Instalar dependencias
RUN apt-get update && \
    apt-get install -y --no-install-recommends \
        default-jdk \
        curl \
        git \
        bash \
        nano \
        vim && \
    rm -rf /var/lib/apt/lists/*

# Descargar ANTLR
RUN curl -L https://www.antlr.org/download/antlr-${ANTLR_VERSION}-complete.jar \
    -o /usr/local/lib/antlr.jar

# Crear entorno virtual
RUN python -m venv /opt/venv

# Instalar runtime de Python
RUN /opt/venv/bin/pip install --no-cache-dir --upgrade pip && \
    /opt/venv/bin/pip install --no-cache-dir antlr4-python3-runtime

# Agregar el venv al PATH
ENV PATH="/opt/venv/bin:${PATH}"

# Variables para Java
ENV CLASSPATH=".:/usr/local/lib/antlr.jar"

# Comando antlr4
RUN printf '#!/bin/sh\nexec java -jar /usr/local/lib/antlr.jar "$@"\n' \
    > /usr/local/bin/antlr4 && \
    chmod +x /usr/local/bin/antlr4

# Mantener vivo el contenedor
CMD ["tail", "-f", "/dev/null"]