package br.inatel.autenticavel;

public class Cliente implements Autenticavel{
    private String login;

    public Cliente(String login) {
        this.login = login;
    }

    @Override
    public boolean autenticar(String login, String senha) {
        return this.login.equals(login);
    }
}
