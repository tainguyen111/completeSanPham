package QL_CUA_HANG_OTO;

public class KHACH_HANG extends CON_NGUOI {
    private String MaKhachHang;

    public KHACH_HANG() {
        
    }

    public KHACH_HANG(String MaKhachHang, String HoTen, String GioiTinh, String NamSinh, String DiaChi, String SDT) {
        super(HoTen, GioiTinh, NamSinh, DiaChi, SDT);
        this.MaKhachHang = MaKhachHang;
    }
    
}
