package com.person.utils;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    /**
     * Reads number from input.
     * @param prompt
     * @return
     */
    public static int number(String prompt)
    {
        System.out.print(prompt + ": ");

        return scanner.nextInt();
    }

    /**
     * Reads string from input.
     * @param prompt
     * @return
     */
    public static String string(String prompt)
    {
        System.out.print(prompt + ": ");

        String str = scanner.nextLine();
        while(str.isEmpty())
            str = scanner.nextLine();
        return str;
    }

}
