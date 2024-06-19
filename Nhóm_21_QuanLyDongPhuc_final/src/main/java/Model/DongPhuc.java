package Model;

/**
 *
 * @author Nguyen Van Viet
 */
public class DongPhuc implements Comparable<DongPhuc>{
    private String Tensp, Loaisp, Masp, Kichco; 
    private int Dongia, Soluong;
    public DongPhuc() {
    }
    public DongPhuc(String Masp, String Tensp, String Loaisp, int Dongia, String Kichco, int Soluong) {
        this.Tensp = Tensp;
        this.Loaisp = Loaisp;
        this.Dongia = Dongia;
        this.Kichco = Kichco;
        this.Soluong = Soluong;
        this.Masp = Masp;
    }

    public DongPhuc(String Tensp, String Masp, int Dongia) {
        this.Tensp = Tensp;
        this.Masp = Masp;
        this.Dongia = Dongia;
    }
    
    public String getMasp(){
        return Masp;
    }
    
    public void setMasp(String Masp){
        this.Masp = Masp;
    }
    
    public String getTen() {
        return Tensp;
    }

    public String getLoai() {
        return Loaisp;
    }

    public int getGia() {
        return Dongia;
    }

    public String getKichco() {
        return Kichco;
    }

    public int getQual() {
        return Soluong;
    }

    public void setTen(String Tensp) {
        this.Tensp = Tensp;
    }

    public void setLoai(String Loaisp) {
        this.Loaisp = Loaisp;
    }

    public void setGia(int Dongia) {
        this.Dongia = Dongia;
    }

    public void setKichco(String Kichco) {
        this.Kichco = Kichco;
    }

    public void setSoluong(int Soluong) {
        this.Soluong = Soluong;
    }
    
    public int compareTo(DongPhuc a){
        if(a.getMasp().compareTo(this.getMasp()) == 0)
            return a.getTen().compareTo(this.getTen());
        else return a.getMasp().compareTo(this.getMasp());
    }
}