package latihanscan;

import java.util.Scanner;

public class LatihanScan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N, bil, i, nilaiMin = 1000, jml=1;
        char pil;

        Scanner input = new Scanner(System.in);

        N = input.nextInt();
        pil = input.next().charAt(0);

        if (pil == 'A') {
            for (i = 0; i < N; i++) {
                bil = input.nextInt();
                if (bil <= nilaiMin) {
                    if (bil == nilaiMin){
                        jml++;
                    }
                    nilaiMin = bil;
                }
                System.out.println(nilaiMin);
                System.out.println(jml);
            }
            
                }
    }
}
