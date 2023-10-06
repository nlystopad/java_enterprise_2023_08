package com.hillel.multi.service;

import com.hillel.multi.persistent.entity.User;
import com.hillel.multi.persistent.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User byUsername = repository.findByUsername(username);
        if (byUsername == null) throw new UsernameNotFoundException(String.format("User %s not found", username));
        return byUsername;
    }
}
