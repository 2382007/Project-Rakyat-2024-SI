import java.util.Scanner;

public class MenuMiree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Menu Utama Laundry Merakrayat");
            System.out.println(" 1. List Harga");
            System.out.println(" 2. Pesan");
            System.out.println(" 3. Exit");
            System.out.println(" Pilih menu (1-3)");

            int pilihan = scanner.nextInt();

            switch (pilihan){
                case 1:
                    LihatListHarga();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                default:

                    return;
            }
        }
    }

    public static void LihatListHarga(){
        System.out.println(" Daftar Paket Laundry");
        System.out.println(" 1. Papres (Paket Cuci Express)");
        System.out.println(" 2. Pacili (Paket Cuci Lipat)");
        System.out.println(" 3. Kecuka (Paket Cuci Setrika)");
    }

    public static void FormatPesanan(Scanner scanner){
        System.out.println( " Form Pemesanan ");

        System.out.println(" Nama:");
        String nama = scanner.next();
        System.out.println(" No. Telepon:");
        String telepon = scanner.next();

        System.out.println("Pilih Paket Layanan Kami:" );
        System.out.println(" 1. Papres (Paket Cuci Express)");
        System.out.println(" 2. Pacili (Paket Cuci Lipat)");
        System.out.println(" 3. Kecuka (Paket Cuci Setrika)");
        System.out.println(" Pilih Paket (1-3):");
        int paketPilihan = scanner.nextInt();
        System.out.println("Berat (kg): ");
        int berat = scanner.nextInt();

        System.out.println("\n Rincian Pemesanan ");
        System.out.println("Nama:" + nama);
        System.out.println("No. Telepon:" + telepon);
        String paketNama = "";

        switch (paketPilihan){
            case 1:
                paketNama = "Papress (Paket Cuci Express)";
                break;
            case 2:
                paketNama = "Pacili (Paket Cuci Lipat)";
                break;
            case 3:
                paketNama = "Kecuka (Paket Cuci Setrika)";
                break;
            default:
                System.out.println(" Paket tidak ada.");
                return;
        }
        System.out.println("Paket: " + paketNama);
        System.out.println("Berat: " + berat + "kg");
        System.out.println("Terima kasih atass pemesanan anda!");
    }
}
