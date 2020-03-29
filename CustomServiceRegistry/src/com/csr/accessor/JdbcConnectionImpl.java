package com.csr.accessor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;
import org.hibernate.service.spi.Startable;
import org.hibernate.service.spi.Stoppable;

@SuppressWarnings("serial")
public class JdbcConnectionImpl implements ConnectionProvider, Startable, Stoppable {

	@SuppressWarnings("rawtypes")
	@Override
	public boolean isUnwrappableAs(Class unwrapType) {
		System.out.println("isUnwrappableAs()");
		return false;
	}

	@Override
	public <T> T unwrap(Class<T> unwrapType) {
		System.out.println("unwrap()");
		return null;
	}

	@Override
	public void stop() {
		System.out.println("stop()");
	}

	@Override
	public void start() {
		System.out.println("start()");
	}

	@Override
	public Connection getConnection() throws SQLException {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/support", "root", "root");
		con.setAutoCommit(false);
		return con;
	}

	@Override
	public void closeConnection(Connection conn) throws SQLException {
		System.out.println("closeConnection()");
		conn.close();
	}

	@Override
	public boolean supportsAggressiveRelease() {
		System.out.println("supportsAggressiveRelease()");
		return false;
	}

}
