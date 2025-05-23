import java.io.*;
import java.util.*;

public class DaisyChains {
    public static int countPhotosWithAverageFlower(int N, int[] petals) {
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                int total = 0;
                int length = j - i + 1;

                for (int k = i; k <= j; k++) {
                    total += petals[k];
                }

                if (total % length == 0) {
                    int average = total / length;

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

        int N = scanner.nextInt();
        
        int[] petals = new int[N];
        for (int i = 0; i < N; i++) {
            petals[i] = scanner.nextInt();
        }

        int result = countPhotosWithAverageFlower(N, petals);
        System.out.print(result);

        //pw.close();
    }
}
