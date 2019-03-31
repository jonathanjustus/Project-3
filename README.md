# Project-3

Main Class:

Import Statements:
java.io.IOException
java.util.HashMap

Variables Created:
String StID
MesoAscii AsciiAverage
int AsciiAvg
HashMap<String, Integer> AsciiValues
MesoEqual mesoequal
String stid

This class utilizes the the other methods to basically drive the program. The spefic output of the main class is 
given in the Project 3 Description. The functions within this class are to print out the ASCII average values, the 
Stations according to the respective purpose.

MesoAscii Class:
*extends MesoAsciiAbstract Class
 
Instance Variable:
MesoStation mesoStation

Variables Created:
int intAvg
double asciiAdded
String mesoID
int i
double asciiAvg
int asciiCeiling
int asciiFloor

This class calculates the decimal value of the average ASCII values along with the floor and ceiling values. The return, intAvg
is determined by "if ((Math.abs(asciiAvg - asciiCeiling)) <= (Math.abs(asciiFloor - asciiAvg)))" in this case the ceiling 
would be returned. Else the floor assignned to be returned.

MesoAsciiAbstract Class:
Not much to explain here about the abstract class of MesoAscii that contains the abstract method calAverage()

MesoEqual Class:

Import Statements:
java.io.FileInputStream
java.io.IOException
java.util.HashMap
java.util.Scanner

Instance Variables:
String stID
HashMap<String, Integer> asciiValues

Variables Created:
FileInputStream Mesonet
Scanner keyboard
int i
int theStation
String compareStation
MesoAscii compareMesoAscii
int compareAsciiValues

This class is all about reading in information from the Mesonet.txt using FileInputStream and Scanner.
Once keyboard is initialized, there must be three nextLine commands in order to start reading through the file at the correct
position. A While loop is then used to determine if the Station and its comparison Station are equal in Ascii Values. If they
are equivalent then the staion being compared and its ASCII value are put into the HashMap<String, Integer> asciiValues.

MesoSortedAbstract Class:
Contains Map<String, Integer> sortedMap(HashMap<String, Integer> unsorted) Method Signature












