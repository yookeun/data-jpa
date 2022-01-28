package com.example.datajpa.repository;

public interface UsernameOnly {
    // @Value("#{target.username + ' ' + target.age}")
    String getUsername();
}
