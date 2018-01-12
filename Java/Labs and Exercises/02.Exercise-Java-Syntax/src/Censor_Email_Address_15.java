import java.util.Scanner;

public class Censor_Email_Address_15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String email = scan.nextLine();
        String text = scan.nextLine();

        String[] split = email.split("@");
        StringBuilder replacing = new StringBuilder();
        String name = split[0];
        for (int j = 0; j < name.length(); j++) {
            replacing.append("*");
        }
        replacing.append("@");
        replacing.append(split[1]);
        String ceonzored = text.replace(email,replacing);

        System.out.print(ceonzored);
    }
}
