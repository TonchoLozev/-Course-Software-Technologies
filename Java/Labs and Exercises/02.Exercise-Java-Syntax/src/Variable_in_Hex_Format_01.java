import java.util.Scanner;

public class Variable_in_Hex_Format_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int convert = Integer.parseInt(input, 16);
        System.out.println(convert);
    }
}
