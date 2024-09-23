import java.util.Scanner;

public class TugasTerus2 {
    public static void listMenu(Scanner input){
        System.out.println("Pilih bangun datar:");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
        System.out.print("Masukkan Pilihan: ");
    }

    public static void inputSisiPersegi(Scanner input) {
        System.out.print("Masukkan sisi persegi: ");
        double sisiPersegi = input.nextDouble();
        double luasPersegi = hitungLuasPersegi(sisiPersegi);
        double kelilingPersegi = hitungKelilingPersegi(sisiPersegi);
        System.out.println("Luas persegi: " + luasPersegi);
        System.out.println("Keliling Persegi: " + kelilingPersegi);
    }

    public static double hitungLuasPersegi(double sisiPersegi){
        return sisiPersegi * sisiPersegi;
    }

    public static double hitungKelilingPersegi(double sisiPersegi){
        return 4 * sisiPersegi;
    }

    public static void inputPanjangDanLebarPersegiPanjang(Scanner input){
        System.out.println("Masukkan Panjang Persegi Panjang: ");
        double panjang = input.nextDouble();
        System.out.println("Masukkan Lebar Persegi Panjang: ");
        double lebar = input.nextDouble();
        double luasPersegiPanjang = hitungLuasPersegiPanjang(panjang, lebar);
        double kelilingPersegiPanjang = hitungKelilingPersegiPanjang(panjang, lebar);
        System.out.println("Luas Persegi Panjang: " + luasPersegiPanjang);
        System.out.println("Keliling Persegi Panjang: " + kelilingPersegiPanjang);
    }

    public static double hitungLuasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }

    public static double hitungKelilingPersegiPanjang(double panjang, double lebar){
        return 2 * (panjang + lebar);
    }

    public static void inputLingkaran(Scanner input){
        System.out.print("Masukkan Jari - jari Lingkaran: ");
        double jariJari = input.nextDouble();
        double luasLingkaran = hitungLuasLingkaran(jariJari);
        double  kelilingLingkaran = hitungKelilingLingkaran(jariJari);
        System.out.println("Luas Lingkaran: " + luasLingkaran);
        System.out.println("Keliling Lingkaran: " + kelilingLingkaran);
    }

    public static double hitungLuasLingkaran(double jariJari){
        final double phi = Math.PI;
        return phi * (jariJari * jariJari);
    }

    public static double hitungKelilingLingkaran(double jariJari){
        final double phi = Math.PI;
        return  2 * phi * jariJari;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        listMenu(input);
        int pilihan = input.nextInt();

        switch (pilihan){
            case 1:
                inputSisiPersegi(input);
                break;
            case 2:
                inputSisiPersegi(input);
                break;
            case 3:
                inputLingkaran(input);
                break;
            default:
                System.out.print("Masukkan angka yang benar!");
                break;
        }

        input.close();
    }

}
