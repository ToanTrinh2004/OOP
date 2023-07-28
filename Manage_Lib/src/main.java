import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n; 
		System.out.println("Nhap so luong sach co trong thu vien: ");
		n = sc.nextInt();
		ArrayList<Books> ls = new ArrayList<Books>();
		for(int i=0;i<n;i++)
		{
			int type;
			Books temp;
			System.out.println("Nhap loai sach can nhap: ");
			System.out.println("---1.Sach giao khoa");
			System.out.println("---2.Sach tham khao");
			type = sc.nextInt();
			switch (type) {
			case 1: 
				temp = new Reference_Book();
				break;
			case 2: 
				temp = new Fomral_Book();
				break;
			default: 
				System.out.println("Khong co loai sach nay!!!");
				continue;
			}
			temp.Input();
			ls.add(temp);
		}
		for (Books books : ls) {
			books.Output();
		}
		sc.close();
	}
}
