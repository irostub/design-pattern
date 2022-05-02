package com.irostub.designpatterns._06adaptor.regular;

public class App {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginService loginService = new LoginService(userDetailsService);

        String login = loginService.login("irostub", "qwer1234$");
        System.out.println(login);
    }
}
