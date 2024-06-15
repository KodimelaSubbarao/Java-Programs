
package com.sa.tasks;

import java.util.HashMap;
import java.util.Stack;

public class SpecialSymbolsChecking {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        HashMap<Character, Character> hm = new HashMap<>();
        hm.put('(', ')');
        hm.put('{', '}');
        hm.put('[', ']');

        String s1 = "{}[{(][][])}{}";
        System.out.println("Given String :: " + s1 + " length is :: " + s1.length());

        boolean flag = isValid(s1, hm);

        if (flag) {
            System.out.println("\nAll are perfect " + flag);
        } else {
            System.out.println("\nAll are not perfect " + flag);
        }
    }

    public static boolean isValid(String s, HashMap<Character, Character> hm) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (hm.containsKey(c)) {
                stack.push(c);
            } else if (hm.containsValue(c)) {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (hm.get(top) != c) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}


/*
 * package com.sa.tasks;
 * 
 * import java.util.HashMap; public class SpecialSymbolsChecking { public static
 * void main(String[] args) { test(); } public static void test() {
 * HashMap<Character,Character> hm=new HashMap<>(); hm.put('(',')');
 * hm.put('{','}'); hm.put('[',']'); String s1="{}[{(][][])}{}"; StringBuffer
 * s=new StringBuffer(s1);
 * System.out.println("Given String :: "+s+" length is :: "+s.length()); boolean
 * flag=false; if(s.length()>1) { for(int i =0;i<3;i++) { for(int
 * j=0;j<s.length();j++) { if(hm.get(s.charAt(i)) == s.charAt(j)) {
 * s.deleteCharAt(j); } } } } else
 * System.out.println("Given data is less than 2 "+flag);
 * System.out.println("After String"+s+" length is :: "+s.length());
 * if(s.length()==s1.length()/2) flag=true;
 * 
 * if(flag) System.out.println("\nall are perfect "+flag); else
 * System.out.println("\nall are not perfect "+flag); } }
 */