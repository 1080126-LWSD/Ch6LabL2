//In this lab, you will create three methods that relate to binary values
//Every method signature has been provided
//The file directory will be provided in the parameters
//The lab will be graded off the public tests, which you are free to look at
//Do not edit the public tests or the text files, if you do, it will likely break the tests

import java.util.*;
import java.io.*;

public class Chapter6Lab {
    //The first method you have to create is a method named binaryConvert that accepts a String parameter of a file
    //The file is consisting of 1's and 0's separated by whitespace
    //It must return a base-10 int equal to the binary value of the input
    //ex. binaryConvert(/file that contains "0 1 0 1 0"/) -> returns 10
    //Precondition: Input has only 1's and 0's and has at least one token

    public static int binaryConvert(String binaryFile) throws FileNotFoundException {
        return -1;
    }

    //The next method, named addBinary, adds two binary values stored in two different files and returns a base-10 integer
    //ex. addBinary(/file that contains "1 0 1 0 1 0"/, file that contains "0 1 0 1 0") -> returns 52
    //Precondition: Both files has only 1's and 0's and has at least one token, all seperated by whitespace

    public static int addBinary(String binaryFileOne, String binaryFileTwo) throws FileNotFoundException {
        return -1;
    }

    //The last method named isBinary checks if a file contains a binary value, which each 1 and 0 seperated by whitespace.
    //It will return true if it is a valid binary, false otherwise
    //ex. isBinary(/file that contains "0 1 0 1 0"/) -> returns true
    //ex. isBinary(/file that contains "1 0 0 1 0.0") -> returns false
    //Precondition: There is at least one token

    public static boolean isBinary(String inputFile) throws FileNotFoundException {
        return true;
    }
}