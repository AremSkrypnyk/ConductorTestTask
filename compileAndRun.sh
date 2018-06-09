#!/bin/sh
mkdir -p -m a=rwx bin
javac -sourcepath ./src -d bin src/main/java/Main.java
java -classpath ./bin main.java.Main
