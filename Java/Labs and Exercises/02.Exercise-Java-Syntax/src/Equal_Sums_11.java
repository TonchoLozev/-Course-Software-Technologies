import java.util.Arrays;
import java.util.Scanner;

public class Equal_Sums_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        if (arr.length == 1) {
            System.out.println(0);
        } else

        {

            int check = 0;
            for (int i = 1; i < arr.length - 1; i++) {
                long leftSum = 0;
                long rightSum = 0;
                for (int left = i - 1; left >= 0; left--) {
                    leftSum += arr[left];
                }
                for (int right = i + 1; right < arr.length; right++) {
                    rightSum += arr[right];
                }
                if (leftSum == rightSum) {
                    System.out.println(i);
                    check++;
                    break;
                }
            }
            if (check == 0) {
                System.out.println("no");
            }
        }
    }
}
