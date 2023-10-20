 class NonDigitException extends Exception {
    public NonDigitException(String message) {
        super(message);
    }
}

public class Main {
    public static void printWords(String str) throws NonDigitException {
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                switch (c) {
                    case '0':
                        System.out.print("Zero ");
                        break;
                    case '1':
                        System.out.print("One ");
                        break;
                    case '2':
                        System.out.print("Two ");
                        break;
                    case '3':
                        System.out.print("Three ");
                        break;
                    case '4':
                        System.out.print("Four ");
                        break;
                    case '5':
                        System.out.print("Five ");
                        break;
                    case '6':
                        System.out.print("Six ");
                        break;
                    case '7':
                        System.out.print("Seven ");
                        break;
                    case '8':
                        System.out.print("Eight ");
                        break;
                    case '9':
                        System.out.print("Nine ");
                        break;
                }
            } else {
                throw new NonDigitException("Non-digit character encountered");
            }
        }
    }

    public static void main(String[] args) {
        String str = "56a31";
        try {
            printWords(str);
        } catch (NonDigitException e) {
            System.out.println(e.getMessage());
        }
    }
}
