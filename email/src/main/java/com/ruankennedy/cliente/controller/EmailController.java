package com.ruankennedy.cliente.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ruankennedy.cliente.model.Email;
import com.ruankennedy.cliente.service.EmailService;

import jakarta.mail.MessagingException;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("api/email")
public class EmailController {
	
	private EmailService emailService;
	
	@PostMapping
	public void enviarEmail(@RequestBody Email email) throws MessagingException {
		emailService.enviarEmail(email);
	}

}
