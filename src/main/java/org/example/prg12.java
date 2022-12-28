package org.example; //orange is present or not

public class prg12 {
    static boolean isWordPresent(String sentence, String word)
    {
        String []s = sentence.split(" ");
        for ( String temp :s)
        {
            if (temp.compareTo(word) == 0)
            {
                return true;
            }
        }
        return false;
    }

    // Driver code
    public static void main(String[] args)
    {
        String s = "This is orange juice";
        String word = "orange";

        if (isWordPresent(s, word))
            System.out.print("Yes");
        else
            System.out.print("No");

    }
}
