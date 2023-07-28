import java.util.Scanner;

class Text_Book extends Book {
    public boolean book_status;

    @Override
    protected void Input() {
        super.Input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter status of Book false:old true:new : ");
        this.book_status = sc.nextBoolean();
        if(book_status)
            this.total_price = book_price*book_nums;
        else
            this.total_price = book_price*(book_nums/2);
    }

    @Override
    protected void Output() {
        super.Output();
        if (book_status)
            System.out.println("Book Status is new ");
        else
            System.out.println("Book Status is old ");

    }
}
