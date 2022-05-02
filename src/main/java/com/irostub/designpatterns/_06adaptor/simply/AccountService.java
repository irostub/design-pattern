package com.irostub.designpatterns._06adaptor.simply;

import java.util.HashMap;
import java.util.Map;

public class AccountService implements UserDetailsService{
    private static Map<String, Account> accountMap = new HashMap<>();

    static{
        accountMap.put("irostub", new Account("irostub", "qwer1234$"));
        accountMap.put("diph", new Account("diph", "qwer1234!"));
        accountMap.put("ranja", new Account("ranja", "qwer1234@"));
    }

    public Account findByUsername(String username) {
        return accountMap.get(username);
    }

    @Override
    public UserDetails loadUser(String username) {
        return findByUsername(username);
    }
}
