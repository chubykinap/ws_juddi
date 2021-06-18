package juddi.service;

import java.util.Scanner;

public class JUDDIApplication {

    public static void main(String[] args) {
        try {
            while (true) {
                System.out.println("Введите одну из команд:\r\npublish, search, call");
                String action = new Scanner(System.in).nextLine();
                switch (action) {
                    case "publish":
                        new JUDDIPublish().publish();
                        break;
                    case "search":
                        new JUDDISearch().search();
                        break;
                    case "call":
                        new JUDDICall().call();
                        break;
                    default:
                        System.out.println("Команда не найдена");
                        return;
                }
                System.out.println("Команда выполнена\r\n");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static String[] enterData() {
        String[] res = new String[2];
        System.out.print("Введите название бизнеса: ");
        res[0] = new Scanner(System.in).nextLine();
        System.out.print("Введите название сервиса: ");
        res[1] = new Scanner(System.in).nextLine();
        return res;
    }
}
