import java.util.*;

public class permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println(1);
            return;
        } else if (n <= 3) {
            System.out.println("NO SOLUTION");
            return;
        }

        List<Integer> permutation = new ArrayList<>();
        int even = 2;
        int odd = 1;

        // Construct the permutation alternating even and odd numbers
        while (even <= n) {
            permutation.add(even);
            even += 2;
        }
        while (odd <= n) {
            permutation.add(odd);
            odd += 2;
        }

        // Output the permutation
        for (int i = 0; i < n; i++) {
            System.out.print(permutation.get(i) + " ");
        }

    }
}
