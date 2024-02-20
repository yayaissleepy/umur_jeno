import java.time.LocalDate; //file header
import java.time.Period;
import java.util.Scanner;

public class jeno { //fungsi
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data diri
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine(); //scanner for ngebaca

        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelamin = scanner.next().charAt(0);
        String jenisKelaminLengkap = (jenisKelamin == 'P') ? "Perempuan" : "Laki-laki";

        System.out.print("Masukkan tanggal lahir (YYYY-MM-DD): ");
        String tanggalLahirString = scanner.next();
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirString);

        // Hitung umur
        LocalDate hariIni = LocalDate.now();
        Period selisih = Period.between(tanggalLahir, hariIni); //menghitung
        int umur = selisih.getYears();

        // Output data diri dan umur
        System.out.println("\n===== Data Diri =====");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelaminLengkap);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("Umur: " + umur + " tahun");

        scanner.close();
}
}