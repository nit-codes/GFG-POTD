class Reverse {
    // Complete the function
    // str: input string
    public static String reverseString(String s) {
        // Convert the string to a character array
        char[] charArray = s.toCharArray();
        
        // Initialize two pointers
        int left = 0;
        int right = s.length() - 1;
        
        // Swap characters from both ends of the array
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        
        // Convert the character array back to a string
        return new String(charArray);
    }
}
