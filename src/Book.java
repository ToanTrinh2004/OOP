import java.util.Scanner;

abstract class Book {
    protected String book_id;
    protected String book_name;
    protected int book_price;
    public String book_public;
    protected int book_nums;
    public float total_price;
    protected void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Id of Book : ");
        this.book_id = sc.nextLine();
        System.out.println("Enter name of Book : ");
        this.book_name = sc.nextLine();
        System.out.println("Enter Book publicsher : ");
        this.book_public = sc.nextLine();
        System.out.println("Enter price of Book : ");
        this.book_price = sc.nextInt();
        System.out.println("Enter number of Book : ");
        this.book_nums = sc.nextInt();
    }
    protected void Output(){
        System.out.println("Book Id is : " + book_id);
        System.out.println("Book Name is : " + book_name);
        System.out.println("Book Publicsher is : "+book_public);
        System.out.println("Book Price is : "+book_price);
        System.out.println("Number of Book is : " +book_nums);
    }

}
