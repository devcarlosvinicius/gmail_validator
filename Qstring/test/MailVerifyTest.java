package maratonajava.javacore.Qstring.test;

import maratonajava.javacore.Qstring.dominio.IncorrectEmail;
import maratonajava.javacore.Qstring.dominio.IncorrectPassword;

import java.util.Scanner;

public class MailVerifyTest {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Sign in Email: ");
            String eMail = scanner.nextLine();
            System.out.print("Sign in Password: ");
            String password = scanner.nextLine();
            System.out.print("Login Email: ");
            String loginEmail = scanner.nextLine();
            System.out.print("Login Password: ");
            String loginPassword = scanner.nextLine();

            verify(eMail.trim(), loginEmail.trim(), password, loginPassword);

        } catch (IncorrectEmail | IncorrectPassword e) {
            e.printStackTrace();
        }
    }


    public static void verify(String mail, String loginEmail, String password, String loginPassword) {
        if (!loginEmail.equals(mail)) {
            throw new IncorrectEmail("Incorrect Email!");
        }
        if (!loginPassword.equals(password)) {
            throw new IncorrectPassword("Incorrect Password!");
        }
        System.out.println("Successful Login!");
    }
}
