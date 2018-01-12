import java.util.Scanner;

public class Integer_to_Hex_and_Binary_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String convert = Integer.toHexString(n).toUpperCase();
        String convert2 = Integer.toBinaryString(n);

        System.out.println(convert);
        System.out.println(convert2);
    }
}
