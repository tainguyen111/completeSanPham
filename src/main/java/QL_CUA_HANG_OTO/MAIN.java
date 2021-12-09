package QL_CUA_HANG_OTO;

import java.io.IOException;
import java.util.Scanner;

public class MAIN {
    
    public static void menu() {
		System.out.println("------------------Danh Sach Chuc Nang----------------------------");
		System.out.println("1. Them Moi San Pham");
		System.out.println("2. Hien Thi San Pham");
		System.out.println("3. Sua San Pham");
		System.out.println("4. Xoa San Pham");
		System.out.println("5. Mua Hang");
		System.out.println("6. Hien Thi Danh Sach Don Hang");
                System.out.println("8. Check Kho");
		System.out.println("7. Thoat.");
	}

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        CHI_TIET_HOA_DON cthd = new CHI_TIET_HOA_DON();
        int opt;
        do {
            menu();
            System.out.println("Moi Nhap Lua Chon: ");
            opt = Integer.parseInt(sc.nextLine());
            switch(opt) {
                case 1:
                    cthd.Insert();
                    break;
                case 2:
                    cthd.ShowDSSanPham();
                    break;
                case 3:
                    cthd.Update();
                    break;
                case 4:
                    cthd.XoaSanPham();
                    break;
                case 5:
                    break;
                case 6:
                    cthd.ShowDSHoaDon();
                    break;
                case 7: 
                    System.out.println("Successful!");
                    break;
                case 8:
                    KHO kho = new KHO();
                    System.out.println("So Luong 4 banh la: " + kho.getSoLuong4Banh());
                    System.out.println("So Luong 6 banh la: " + kho.getSoLuong6Banh());
                    break;
            }
        } while(opt != 7);
    }
}
