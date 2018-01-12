import java.util.Scanner;

public class Compare_Char_Arrays_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] array1 = scan.nextLine().split(" ");
        String[] array2 = scan.nextLine().split(" ");
        if (array1.length != array2.length) {
            if (array1.length < array2.length) {
                System.out.println(String.join("", array1));
                System.out.println(String.join("", array2));
            } else {
                System.out.println(String.join("", array2));
                System.out.println(String.join("", array1));
            }
        } else {
            int z = 0;
            for (int i = 0; i < array1.length; i++) {
                int char1 = Character.valueOf(array1[i].charAt(0)) - 96;
                int char2 = Character.valueOf(array2[i].charAt(0)) - 96;

                if(char1==char2){
                    continue;
                }
                else{
                    if(char1<char2){
                        System.out.println(String.join("", array1));
                        System.out.println(String.join("", array2));
                        z++;
                        break;
                    }
                    else{
                        System.out.println(String.join("", array2));
                        System.out.println(String.join("", array1));
                        z++;
                        break;
                    }
                }
            }
            if(z==0){
                System.out.println(String.join("", array1));
                System.out.println(String.join("", array2));
            }
        }
    }
}
