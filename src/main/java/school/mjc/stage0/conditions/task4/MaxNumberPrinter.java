package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
//        int biggest = (first > second) ? (first > third ? first : third): (second > third ? second : third);
//        System.out.println(biggest);
//
        if (first > second && first > third) {
            System.out.println(first);
        } else if (second > first && second > third) {
            System.out.println(second);
        } else if (third > first && third > second) {
            System.out.println(third);
        }
    }
}
