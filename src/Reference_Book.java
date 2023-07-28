import java.util.Scanner;

class Reference_Book extends Book {
    public float book_tax;

    @Override
    protected void Input() {
        super.Input();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Tax of Book : ");
        this.book_tax = sc.nextFloat();
        this.total_price = book_price*book_nums+book_tax;
    }

    @Override
    protected void Output() {
        super.Output();
        System.out.println("Book Tax is " + book_tax);
    }
}
