package br.com.myapp.security;

public interface SecurityManager {

    boolean authenticate(String username, String password);
}
