ANTLR4=java -Xmx500M -cp /usr/local/sw/versions/antlr/4/4.10.1/antlr-4.10.1-complete.jar:$$CLASSPATH org.antlr.v4.Tool
GRUN=java -Xmx500M -cp .:/usr/local/sw/versions/antlr/4/4.10.1/antlr-4.10.1-complete.jar:$$CLASSPATH org.antlr.v4.gui.TestRig
JAVAC=javac -cp .:/usr/local/sw/versions/antlr/4/4.10.1/antlr-4.10.1-complete.jar:$$CLASSPATH

all: TNOAParser.class

TNOAParser.java : TNOA.g4
	$(ANTLR4) $<

TNOAParser.class : TNOAParser.java
	$(JAVAC) *.java

check: ../module.tnoa TNOAParser.class
	$(GRUN) TNOA module -tree <$<

gui: ../module.tnoa TNOAParser.class
	$(GRUN) TNOA module -gui <$<

clean:
	- rm *.java *.class *.lis *.interp *.tokens
