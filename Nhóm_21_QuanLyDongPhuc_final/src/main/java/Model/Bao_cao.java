package Model;

/**
 *
 * @author Nguyen Van Viet
 */
public class Bao_cao implements Comparable<Bao_cao>{
    String quy, nam;
    int cpnhap, cpban;

    public Bao_cao() {
    }

    public Bao_cao(String quy, String nam, int cpnhap, int cpban) {
        this.quy = quy;
        this.nam = nam;
        this.cpnhap = cpnhap;
        this.cpban = cpban;
    }

    public String getQuy() {
        return quy;
    }

    public void setQuy(String quy) {
        this.quy = quy;
    }

    public String getNam() {
        return nam;
    }

    public void setNam(String nam) {
        this.nam = nam;
    }

    public int getCpnhap() {
        return cpnhap;
    }

    public void setCpnhap(int cpnhap) {
        this.cpnhap = cpnhap;
    }

    public int getCpban() {
        return cpban;
    }

    public void setCpban(int cpban) {
        this.cpban = cpban;
    }
    
    @Override
    public int compareTo(Bao_cao temp){
        int loinhuan1 = temp.getCpban() - temp.getCpnhap();
        int loinhuan2 = this.getCpban() - this.getCpnhap();
        if(loinhuan2 > loinhuan1) return 1;
        else if(loinhuan2 < loinhuan1) return -1;
        else return 0;
    }
}