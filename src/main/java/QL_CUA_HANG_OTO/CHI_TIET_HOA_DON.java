package QL_CUA_HANG_OTO;

import java.time.LocalDateTime;
import java.util.*;

public class CHI_TIET_HOA_DON extends HOA_DON{
    private String NgayLap;
    private String LoaiXe;
    private int SoLuong;
    private static int i = 0, k = 0;
    // giới hạn mua mỗi lần là 50 ô tô
    static O_TO[] oto = new O_TO[50];
    static HOA_DON[] hd = new HOA_DON[50];

    public CHI_TIET_HOA_DON() {
    }

    public CHI_TIET_HOA_DON(String NgayLap, String LoaiXe, int SoLuong, String MaHoaDon, String MaNhanVien, String MaKhachHang) {
        super(MaHoaDon, MaNhanVien, MaKhachHang);
        this.NgayLap = NgayLap;
        this.LoaiXe = LoaiXe;
        this.SoLuong = SoLuong;
    }

    public String getNgayLap() {
        return NgayLap;
    }

    public void setNgayLap(String NgayLap) {
        this.NgayLap = NgayLap;
    }

    public String getLoaiXe() {
        return LoaiXe;
    }

    public void setLoaiXe(String LoaiXe) {
        this.LoaiXe = LoaiXe;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    @Override
    public void NHAP() {
     Scanner sc = new Scanner(System.in);
        super.NHAP();
         LocalDateTime localDate = LocalDateTime.now();
            boolean a_ngaylap = false;
            do {            
            System.out.println("Nhap ngay lap theo dd/mm/yyyy(VD:02/02/2012):");
            NgayLap=sc.nextLine();
            if(NgayLap.length()>10){
                a_ngaylap= false;
            }else
            {
                 String [] arrray=NgayLap.split("/");
                   if(Integer.parseInt(arrray[0]) <=31)
                   {
                        if(Integer.parseInt(arrray[1]) <=12)
                        {
                            if(Integer.parseInt(arrray[2]) <= localDate.getYear())
                            {
                                a_ngaylap=true;
                            }
                            else
                            {
                                a_ngaylap=false;
                            }
                        }
                        else
                        {
                            a_ngaylap=false;
                        }
                 }
                  else
                 {
                     a_ngaylap=false;
                 }
            }
        } while (a_ngaylap!=true);
            
        
                
            boolean a = false;
        do {            
            System.out.println("Nhap Loai Xe: ");
                LoaiXe = sc.nextLine();
            if(LoaiXe.equalsIgnoreCase("4")||LoaiXe.equalsIgnoreCase("6")||
                    LoaiXe.equalsIgnoreCase("bon banh")||LoaiXe.equalsIgnoreCase("sau banh")){
                a=true;
            }
        
        } while (a!=true);
        do {            
            System.out.println("Nhap So Luong: ");
             SoLuong = Integer.parseInt(sc.nextLine());
        } while (SoLuong <=0);
       
        
    }
    
    @Override
    public void XUAT() {
        super.XUAT(); 
        System.out.println("Ngay Lap: " +  NgayLap);
        System.out.println("Loai Xe: " +  LoaiXe);
        System.out.println("So Luong Mua: " +  SoLuong);
    }
    
    public void Insert() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Thong Tin Hoa Don: ");
        super.NHAP();
         LocalDateTime localDate = LocalDateTime.now();
            boolean a_ngaylap = false;
            do {            
            System.out.println("Nhap ngay lap theo dd/mm/yyyy(VD:02/02/2012):");
            NgayLap=sc.nextLine();
            if(NgayLap.length()>10){
                a_ngaylap= false;
            }else
            {
                 String [] arrray=NgayLap.split("/");
                   if(Integer.parseInt(arrray[0]) <=31)
                   {
                        if(Integer.parseInt(arrray[1]) <=12)
                        {
                            if(Integer.parseInt(arrray[2]) <= localDate.getYear())
                            {
                                a_ngaylap=true;
                            }
                            else
                            {
                                a_ngaylap=false;
                            }
                        }
                        else
                        {
                            a_ngaylap=false;
                        }
                 }
                  else
                 {
                     a_ngaylap=false;
                 }
            }
        } while (a_ngaylap!=true);
          boolean a = false;
        do {            
            System.out.println("Nhap Loai Xe: ");
                LoaiXe = sc.nextLine();
            if(LoaiXe.equalsIgnoreCase("4")||LoaiXe.equalsIgnoreCase("6")||
                    LoaiXe.equalsIgnoreCase("bon banh")||LoaiXe.equalsIgnoreCase("sau banh")){
                a=true;
            }
        
        } while (a!=true);
        do {            
            System.out.println("Nhap So Luong: ");
             SoLuong = Integer.parseInt(sc.nextLine());
        } while (SoLuong <=0);
        
        if(LoaiXe.equalsIgnoreCase("BON BANH")) {
            oto[i] = new BON_BANH();
            oto[i].NHAP();
            i++;
        }
        if(LoaiXe.equalsIgnoreCase("SAU BANH")) {
            oto[i] = new SAU_BANH();
            oto[i].NHAP();
            i++;
        }   
        if(i > 50)
                System.out.println("Qua So Luong Cho Phep Mua!");
        hd[k] = new CHI_TIET_HOA_DON(NgayLap, LoaiXe, SoLuong, super.getMaHoaDon(), super.getMaNhanVien(), super.getMaKhachHang());
        k++;
        if(k > 50)
                System.out.println("Qua So Luong Hoa Don Cho Phep!");
    }
    
    public void ShowDSSanPham() {
        System.out.println("");
        System.out.println("Danh sách OTo Da Dat: ");
        for(int o = 0; o < i ; o++) {
            System.out.println("" + (o+1) + ": ");
            oto[o].XUAT();
            System.out.println("");
        }
        
        System.out.println("");
    }
    
    public void ShowDSHoaDon() {
        System.out.println("");
        System.out.println("Danh sách Hoa Don: ");
        for(int h = 0; h < k ; h++) {
            System.out.println("" + (h+1) + ": ");
            hd[h].XUAT();
            System.out.println("Gia: " +  oto[h].getGia());  
            System.out.println("Thue: " +  oto[h].Thue());
            System.out.println("Tong Thanh Tien: " +  oto[h].ThanhTien());
            System.out.println("");
        }
        System.out.println("");
    }
    
    public void Update() {
        Scanner sc = new Scanner(System.in);
        int id;
        do {
            System.out.println("Moi Nhap id xe muon sua thong tin: ");
            id = Integer.parseInt(sc.nextLine());
            if(id < 0)
                System.out.println("Ban Da Nhap Sai id oto, Vui Long Nhap Lai!");
        } while(id <0);
        
        for(int o = 0; o < i; o++) {
            if(o == id) {
                if(oto[o] == null) 
                    System.out.println("Ma San Pham Khong Ton Tai, Xin Vui Long Nhap Lai!");
        
                System.out.println("Thong Tin San Pham Hien Tai: ");
                oto[o].XUAT();
            }
        }
        
        for(int o = 0; o < i; o++) {
            if(o == id) {
                System.out.println("");
                System.out.println("Nhap Ten: ");
                String name = sc.nextLine();
                System.out.println("Nhap Thuong Hieu: ");
                String brand = sc.nextLine();
                System.out.println("Nhap Ma Xe: ");
                String code = sc.nextLine();
                System.out.println("Nhap Mau Xe: ");
                String color = sc.nextLine();
                System.out.println("Nhap Toc Do: ");
                int speed = Integer.parseInt(sc.nextLine());
                System.out.println("Nhap Gia: ");
                float price = Float.parseFloat(sc.nextLine());
                
                oto[o].setTenXe(name);
                oto[o].setThuongHieu(brand);
                oto[o].setMauXe(color);
                oto[o].setMaxe(code);
                oto[o].setTocDo(speed);
                oto[o].setGia(price);
            }
        }
        
        hd[i] = new CHI_TIET_HOA_DON(NgayLap, LoaiXe, SoLuong, super.getMaHoaDon(), super.getMaNhanVien(), super.getMaKhachHang());
    }
    
    public void ChonSanPham() {
        int c;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Moi Nhap Id OTo Muon CHon: ");
            c = Integer.parseInt(sc.nextLine());
            if(c < 0 && c < i)
                System.out.println("Ban Da Nhap Sai id oto, Vui Long Nhap Lai!");
        } while(c <0 && c < i);
        for(int o = 0; o < i; o++) {
             if(o == c - 1) {
                 oto[o].XUAT();
             } 
        }
    }
    
    public void XoaSanPham() {
        int x, o;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Moi Nhap Id OTo Muon Xoa: ");
            x = Integer.parseInt(sc.nextLine());
            if(x < 0 && x < oto.length)
                System.out.println("Ban Da Nhap Sai id oto, Vui Long Nhap Lai!");
        } while(x < 0 && x < oto.length);
        
        for (o = x; o < i; o++) {
            oto[o] = oto[o+1];
        }
        i--;
        
        for (o = x; o < k; o++) {
            oto[o] = oto[o+1];
        }
        k--;
        
        System.out.println("Danh Sach san pham sau khi xoa: ");
        for(o = 0; o < i ; o++) {
            System.out.println("" + (o+1) + ": ");
            oto[o].XUAT();
            System.out.println("");
        }
    }
   
}