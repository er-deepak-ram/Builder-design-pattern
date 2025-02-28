package com.google;

public class TestDrive {

	public static void main(String[] args) {
		User user = new User.Builder()
						.setName("John")
						.setEmail("john@example.com")
						.setPhone("1234567890")
						.build();
	}

}
