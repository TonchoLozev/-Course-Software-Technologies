import java.util.Arrays;
import java.util.Scanner;

public class Max_Sequence_of_Increasing_Elements_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int bestStart = 0;
        int start = 0;
        int bestLength = 1;
        int length = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]+1) {
                length++;

                if (length > bestLength) {
                    bestLength = length;
                    bestStart = start;
                }

            } else {
                length = 1;
                start = i;
            }
        }

        for (int i = bestStart; i < bestStart + bestLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
