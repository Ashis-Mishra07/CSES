import java.util.ArrayList;
import java.util.Scanner;

public class twosets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Calculate total sum
        long totalSum = (long) n * (n + 1) / 2;

        // Check if the total sum is odd
        if (totalSum % 2 != 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");

            // Find the largest index k such that sum(1..k) <= totalSum / 2
            long sumSet1 = 0;
            int k = 0;
            for (int i = 1; i <= n; i++) {
                sumSet1 += i;
                if (sumSet1 >= totalSum / 2) {
                    k = i;
                    break;
                }
            }

            // Construct the first set
            ArrayList<Integer> set1 = new ArrayList<>();
            for (int i = 1; i <= k; i++) {
                set1.add(i);
            }

            // Construct the second set
            ArrayList<Integer> set2 = new ArrayList<>();
            for (int i = k + 1; i <= n; i++) {
                set2.add(i);
            }

            // Adjust sets if necessary
            if (sumSet1 > totalSum / 2) {
                set1.remove((int) (sumSet1 - totalSum / 2 - 1));
                set2.add((int) (sumSet1 - totalSum / 2));
            } else if (sumSet1 < totalSum / 2) {
                set1.add((int) (totalSum / 2 - sumSet1));
                set2.remove((int) (totalSum / 2 - sumSet1 - 1));
            }

            // Output sets
            System.out.println(set1.size());
            for (int num : set1) {
                System.out.print(num + " ");
            }
            System.out.println();

            System.out.println(set2.size());
            for (int num : set2) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
