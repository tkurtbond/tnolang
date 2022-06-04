#include <stdlib.h>
#include <stdio.h>
#include "Scanner.h"
#include "Parser.h"

int
main (int argc, char **argv)
{
  wchar_t *ddtString = coco_string_create ("012345789");

  if (argc != 2) {
    fprintf (stderr, "usage: %s file\n", argv[0]);
    exit (1);
  }

  wchar_t *srcName = coco_string_create(argv[1]);

  Scanner *scanner = new Scanner(srcName);
  Parser  *parser  = new Parser(scanner);

  parser->Parse();

  delete parser;
  delete scanner;
  coco_string_delete(srcName);

  exit (0);
}
