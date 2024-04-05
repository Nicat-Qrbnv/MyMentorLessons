package lesson18.exercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        createNickname();
    }

    public static void createNickname () {

        Scanner scanner = new Scanner (System.in);
        String name = scanner.next();
        String surname = scanner.next();
        String year = scanner.next();

        StringBuilder nickName = new StringBuilder();

        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (c != 'e' || c!='a' || c!='i') {
                nickName.append(c);
            }
        }
        nickName.append("-");
        nickName.append(surname.substring(0, 4));
        nickName.append(year.substring(2));
        System.out.println(nickName);
    }
}
