import java.util.Scanner;

public class Photos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int O = 0, E = 0; // Counters for odd and even numbers
        int N = scanner.nextInt(); // Number of integers

        // Read the integers and count odd and even numbers
        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            if (x % 2 == 0) {
                E++; // Increment even counter
            } else {
                O++; // Increment odd counter
            }
        }

        // Adjust the number of odd and even counts
        while (O > E) {
            O -= 2;
            E++;
        }
        if (E > O + 1) {
            E = O + 1;
        }

        // Output the result
        System.out.println(E + O);

        scanner.close();
    }
}
