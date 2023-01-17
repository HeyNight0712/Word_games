@echo off

cd src
javac -encoding UTF-8 main.java
java -Dfile.encoding=UTF-8 main

del /F /S %cd%\*.class

pause