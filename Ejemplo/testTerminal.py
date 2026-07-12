from antlr4 import*
from ExprLexer import ExprLexer
import sys

#leer archivos
lexer = ExprLexer(InputStream(input("? ")))

#por terminal
lexer = ExprLexer(intput_stream)

tokens = CommonTokenStream(lexer)
tokens.fill()
print(tokens)

for token in tokens.tokens:
    print("Texto :", token.text)
    print("Linea :", token.line)
    print("Columna :", token.column)
    nombre_token = lexer.symbolicNames[token.type]
    print("Tipo ", nombre_token)
    print("----------------------")