package Data;

import Model.DanhSachDatHang;

import java.util.ArrayList;

/**
 *
 * @author Nguyen Van Viet
 */
public class DanhSachDatHang_DA {
    private ArrayList<DanhSachDatHang> dh = new ArrayList();
    IOF fileio = new IOF();
    
    public DanhSachDatHang_DA() {
        dh = fileio.DocDonHang();
    }
    
    public void xoa_don(int index){
        dh.remove(index);
        fileio.GhiDanhSachDon(dh);
    }
    
    public void cap_nhat(int index, DanhSachDatHang temp){
        dh.set(index, temp);
        fileio.GhiDanhSachDon(dh);
    }
    public void them_don(DanhSachDatHang temp){
        dh.add(temp);
        fileio.GhiDanhSachDon(dh);
    }
    
    public DanhSachDatHang tt_don(DanhSachDatHang temp){
        return dh.get(dh.indexOf(temp));
    }
    
    public ArrayList<DanhSachDatHang> getDh() {
        return dh;
    }

    public void setDh(ArrayList<DanhSachDatHang> dh) {
        this.dh = dh;
    }
    
};