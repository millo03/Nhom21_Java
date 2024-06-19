package Data;

import Model.SinhVien;

import java.util.ArrayList;

/**
 *
 * @author Nguyen Van Viet
 */
public class SinhVien_DA {
    ArrayList<SinhVien> kh = new ArrayList();
    SinhVien temp;
    IOF fileio = new IOF();
    
    public SinhVien_DA() {
       kh = fileio.DocKhachHang();
    }

    public ArrayList<SinhVien> getKh() {
        return kh;
    }

    public SinhVien getTemp() {
        temp = new SinhVien();
        return temp;
    }

    public SinhVien getTtkh(String msv) {
        for(SinhVien i : kh){
            if(i.getMakh().equals(msv)){
                temp = new SinhVien(msv,i.getTen(), i.getSdt(), i.getLop());
                return temp;
            }
        }
        return temp;
    }
    
}