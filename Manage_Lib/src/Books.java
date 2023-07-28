import java.util.Scanner;

public class Books {
	protected String id;
	protected String name;
	protected int count;
	protected int cost;
	public void Input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma so cuon sach: ");
		this.id = sc.nextLine();
		System.out.println("Nhap ten cuon sach: ");
		this.name = sc.nextLine();
		System.out.println("Nhap so luong cuon sach: ");
		this.count = sc.nextInt();
		System.out.println("Nhap gia tien cuon sach: ");
		this.cost = sc.nextInt();
	}
	public void Output()
	{
		System.out.println("Ma so cuon sach: " + this.id);
		System.out.println("Ten cuon sach: " + this.name);
		System.out.println("So luong cuon sach: " + this.count);
		System.out.println("Gia tien cuon sach: " + this.cost);
	}
	public float TotalCost()
	{
		return 0;
	}
	public String getName()
	{
		return this.name;
	}
}
