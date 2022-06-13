ANTLR4=java -Xmx500M -cp /usr/local/sw/versions/antlr/4/4.10.1/antlr-4.10.1-complete.jar:$$CLASSPATH org.antlr.v4.Tool
GRUN=java -Xmx500M -cp .:/usr/local/sw/versions/antlr/4/4.10.1/antlr-4.10.1-complete.jar:$$CLASSPATH org.antlr.v4.gui.TestRig
JAVAC=javac -cp .:/usr/local/sw/versions/antlr/4/4.10.1/antlr-4.10.1-complete.jar:$$CLASSPATH

# To complicated to start with: /home/tkb/current/Oberon/compiler/src/MOBP.Mod
# Simpler: test.obn
MODULE=../test.tnoo

all: TNOOParser.class

TNOOParser.java : TNOO.g4
	$(ANTLR4) $<

TNOOParser.class : TNOOParser.java
	$(JAVAC) *.java

tokens: $(MODULE) TNOOParser.class
	$(GRUN) TNOO module -tokens <$<


tree: $(MODULE) TNOOParser.class
	$(GRUN) TNOO module -tree <$<

gui: $(MODULE) TNOOParser.class
	$(GRUN) TNOO module -gui <$<

clean:
	- rm *.java *.class *.lis *.interp *.tokens
