import java.util.Scanner;
public class UAS1C19 {
    static Scanner no19 = new Scanner(System.in);
    static int totalTim19 = 6;
    static String[] namaTim19 = new String[totalTim19];
    static int[][]skorTim19 = new int[totalTim19][2];
    static int[]totalSkor19 = new int[totalTim19];
    
    public static void main(String[] args) {
        boolean menu19 = true;
        while (menu19) {
            System.out.println("\n=====MENU UTAMA=====");
            System.out.println("1. Input data skor tim");
            System.out.println("2.Tampilkan Tabel Skor ");
            System.out.println("3. Tentukan Juara");
            System.out.println("4. Keluar");
            System.out.println("======================");
            System.out.print("Masukkan Pilihan (1-4): ");
            int pilihan19 = no19.nextInt();
            no19.nextLine();

            switch (pilihan19) {
                case 1:
                    inputData19();
                    break;
                case 2:
                    tampilkanData19();
                    break;
                case 3:
                    tentukanJuara19();
                    break;
                case 4:
                    menu19 = false;
                    System.out.println("\nTerima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi");
            }
            
        }
    }
    public static void inputData19() {
        for (int i = 0; i<6; i++) {
            System.out.print("Masukan nama tim ke-" + (i + 1) + ": ");
            namaTim19[i] = no19.nextLine();
            System.out.print("Masukkan skor " + namaTim19[i] + " untuk level 1: ");
            skorTim19[i][0] =validasiSkor19(no19.nextInt());
            System.err.print("Masukkan skor " + namaTim19[i] + " untuk level 2: ");
            skorTim19[i][1] = no19.nextInt();
            no19.nextLine();

            totalSkor19[i] = skorTim19[i][0] + skorTim19[i][1];
        }
        System.out.println("Data skor tim berhasil ditambahkan.");
    }
    public static void tampilkanData19() {
        System.out.println("\n Tabel Skor Turnamen");
        System.out.printf("%-10s %-8s %-8s %-8s\n","Nama Tim", "Level 1", "Level 2", "Total Skor");
        for (int i = 0; i < totalTim19; i++) {
            System.out.printf("%-10s %-8d %-8d %-8d\n", namaTim19[i], skorTim19[i][0], skorTim19[i][1], totalSkor19[i]);
        }

    }
    public static void tentukanJuara19() {
        int juaraIndex = 0;
        for (int i = 1; i < 6; i++ ) {
            if (totalSkor19[i] > totalSkor19[juaraIndex] || (totalSkor19[i] == totalSkor19[juaraIndex] && skorTim19[i][1] > skorTim19[juaraIndex][1])) {
                juaraIndex = 1;
            }
        }
        System.out.println("Selamat kepada Tim " + namaTim19[juaraIndex] + " yang telah memenangkan kompetisi!");
    }
    public static int validasiSkor19(int skor) {
        if (skor < 35) {
            System.out.println("Skor tidak valid (harus 1-35). Skor dianggap 0 ");
        return 0;
        }
        return skor;
    }
    
    
}