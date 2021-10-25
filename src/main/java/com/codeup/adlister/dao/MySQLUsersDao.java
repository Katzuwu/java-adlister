package com.codeup.adlister.dao;

import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class MySQLUsersDao implements Users {
	private Connection connection;

	public MySQLUsersDao(Config config) {
		try {
			DriverManager.registerDriver(new Driver());
			connection = DriverManager.getConnection(
					config.getUrl(),
					config.getUser(),
					config.getPassword()
			);
		} catch (SQLException e) {
			throw new RuntimeException("Error connecting to the database!", e);
		}
	}

	@Override
	public User findByUsername(String username) {
		User resultedUser = null;
		try {
			String prepareQuery = "SELECT * FROM users WHERE username LIKE ?";
			String searchTermWithWildcards = "%" + username + "%";
			PreparedStatement stmt = connection.prepareStatement(prepareQuery);
			stmt.setString(1, searchTermWithWildcards);

			ResultSet rs = stmt.executeQuery();
			resultedUser = extractUser(rs);
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
		return resultedUser;
	}

	private User extractUser(ResultSet rs) throws SQLException {
		if (!rs.next()) {
			return null;
		}
		return new User(
				rs.getLong("id"),
				rs.getString("username"),
				rs.getString("email"),
				rs.getString("password")
		);
	}

	@Override
	public Long insert(User user) {
		try {
			String insertQuery = "INSERT INTO users(username, email, password) VALUE (?, ?, ?)";
			PreparedStatement statement = connection.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS);
			statement.setString(1, user.getUsername());
			statement.setString(2, user.getEmail());
			statement.setString(3, user.getPassword());
			statement.executeUpdate();
			ResultSet rs = statement.getGeneratedKeys();
			rs.next();
			return rs.getLong(1);
		} catch (SQLException throwables) {
			throw new RuntimeException("Error creating a new ad.", throwables);
		}
	}
	public static void main(String[] args) {
		Users usersDao = new MySQLUsersDao(new Config());
		System.out.println(usersDao.findByUsername("newuser"));
	}
}
