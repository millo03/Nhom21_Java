package Data;

import Model.User;

import java.util.ArrayList;
/**
 *
 * @author Nguyen Van Viet
 */
public class TaiKhoan_DA {
    public ArrayList<User> ql = new ArrayList();
    IOF fileio = new IOF();
    
    public TaiKhoan_DA(){
        ql = fileio.DocTaiKhoan();
    }

    public ArrayList<User> getQl() {
        return ql;
    }
    public void deleteTK(int index){
        ql.remove(index);
        fileio.GhiTaiKhoan(ql);
    }
    public void addTk(User temp){
        ql.add(temp);
        fileio.GhiTaiKhoan(ql);
    }
    
}