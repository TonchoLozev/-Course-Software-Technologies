import java.util.Scanner;

public class Fit_String_in_20_Chars_14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        StringBuilder fit = new StringBuilder(str);
        if(fit.length()<20){
            for (int i = fit.length(); i < 20 ; i++) {
                fit.append("*");
            }
            System.out.println(fit);
        }
        else{
            str = str.substring(0,20);
            System.out.println(str);
        }
    }
}
