 import java.util.Scanner;

public class StudiKasus2_JS6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaMahasiswa;
        String jenisKegiatan;
        int jumlahDokumen, peringkat, kurang, statusPendanaan;

        System.out.print("Nama Mahasiswa : ");
        namaMahasiswa = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA : ");
        jenisKegiatan = sc.nextLine();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA")||
            jenisKegiatan.equalsIgnoreCase("BAKORMA")||
            jenisKegiatan.equalsIgnoreCase("MANDIRI")){

            System.out.println("Jumlah dokumen : ");
            jumlahDokumen = sc.nextInt();
            System.out.println("Peringkat juara : ");
            peringkat = sc.nextInt();
            
            if (peringkat >= 1 && peringkat <= 3){
                if (jumlahDokumen == 4){
                    System.out.println("Status : Dana penghargaan diberikan");
                }else {
                    kurang = 4 - jumlahDokumen;
                    System.out.println("Status : Dokumen tidak lengkap (kurang "+ kurang +" dokumen). Dana penghargaan tidak diberikan");
                }
            }else {
                System.out.println("Status : Dana tidak diberikan karena bukan peraih juara 1, 2, atau 3");
            }

        }else if (jenisKegiatan.equalsIgnoreCase("PKM")){
            System.out.print("Jumlah dokumen : ");
            jumlahDokumen = sc.nextInt();
            System.out.print("Status pendanaan (1/0) : ");
            statusPendanaan = sc.nextInt();

            if (statusPendanaan == 1){
                if (jumlahDokumen == 4) {
                    System.out.println("Status : Dana penghargaan diberikan");
                }else {
                    kurang = 4 - jumlahDokumen;
                    System.out.println("Status : Dokumen tidak lengkap (kurang "+ kurang +" dokumen). Dana penghargaan tidak diberikan");
                }
            }else {
                System.out.println("Status : Dana tidak diberikan karena tim tidak lolos pendanaan");
            }

        }else {
            System.out.println("Status : Jenis kegiatan tidak memperoleh dana penghargaan");
        }
    }
}
