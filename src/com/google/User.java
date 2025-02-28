package com.google;

public class User {

	private String name;
	private String email;
	private String phone;
	
	private User(Builder builder) {
		this.name = builder.name;
		this.email = builder.email;
		this.phone = builder.phone;
	}
	
	public static class Builder {
		private String name;
		private String email;
		private String phone;
		
		public Builder setName(String name) {
			this.name = name;
			return this;
		}
		
		public Builder setEmail(String email) {
			this.email = email;
			return this;
		}
		
		public Builder setPhone(String phone) {
			this.phone = phone;
			return this;
		}
		
		public User build() {
			return new User(this);
		}
	}
}
