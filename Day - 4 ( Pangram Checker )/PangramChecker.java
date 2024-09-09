/*
 * A pangram is a sentence that contains every single letter of the alphabet at
 * least once. For example, the sentence
 * "The quick brown fox jumps over the lazy dog" is a pangram, because it uses
 * the letters A-Z at least once (case is irrelevant).
 * 
 * Given a string, detect whether or not it is a pangram. Return True if it is,
 * False if not. Ignore numbers and punctuation.
 * 
 * https://www.codewars.com/kata/545cedaa9943f7fe7b000048
 */

public class PangramChecker {
    public static boolean isPangram(String sentence) {
        sentence = sentence.toLowerCase();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < alphabet.length(); i++) {
            if (!sentence.contains(alphabet.substring(i, i + 1))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPangram("The quick brown fox jumps over the lazy dog"));
    }
}