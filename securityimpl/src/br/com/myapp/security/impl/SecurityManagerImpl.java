package br.com.myapp.security.impl;

import br.com.myapp.security.SecurityManager;

import java.io.IOException;
import java.io.InputStream;

@SuppressWarnings("ALL")
public class SecurityManagerImpl implements SecurityManager {

    @Override
    public boolean authenticate(String username, String password){
        //return Objects.equals(username, "A") && Objects.equals(password, "B");

        try (InputStream in = getClass().getResourceAsStream("/credentials.json")) {

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

        return true; // temporario sera excluído depois, apenas para sossegar compilador
    }
}
