#!/usr/bin/env bash

rm -f src/com/timmattison/Main.class && javac src/com/timmattison/Main.java && java -cp src com/timmattison/Main && rm src/com/timmattison/Main.class
