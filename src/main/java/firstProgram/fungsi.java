package firstProgram;
//import  firstProgram.namaku;
//import static firstProgram.namaku.David;
import contoh.hasil;


public class fungsi {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        int z = 10;
        int v = 5;

        namaku.David("Kia");

        hasil.printNama("David Keren");
        tambah(x, y);
        tambah(x, z);
        tambah(y, z);
        tambah(z, v);
    }

    public static int tambah(int a, int b) {
        int hasilTambah = a + b;
        System.out.println("Hasil tambah " + a + " dan " + b + " adalah : " + hasilTambah);
        return hasilTambah;
    }
}

