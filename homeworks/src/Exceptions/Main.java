package Exceptions;

import static Exceptions.Methods.subtractionWithExceptions;
import static Exceptions.Methods.sumWithExceptions;
import static Exceptions.Methods.divisionWithExceptions;
import static Exceptions.Methods.multiplicationWithExceptions;

public class Main {
    public static void main(String[] args) throws Exception {
        sumWithExceptions();
        subtractionWithExceptions();
        divisionWithExceptions();
        multiplicationWithExceptions();
    }
}