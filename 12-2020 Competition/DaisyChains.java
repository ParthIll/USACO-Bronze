import java.io.*;
import java.util.*;

public class DaisyChains {
    // Counts the number of photos (subarrays) where the average petal count is present
    public static int countPhotosWithAverageFlower(int N, int[] petals) {
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                int total = 0;
                int length = j - i + 1;

                // Calculate total petals in the current subarray
                for (int k = i; k <= j; k++) {
                    total += petals[k];
                }

                // Check if the average is an integer
                if (total % length == 0) {
                    int average = total / length;

                    // Check if any flower in the subarray has the average petal count
                    for (int k = i; k <= j; k++) {
                        if (petals[k] == average) {
                            count++;
                            break;
                        }
                    }
                } 
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // Number of flowers
        
        int[] petals = new int[N];
        for (int i = 0; i < N; i++) {
            petals[i] = scanner.nextInt(); // Petal count for each flower
        }

        int result = countPhotosWithAverageFlower(N, petals);
        System.out.print(result);

        //pw.close();
    }
}
