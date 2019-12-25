int myNum = 5; // Integer (whole number)
float myFloatNum = 5.99f; // Floating point number
char myLetter = 'D'; // Character
boolean myBool = true; // Boolean
String myText = "Hello"; // String

Primitive data types include byte, short, int, long, float, double, boolean, and char
Non-primitive data types include String, Arrays, Classes

Primitive data type specifies the size and type of variable values, and it has no additional methods.class
8 primitive data types in Java:
byte -  size = 1 byte - stores whole numbers from -128 to 127
short - size = 2 bytes - stores whole numbers from -32,768 to 32,767
int - size = 4 bytes - stores whole numbers from -2,147,483,648 to 2,147,483,647
long - size = 8 bytes - stores whole numbers from -9,223,372,036,854,775,808 to 9,233,372,036,854,807
float - size = 4 bytes - stores fractional numbers.  Sufficient for storing 6 to 7 decimal digits
double - size = 8 bytes - stores fractional numbers.  Sufficient for storing 15 decimal digits.
boolean - size = 1 bit - stores true or false values
char - size = 2 bytes - stores a single character/letter or ASCII values

Primitive number types are divided into 2 groups:
Integer types - stores whole numbers, positive or negative (123 or -456), without decimals.  Valid types are byte, short, int, and long
Floating point types - represents numbers with a fractional part, containing one or more decimals.  2 types: float and double

Most used numbers are int (for whole numbers) and double (for floating point numbers)

Integer types
byte myNum = 100;
System.out.println(myNum);

short myNum = 5000;
System.out.println(myNum);

int myNum = 100000;
System.out.println(myNum);

// Used when int is not large enough to store the value.  End value with an "L"
long myNum = 15000000000L
System.out.println(myNum);

// Store fractional numbers from 3.4e-038 to 3.4e+038.  End value with "f"
float myNum = 5.75f;
System.out.println(myNum);

// Store fractional numbers from 1.7e-308 to 1.7e+308.  End value with "d"
double myNum = 19.99d
System.out.println(myNum);

