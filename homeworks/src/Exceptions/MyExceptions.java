package Exceptions;

public class MyExceptions extends Exception {
//    public String toString() {
//        return "My own Exception (Some Error :=)  )";
//    }

    public MyExceptions(String message) {
        super(message);
    }
}
