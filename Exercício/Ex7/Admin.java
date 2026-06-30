package br.inatel.autenticavel;

public class Admin implements Autenticavel{
    @Override
    public boolean autenticar(String login, String senha) {
        return login.equals("Adm") && senha.equals("adm123");
    }
}
