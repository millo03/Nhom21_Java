package Data;

import Model.Bao_cao;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Nguyen Van Viet
 */
public class BaoCao_DA {
    ArrayList<Bao_cao> bc = new ArrayList();
    IOF fileio = new IOF();
    
    public BaoCao_DA() {
        bc = fileio.DocBaoCao();
    }

    public ArrayList<Bao_cao> getBc() {
        return bc;
    }

    public void setBc(ArrayList<Bao_cao> bc) {
        this.bc = bc;
    }
    
    public void them(Bao_cao temp){
        bc.add(temp);
        fileio.GhiBaoCao(bc);
    }
    public void xoa(Bao_cao temp){
        bc.remove(temp);
        fileio.GhiBaoCao(bc);
    }
    public void sort_arr(){
        Collections.sort(bc);
    }
    
}