import java.util.Scanner;

public class Vowel_or_Digit_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String  charecter = scan.nextLine().toLowerCase();

        if(Character.isLetter(charecter.charAt(0))){

            switch (charecter){
                case "a":
                    System.out.println("vowel");
                    break;
                case "e":
                    System.out.println("vowel");
                    break;
                case "i":
                    System.out.println("vowel");
                    break;
                case "o":
                    System.out.println("vowel");
                    break;
                case "u":
                    System.out.println("vowel");
                    break;
                default:
                    System.out.println("other");
                    break;
            }
        }
        else if (Character.isDigit(charecter.charAt(0))){
            System.out.println("digit");
        }
        else{
            System.out.println("other");
        }
    }
}
