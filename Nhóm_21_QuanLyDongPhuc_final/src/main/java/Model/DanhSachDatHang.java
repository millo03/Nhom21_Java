package Model;

import Data.DongPhuc_DA;
import Data.SinhVien_DA;

/**
 *
 * @author Nguyen Van Viet
 */
public class DanhSachDatHang {
    private String masv, masp, ghichu, ngaydat, ngayhen, trangthai;
    private int thanhtoan, soluong;
    private DongPhuc_DA dpda = new DongPhuc_DA();
    private SinhVien_DA khda = new SinhVien_DA();

    public SinhVien_DA getKhda() {
        return khda;
    }

    public void setKhda(SinhVien_DA khda) {
        this.khda = khda;
    }
    public DanhSachDatHang() {
    }
    
    public DanhSachDatHang(String masv,String masp, String ghichu, String ngaydat, String ngayhen, String trangthai, int thanhtoan, int soluong) {
        this.masv =masv;
        this.masp = masp;
        this.ghichu = ghichu;
        this.ngaydat = ngaydat;
        this.ngayhen = ngayhen;
        this.trangthai = trangthai;
        this.thanhtoan = thanhtoan;
        this.soluong = soluong;  
    }

    public DongPhuc_DA getDpda() {
        return dpda;
    }

    public void setDpda(DongPhuc_DA dpda) {
        this.dpda = dpda;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getMasp() {
        return masp;
    }
    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }
    public String getNgaydat() {
        return ngaydat;
    }

    public void setNgaydat(String ngaydat) {
        this.ngaydat = ngaydat;
    }

    public String getNgayhen() {
        return ngayhen;
    }

    public void setNgayhen(String ngayhen) {
        this.ngayhen = ngayhen;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    public int getThanhtoan() {
        return thanhtoan;
    }

    public void setThanhtoan(int thanhtoan) {
        this.thanhtoan = thanhtoan;
    }
    
    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    
    public int getThanhtien(){
        return soluong*dpda.getTtdp(masp).getGia();
    }
    public int getTratien(){
        return thanhtoan - getThanhtien();
    }
}