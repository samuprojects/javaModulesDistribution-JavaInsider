package br.com.myapp.security.impl;

import br.com.myapp.security.SecurityManager;
import br.com.myapp.security.impl.model.Credentials;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import static java.util.Objects.requireNonNull;

@SuppressWarnings("ALL")
public class SecurityManagerImpl implements SecurityManager {

    @Override
    public boolean authenticate(String username, String password){
        //return Objects.equals(username, "A") && Objects.equals(password, "B");

        String storedPassword = getCredentials().getPasswordByUsername(username);

        return storedPassword != null && storedPassword.equals(password);
    }

    private Credentials getCredentials() {
        try (Reader reader = new InputStreamReader(requireNonNull(getClass().getResourceAsStream("/credentials.json")))) {
            return new Gson().fromJson(reader, Credentials.class);
        } catch (IOException e) {
           throw new RuntimeException(e);
        }
    }
}
