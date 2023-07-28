
import java.util.Scanner;

public class Fomral_Book extends Books {
	private int tax;
	public void Input()
	{
		super.Input();
		Scanner sc = new Scanner(System.in);
		System.out.println("Tien thue phai dong: ");
		tax = sc.nextInt();
	}
	public float TotalCost()
	{
		return cost*count + tax;
	}
	public void Output()
	{
		super.Output();
		System.out.println("Loai sach: Sach tham khao");
		System.out.println("Tong tien can phai tra: " + TotalCost());
	}
	
}
