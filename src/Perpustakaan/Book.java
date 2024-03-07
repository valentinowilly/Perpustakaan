package Perpustakaan;

// Kelas untuk merepresentasikan buku
class Book {
    private String name;
    private String[] authors;
    private int numberOfPages;
    private int publicationYear;
    private String publisher;

    // Konstruktor untuk inisialisasi buku
    public Book(String name, String[] authors, int numberOfPages, int publicationYear, String publisher) {
        this.name = name;
        this.authors = authors;
        this.numberOfPages = numberOfPages;
        this.publicationYear = publicationYear;
        this.publisher = publisher;
    }

    // Getter methods untuk mengakses data buku m
    public String getName() {
        return name;
    }

    public String[] getAuthors() {
        return authors;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getPublisher() {
        return publisher;
    }
}

// Kelas untuk merepresentasikan perpustakaan
class Library {
    private Book[][] books; // Array 2 dimensi untuk menyimpan buku dalam berbagai kategori

    // Konstruktor untuk inisialisasi perpustakaan dan buku-bukunya
    public Library() {
        books = new Book[7][6]; // Inisialisasi array 2 dimensi

        // Kategori Teknologi
        books[0] = new Book[]{
            new Book("System Requirement Analysis", new String[]{"Jeffrey O. Grady"}, 801, 2014, "Elsevier"),
            new Book("101 Trik Excel Gaya Youtuber", new String[]{"Ignasius Ryan"}, 184, 2022, "Elex Media Komputindo"),
            new Book("Modern Operating System", new String[]{"Andrew S. Tanenbaum"}, 1076, 2008, "Pearson Prentice Hall"),
            new Book("Master Data Management", new String[]{"David Loshin"}, 274, 2009, "Morgan Kaufmann"),
            new Book("Numeral Mathematics and Computing", new String[]{"Ward Cheney", "David Kincaid"}, 678, 2013, "Brooks/Cole"),
            new Book("Computer Ethics", new String[]{"Deborah G. Johnson"}, 240, 2001, "Prentice Hall"),
        };

        // Kategori Filsafat
        books[1] = new Book[]{
            new Book("Filsafat Ilmu", new String[]{"Nunu Burhanuddin"}, 261, 2019, "Prenadamedia Group"),
            new Book("Buku Studi Dasar Filsafat", new String[]{"Tazkiyah Basa'ad"}, 197, 2018, "Deepublish"),
            new Book("Filsafat Pendidikan Islam", new String[]{"Afifuddin Harisah"}, 303, 2018, "STAIN Malikussaleh Lhokseumawe"),
            new Book("Buku Filsafat Pendidikan Vokasi", new String[]{"Soetyono Iskandar", "Mardi Syahir"}, 112, 2017, "Deepublish"),
            new Book("Mengampuni yang Tak Terampuni", new String[]{"Nikolaus Kristiyanto"}, 161, 2022, "Pustaka Aksara"),
        };

        // Kategori Sejarah
        books[2] = new Book[]{
            new Book("A History of China", new String[]{"Frederick Wells W."}, 628, 2020, "Indoliterasi"),
            new Book("A Brief History of The World", new String[]{"George Willis Bostford", "Jay Barret Bostfor", "dkk"}, 502, 2018, "Alexander Books"),
            new Book("Sejarah Tembakau dan Penyebarannya", new String[]{"Billings E.R"}, 540, 2019, "Indoliterasi"),
            new Book("Mengulas Dokumen Kerajaan Huristak Dari Masa ke Masa", new String[]{"Tondi Hasibuan", "Jorry Sam"}, 36, 2020, "Deepublish"),
            new Book("Sejarah Asia Barat", new String[]{"Syaiful", "Anisa Septianingrum"}, 98, 2018, "Graha Ilmu"),
        };

        // Kategori Agama
        books[3] = new Book[]{
            new Book("Mr. Crack dari Parepare", new String[]{"Andi Makmur Makka"}, 493, 2019, "Republika Penerbit"),
            new Book("Belajar dari Partai Masjumi", new String[]{"Artawijaya"}, 208, 2014, "Pustaka Al Kautsar"),
            new Book("Biografi Umar bin Khattab", new String[]{"Ali Muhammad ash-Shallabi"}, 501, 2019, "Pustaka Al Kautsar"),
            new Book("Akhlak Tasawuf", new String[]{"Muhammad Muhajir"}, 266, 2020, "Kementerian Agama RI"),
            new Book("Tuhan Ada di Hatimu", new String[]{"Husein Ja'far Al-Hadar"}, 203, 2020, "Noura Books Publishing"),
        };

        // Kategori Psikologi
        books[4] = new Book[]{
            new Book("The Psychology of Money", new String[]{"Morgan Housel"}, 320, 2024, "Baca"),
            new Book("Psikologi Perkembangan Anak Edisi 2", new String[]{"Iriani Indri Hapsari"}, 220, 2023, "Campustakaa"),
            new Book("Pastoral Konseling dan Kesehatan Mental", new String[]{"Siswanto", "Mesach Krisetya"}, 240, 2023, "Penerbit Andi"),
            new Book("Seni Berkomunikasi Menanggapi Pertanyaan Anak Yang Sulit", new String[]{"Samanta Elsener"}, 200, 2022, "Elex Media Komputindo"),
            new Book("Metode Berkomunikasi Dengan Gambar", new String[]{"Nur Fatwikiningsih"}, 237, 2023, "Penerbit Andi"),
        };

        // Kategori Politik
        books[5] = new Book[]{
            new Book("Diaspora Bangga Berbangsa", new String[]{"Fenty Effendy"}, 200, 2023, "Penerbit Buku Kompas"),
            new Book("Jalan Tengah Golongan Karya", new String[]{"Erwin Aksa", "Sharif Cicip Sutarjo"}, 130, 2024, "Gramedia Pustaka Utama"),
            new Book("Kiprah Politik Soekarno", new String[]{"Yonita Yulia Yalinda"}, 240, 2024, "Anak Hebat Indonesisa"),
            new Book("Filsafat Pancasila", new String[]{"Nur Rohim Yunus", "Serlika Aprita"}, 268, 2022, "Refika Aditama"),
            new Book("Etika Politik", new String[]{"Franz Magnis-Suseno"}, 564, 2016, "Gramedia Pustaka Utama"),
            new Book("The Social Contract", new String[]{"Jean Jacques Rousseau"}, 208, 2024, "Anak Hebat Indonesia"),
        };

        // Kategori Fiksi
        books[6] = new Book[]{
            new Book("Pingkan Melipat Jarak ", new String[]{"Sapardi Djoko Darmono"}, 128, 2022, "Gramedia Pustaka Utama"),
            new Book("Pasutri Gaje", new String[]{"Annisa Nisfihani"}, 232, 2024, "Falcon Publishing"),
            new Book("One Punch Man 10", new String[]{"Yusuke Murata"}, 216, 2017, "Elex Media Komputindo"),
            new Book("Rumah Untuk Alie", new String[]{"Lenn Liu"}, 300, 2024, "Tekad"),
            new Book("Oi Abang Oi", new String[]{"Armaraher"}, 308, 2024, "Akad"),
            new Book("Malam Tanpa Akhir (Enddles Night)", new String[]{"Agatha Christie"}, 304, 2017, "Gramedia Pustaka Utama"),
        };
    }

    // Metode untuk menampilkan buku berdasarkan kategori yang dipilih
    public void displayBooksByCategory(int category) {
        switch (category) {
            case 1:
                displayCategoryBooks("TEKNOLOGI", books[category - 1]);
                break;
            case 2:
                displayCategoryBooks("FILSAFAT", books[category - 1]);
                break;
            case 3:
                displayCategoryBooks("SEJARAH", books[category - 1]);
                break;
            case 4:
                displayCategoryBooks("AGAMA", books[category - 1]);
                break;
            case 5:
                displayCategoryBooks("PSIKOLOGI", books[category - 1]);
                break;
            case 6:
                displayCategoryBooks("POLITIK", books[category - 1]);
                break;
            case 7:
                displayCategoryBooks("FIKSI", books[category - 1]);
                break;
            default: // Menampilkan pesan apabila pilihan tidak valid
                System.out.println("Kategori tidak valid.");
        }
    }

    // Metode untuk menampilkan buku-buku dalam kategori yang dipilih
    private void displayCategoryBooks(String categoryName, Book[] categoryBooks) {
        System.out.println("=========[BUKU KATEGORI " + categoryName + "]=========");
        int bookNumber = 1;
        for (Book book : categoryBooks) {
            if (book != null) {
                displayBookDetails(book, bookNumber++);
            }
        }
    }

    // Metode untuk menampilkan detail buku
    private void displayBookDetails(Book book, int bookNumber) {
        // Menampilkan detail buku seperti nama, penulis, halaman, tahun terbit, dan penerbit
        System.out.println("Buku ke-" + bookNumber);
        System.out.println("1. Nama Buku\t\t: " + book.getName());
        System.out.println("2. Penulis\t\t: " + String.join(", ", book.getAuthors()));
        System.out.println("3. Jumlah Halaman\t: " + book.getNumberOfPages());
        System.out.println("4. Tahun Terbit\t\t: " + book.getPublicationYear());
        System.out.println("5. Nama Penerbit\t: " + book.getPublisher());
        System.out.println();
    }

    // Metode untuk menampilkan total buku yang tersedia di perpustakaan
    public void displayTotalBooksAvailable() {
        // Menghitung total buku yang tersedia dalam semua kategori
        int total = 0;
        for (Book[] category : books) {
            for (Book book : category) {
                if (book != null) {
                    total++;
                }
            }
        }
        System.out.println("Total buku yang tersedia di perpustakaan: " + total);
    }

    // Metode untuk keluar dari program 
    public void exitProgram() {
        // Menampilkan pesan terima kasih dan mengakhiri program
        System.out.println("Terima kasih telah menggunakan layanan perpustakaan.");
        System.exit(0);
    }
}