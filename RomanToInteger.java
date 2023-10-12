import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        HashMap<Character, Integer> romanToInteger = new HashMap<>();
        romanToInteger.put('I', 1);
        romanToInteger.put('V', 5);
        romanToInteger.put('X', 10);
        romanToInteger.put('L', 50);
        romanToInteger.put('C', 100);
        romanToInteger.put('D', 500);
        romanToInteger.put('M', 1000);

        String roman = "IX"; 

        int result = 0;
        for (int i = 0; i < roman.length(); i++) {
            if (i < roman.length() - 1 && romanToInteger.get(roman.charAt(i)) < romanToInteger.get(roman.charAt(i + 1))) {
                result -= romanToInteger.get(roman.charAt(i));
            } else {
                result += romanToInteger.get(roman.charAt(i));
            }
        }

        System.out.println("Roman numeral " + roman + " is equal to " + result);
    }
}
