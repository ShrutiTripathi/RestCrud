package com.jkt.registration.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.springframework.stereotype.Service;

import com.jkt.registratrion.domain.RegistrationForm;

@Service("registrationService")
public class RegistrationServiceImpl implements RegistrationService {
	@Override
	public String registerUser(RegistrationForm registrationForm)
			throws Exception {
		String message = "Sucessfull";
		final Connection con = getConnection();
		final Statement st = con.createStatement();
		final String sqlString = "insert into user(firstName,lastName,email,password,confirm_password) values('"
				+ registrationForm.getFirstName()
				+ "','"
				+ registrationForm.getLastName()
				+ "','"
				+ registrationForm.getEmail()
				+ "','"
				+ registrationForm.getPassword()
				+ "','"
				+ registrationForm.getConfirmPassword() + "');";
		final int result = st.executeUpdate(sqlString);
		if (result == 0) {
			message = "UnSuccessFull";
		}

		return message;
	}

	private Connection getConnection() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		final Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost/donateme", "root", "mysql");
		return connection;
	}
}
