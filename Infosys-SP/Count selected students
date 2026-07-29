import java.util.Scanner;

public class Main {
    public static int countSelectedStudents(int n, int[] scores, int cutoff) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if (scores[i] >= cutoff) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }
        int cutoff = scanner.nextInt();
        int result = countSelectedStudents(n, scores, cutoff);
        System.out.println(result);
    }
}