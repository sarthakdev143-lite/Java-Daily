/*
 * ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain
 * anything but exactly 4 digits or exactly 6 digits.
 * 
 * If the function is passed a valid PIN string, return true, else return false.
 * 
 * Examples (Input --> Output)
 * "1234" --> true
 * "12345" --> false
 * "a234" --> false
 * 
 */

public class RegexValidatePINcode {
    public static void main(String[] args) {
        System.out.println(validatePin("123442") ? "Pin is Valid" : "Pin Not Valid");
    }

    public static boolean validatePin(String pin) {
        boolean isCorrect;
        int pinLength = pin.length();
        isCorrect = (pin.length() == 4 || pin.length() == 6) ? true : false;
        for (int i = pinLength - 1; i >= 0; i--) {
            if (Character.isDigit(pin.charAt(i)) == false) {
                isCorrect = false;
                break;
            }
        }
        return isCorrect;
    }
}