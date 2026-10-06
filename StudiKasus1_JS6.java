import java.util.Scanner;

public class StudiKasus1_JS6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaPercup = 18000;
        int jumlahCup,uangBayar;
        int totalHarga, diskon = 10/100, totalBayar;
        int kembalian, kurang;

        System.out.println("Masukkan jumlah cup : ");
        jumlahCup = sc.nextInt();
        System.out.println("Masukkan uang bayar : ");
        uangBayar = sc.nextInt();

        totalHarga = jumlahCup * hargaPercup;

        if (totalHarga >= 100000){
            diskon = totalHarga * diskon;
        }

        totalBayar = totalHarga - diskon;
        System.out.println("Harga per cup adalah Rp. "+ hargaPercup);
        System.out.println("Masukkan jumlah cup : "+ jumlahCup);
        System.out.println("Total harga : Rp "+ totalHarga);
        System.out.println("Diskon : Rp "+ diskon);

        if (uangBayar >= totalBayar){
            kembalian = uangBayar - totalBayar;
            System.out.println("Masukkan uang bayar : Rp "+ uangBayar);
            System.out.println("Kembalian : Rp "+ kembalian);
        }else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp "+ kurang);
        }
        
        sc.close();


    }
}
