public class Main {
    public static void main(String[] args) {
        String login = "whsgorwh23";
        String password = "vmd  p2421 13";
        String confirmPassword = "vmd  p2421 13";
        try {
            Task1.User(login, password, confirmPassword);
            System.out.println("Пользователь верный");
        } catch (WrongLoginException e) {
            System.out.println("Неверный логин: " + e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println("Неверный пароль: " + e.getMessage());
        }
    }
    }
