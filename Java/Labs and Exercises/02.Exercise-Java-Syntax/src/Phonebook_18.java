import java.util.*;

public class Phonebook_18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        LinkedHashMap<String, String> phonebook = new LinkedHashMap<>();

        while (true) {
            String input = scan.nextLine();
            if (input.equals("END")) {
                break;
            }
            String[] split = input.split(" ");
            String cmd = split[0];
            if (cmd.equals("A")) {
                String name = split[1];
                String number = split[2];

                if (!phonebook.containsKey(name)) {
                    phonebook.put(name, number);
                } else {
                    phonebook.put(name, number);
                }
            } else if (cmd.equals("S")) {
                String print = split[1];

                if (phonebook.containsKey(print)) {
                    Set set = phonebook.entrySet();
                    Iterator iterator = set.iterator();
                    while (iterator.hasNext()) {
                        Map.Entry me = (Map.Entry) iterator.next();
                        if (me.getKey().equals(print)) {
                            System.out.println(me.getKey() + " -> " + me.getValue());
                        }
                    }
                } else {
                    System.out.println("Contact " + print + " does not exist.");
                }
            }

        }
    }
}
