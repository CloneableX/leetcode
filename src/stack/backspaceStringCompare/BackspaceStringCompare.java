package stack.backspaceStringCompare;

import java.util.Stack;

/**
 * stack.backspaceStringCompare.BackspaceStringCompare
 *
 * problems link https://leetcode.com/problems/backspace-string-compare/
 *
 * @author Cloneable
 * @date 2019/6/29 14:03:29
 * @description
 */
public class BackspaceStringCompare {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> stackS = backspace(S.toCharArray());
        Stack<Character> stackT = backspace(T.toCharArray());

        if(stackS.size() != stackT.size()) {
            return false;
        }

        while(!stackS.empty() && !stackT.empty()) {
            if(!stackS.pop().equals(stackT.pop())) {
                return false;
            }
        }

        return true;
    }

    public Stack<Character> backspace(char[] chars) {
        Stack<Character> stack = new Stack();

        for(int i = 0; i < chars.length; i++) {
            if(chars[i] == '#' && !stack.empty()) {
                stack.pop();
            } else if(chars[i] != '#') {
                stack.push(chars[i]);
            }
        }

        return stack;
    }

    public boolean backspaceCompareInPlace(String S, String T) {
        char[] charS = backspaceInPlace(S.toCharArray());
        char[] charT = backspaceInPlace(T.toCharArray());

        if(charS.length != charT.length) {
            return false;
        }

        for(int i = 0; i < charS.length; i++) {
            if(charS[i] != charT[i]) {
                return false;
            }
        }

        return true;
    }

    public char[] backspaceInPlace(char[] chars) {
        int j = 0;
        for(int i = 0; i < chars.length; i++) {
            if(chars[i] == '#' && j > 0) {
                j--;
            } else if(chars[i] != '#') {
                chars[j++] = chars[i];
            }
        }

        char[] result = new char[j];
        System.arraycopy(chars, 0, result, 0, j);
        return result;
    }
}
