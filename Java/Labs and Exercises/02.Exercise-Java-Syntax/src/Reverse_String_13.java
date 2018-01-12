import java.util.Scanner;

public class Reverse_String_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length()-1; i >= 0; i--) {
            reversed.append(Character.valueOf(input.charAt(i)));
        }
        System.out.println(reversed);
    }
}
