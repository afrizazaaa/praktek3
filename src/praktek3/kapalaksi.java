package praktek3;

public class kapalaksi {
    public static void main(String[] args) {
        Kapal q = new Kapal ();
        q.setKargo("3");
        q.setJenis("Titanic");
        q.setHarga(3000000);
        q.setJenisKapal();
        
        
        q.cetakInfo();
        
        System.out.print("Kargonya \t: ");
        System.out.println(q.getKargo());
        System.out.print("Jenisnya \t: ");
        System.out.println(q.getJenis());
        System.out.print("Harganya \t: ");
        System.out.println(q.getHarga());
        
        KapalTitanic sm = new KapalTitanic();
        sm.setKargo("3");
        sm.setJenis("Titanic");
        sm.setHarga(3000000);
        sm.setJenisKapal("Air,Udara,Api,Bumi");
        sm.cetakInfo();
        System.out.println("Jenis \t:"+sm.getJenisKapal());
        sm.throttle();
    }
}
