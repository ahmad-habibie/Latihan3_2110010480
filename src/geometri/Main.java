package geometri;
public class Main {
    public static void main(String[] args) {
        // Membuat objek Lingkaran
        Lingkaran lingkaran = new Lingkaran(9.8);

        // Menggunakan objek Lingkaran untuk menghitung luas dan keliling
        double luasLingkaran = lingkaran.luas();
        double kelilingLingkaran = lingkaran.keliling();

        System.out.println("Lingkaran:");
        System.out.println("Luas: " + luasLingkaran);
        System.out.println("Keliling: " + kelilingLingkaran);

        System.out.println();

        // Membuat objek PersegiPanjang
        PersegiPanjang persegiPanjang = new PersegiPanjang(5.3, 2.7);

        // Menggunakan objek PersegiPanjang untuk menghitung luas dan keliling
        double luasPersegiPanjang = persegiPanjang.luas();
        double kelilingPersegiPanjang = persegiPanjang.keliling();

        System.out.println("Persegi Panjang:");
        System.out.println("Luas: " + luasPersegiPanjang);
        System.out.println("Keliling: " + kelilingPersegiPanjang);
    }
}