package task1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите login: ");
        String login = scanner.nextLine();
        System.out.println("Введите password: ");
        String pass = scanner.nextLine();
        System.out.println("Подтвердите password: ");
        String confirmPass = scanner.nextLine();

        Boolean flag = LoginPassword.checkLoginPass(login, pass, confirmPass);
        System.out.println(flag);
    }

}