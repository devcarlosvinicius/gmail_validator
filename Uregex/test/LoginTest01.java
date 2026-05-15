package maratonajava.javacore.Uregex.test;

import maratonajava.javacore.Uregex.dominio.Login;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class LoginTest01 {
    public static void main(String[] args) {
        Login emailLogin = new Login();
        ResourceBundle alert = ResourceBundle.getBundle("alert", Locale.getDefault());
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println(alert.getString("user.email"));
            String email = scanner.nextLine();
            emailLogin.loginValidation(email);
            System.out.println(alert.getString("message"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
