package praktek3;

public class Kapal {
   private String kargo;
   private String jenis;
   private double harga;
   
   void cetakInfo(){
       System.out.println("Kargo \t: "+kargo+"\n"+
               "Jenis \t: "+jenis+"\n"+
               "Harga \t:"+harga);
   }

    public String getKargo() {
        return kargo;
    }

    public void setKargo(String kargo) {
        this.kargo = kargo;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
   
   
}
