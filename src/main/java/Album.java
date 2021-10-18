import java.io.Serializable;

public class Album implements Serializable {
	private long id;
	private String artist;
	private String name;
	private String releaseDate;
	private int sales;
	private String genre;

	public Album(){

	}

	public Album(long id, String artist, String name, String releaseDate, int sales, String genre){
		this.id = id;
		this.artist = artist;
		this.name = name;
		this.releaseDate = releaseDate;
		this.sales = sales;
		this.genre = genre;
	}

	public Album(String artist, String name, String releaseDate, int sales, String genre){
		this.artist = artist;
		this.name = name;
		this.releaseDate = releaseDate;
		this.sales = sales;
		this.genre = genre;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public int getSales() {
		return sales;
	}

	public void setSales(int sales) {
		this.sales = sales;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Album{" +
				"id=" + id +
				", artist='" + artist + '\'' +
				", name='" + name + '\'' +
				", releaseDate='" + releaseDate + '\'' +
				", sales=" + sales +
				", genre='" + genre + '\'' +
				'}';
	}
}
