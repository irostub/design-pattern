package com.irostub.designpatterns._06adaptor.simply;

public class LoginService {
    private final UserDetailsService userDetailsService;

    public LoginService(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    public String login(String username, String password) {
        UserDetails userDetails = userDetailsService.loadUser(username);
        if (userDetails.getPassword().equals(password)) {
            return userDetails.getUsername();
        }else{
            throw new IllegalArgumentException();
        }
    }
}
