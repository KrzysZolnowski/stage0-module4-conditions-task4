package school.mjc.stage0.conditions.task4;

public class TernaryGreatestNumberPrinter {
    public void printGreatest(int first, int second) {
        int b = 16;
        int z = b > first ? 10 : (second > b ? second : 23);
        System.out.println(z);

    }
}
