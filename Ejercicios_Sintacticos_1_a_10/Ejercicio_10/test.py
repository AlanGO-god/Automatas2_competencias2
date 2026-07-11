from antlr4 import*
from ExprLexer import ExprLexer
from ExprParser import ExprParser

entrada = input("Codigo: ")
lexer = ExprLexer(InputStream(entrada))
tokens = CommonTokenStream(lexer)
parser = ExprParser(tokens)
arbol = parser.root()

if parser.getNumberOfSyntaxErrors() == 0:
    print("El codigo es correcto")
    print("Árbol: ")
    print(arbol.toStringTree(recog=parser))
else:
    print("El código es incorrecto.")