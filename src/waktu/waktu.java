package waktu;
public class waktu {
    int Jam;
    int Menit;
    int Waktu;
    int menitWaktu;
    void setJam (int j){
        Jam=j;
    }
    void  setMenit (int m){
        Menit=m;
    }
    void tampilWaktu(){
        System.out.println("Waktu   : "+Jam+":"+Menit);
    }
    void tambahMenit (int m){
        Menit=Menit+m;
        if (Menit>60)
            Menit=Menit-60;
        Jam=Jam+1;
    }
    void tambahJam (int j){
        Jam=Jam+j;
    }
    int getJam(){
        menitWaktu=Jam;
        return menitWaktu;
    }
    int getMenit(){
        menitWaktu=Menit;
        return menitWaktu;
    }
    int getTotalMenit(){
        menitWaktu=(Jam*60)+Menit;
        return menitWaktu;
    }
}
