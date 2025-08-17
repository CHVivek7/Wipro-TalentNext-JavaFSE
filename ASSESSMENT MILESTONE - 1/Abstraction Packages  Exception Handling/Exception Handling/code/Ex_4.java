class InvalidCountryException extends Exception {
    public InvalidCountryException(String message) {
        super(message);
    }
}

public class Ex_4 {
    void registerUser(String username, String userCountry) throws InvalidCountryException {
        if (!userCountry.equalsIgnoreCase("India")) {
            throw new InvalidCountryException("User Outside India  cannot be registered");
        } else {
            System.out.println("User registration done successfully");
        }
    }

    public static void main(String[] args) {
        Ex_4 reg = new Ex_4();
        try {
            if (args.length != 2) {
                System.out.println("Please provide username and country as arguments");
                return;
            }
            reg.registerUser(args[0], args[1]);
        } catch (InvalidCountryException e) {
            System.out.println(e.getMessage());
        }
    }
}
