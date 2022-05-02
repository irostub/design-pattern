package com.irostub.designpatterns._06adaptor.simply;

public class App {
    public static void main(String[] args) {
        UserDetailsService userDetailsService = new AccountService();
        LoginService loginService = new LoginService(userDetailsService);
        String login = loginService.login("irostub", "qwer1234$");
        System.out.println(login);
    }
}
