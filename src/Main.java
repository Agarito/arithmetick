public class Main {
    public static void main(String[] args) {
        Arithmetick arithmetick = new Arithmetick(5, 6);

        System.out.println("Результат сложения: " +
                arithmetick.sum());
        System.out.println("Результат произведение: " +
                arithmetick.multiplication());
        System.out.println("Какое число больше? " +
                arithmetick.maxMin());

    }
}