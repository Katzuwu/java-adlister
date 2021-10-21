import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class JDBCTest {
	public static void main(String[] args) {
		try {
			// register driver

			DriverManager.registerDriver(new Driver());

			// create connection

			Connection connection = DriverManager.getConnection(
					// DB connection url
					"jdbc:mysql://localhost/codeup_test_db?serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true",
					// DB username
					"root",
					// DB password
					"codeup"
			);

			// create statement

			Statement statement = connection.createStatement();

			// (Select) execute the query with statement

//			ResultSet resultSet = statement.executeQuery("SELECT * FROM albums");

//			while(resultSet.next()){
//				System.out.println(resultSet.getString("name"));// look at first result
//			}

//			String firstArtist = resultSet.getString("artist");
//			String firstAlbum = resultSet.getString("name");
//
//			System.out.println(firstArtist);
//			System.out.println(firstAlbum);





			// scroll through ResultSet to print album artists


			// id |         artist |                      name | release_date | sales | genre <------------ column names
			// 1  |              2 |                         3 |            4 |     5 |     6 <------------ column numbers

			Album brandNewAlbum = new Album(
					29,
					"Elton John",
					"Goodbye Yellow Brick Road",
					1973,
					30,
					"rock, pop rock, glam rock"
			);

			Album updateAlbum = new Album(
					7,
					"Pink Floyd",
					"Dark Side of the Moon",
					1973,
					44,
					"Progressive Rock"
			);

//			String updateQuery = String.format("UPDATE albums SET artist = '%s', name = '%s', release_date = %d, sales = %f, genre = '%s' WHERE id = %d",
//					         updateAlbum.getArtist(),
//					         updateAlbum.getName(),
//					         updateAlbum.getReleaseDate(),
//					         updateAlbum.getSales(),
//					         updateAlbum.getGenre(),
//					         updateAlbum.getId()
//					 );
//			System.out.println(updateQuery);

//			int numberOfRowsEffected = statement.executeUpdate(updateQuery);
//			 System.out.println("Records effected..." + numberOfRowsEffected);


			// create insert query
			String insertQuery = String.format("INSERT INTO albums (id, artist, name, release_date, sales, genre) VALUES (%d, '%s', '%s', %d, %f, '%s')",
					brandNewAlbum.getId(),
					brandNewAlbum.getArtist(),
					brandNewAlbum.getName(),
					brandNewAlbum.getReleaseDate(),
					brandNewAlbum.getSales(),
					brandNewAlbum.getGenre()
			);

			System.out.println(insertQuery);
			statement.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);

			// ONLY NEEDED IF WANTING AUTO GENERATED ID...

			// pull out the primary that was created
			ResultSet rs = statement.getGeneratedKeys();

			// extract the primary key from the result set
			if (rs.next()) {
				System.out.println("Inserted id is: " + rs.getLong(1));
			}


		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
	}
}
