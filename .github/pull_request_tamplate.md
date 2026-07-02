# Descripción

Este Pull Request agrega la carpeta **Ejemplo**, la cual contiene una implementación mínima para verificar el funcionamiento de ANTLR con Python dentro del entorno Docker del proyecto.

El ejemplo permite generar el lexer y parser a partir de una gramática de prueba y validar el análisis léxico mediante un programa en Python.

---

# Cambios realizados

- Se agregó la carpeta `Ejemplo`.
- Se incorporó la gramática `Expr.g4`.
- Se agregó el archivo `main.py` para probar el lexer generado.
- Se verificó la generación de archivos mediante ANTLR.
- Se validó el funcionamiento del runtime de ANTLR para Python.

---

# Evidencias

## Generación del lexer

Comando ejecutado:

```bash
antlr4 -Dlanguage=Python3 Expr.g4
```

Resultado esperado:

```text
ExprLexer.py
ExprParser.py
ExprListener.py
Expr.tokens
Expr.interp
```

> 📷 Agregar aquí una captura donde se observe la generación de los archivos.

---

## Ejecución del programa

Comando ejecutado:

```bash
python main.py
```

Entrada utilizada:

```text
if > 25 hola
```

Salida esperada:

```text
Texto : if
Tipo : IF

Texto : >
Tipo : MAYOR_QUE

Texto : 25
Tipo : NUM

Texto : hola
Tipo : ID
```

> 📷 Agregar una captura de la salida del programa.

---

# Checklist

- [x] El proyecto compila correctamente.
- [x] La gramática se genera sin errores.
- [x] El programa de prueba ejecuta correctamente.
- [x] No se modificó código fuera del alcance de este PR.
- [x] Se realizaron pruebas locales.
- [x] La documentación fue actualizada (si aplica).

---

# Revisor(es)

- @NombreDelRevisor

---

# Comentarios adicionales

No se detectaron incidencias durante las pruebas realizadas.