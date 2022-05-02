package com.irostub.designpatterns._06adaptor.regular;

public class AccountUserDetailsService implements UserDetailsService{
    private AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        Account account = accountService.findByUsername(username);
        return new AccountUserDetails(account);
    }
}
