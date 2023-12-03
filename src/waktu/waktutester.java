package waktu;
public class waktutester {
    public static void main(String[] args) {
        waktu w = new waktu();
        System.out.println("1. Total Menit : "+w.getTotalMenit());
        w.setJam (10);
        System.out.println("2. Total Menit : "+w.getTotalMenit());
        w.setMenit (57);
        System.out.println("3. Total Menit : "+w.getTotalMenit());
        w.tampilWaktu();
        w.tambahJam(7);
        System.out.println("4. Jam         : "+w.getJam()+" Menit : "+w.getMenit());
        w.tambahMenit(40);
        System.out.println("5. Jam         : "+w.getJam()+" Menit : "+w.getMenit());    
    }
}