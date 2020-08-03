package homeworks.person.utils;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    public static int number(String prompt)
    {
        System.out.print(prompt + ": ");

        return scanner.nextInt();
    }

    public static String string(String prompt)
    {
        System.out.print(prompt + ": ");

        String str = scanner.nextLine();
        while(str.isEmpty())
            str = scanner.nextLine();
        return str;
    }

}
