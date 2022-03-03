package com.alewol.spring.backend.demo.email;

public interface EmailSender {
    void send(String to, String email);
}
