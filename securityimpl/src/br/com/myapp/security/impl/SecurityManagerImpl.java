package br.com.myapp.security.impl;

import br.com.myapp.security.SecurityManager;

import java.util.Objects;

public class SecurityManagerImpl implements SecurityManager {

    @Override
    public boolean authenticate(String username, String password){
        return Objects.equals(username, "A") && Objects.equals(password, "B");
    }
}
