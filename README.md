# Entorno de Desarrollo para ANTLR con Docker

Este proyecto proporciona un entorno de desarrollo reproducible para trabajar con **ANTLR 4** utilizando **Python** como lenguaje de destino, todo dentro de un contenedor Docker.

El objetivo es evitar la instalación manual de dependencias en el sistema operativo y garantizar que todos los integrantes del proyecto trabajen con la misma configuración.

---

## Tecnologías utilizadas

- Docker
- Docker Compose
- Python 3.12
- Java JDK
- ANTLR 4.13.2
- ANTLR Python Runtime

---

## Requisitos

Antes de comenzar, asegúrate de tener instalado:

- Docker Desktop
- Docker Compose
- Visual Studio Code (opcional)
- Extensión **Dev Containers** para Visual Studio Code (opcional)

---

## Estructura del proyecto

```text
.
├── Dockerfile
├── docker-compose.yml
├── Ejemplo/
│   ├── Expr.g4
│   ├── main.py
│   └── ...
└── ...
```

---

## Construcción del entorno

Construir la imagen del proyecto:

```bash
docker compose build
```

Levantar el contenedor:

```bash
docker compose up -d
```

Acceder al contenedor:

```bash
docker compose exec antlr bash
```

O mediante devContainer: 

**SHIFT + CONTROL + P**

Seleccionar la opcion "*Attach to Running Container*"

---

## Generar el lexer y parser

Ubicarse en la carpeta donde se encuentra la gramática:

```bash
cd Ejemplo
```

Generar los archivos de ANTLR para Python:

```bash
antlr4 -Dlanguage=Python3 Expr.g4
```

Esto generará automáticamente archivos como:

- ExprLexer.py
- ExprParser.py
- ExprListener.py
- Expr.tokens
- Expr.interp

---

## Ejecutar el ejemplo

Una vez generados los archivos, ejecutar:

```bash
python main.py
```

El programa solicitará una entrada desde la consola y mostrará la lista de tokens reconocidos por el lexer.

Ejemplo de entrada:

```text
if > 25 hola
```

---

## Objetivo del ejemplo

La carpeta **Ejemplo** tiene como finalidad comprobar que:

- ANTLR está correctamente instalado.
- La gramática puede compilarse sin errores.
- Se generan correctamente el lexer y el parser para Python.
- El runtime de ANTLR funciona correctamente.
- Es posible analizar una entrada y visualizar los tokens obtenidos.

Este ejemplo sirve como referencia para el desarrollo de futuras gramáticas dentro del proyecto.

---

## Ventajas del entorno

- No requiere instalar Java ni ANTLR en el sistema operativo.
- Todas las dependencias se encuentran dentro del contenedor Docker.
- Los archivos del proyecto permanecen sincronizados entre el host y el contenedor mediante volúmenes.
- El entorno puede reproducirse fácilmente en cualquier equipo utilizando Docker Compose.
