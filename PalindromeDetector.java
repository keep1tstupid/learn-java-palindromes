package task.palindrome;

import java.lang.StringBuffer;
import java.lang.Math;

public class PalindromeDetector {
    public static boolean isPalindrome (String string) {
        if (string.isEmpty()){
            return false;
        }

        String localString = string.replaceAll("[^A-Za-zА-Яа-я]+", "").toLowerCase();

        int length = localString.length();
        boolean isEven = length % 2 == 0;
        int startIndex = isEven ? length / 2 : (int) Math.ceil(length / 2) + 1;

        String tail = localString.substring(startIndex);
        String reversed = new StringBuffer(tail).reverse().toString();

        return localString.startsWith(reversed);
    }
}
