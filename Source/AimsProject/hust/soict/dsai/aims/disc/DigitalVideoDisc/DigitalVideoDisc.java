package hust.soict.dsai.aims.disc.DigitalVideoDisc;
// VŨ QUANG DŨNG - 20225818
public class DigitalVideoDisc {
	private String title;      // Tiêu đề của đĩa DVD
	private String category;   // Thể loại của đĩa DVD
	private String director;   // Đạo diễn của đĩa DVD
	private int length;        // Độ dài (thời gian) của đĩa DVD
	private float cost;        // Giá của đĩa DVD

	private static int nbDigitalVideoDiscs = 0; // Class attribute
	private int id;  // Instance attribute

	// Constructor mặc định
	public DigitalVideoDisc() {
			updateID();
	}

	// Phương thức cập nhật ID
	private void updateID() {
			nbDigitalVideoDiscs++; // Tăng số lượng đối tượng DigitalVideoDisc
			id = nbDigitalVideoDiscs; // Gán ID cho đối tượng
	}

	// Constructor với tất cả các thuộc tính
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
			this.title = title;
			this.category = category;
			this.director = director;
			this.length = length;
			this.cost = cost;
			updateID();
	}

	// Constructor với tiêu đề, thể loại, đạo diễn và giá
	public DigitalVideoDisc(String title, String category, String director, float cost) {
			this.title = title;
			this.category = category;
			this.director = director;
			this.cost = cost;
			updateID();
	}

	// Constructor với tiêu đề, thể loại và giá
	public DigitalVideoDisc(String title, String category, float cost) {
			this.title = title;
			this.category = category;
			this.cost = cost;
			updateID();
	}

	// Constructor với chỉ tiêu đề
	public DigitalVideoDisc(String title) {
			this.title = title;
			updateID();
	}

	// Setter tạm thời cho tiêu đề
	public void setTitle(String title) {
			this.title = title;
	}

	// Getter lấy tiêu đề
	public String getTitle() {
			return title;
	}

	// Getter lấy thể loại
	public String getCategory() {
			return category;
	}

	// Getter lấy đạo diễn
	public String getDirector() {
			return director;
	}

	// Getter lấy độ dài
	public int getLength() {
			return length;
	}

	// Getter lấy giá
	public float getCost() {
			return cost;
	}

	// Getter lấy ID
	public int getId() {
			return id;
	}

	//toString
	public String toString(){
		return id + ". DVD - " + title + " - " + category + " - " + director + " - " + length + ": " + cost + "$";
  }
}
