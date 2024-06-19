package Model;

import java.util.ArrayList;

/**
 *
 * @author Nguyen Van Viet
 */
public class User {
    private String hovaten;
    private String manv;
    private String taikhoan;
    private String matkhau;
    private String chucvu;
    private String trangthai;
    
    ArrayList<User> qltk = new ArrayList();

    
    public User() {
    }

    public User(String hovaten, String manv,String chucvu, String trangthai, String taikhoan, String matkhau) {
        this.hovaten = hovaten;
        this.manv = manv;
        this.taikhoan = taikhoan;
        this.matkhau = matkhau;
        this.chucvu = chucvu;
        this.trangthai = trangthai;
    }
    
    public String getTaikhoan() {
        return taikhoan;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public String getManv() {
        return manv;
    }

    public void setTaikhoan(String taikhoan) {
        this.taikhoan = taikhoan;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }
    
    public String getHovaten() {
        return hovaten;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    
    public void setHovaten(String hovaten) {
        this.hovaten = hovaten;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getChucvu() {
        return chucvu;
    }

    public String getTrangthai() {
        return trangthai;
    }
}