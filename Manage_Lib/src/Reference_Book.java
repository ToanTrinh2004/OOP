import java.util.Scanner;

public class Reference_Book extends Books {
	private boolean isNew;
	public void Input()
	{
		super.Input();
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuon sach co con moi hay khong: ");
		try {
			isNew = sc.nextBoolean();			
		} catch (Exception e) {
			isNew = false;
		}
	}
	public float TotalCost()
	{
		float total = (cost*count*1/(isNew ? 1 : 2));
		return total;
	}
	public void Output()
	{
		super.Output();
		System.out.println("Loai sach: SGK");
		System.out.println("Tinh trang cuon sach: " + (isNew ? "Moi" : "Cu"));
		System.out.println("Tong tien can phai tra: " + TotalCost());
	}
	
}
