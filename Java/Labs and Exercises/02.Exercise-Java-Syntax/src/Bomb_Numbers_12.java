import java.util.Arrays;
import java.util.Scanner;

public class Bomb_Numbers_12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] bomb = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int number = bomb[0];
        int power = bomb[1];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {

                arr[i] = 0;
                int left = i;
                int right = i;

                for (int j = 0; j < power; j++) {
                    left--;
                    if (left >= 0) {
                        arr[left] = 0;
                    } else {
                        break;
                    }
                }
                for (int j = 0; j < power; j++) {
                    right++;
                    if (right < arr.length) {
                        arr[right] = 0;
                    } else {
                        break;
                    }
                }
            }
        }
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
