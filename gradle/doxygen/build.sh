#!/bin/sh


cat "${1}" | grep -v "#"  | grep -v -e '^$' > Doxyfile
