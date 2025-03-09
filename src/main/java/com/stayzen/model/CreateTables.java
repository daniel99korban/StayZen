package com.stayzen.model;

import jakarta.persistence.Persistence;

public class CreateTables {
	
	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("org.hibernate.stayzen.jpa");
	}

}
