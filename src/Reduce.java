public class Reduce {
    public static void main(String[] args) {
        int counter = 0;
        int n = 100;
        while (n != 0) {
            if (n % 2 == 0) {
                n = n/2;
            } else {
                n--;
            }
            counter++;
        }
        System.out.println("Number of steps it takes to reach 0 if you start at 100 is " + counter);
    }
}
