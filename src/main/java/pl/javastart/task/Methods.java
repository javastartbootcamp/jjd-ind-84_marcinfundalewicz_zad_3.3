package pl.javastart.task;

public class Methods {

    boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    boolean isOdd(int number) {
        if (number % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }
    double circleField(double beam){
        return beam*beam*(3.14);
    }
    int power(int number){
        return number*number;
    }
}
