public class Produk implements Pembayaran {     //Inheritance
    private String namaBarang;
    private double hargaBarang;
    private int jumlahBarang;

    public Produk(String namaBarang, double hargaBarang, int jumlahBarang) {
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.jumlahBarang = jumlahBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public double getHargaBarang() {
        return hargaBarang;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    @Override
    public void totalBayar() {
    }  
}