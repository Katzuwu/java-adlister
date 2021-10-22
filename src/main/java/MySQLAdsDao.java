import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads{
	private Connection connection;

	public MySQLAdsDao(Config config) throws SQLException {
		DriverManager.registerDriver(new Driver());
		config = new Config();
		this.connection = DriverManager.getConnection(
				config.getUrl(),
				config.getUser(),
				config.getPassword()
		);
	}

	@Override
	public List<Ad> all() {
		List<Ad> ads = new ArrayList<>();
		try {
			Statement statement = connection.createStatement();
			String query = "SELECT * FROM ads";
			ResultSet resultSet = statement.executeQuery(query);
			while (resultSet.next()){
				ads.add(new Ad(Long.parseLong(resultSet.getString("id")), Long.parseLong(resultSet.getString("user_id")), resultSet.getString("title"), resultSet.getString("description")));
			}
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		} return ads;
	}

	@Override
	public Long insert(Ad ad) {
		long lastUserId = 0;
		String query = String.format("INSERT INTO ads(user_id, title, description) VALUE(%d, '%s', '%s')",
				ad.getUserId(),
				ad.getTitle(),
				ad.getDescription());
		try {
			Statement statement = connection.createStatement();
			statement.executeUpdate(query, statement.RETURN_GENERATED_KEYS);
			ResultSet resultSet = statement.getGeneratedKeys();
			if (resultSet.next()) {
				lastUserId = resultSet.getLong(1);
			}
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		} return lastUserId;
	}
}
