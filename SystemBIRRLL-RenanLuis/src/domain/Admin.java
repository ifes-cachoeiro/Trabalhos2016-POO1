/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.regex.*;

/**
 *
 * @author Vinincius ID do usu´ario; – Nome Completo; – E-mail do Usu´ario; –
 * Senha do Usuario;
 */
public class Admin {

    private int codAdmin;
    private String nome;
    private String email;
    private String Senha;
    public static int auxP = 0;

    public Admin() {
        codAdmin = auxP++;
    }

    public int getCodAdmin() {
        return codAdmin;
    }

    public void setCodAdmin(int codAdmin) {
        this.codAdmin = codAdmin;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public boolean validEmail(String email) {
        Pattern p = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+[a-zA-Z]{2,7}$");
        Matcher m = p.matcher(email);
        if (m.find()) {
            return true;
        } else {
            return false;
        }
    }

    public int ehInteiro(String s) {
        // cria um array de char
        int j = 1;
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) // verifica se o char não é um dígito
        {
            if (!Character.isDigit(c[i])) {

                j++;

            }
        }

        return j;
    }
}
