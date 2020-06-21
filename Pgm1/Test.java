package encapsulation;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author auth=new Author("J.K.Rowling","jkrowl@gmail.com",'M');
		Book book=new Book("Harry Potter",auth,250,10);
		System.out.println(book);
	}

}
