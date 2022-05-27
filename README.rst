tnolang, Totally Not Oberon computer language
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

This is a computer language that is Totally Not Oberon, but is
inspired by it and Oberon-2, although the current syntax is inspired
more by Algol-68.

Right now I'm just working on the syntax.  I'm developing the syntax
in both ANTLR4_ and `Coco/R`_ because I plan to write the first
compiler in Go_ using LLVM_ for the back end, but would still like to
be able to develop a single pass recursive descent direct code
generation compiler in the style_ of Niklaus Wirth (N1_, N2_) later on,
so the syntax needs to be LL(1)ish.

.. _ANTLR4: https://www.antlr.org/
.. _Coco/R: https://ssw.jku.at/Research/Projects/Coco/
.. _Go: https://go.dev/
.. _LLVM: https://llvm.org/
.. _style: https://www.researchgate.net/publication/221350529_Compiler_Construction_-_The_Art_of_Niklaus_Wirth
.. _N1: https://people.inf.ethz.ch/wirth/
.. _N2: https://en.wikipedia.org/wiki/Niklaus_Wirth
