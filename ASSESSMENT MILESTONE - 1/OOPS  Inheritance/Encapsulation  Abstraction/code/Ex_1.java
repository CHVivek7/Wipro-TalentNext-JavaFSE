class Author {
	private String name;
	private String email;
	private char gender;

	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Author [name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}
}

class Book {
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;

	public Book(String name, Author author, double price, int qtyInStock) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQtyInStock() {
		return qtyInStock;
	}

	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", price=" + price + ", qtyInStock=" + qtyInStock + "]";
	}
}

public class Ex_1 {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("Enter author name: ");
		String authorName = sc.nextLine();
		System.out.print("Enter author email: ");
		String authorEmail = sc.nextLine();
		System.out.print("Enter author gender (M/F): ");
		char authorGender = sc.nextLine().charAt(0);

		Author author = new Author(authorName, authorEmail, authorGender);

		System.out.print("Enter book name: ");
		String bookName = sc.nextLine();
		System.out.print("Enter book price: ");
		double bookPrice = sc.nextDouble();
		System.out.print("Enter quantity in stock: ");
		int qtyInStock = sc.nextInt();

		Book book = new Book(bookName, author, bookPrice, qtyInStock);
		System.out.println(book);
		sc.close();
	}
}
