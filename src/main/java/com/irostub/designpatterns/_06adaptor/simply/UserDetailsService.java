package com.irostub.designpatterns._06adaptor.simply;

public interface UserDetailsService {
    UserDetails loadUser(String username);
}
