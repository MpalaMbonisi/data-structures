package com.github.mpalambonisi.datastructures.stack;

public class ParentheseBalancedDemo {
    private static boolean isBalancedParentheses(String str){
        StackArrayList<Character> myStack = new StackArrayList<>();
        for (char c: str.toCharArray()
             ) {
            if (c == '('){
                myStack.push(c);
            }
            else if (c == ')'){
                if (myStack.isEmpty() || myStack.pop() != '('){
                    return false;
                }
            }
        }
        return myStack.isEmpty();
    }
    public static void main(String[] args) {
        testAndPrint("()", true);
        testAndPrint("()()", true);
        testAndPrint("(())", true);
        testAndPrint("()()()", true);
        testAndPrint("(()())", true);
        testAndPrint(")()(", false);
        testAndPrint(")(", false);
        testAndPrint("(()", false);
        testAndPrint("))", false);
        testAndPrint("(", false);
        testAndPrint(")", false);
    }
    private static void testAndPrint(String testStr, boolean expected) {
        // Run the test and store the result
        boolean result = isBalancedParentheses(testStr);

        // Print the test string, expected result, and actual result
        System.out.println("Test String: " + testStr);
        System.out.println("EXPECTED: " + expected);
        System.out.println("RESULT: " + result);

        // Check if the test passed or failed
        if (result == expected) {
            System.out.println("STATUS: PASS");
        } else {
            System.out.println("STATUS: FAIL");
        }

        // Print a separator for better readability
        System.out.println("--------------");
    }
}
