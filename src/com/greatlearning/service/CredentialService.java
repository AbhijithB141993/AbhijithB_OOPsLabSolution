package com.greatlearning.service;
import java.util.Random;
import com.greatlearning.model.Employee;
public class CredentialService {
	String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String smallLetters = "abcdefghijklmnopqrstuvwxyz";
	String numbers = "0123456789";
	String specialCharacters = "!@#$%^&*_=+-/.?<>)";
	String values = capitalLetters + smallLetters + numbers + specialCharacters;
	Random random = new Random();

	char[] password = new char[8];

	public char[] generatePassword() {
		for (int i = 0; i < 8; i++) {
			password[i] = values.charAt(random.nextInt(values.length()));

		}
		return password;}
}
 public String generateEmailAddress (String firstName, String lastName, String department)
 return firstName+lastName+"@"+department+".abc.com";