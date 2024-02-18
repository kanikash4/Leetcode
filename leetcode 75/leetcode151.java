
//leetcode 151 : Reverse the words in string
//Input: s = "  hello world  "
//Output: "world hello"
//Explanation: Your reversed string should not contain leading or trailing spaces.


//Input: s = "a good   example"
//Output: "example good a"
//Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
//
//Constraints:
//
// 1 <= s.length <= 104
//s contains English letters (upper-case and lower-case), digits, and spaces ' '.
//There is at least one word in s.

class leetcode151 {
public String reverseWords(String s) {
    // Trim the input string to remove leading and trailing spaces
    String[] str = s.trim().split("\\s+");

    // Initialize the output string
    String out = "";

    // Iterate through the words in reverse order
    for (int i = str.length - 1; i > 0; i--) {
        // Append the current word and a space to the output
        out += str[i] + " ";
    }

    // Append the first word to the output (without trailing space)
    return out + str[0];
}

}