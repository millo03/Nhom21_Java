package Model;

import javax.swing.*;

/**
 *
 * @author Nguyen Van Viet
 */
public class DialogHelper {
   public void infoDialogMess(String mess){
        JOptionPane.showMessageDialog(null, mess);
    }
    public void infoDialogMess(String mess, String title){
        JOptionPane.showMessageDialog(null, mess, title, JOptionPane.OK_OPTION);
    }
    public boolean infoDialogConfirm(String message, String title) {
        int result = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
        return result == JOptionPane.YES_OPTION;
    }
}