import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Scanner;

public class Boolean_Variable_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        Boolean bool = Boolean.valueOf(str);
        if(bool){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
