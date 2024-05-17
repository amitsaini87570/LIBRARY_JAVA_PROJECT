package LIBRARY;

import java.util.Scanner;

public class main extends LIBRARY{
public static void main(String[]args){
	
	main o = new main();
	
	System.out.println("*************welcome to library ******************");
	
	while(true) {
		System.out.println("\n1.add book \n2.show book \n3.issue book \n4.return book \n5.history \n6.exit");
		
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		
		if(ch ==1) {
			System.out.println("enter book serial no");
			int sno = sc.nextInt();
			System.out.println("enter book name");
			String book = sc.next();
			System.out.println("enter book author name");
			String book_author = sc.next();
			o.add_book(sno, book, book_author);
		}
		else if(ch ==2 ) {
			o.show_book();	
		}
		
		if(ch ==3) {
			System.out.println("enter book serial no");
			int sno = sc.nextInt();
			System.out.println("enter book name");
			String book = sc.next();
			System.out.println("enter book author name");
			String book_author = sc.next();
			o.issue_book(sno, book, book_author);
		}
		
		if(ch ==4) {
			System.out.println("enter book serial no");
			int sno = sc.nextInt();
			System.out.println("enter book name");
			String book = sc.next();
			System.out.println("enter book author name");
			String book_author = sc.next();
			o.return_book(sno, book, book_author);
		}
		
		
		if(ch ==5) {
			System.out.println("history");
			o.show_history();

		}
		
		if(ch ==6) {
			System.out.println("visit again");
System.exit(0);
		}	
	}
}
}
