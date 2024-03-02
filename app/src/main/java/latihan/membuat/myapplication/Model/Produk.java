package latihan.membuat.myapplication.Model;

public class Produk {
    //attribut
    private String namaProduk;
    private int hargaProduk;
    private int gambarProduk;

    public Produk(String namaProduk, int hargaProduk, int gambarProduk) {
        this.namaProduk = namaProduk;
        this.hargaProduk = hargaProduk;
        this.gambarProduk = gambarProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public int getHargaProduk() {
        return hargaProduk;
    }

    public void setHargaProduk(int hargaProduk) {
        this.hargaProduk = hargaProduk;
    }

    public int getGambarProduk() {
        return gambarProduk;
    }

    public void setGambarProduk(int gambarProduk) {
        this.gambarProduk = gambarProduk;
    }
}
