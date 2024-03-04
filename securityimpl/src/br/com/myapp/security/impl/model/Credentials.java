package br.com.myapp.security.impl.model;

import java.util.List;

@SuppressWarnings("ALL")
public class Credentials {
    private final List<Credential> credentials = List.of();

    public String getPasswordByUsername(String username) {
        return credentials
                .stream()
                .filter(c -> c.username().equals(username)) // procurar dentro dos objetos Credentials quais possuem o username informado
                .findFirst() //Isso retorna um optional. Assumindo que foi encontrado, mapear com a senha associado
                .map(Credential::password) // utilizando method reference
                .orElse(null); // retorna o valor e caso não encontrado retornar null
    }

    public List<Credential> getCredentials() {
        return credentials;
    }
}
