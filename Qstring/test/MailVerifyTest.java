package maratonajava.javacore.Qstring.test;

import maratonajava.javacore.Qstring.dominio.EmailIncorreto;
import maratonajava.javacore.Qstring.dominio.SenhaIncorreta;

import java.util.Scanner;

public class MailVerifyTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cria teu E-mail: ");
        String eMail = scanner.nextLine();
        System.out.print("Cria tua senha: ");
        String senha = scanner.nextLine();

        System.out.print("Loga teu email: ");
        String tent = scanner.nextLine();
        System.out.print("Loga tua senha: ");
        String tentS = scanner.nextLine();

        try {
            verify(eMail.trim(), tent.trim(), senha, tentS);
        } catch (EmailIncorreto | SenhaIncorreta e) {
            e.printStackTrace();
        }
    }


    public static void verify(String mail, String tent, String senha, String tentS) {
        if (!tent.equals(mail)) {
            throw new EmailIncorreto("Email Incorreto!");
        }
        if (!tentS.equals(senha)) {
            throw new SenhaIncorreta("Senha incopativel com banco de dados!");
        }
        System.out.println("Login com sucesso!");
    }
}
