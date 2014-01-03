package com.jkt.registration.service;

import com.jkt.registratrion.domain.RegistrationForm;

public interface RegistrationService {

	String registerUser(RegistrationForm registrationForm) throws Exception;
}
