class CustValidException extends Exception {
    public CustValidException(String message) {
        super(message);
    }
}

class Vdtr {
    public void validNum(int number) throws CustomValidationException {
        if (number < 0) {
            throw new CustomValidationException("Number cannot be negative");
        }
    }
}

public class ValidCust {
    public static void main(String[] args) {
        Vdtr valid = new Vdtr();
        int inputNumber = -5; // Example input number

        try {
            valid.validNum(inputNumber);
            System.out.println("Number is valid");
        } catch (CustValidException e) {
            System.out.println("CustomValidationException: " + e.getMessage());
        }
    }
}
