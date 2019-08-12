package com.michonski.football.controller;

import com.michonski.football.dto.InfoDto;
import com.michonski.football.dto.security.RegisterUser;
import com.michonski.football.service.SecurityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/security")
@RequiredArgsConstructor
public class SecurityController {

    private final SecurityService securityService;

    // metoda /register ktora przyjmuje RegisterUser i przekazuje do
    // przygotowanej metody service
    @PostMapping("/register")
    public InfoDto register(@RequestBody RegisterUser registerUser ) {
        return InfoDto
                .builder()
                .message(securityService.registerUserName(registerUser))
                .build();
    }
}
