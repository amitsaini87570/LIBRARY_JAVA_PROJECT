package LIBRARY;

import java.util.HashMap;
import java.util.Map;

public class LIBRARY {
	Map<String, String> library = new HashMap<>();
	String[] books = new String[100];
	int no_of_books = 0;

	void add_book(int s_no, String book, String author) {
		this.books[no_of_books++] = book;
		System.out.print("book\t" + book + "\t has been added!");
		library.put("\tbook added\t", book);
	}

	void show_book() {
		System.out.println("available books are: ");
		for (String book : books) {
			if (book == null) {
				continue;
			}
			System.out.println("*" + book);
		}
	}

	void issue_book(int s_no, String book, String author) {
		for (int i = 0; i <= books.length; i++) {
			if (books[i].equals(book)) {
				System.out.println("the book \t" + book + "\thas been issued!");
				library.put("\t bookissued\t", book);
				books[i] = null;
				return;
			} else {
				System.out.println("the book is not available");
			}
		}
	}

	void return_book(int s_no, String book, String author) {
		this.books[no_of_books++] = book;
		System.out.println("the book \t" + book + "\thas been returned!");
		library.put("\t book_returned \t", book);
	}

	void show_history() {
		for (Map.Entry<String, String> M : library.entrySet()) {
			System.out.println(M.getKey() + M.getValue());
		}
	}

}
