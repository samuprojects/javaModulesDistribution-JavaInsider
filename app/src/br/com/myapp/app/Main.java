package br.com.myapp.app;

import br.com.myapp.security.SecurityManager;

import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        var manager = ServiceLoader.load(SecurityManager.class).findFirst().orElseThrow();
        var result = manager.authenticate("A", "B");
        System.out.println(result);
    }
}