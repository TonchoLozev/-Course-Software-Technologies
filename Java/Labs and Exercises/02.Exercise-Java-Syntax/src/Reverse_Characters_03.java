import java.util.Scanner;

public class Reverse_Characters_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            String input = scan.nextLine();
            str.insert(0, input);
        }
        System.out.println(str);
    }
}
