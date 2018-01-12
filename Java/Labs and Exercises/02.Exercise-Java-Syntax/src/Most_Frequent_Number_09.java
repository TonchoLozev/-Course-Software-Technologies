import java.util.Arrays;
import java.util.Scanner;

public class Most_Frequent_Number_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int times = 0;
        int longest = 1;
        int most = 0;

        for (int i = 0; i < arr.length; i++) {
            times = 1;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    times++;
                    if(times>longest){
                        longest=times;
                        most=arr[i];
                    }
                }
            }
        }
        System.out.println(most);
    }
}
