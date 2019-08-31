package stack.removeAllAdjacentDuplicatesInString;

import java.util.Stack;

/**
 * stack.removeAllAdjacentDuplicatesInString.RemoveAllAdjacentDuplicatesInString
 *
 * @author Cloneable
 * @date 2019/7/1 08:52:01
 * @description
 */
public class RemoveAllAdjacentDuplicatesInString {
    public static String removeDuplicates(String S) {
        char[] chars = S.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < chars.length; i++) {
            if(stack.empty() || !stack.peek().equals(chars[i])) {
                stack.push(chars[i]);
            } else {
                stack.pop();
            }
        }

        char[] result = new char[stack.size()];
        while(!stack.empty()) {
            result[stack.size() - 1] = stack.pop();
        }

        return new String(result);
    }

    public static String removeDuplicatesInPlace(String S) {
        char[] chars = S.toCharArray();
        int j = 0;
        for(int i = 0; i < chars.length; i++) {
            if(j == 0 || chars[j - 1] != chars[i]) {
                chars[j++] = chars[i];
            } else {
                j--;
            }
        }

        char[] result = new char[j];
        System.arraycopy(chars, 0, result, 0, j);
        return new String(result);
    }
}
