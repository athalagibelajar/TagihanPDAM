package RPLProduktif.BuAul.Tugas;

import java.util.Scanner;

public class LatihanFungsi {
    static void tampilNama(int id){
        String namaPelanggan[]={"Ali","Budi","Dani","Edi"};
        System.out.println(namaPelanggan[id-1]);
        }
     static void hitungTarif(int jumlahPakai){
        int harga = 0;
        if(jumlahPakai >0 && jumlahPakai<10){
            jumlahPakai=10;
            harga=jumlahPakai*2000;
        }
        else if(jumlahPakai>=11 && jumlahPakai<=20){
            harga=jumlahPakai*3000;
        }
        else if(jumlahPakai>=21 && jumlahPakai<=30){
            harga=jumlahPakai*4000;
        }
        else if(jumlahPakai>=31){
            harga=jumlahPakai*5000;
        }
        System.out.println(harga+10000);
    }
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Penginputan Pengggunaan Air PDAM");
    System.out.print("Masukkan Nomer Id Anda:");
    int id = input.nextInt();
    System.out.println("id Pelanggan:"+id);
    tampilNama(id);
    System.out.println("Masukkan Penggunaan Air: ");
    int air = input.nextInt();
    System.out.println("Penggunaan Air: "+air);
    hitungTarif(air);

}
}


    

