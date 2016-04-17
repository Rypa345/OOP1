/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jam;

/**
 *
 * @author RYPA
 */
public class jamKlas {
    
int hh, mm, dd;
public jamKlas(){
    
}

    public jamKlas(int hh, int mm, int dd) {
        this.hh = hh;
        this.mm = mm;
        this.dd = dd;
    }

    public int getHh() {
        return hh;
    }

    public void setHh(int hh) {
        this.hh = hh;
    }

    public int getMm() {
        return mm;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }

    public int getDd() {
        return dd;
    }

    public void setDd(int dd) {
        this.dd = dd;
    }

int covertJamToMenit(int jam){
    int menit;
    menit = jam * 60;
    return menit;
}
int covertMenitToDetik(int jam){
    int detik;
    return detik = jam * 3600;

}
}  
