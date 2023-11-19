public class Task1 {
    String login;
    String password;
    String confirmPassword;

    public static boolean User(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("Login does not meet requirements");
        }
        if (password.length() >= 20 || password.contains(" ") || !password.matches(".*\\d.*") || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password does not meet requirements");
        }
        return true;
    }
}

