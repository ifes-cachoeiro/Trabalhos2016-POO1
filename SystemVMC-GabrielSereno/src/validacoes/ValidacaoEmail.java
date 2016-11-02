/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validacoes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Gabriel dos Santos Sereno <gabrielf2@live.com>
 */
public class ValidacaoEmail {
    public static boolean validEmail(String email) {
        System.out.println("Metodo de validacao de email");
        Pattern p = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+[a-zA-Z]{2,7}$");
        Matcher m = p.matcher(email);
        if (m.find()) {
            System.out.println("O email " + email + " e valido");
            return true;
        } else {
            System.out.println("O E-mail " + email + " é inválido");
            return false;
        }
    }

    public static boolean validaPassword(final String password){
        Pattern p = Pattern.compile("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])[^\\s]{6,}$");
        Matcher m = p.matcher(password);
        return m.matches();
    }
}
