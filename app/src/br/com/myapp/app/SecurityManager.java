package br.com.myapp.app;

import java.util.Objects;

public class SecurityManager {

    public boolean authenticate(String username, String password){
        return Objects.equals(username, "A") && Objects.equals(password, "B");
    }
}
