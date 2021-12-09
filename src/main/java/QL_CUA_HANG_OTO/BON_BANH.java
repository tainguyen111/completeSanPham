package QL_CUA_HANG_OTO;

public class BON_BANH extends O_TO implements TINH_GIA_TRI{

    public BON_BANH() {
    }

    public BON_BANH(String TenXe, String ThuongHieu, String MauXe, String Maxe, int TocDo, float Gia) {
        super(TenXe, ThuongHieu, MauXe, Maxe, TocDo, Gia);
    }
    
    @Override
    public String TypeCar() {
        return "BON BANH";
    }
    
    @Override
    public float Thue() {
        return 0.4f*super.getGia();
    }
    
    @Override
    public float GiaBan() {
        return super.getGia() + Thue();
    }
    
    @Override
    public float ThanhTien() {
        return GiaBan();
    }
}
