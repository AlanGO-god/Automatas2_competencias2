# Generated from Expr.g4 by ANTLR 4.13.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,29,10,2,0,7,0,2,1,7,1,1,0,1,0,1,0,1,1,1,1,1,1,0,0,2,0,2,0,0,
        7,0,4,1,0,0,0,2,7,1,0,0,0,4,5,3,2,1,0,5,6,5,0,0,1,6,1,1,0,0,0,7,
        8,5,0,0,1,8,3,1,0,0,0,0
    ]

class ExprParser ( Parser ):

    grammarFileName = "Expr.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'nmap'", "<INVALID>", "'|'", "'sudo'", 
                     "'ss'", "'-tuln'", "'tcpdump'", "<INVALID>", "'grep'", 
                     "'curl'", "'-I'", "'dig'", "'MX'", "'/'", "'/24'", 
                     "'journalcd'", "'--since'", "'today'", "'\"'", "'ufw'", 
                     "'deny'", "'from'" ]

    symbolicNames = [ "<INVALID>", "NMAP", "NMAP_OPTION", "VERTICAL_BAR", 
                      "SUDO", "SS", "SS_OPTION", "TCPDUMP", "TCPDUMP_OPTION", 
                      "GREP", "CURL", "CURL_OPTIONS", "DIG", "MX", "DIAGONAL", 
                      "MASCARA_SUBRED", "JOURNALCD", "JOURNALCD_OPTION", 
                      "JOURNALCD_ARGUMENT", "COMILLAS_DOBLES", "UFW", "UFW_ACTIONS", 
                      "FROM", "RUTA_ARCHIVO", "IP", "DOMINIO", "NUMBER", 
                      "STRING", "ID", "WS" ]

    RULE_root = 0
    RULE_expr = 1

    ruleNames =  [ "root", "expr" ]

    EOF = Token.EOF
    NMAP=1
    NMAP_OPTION=2
    VERTICAL_BAR=3
    SUDO=4
    SS=5
    SS_OPTION=6
    TCPDUMP=7
    TCPDUMP_OPTION=8
    GREP=9
    CURL=10
    CURL_OPTIONS=11
    DIG=12
    MX=13
    DIAGONAL=14
    MASCARA_SUBRED=15
    JOURNALCD=16
    JOURNALCD_OPTION=17
    JOURNALCD_ARGUMENT=18
    COMILLAS_DOBLES=19
    UFW=20
    UFW_ACTIONS=21
    FROM=22
    RUTA_ARCHIVO=23
    IP=24
    DOMINIO=25
    NUMBER=26
    STRING=27
    ID=28
    WS=29

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class RootContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expr(self):
            return self.getTypedRuleContext(ExprParser.ExprContext,0)


        def EOF(self):
            return self.getToken(ExprParser.EOF, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_root

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterRoot" ):
                listener.enterRoot(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitRoot" ):
                listener.exitRoot(self)




    def root(self):

        localctx = ExprParser.RootContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_root)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 4
            self.expr()
            self.state = 5
            self.match(ExprParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(ExprParser.EOF, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_expr

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpr" ):
                listener.enterExpr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpr" ):
                listener.exitExpr(self)




    def expr(self):

        localctx = ExprParser.ExprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_expr)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 7
            self.match(ExprParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





