package org.denispozo.tutorial.thj.access.control.connections.application;

import static org.junit.Assert.*;

import org.denispozo.tutorial.thj.access.control.connections.Connection;
import org.denispozo.tutorial.thj.access.control.connections.ConnectionManager;
import org.junit.Test;

public class ConnectionManagerTest {

	@Test
	public void createConnectionShouldReturnConnectionIfArrayIsNotFull() {
		ConnectionManager cm = new ConnectionManager(1);
		Connection c = cm.createConnection();
		
		assertTrue(c instanceof Connection);
	}
	
	@Test
	public void createConnectionShouldReturnNullIfArrayIsFull () {
		ConnectionManager cm = new ConnectionManager(0);
		
		Connection c = cm.createConnection();
		
		assertNull(c);
	}

}
