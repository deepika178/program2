package org.example;

public class prg14 {
    public static void main(String args[]) {
        String name = "Robert Brett Roser";
        System.out.print("Initials with surname is: ");
        int len = name.length();
        name = name.trim();
        String str1 = "";
        for (int i = 0; i < len; i++) {
            char ch = name.charAt(i);
            if (ch != ' ') {
                str1 = str1 + ch;
            } else {
                System.out.print(Character.toUpperCase(str1.charAt(0)) + ".");
                str1 = "";

            }
        }
        System.out.print("Roser");

    }
}
