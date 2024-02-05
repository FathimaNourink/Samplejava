package string;


public class PalindromeString {
    public static boolean isPalindrome(String str) {
        // Removing spaces and converting to LowerCase
        str = str.replaceAll("\\s", "").toLowerCase();

        // Using StringBuilder to reverse the string
        String reversed = new StringBuilder(str).reverse().toString();

        // Comparing the original and reversed strings
        return str.equals(reversed);
    }

    public static void main(String[] args) {
        String string1 = "java";
        String string2 = "Malayalam";

        if (isPalindrome(string1)) {
            System.out.println(string1 + " is a palindrome.");
        } else {
            System.out.println(string1 + " is not a palindrome.");
        }

        if (isPalindrome(string2)) {
            System.out.println(string2 + " is a palindrome.");
        } else {
            System.out.println(string2 + " is not a palindrome.");
        }
    }
}
