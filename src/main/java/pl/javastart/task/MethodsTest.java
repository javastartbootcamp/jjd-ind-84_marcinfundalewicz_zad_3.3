package pl.javastart.task;

public class MethodsTest {

    public static void main(String[] args) {
    Methods methods = new Methods();

    boolean resultEven = methods.isEven(4);
    System.out.println("Czy liczba jest parzysta ? " + resultEven);

    boolean resultOdd = methods.isOdd(5);
    System.out.println("Czy liczba jest nieparzysta ? " + resultOdd);

    double circeFieldResult = methods.circleField(3);
    System.out.println("Pole kola to: " + circeFieldResult);

    int powerResult = methods.power(5);
    System.out.println("Kwadrat liczby to : " + powerResult);

    }
}
