import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    ArrayList<Book> book = new ArrayList<>();
    public int choose;
    public int number_booktype;
    public  float TextBook_cost = 0;
    public float ReferBook_cost = 0;
    public int min_fee_index = 0 ;

    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number input : ");
        this.number_booktype = sc.nextInt();
        Book temp = new Text_Book();
        for (int i=0;i<number_booktype;i++){
            System.out.println("Enter The Book type : ");
            System.out.println("1 . Text Book ");
            System.out.println("2 . Reference Book  ");
            System.out.print("Your choose is : ");
            choose = sc.nextInt();
            switch (choose){
                case 1 :
                    temp = new Text_Book();
                    temp.Input();
                    this.TextBook_cost += temp.total_price;
                    break;
                case 2 :
                    temp = new Reference_Book();
                    temp.Input();
                    this.ReferBook_cost += temp.total_price;
                    break;
                default:
                    System.out.println("Your input invalid ");
            }

            book.add(temp);
        }



    }
    public void Output(){
        float fee = book.get(0).total_price;
        for (int i=0;i<number_booktype;i++){
            System.out.println("-------------------------------------------------");
            System.out.println("\n\n\n");
            System.out.println("Book "+(i+1)+"th");
            if (fee > book.get(i).total_price)
                this.min_fee_index = i;
            book.get(i).Output();
            System.out.println("\n\n\n");
            System.out.println("-------------------------------------------------");
        }
        System.out.println("Total fee for Text Book is "+TextBook_cost);
        System.out.println("Total fee for Reference Book is "+ReferBook_cost);
        System.out.println("-------------------------------------------------");
        System.out.println("\n\n\n");
        System.out.println("Information of min fee Book is : ");
        book.get(min_fee_index).Output();
        System.out.println("\n\n\n");
        System.out.println("-------------------------------------------------");
    }

    public void Find_Publicsher(){
        String publicsher;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name of publicsher : ");
        publicsher = sc.nextLine();
        System.out.println("Here is result : ");
        for (int i=0;i<number_booktype;i++){
            if(publicsher.equals(book.get(i).book_public))
                book.get(i).Output();
        }
    }
}
