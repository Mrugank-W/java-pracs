 class VowelException extends Exception {
    public VowelException(String message) {
        super(message);
    }
}


public class Vowel {
    public static void checkVowels(String str) throws VowelException {
        boolean flag = false;
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                flag = true;
                break;
            }
        }
        if (!flag) {
            throw new VowelException("String does not contain vowels");
        }
    }


    public static void main(String[] args) {
        String str = "qwrtypsdfghjklzxcvbnm";
        try {
            checkVowels(str);
            System.out.println("String contains vowels");
        } catch (VowelException e) {
            System.out.println(e.getMessage());
        }
    }
}
