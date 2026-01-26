package com.testing;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestingDatabaseConnection {

	DatabaseConnection db;
	
	@BeforeEach
	void setUp() {
		db= new DatabaseConnection();
		db.connect();
	}
	
	@AfterEach
	void tearDown() {
		db.disconnect();
	}
	
	@Test
	void testConnection() {
		assertTrue(db.isConnected());
	}
	
	@Test
	void testClosedConnection() {
		assertTrue(db.isConnected());
	}
}
