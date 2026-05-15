package maratonajava.javacore.Uregex.dominio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Login {

    public void loginValidation(String email) throws Exception{
        String regex = "\\w+@gmail(\\.[a-z]{3})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (!matcher.matches()){
            throw new InvalidEmailException("Invalid E-mail");
        }
    }
}
