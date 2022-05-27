COCOR=/usr/local/sw/src/CocoR/CocoR-CPP/src/Coco



tnoa: tnoa.cpp Parser.cpp
	g++ -o $@ *.cpp

Parser.cpp: TNOA.ATG Parser.frame Scanner.frame
	$(COCOR) TNOA.ATG

check: TNOA.ATG tnoa ../module.tnoa
	./tnoa ../module.tnoa

clean:
	-rm {Parser,Scanner}.cpp *.h *.old tnoa
