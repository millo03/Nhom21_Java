package Data;

import Model.DongPhuc;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Nguyen Van Viet
 */
public class DongPhuc_DA {
    ArrayList<DongPhuc> dp = new ArrayList();
    DongPhuc temp;
    IOF fileio = new IOF();
    public DongPhuc_DA() {
        dp = fileio.DocDongPhuc();
    }

    public ArrayList<DongPhuc> getDp() {
        return dp;
    }
    public void add_dp(DongPhuc temp){
        dp.add(temp);
        fileio.GhiDongPhuc(dp);
    }
    public void remove_dp(int index){
        dp.remove(index);
        fileio.GhiDongPhuc(dp);
    }
    public void sort_dp(){
        Collections.sort(dp);
    }

    public DongPhuc getTtdp(String msp) {
        for(DongPhuc i : dp){
            if(i.getMasp().equals(msp)){
                temp = new DongPhuc(i.getTen(), msp, i.getGia());
                return temp;
            }
        }
        return temp;
    }
}