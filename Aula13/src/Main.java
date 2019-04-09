public class Main {

    public static void main(String[] args) {
        int x = 5, j = 0;

        for (int i = 0; i < 3;) {
            System.out.println(i);
            INNER: do {
                System.out.println(i++);
                System.out.println(x++);
                if (x > 10) break INNER;
                x += 4;
                j++;
            } while (j <= 2);
        }
        System.out.println("X é = " + x);
    }
}
