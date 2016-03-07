package org.denispozo.tutorial.thj.access.control.connections;

import java.util.ArrayList;
import java.util.List;

public class ConnectionManager {
/*
 * Following the form of the example Lunch.java create a class called connection manager
 * that manages a fixed array of Connection objects. The client programmer must not be
 * able to explicity create Connection objects, but can only get them via a static method
 * in ConnectionManager. When the connection manager runs out of objects, it returns a \
 * null ref. Test the classes in main
 */
	private final int NUM_CONNECTIONS = 10;
	
	private int numConnections;
	
	private List<Connection> connections;
	
	public ConnectionManager() {
		numConnections = NUM_CONNECTIONS;
		connections = new ArrayList<Connection>(NUM_CONNECTIONS);
	}
	
	public ConnectionManager(int numConnections){
		this.numConnections = numConnections;
		connections = new ArrayList<Connection>(numConnections);
	}
	
	public Connection createConnection() {
		
		if(connections.size() == numConnections) return null;
	
		Connection connection = new Connection();
		connections.add(connection);
		return connection;
		
	}
	
	public int getDefaultMaxConnections() {
		return NUM_CONNECTIONS;
	}
}
