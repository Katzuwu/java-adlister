import java.io.Serializable;

public class Quote implements Serializable {
	private long id;
	private long authorID;
	private String content;

	public Quote(){

	}

	public Quote(long id, long authorID, String content){
		this.id = id;
		this.authorID = authorID;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getAuthorID() {
		return authorID;
	}

	public void setAuthorID(long authorID) {
		this.authorID = authorID;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Quote{" +
				"id=" + id +
				", authorID=" + authorID +
				", content='" + content + '\'' +
				'}';
	}
}
