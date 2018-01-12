import java.util.Scanner;

public class URL_Parser_16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String url = scan.nextLine().trim();
        String protocol = "";
        String server = "";
        String resource = "";

        boolean check = false;

        for (int i = 0; i < url.length(); i++) {

            if (Character.valueOf(url.charAt(i)).equals(':') &&
                    Character.valueOf(url.charAt(i + 1)).equals('/') &&
                    Character.valueOf(url.charAt(i + 2)).equals('/')) {
                protocol = url.substring(0, i);
                check = true;
                break;
            }
        }

        if (check) {
            check = false;
            for (int i = protocol.length() + 3; i < url.length(); i++) {
                if (Character.valueOf(url.charAt(i)).equals('/')) {
                    server = url.substring(protocol.length() + 3, i);
                    resource = url.substring(protocol.length() + 3 + server.length() + 1, url.length());
                    check = true;
                    break;
                }
            }
            if (!check) {
                server = url.substring(protocol.length() + 3, url.length());
            }
        } else {
            for (int i = 0; i < url.length(); i++) {
                if (Character.valueOf(url.charAt(i)).equals('/')) {
                    server = url.substring(protocol.length() + 3, i);
                    resource = url.substring(protocol.length() + 3 + server.length() + 1, url.length());
                    check = true;
                    break;
                }
            }
            if (!check) {
                server = url.substring(protocol.length() + 3, url.length());
            }
        }

        System.out.println("[protocol] = " + "\"" + protocol + "\"");
        System.out.println("[server] = " + "\"" + server + "\"");
        System.out.println("[resource] = " + "\"" + resource + "\"");
    }
}
