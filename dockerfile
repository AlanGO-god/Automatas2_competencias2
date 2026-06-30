FROM python:3.12-slim

WORKDIR /workspace

# Instalar Java y curl
RUN apt-get update && \
    apt-get install -y default-jdk curl && \
    rm -rf /var/lib/apt/lists/*

# Descargar ANTLR
RUN curl -L https://www.antlr.org/download/antlr-4.13.2-complete.jar \
    -o /usr/local/lib/antlr.jar

# Crear entorno virtual
RUN python -m venv /opt/venv

# Instalar runtime de ANTLR en el venv
RUN /opt/venv/bin/pip install --upgrade pip && \
    /opt/venv/bin/pip install antlr4-python3-runtime

# Agregar el venv al PATH
ENV PATH="/opt/venv/bin:$PATH"

CMD ["tail", "-f", "/dev/null"]