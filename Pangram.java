public class PangramCheck {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        input = input.replaceAll(" ", "").toLowerCase();

        boolean[] alphabetFlags = new boolean[26]; 
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if ('a' <= ch && ch <= 'z') {
                alphabetFlags[ch - 'a'] = true;
            }
        }

        boolean isPangram = true;
        for (boolean flag : alphabetFlags) {
            if (!flag) {
                isPangram = false;
                break;
            }
        }

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}
