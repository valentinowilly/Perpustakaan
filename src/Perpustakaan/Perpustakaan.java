package Perpustakaan;

import java.util.Scanner;

public class Perpustakaan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Membuat objek scanner
        Library library = new Library(); // Membuat objek library untuk mengakses fungsionalitas class library

        // Menampilkan menu utama perpustakaan
        System.out.println("=======[Perpustakaan]=======");
        System.out.println("1. Teknologi\n2. Filsafat\n3. Sejarah\n4. Agama\n5. Psikologi\n6. Politik\n7. Fiksi\n8. Tampilkan total buku yang tersedia\n9. Keluar dari program");
        
        // Looping untuk terus menampilkan menu dan menerima input dari pengguna
        while (true){
            System.out.print("Pilhan anda: ");
            int choice = input.nextInt(); // Menerima input pilihan dari user
            switch (choice){
                case 1, 2, 3, 4, 5, 6, 7: // Menampilkan buku berdasarkan kategori yang dipilih
                    library.displayBooksByCategory(choice);
                    break;
                case 8: // Menampilkan total buku yang tersedia
                    library.displayTotalBooksAvailable();
                    break;
                case 9: // Keluar dari program
                    library.exitProgram();
                    break;
                default: // Menampilkan pesan jika tidak valid
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}