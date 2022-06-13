COCOR=Coco

oberon2: oberon2.cpp Parser.cpp
	g++ -o $@ *.cpp

Parser.cpp: Oberon2.atg Parser.frame Scanner.frame
	$(COCOR) Oberon2.atg

check: Oberon2.atg oberon2 ../test.oberon2
	./oberon2 ../test.oberon2

clean:
	-rm {Parser,Scanner}.cpp *.h *.old oberon2
