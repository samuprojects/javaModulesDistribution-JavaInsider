package br.com.myapp.app;

public class Main {
    public static void main(String[] args) {
        var manager = new SecurityManager();
        var result = manager.authenticate("A", "B");
        System.out.println(result);
    }
}