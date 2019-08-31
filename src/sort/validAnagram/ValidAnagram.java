package sort.validAnagram;

import java.util.Arrays;

/**
 * sort.validAnagram.ValidAnagram
 *
 * @author Cloneable
 * @date 2019/7/16 08:54:16
 * @description
 */
public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        int[] charCount = new int[26];
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        for(int i = 0; i < sChars.length; i++) {
            charCount[charHash(sChars[i])]++;
            charCount[charHash(tChars[i])]--;
        }

        for(int i = 0; i < charCount.length; i++) {
            if(charCount[i] != 0) {
                return false;
            }
        }

        return true;
    }

    private static int charHash(char sChar) {
        return (int) sChar - 'a';
    }

    public static boolean isAnagramBySort(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        for(int i = 0; i < sChars.length; i++) {
            if(sChars[i] != tChars[i]) {
                return false;
            }
        }

        return true;
    }
}
