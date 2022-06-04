COCOR=Coco

tnoo: tnoo.cpp Parser.cpp
	g++ -o $@ *.cpp

Parser.cpp: TNOO.atg Parser.frame Scanner.frame
	$(COCOR) TNOO.atg

check: TNOO.atg tnoo ../test.tnoo
	./tnoo ../test.tnoo

clean:
	-rm {Parser,Scanner}.cpp *.h *.old tnoo
