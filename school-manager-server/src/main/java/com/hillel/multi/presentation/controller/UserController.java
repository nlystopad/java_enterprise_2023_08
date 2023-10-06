package com.hillel.multi.presentation.controller;

import com.hillel.multi.persistent.entity.Role;
import com.hillel.multi.persistent.entity.User;
import com.hillel.multi.service.UserServiceImpl;
import com.hillel.multi.service.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam String username, @RequestParam String password) {
        User byUsernameAndPassword = userService.findByUsernameAndPassword(username, password);

        if (byUsernameAndPassword != null) {
            byUsernameAndPassword.setToken(UUID.randomUUID().toString());
            byUsernameAndPassword.setExpirationDate(LocalDateTime.now().plusHours(12));
            userService.save(byUsernameAndPassword);

            return ResponseEntity.ok(String.format("Successfully loged in. Your authentication token : {%s}", byUsernameAndPassword.getToken()));
        }
        return ResponseEntity.badRequest().body("Invalid username or password");
    }

    @PostMapping("/signup/regular")
    public ResponseEntity<User> addNewUser(@RequestBody UserDto userDto) {
        User user = User.builder().username(userDto.getUsername()).password(userDto.getPassword()).build();
        User saved = userService.save(user);

        return ResponseEntity.ok(saved);
    }

    @GetMapping("/authenticated")
    public ResponseEntity<String> authenticated() {
        return ResponseEntity.ok("You were successfully authenticated with the following credentials");
    }
}
