package Data;

import Model.*;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nguyen Van Viet
 */
public class IOF {
    public void GhiKhachHang(ArrayList<SinhVien> list){
        try(PrintWriter pw = new PrintWriter(new File("KhachHang.DAT"))){
            for(SinhVien i : list){
                pw.println(i.getMakh());
                pw.println(i.getTen());
                pw.println(i.getSdt());
                pw.println(i.getLop());   
            }
        }catch(Exception e){
            e.getStackTrace();
        }
    }
    public void GhiBaoCao(ArrayList<Bao_cao> list){
        try(PrintWriter pw = new PrintWriter(new File("BaoCao.DAT"))){
            for(Bao_cao i : list){
                pw.println(i.getNam());
                pw.println(i.getQuy());
                pw.println(i.getCpnhap());
                pw.println(i.getCpban());   
            }
        }catch(Exception e){
            e.getStackTrace();
        }
    }
    
    public void GhiTaiKhoan(ArrayList<User> list){
        try(PrintWriter pw = new PrintWriter(new File("TaiKhoan.DAT"))){
            for(User i : list){
                pw.println(i.getHovaten());
                pw.println(i.getManv());
                pw.println(i.getChucvu());
                pw.println(i.getTrangthai());  
                pw.println(i.getTaikhoan());
                pw.println(i.getMatkhau());   
            }
        }catch(Exception e){
            e.getStackTrace();
        }
    }
    
    public void GhiDongPhuc(ArrayList<DongPhuc> list){
        try(PrintWriter pw = new PrintWriter(new File("DongPhuc.DAT"))){
            for(DongPhuc i : list){
                pw.println(i.getMasp());
                pw.println(i.getTen());
                pw.println(i.getLoai());
                pw.println(i.getGia()); 
                pw.println(i.getKichco()); 
                pw.println(i.getQual()); 
            }
        }catch(Exception e){
            e.getStackTrace();
        }
    }
    
    public void GhiDanhSachDon(ArrayList<DanhSachDatHang> list){
        try(PrintWriter pw = new PrintWriter(new File("DanhSachDon.DAT"))){
            for(DanhSachDatHang i : list){
                pw.println(i.getMasv());
                pw.println(i.getMasp());
                pw.println(i.getGhichu());
                pw.println(i.getNgaydat()); 
                pw.println(i.getNgayhen()); 
                pw.println(i.getTrangthai());
                pw.println(i.getThanhtoan());
                pw.println(i.getSoluong());
            }
        }catch(Exception e){
            e.getStackTrace();
            System.out.println("Lỗi ghi file");
        }
    }
    public ArrayList DocKhachHang(){
        ArrayList<SinhVien> list = new ArrayList();
        try(Scanner sc = new Scanner(new File("KhachHang.DAT"))){
            while(sc.hasNext()){
                SinhVien i = new SinhVien();
                i.setMakh(sc.nextLine());
                i.setTen(sc.nextLine());
                i.setSdt(sc.nextLine());
                i.setLop(sc.nextLine());
                list.add(i);
            }
        }catch(Exception e){
            e.getStackTrace();
        }
        return list;
    }
    
    public ArrayList DocDongPhuc(){
        ArrayList<DongPhuc> list = new ArrayList();
        try(Scanner sc = new Scanner(new File("DongPhuc.DAT"))){
            while(sc.hasNext()){
                DongPhuc i = new DongPhuc();
                i.setMasp(sc.nextLine());
                i.setTen(sc.nextLine());
                i.setLoai(sc.nextLine());
                i.setGia(Integer.valueOf(sc.nextLine()));
                i.setKichco(sc.nextLine());
                i.setSoluong(Integer.valueOf(sc.nextLine()));
                list.add(i);
            }
        }catch(Exception e){
            e.getStackTrace();
        }
        return list;
    }
    
    public ArrayList DocDonHang(){
        ArrayList<DanhSachDatHang> list = new ArrayList();
        try(Scanner sc = new Scanner(new File("DanhSachDon.DAT"))){
            while(sc.hasNext()){
                DanhSachDatHang i = new DanhSachDatHang();
                i.setMasv(sc.nextLine());
                i.setMasp(sc.nextLine());
                i.setGhichu(sc.nextLine());
                i.setNgaydat(sc.nextLine());
                i.setNgayhen(sc.nextLine());
                i.setTrangthai(sc.nextLine());
                i.setThanhtoan(Integer.valueOf(sc.nextLine()));
                i.setSoluong(Integer.valueOf(sc.nextLine()));
                list.add(i);
            }
        }catch(Exception e){
            e.getStackTrace();
        }
        return list;
    }
    
    public ArrayList DocBaoCao(){
        ArrayList<Bao_cao> list = new ArrayList();
        try(Scanner sc = new Scanner(new File("BaoCao.DAT"))){
            while(sc.hasNext()){
                Bao_cao i = new Bao_cao();
                i.setNam(sc.nextLine());
                i.setQuy(sc.nextLine());
                i.setCpnhap(Integer.valueOf(sc.nextLine()));
                i.setCpban(Integer.valueOf(sc.nextLine()));
                list.add(i);
            }
        }catch(Exception e){
            e.getStackTrace();
        }
        return list;
    }
    
    public ArrayList DocTaiKhoan(){
        ArrayList<User> list = new ArrayList();
        try(Scanner sc = new Scanner(new File("TaiKhoan.DAT"))){
            while(sc.hasNext()){
                User i = new User();
                i.setHovaten(sc.nextLine());
                i.setManv(sc.nextLine());
                i.setChucvu(sc.nextLine());
                i.setTrangthai(sc.nextLine());
                i.setTaikhoan(sc.nextLine());
                i.setMatkhau(sc.nextLine());
                list.add(i);
            }
        }catch(Exception e){
            e.getStackTrace();
        }
        return list;
    }
};