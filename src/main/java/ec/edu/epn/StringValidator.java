package ec.edu.epn;

public class StringValidator {

    /**
     * Checks if a string is null or empty.
     * @param input The string to check.
     * @throws IllegalArgumentException if the input is null or empty.
     */
    public void validateNotEmpty(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null.");
        }
        if (input.trim().isEmpty()) {
            throw new IllegalArgumentException("Input cannot be empty.");
        }
    }


    /**
     * Check if a string is palindrome
     * @param input The string to check
     * @return true if the input is palindrome
     * @return false if the input is palindrome
     * return false if the input is null
     */
    public boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }
        return new StringBuilder(input).reverse().toString().equals(input);
    }
}
