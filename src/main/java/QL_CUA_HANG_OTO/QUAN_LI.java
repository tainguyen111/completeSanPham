package QL_CUA_HANG_OTO;

public class QUAN_LI extends NHAN_VIEN{
    public QUAN_LI() {
    }

    public QUAN_LI(String MaSoNhanVien, String CapBac, float LuongTieuChuan, String HoTen, String GioiTinh, String NamSinh, String DiaChi, String SDT) {
        super(MaSoNhanVien, CapBac, LuongTieuChuan, HoTen, GioiTinh, NamSinh, DiaChi, SDT);
    }

    @Override
    public float TienLuong() {
        return (super.getLuongTieuChuan() + super.getLuongTieuChuan()*0.1f);
    }
    
}
