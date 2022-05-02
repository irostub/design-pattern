package com.irostub.designpatterns._06adaptor.regular;

import java.util.HashMap;
import java.util.Map;

public class AccountService {
    private static Map<String, Account> accountMap = new HashMap<>();

    static{
        accountMap.put("irostub", new Account("irostub", "qwer1234$"));
        accountMap.put("diph", new Account("diph", "qwer1234!"));
        accountMap.put("ranja", new Account("ranja", "qwer1234@"));
    }

    public Account findByUsername(String username) {
        return accountMap.get(username);
    }
}
