import java.util.Scanner;

public class Index_of_Letters_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        for (int i = 0; i < str.length(); i++) {
            int charr = Character.valueOf(str.charAt(i))-97;
            Character letter =Character.valueOf(str.charAt(i));
            System.out.println(letter + " -> "+ charr);
        }
    }
}
