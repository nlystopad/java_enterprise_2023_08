package com.hillel.multi.service;

import com.hillel.multi.persistent.entity.Role;
import com.hillel.multi.persistent.entity.User;
import com.hillel.multi.persistent.repository.RoleRepository;
import com.hillel.multi.persistent.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private UserDetailsService userDetailsService;

    public User save(User user) {
        if (user.getAuthorities() == null) user.setAuthorities(List.of(new Role("ROLE_" + Role.REGULAR_USER)));
        roleRepository.save(user.getAuthorities().get(0));

        return userRepository.save(user);
    }

    public UserDetails loadByUsername(String username) {
        return userDetailsService.loadUserByUsername(username);
    }

    public UserDetails findByToken(String token) {
        return userRepository.findByToken(token);
    }

    public User findByUsernameAndPassword(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, password);
    }
}
