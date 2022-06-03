COCOR=Coco

tnoa: tnoa.cpp Parser.cpp
	g++ -o $@ *.cpp

Parser.cpp: TNOA.atg Parser.frame Scanner.frame
	$(COCOR) TNOA.atg

check: TNOA.atg tnoa ../module.tnoa
	./tnoa ../module.tnoa

clean:
	-rm {Parser,Scanner}.cpp *.h *.old tnoa
