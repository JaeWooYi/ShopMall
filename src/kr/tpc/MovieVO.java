package kr.tpc;

public class MovieVO {

	private String title;
	private String price;
	private String autor;
	private int level;
	private String time;

	public MovieVO() {
	}

	// 초기화까지(Generate Constructor using fields)
	public MovieVO(String title, String price, String autor, int level, String time) {
		this.title = title;
		this.price = price;
		this.autor = autor;
		this.level = level;
		this.time = time;
	}

	// setter, getter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	// 객체가 가지고있는 모든 값을 string으로 바꿔서 출력해주는 toString
	@Override
	public String toString() {
		return "MovieVO [title=" + title + ", price=" + price + ", autor=" + autor + ", level=" + level + ", time="
				+ time + "]";
	}
}
