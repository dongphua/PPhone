package com.example.demo.sercurity.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entities.Account;
import com.example.demo.repositories.AccountRepository;




@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private final AccountRepository accountRepository;

    public UserDetailsServiceImpl (AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String email)
            throws UsernameNotFoundException {

        Account acc = accountRepository.findByEmail(email)
                .orElseThrow(() ->
                        new UsernameNotFoundException("User Not Found with -> username or email : " + email)
                );

        return UserDetailsImpl.build(acc);
    }
}