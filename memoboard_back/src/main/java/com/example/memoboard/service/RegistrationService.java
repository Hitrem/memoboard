package com.example.memoboard.service;

import com.example.memoboard.registration.RegistrationRequest;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    public String register(RegistrationRequest request) {
        return "works";
    }
}
