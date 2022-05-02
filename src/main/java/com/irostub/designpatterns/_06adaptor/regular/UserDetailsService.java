package com.irostub.designpatterns._06adaptor.regular;

public interface UserDetailsService {
    UserDetails loadUser(String username);
}
