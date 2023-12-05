public class Pelanggan extends Produk {     //Inheritance
    private String namaPelanggan;
    private String noHp;
    private String alamat;
    private String kodeBarang;

    public Pelanggan(String namaPelanggan, String noHp, String alamat, String kodeBarang, String namaBarang, double hargaBarang, int jumlahBarang) {
        super(namaBarang, hargaBarang, jumlahBarang);
        this.namaPelanggan = namaPelanggan;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    @Override
    public void totalBayar() {
    }
}