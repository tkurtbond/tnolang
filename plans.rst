Plans for Totally Not Oberon
@@@@@@@@@@@@@@@@@@@@@@@@@@@@

TNOO - Totally Not Oberon, Oberon Syntax
========================================

Relatively simple language, like Oberon-2 in surface syntax, with type
extension and type bound procedures, but with Modula-3 structural type
equivalence, initializers, and structured literals.

TNOA - Totally Not Oberon, Algol-68ish Syntax
=============================================

Algol-68ish syntax, but simpler.  Terse type declarations.

General Plans
=============

Considering
-----------

1.  UTF-8
2.  Exceptions


Adopted
-------

1.  Structured literals.  ``TYPENAME { ... }``  Or should it just be TYPE?
2.  Initializers. ``VAR i, j: INTEGER := 0;`` sets ``i`` and ``j`` to zero.
3.  Structural type equivalence.

Questions
---------

1.  Does Modula-3 allow you to return arrays from procedures?


Not Adopted
-----------

1.  Allow compound blocks in expressions.  They'd have to return a
    result (add keyword ``RESULT``?), and {} is already used for
    structure initializations, and I'm not sure the added
    expressiveness is worth the extra complication.  
2.  Modula-3 style ARRAYs would be nice (``ARRAY [-10..10,-10..10] OF
    INTEGER``), but those depends on ranges and would make things more
    complicated.  Oberon's ``ARRAY 10, 10 OF INTEGER`` will work
    fine. 



TNOAA Ambitions
---------------

1.  Dynamic strings (ARRAY OF CHAR) and other ARRAYs.
2.  Tables/Dictionaries.


