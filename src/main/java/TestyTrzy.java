public class TestyTrzy {

    public static void main(String[] args) {

        showCalculations("+", 10, 20, 30);     // Oczekiwany wynik: 60
        showCalculations("-", 50, 15, 10);     // Oczekiwany wynik: 25
        showCalculations("*", 5, 5, 5);        // Oczekiwany wynik: 125
        showCalculations("/", 100, 5, 10);     // Oczekiwany wynik: 2

    }

    public static void showCalculations(String sign, int firstNumber, int secondNumber, int thirdNumber) {
        System.out.print(firstNumber + sign + secondNumber + sign + thirdNumber);
    }
}
