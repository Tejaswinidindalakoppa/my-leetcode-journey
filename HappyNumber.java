import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getNext(n);
        }
        return n == 1;
    }

    private int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int digit = n % 10;
            totalSum += digit * digit;
            n /= 10;
        }
        return totalSum;
    }

    public static void main(String[] args) {
        HappyNumber solution = new HappyNumber();
        int number = 19; // You can change this number to test other values
        if (solution.isHappy(number)) {
            System.out.println(number + " is a Happy Number!");
        } else {
            System.out.println(number + " is not a Happy Number.");
        }
    }
}
