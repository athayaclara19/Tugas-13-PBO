public class Faktur implements Pembayaran {
    private int noFaktur;
    private Pelanggan pelanggan;

    public Faktur(int noFaktur, Pelanggan pelanggan) {
        this.noFaktur = noFaktur;
        this.pelanggan = pelanggan;
    }

    public int getNoFaktur() {
        return noFaktur;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    @Override
    public void totalBayar() {
    }
}