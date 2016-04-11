package latihanoop22;
import javax.swing.JOptionPane;
/**
 *
 * @author RYPA
 */
public class LatihanOop22 {

    public static void main(String[] args) {
       String  a = "Vitamin C";
       String b = "Vitamin C";
        String c = "Vitamin A";
        String ulang;
        do {
            String menu = JOptionPane.showInputDialog(null, "Masukkan pilihan anda: \n 1. Apa sih kandungan Vitamin dari Mangga\n 2. Apa sih kandungan Vitamin dari Wortel\n 3. Apa sih kandungan Vitamin dari Jambu\n 4. Keluar");
            int option = Integer.parseInt(menu);
            if (option == 1) {
          
                    System.out.print(a);
                   
                
            } else if (option == 2) {
                
                    System.out.print(c);
              
          } else if (option == 3) {
                
                    System.out.print(b);
            } else if (option == 4) {
                JOptionPane.showMessageDialog(null, "Selamat Tinggal !");
                System.exit(0);
            }
            ulang = JOptionPane.showInputDialog(null, "Apakah anda ingin mengulang\n 1. ya\n 2. tidak");
        } while ("1".equals(ulang));
        JOptionPane.showMessageDialog(null, "Selamat Tinggal !! :) :)");
    }
}