import java.util.Scanner;

public class TambahListHarga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Menu Utama Laundry Merakrayat");
            System.out.println(" 1. List Harga");
            System.out.println(" 2. Pesan");
            System.out.println(" 3. Exit");
            System.out.println(" Pilih  (1-3):");

            int pilihan = scanner.nextInt();

            switch (pilihan){
                case 1:
                    LihatListHarga(scanner);
                    break;
                case 2:
                    FormatPesanan(scanner);
                    break;
                case 3:
                    System.out.println("Terimakasih Telah menggunakan Layanan Kami :)");
                    System.exit(0);
                    break;
                default:

                    return;
            }
        }
    }

    public static void LihatListHarga(Scanner scanner){
        System.out.println(" Daftar Paket Laundry");
        System.out.println(" 1. Papres (Paket Cuci Express) ");
        System.out.println(" 2. Pacili (Paket Cuci Lipat)");
        System.out.println(" 3. Kecuka (Paket Cuci Setrika)");
        System.out.println(" 4. Lanjutkan Pemesanan ");
        System.out.println(" 5. Exit ");
        System.out.println(" Pilih Opsi 1-5: ");

        int pilihanHarga = scanner.nextInt();

        switch (pilihanHarga) {
            case 1:
                System.out.println("Papres (Paket Cuci Express - Rp. 12.000 / Kg)");
                break;
            case 2:
                System.out.println("Pacili (Paket Cuci Lipat - Rp. 4500 / Kg)");
                break;
            case 3:
                System.out.println("Kecuka (Paket Cuci Setrika - Rp. 6000 / Kg)");
                break;
            case 4:
                FormatPesanan(scanner);
                break;
            case 5:
                System.out.println("Terima kasih telah melihat jasa layanan kami Sampai jumpa :)");
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
        }
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
        int HargaPerKg = 0;

        switch (paketPilihan){
            case 1:
                paketNama = "Papress (Paket Cuci Express)";
                HargaPerKg = 12000;
                break;
            case 2:
                paketNama = "Pacili (Paket Cuci Lipat)";
                HargaPerKg = 4500;
                break;
            case 3:
                paketNama = "Kecuka (Paket Cuci Setrika)";
                HargaPerKg = 6000;
                break;
            default:
                System.out.println(" Paket yang anda cari tidak ada.");
                return;
        }
        int totalHarga = HargaPerKg * berat;
        System.out.println("Paket: " + paketNama);
        System.out.println("Berat: " + berat + "kg");
        System.out.println("Total Harga: Rp  "+ totalHarga);
        System.out.println("Terima kasih atass pemesanan anda!");
    }
}