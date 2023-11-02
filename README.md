# KOMPUTER PEMROGRAMAN (CODING) DALAM KEHIDUPAN SEHARI-HARI.


[![N|Solid](https://cldup.com/dTxpPi9lDf.thumb.png)](https://nodesource.com/products/nsolid)

[![made-with-javascript](https://img.shields.io/badge/Made%20with-JavaScript-1f425f.svg)](https://www.javascript.com)

Dalam kesempatan kali program yang  dibuat itu dengan bahasa pemrograman bahsa java.

# SOFTWARE YANG DIGUNAKAN 
Software yang digunakan pada pemrograman kali ini yaitu :
Intelij IDEA versi.2023.2.4

# SOAL & PERMASALAHAN
1.  Buatlah perulangan hingga 100 menggunakan Java dengan output sebagai berikut:
    1
    2
    3
    4
    5
    6
    7
    8
    9
    (Your Name)
    (Your Name)
    (Your Name)

2. Buatlah program bebas, dengan menerapkan if else dalam perulangan while
3. Buatlah program zodiac dengan menggunakan fitur input dengan hasil menampilkan zodiac sesuai dengan tanggal lahir yang diinputkan.
4. uatlah sebuah variabel dengan tipe data array, kemudian tampilkan semua nilai dalam variabel tersebut menggunakan perulangan for.

# PENJELASAN ISTILAH
1. Penjelasan Istilah Array :
Array adalah struktur data yang digunakan dalam pemrograman untuk menyimpan sejumlah elemen data dengan tipe yang sama di dalam satu variabel. Setiap elemen dalam array diidentifikasi oleh indeks atau nomor urutnya. Indeks ini biasanya dimulai dari 0 untuk elemen pertama, 1 untuk elemen kedua, dan seterusnya

Beberapa hal penting yang perlu dipahami tentang array meliputi:

- Tipe Data Seragam: Semua elemen dalam array memiliki tipe data yang sama. Misalnya, array bilangan bulat (integer) hanya akan berisi bilangan bulat, dan array string hanya akan berisi string.
- Ukuran Tetap: Array memiliki ukuran yang tetap, yang ditentukan saat array dideklarasikan. Ini berarti Anda harus menentukan berapa banyak elemen yang akan disimpan dalam array saat Anda membuatnya. Ukuran array biasanya tidak dapat diubah setelah array dibuat.
- Indeks: Elemen-elemen dalam array diakses menggunakan indeks numerik. Indeks dimulai dari 0 (indeks pertama) dan berakhir pada n-1, di mana n adalah ukuran array. Misalnya, jika sebuah array memiliki 5 elemen, indeksnya adalah 0, 1, 2, 3, dan 4.
- Akses dan Manipulasi Data: Anda dapat mengakses, memodifikasi, atau menghapus elemen-elemen dalam array menggunakan indeks. Contohnya, untuk mengakses elemen ke-3 dalam array, Anda dapat menggunakan array[2] jika indeks dimulai dari 0.
- Pengulangan (Looping): Array sering digunakan dalam pengulangan untuk melakukan operasi pada setiap elemen. Anda dapat menggunakan loop untuk mengakses semua elemen dalam array dan melakukan operasi tertentu pada masing-masing elemen.
- Penggunaan Umum: Array digunakan untuk menyimpan data terkait dalam satu struktur, seperti daftar nilai, elemen-elemen matriks, daftar nama, atau elemen-elemen dalam daftar belanja.
- Bahasa Pemrograman: Hampir semua bahasa pemrograman mendukung array, meskipun sintaksis dan fitur-fiturnya dapat bervariasi antara bahasa. Contoh bahasa pemrograman yang mendukung array termasuk Python, Java, C++, JavaScript, dan banyak lainnya.

Contoh ARRAY dalam Bahasa Pemrograman java :
>// Membuat array bilangan bulat
var numbers = [1, 2, 3, 4, 5];

>// Membuat array string
var colors = ["merah", "biru", "kuning", "hijau"];

2. Penjelasan Istilah Boolean:
Istilah "Boolean" merujuk pada jenis tipe data yang memiliki dua nilai mungkin: true (benar) dan false (salah). Istilah ini dinamai dari matematikawan George Boole, yang mengembangkan aljabar Boolean, yang digunakan dalam pemrosesan logika dan perhitungan logika.

Berikut beberapa poin penting terkait dengan Boolean:
- Nilai: Boolean hanya memiliki dua nilai valid, yaitu true dan false. Ini digunakan untuk merepresentasikan kebenaran atau ketidakbenaran suatu pernyataan atau kondisi dalam pemrograman.
- Pemrograman: Dalam pemrograman, Boolean sering digunakan dalam pengkondisian (if statements), pengulangan (loops), dan operasi logika. Misalnya, Anda dapat menggunakan Boolean untuk memeriksa apakah suatu kondisi benar atau salah, dan berdasarkan hasilnya, mengambil tindakan tertentu.
- Operator Logika: Operator logika seperti AND, OR, dan NOT digunakan dengan Boolean untuk melakukan operasi logika. Misalnya, && digunakan untuk AND, || digunakan untuk OR, dan ! digunakan untuk NOT.
- Perbandingan: Boolean juga digunakan dalam operasi perbandingan. Misalnya, Anda dapat membandingkan dua angka dan mendapatkan hasil Boolean yang menunjukkan apakah perbandingannya benar atau salah. Contohnya, 5 < 10 akan menghasilkan true.
- Pengambilan Keputusan: Dalam banyak kasus, Boolean digunakan untuk pengambilan keputusan. Anda dapat menentukan tindakan yang akan diambil berdasarkan apakah suatu kondisi bernilai true atau false. Misalnya, jika kondisi adalah true, maka tindakan tertentu akan dilakukan, dan jika kondisi adalah false, tindakan lain akan diambil.
- Variabel Boolean: Anda juga dapat mendeklarasikan variabel dengan tipe data Boolean untuk menyimpan nilai Boolean. Ini memungkinkan Anda untuk menyimpan dan memanipulasi hasil logika dengan lebih fleksibel.

Contoh Boolean dalam bahasa java:

    public class BooleanExample {
    public static void main(String[] args) {
        boolean isJavaFun = true;
        boolean isProgrammingHard = false;

        // Penggunaan tipe data boolean dalam pengkondisian
        if (isJavaFun) {
            System.out.println("Java adalah bahasa yang menyenangkan.");
        }

        if (!isProgrammingHard) {
            System.out.println("Pemrograman tidak sulit.");
        }

        // Operasi logika dengan tipe data boolean
        boolean isLearning = isJavaFun && !isProgrammingHard;
        if (isLearning) {
            System.out.println("Saya sedang belajar Java dan merasa senang.");
        }
    }
}

3. Penjelasan Istilah Looping 
Looping (atau disebut juga "perulangan") adalah konsep dalam pemrograman yang digunakan untuk menjalankan serangkaian pernyataan atau blok kode secara berulang atau berulang-ulang. Ini memungkinkan Anda untuk mengotomatisasi tugas-tugas berulang dan menjalankan kode yang sama beberapa kali dengan perbedaan data atau kondisi. Looping sangat penting dalam pemrograman karena memungkinkan Anda untuk menghemat waktu dan mengurangi redundansi dalam kode.

Ada dua jenis umum dari looping yang digunakan dalam pemrograman:
- Looping Definite (Perulangan Terbatas): Jenis looping ini akan berjalan sejumlah tertentu kali, sesuai dengan jumlah yang telah ditentukan sebelumnya. Sebagai contoh, Anda tahu bahwa Anda ingin menjalankan suatu pernyataan sebanyak 5 kali, dan Anda dapat menggunakan looping definite seperti for atau while dengan batasan yang telah ditentukan.
- Looping Indefinite (Perulangan Tak Terbatas): Jenis looping ini akan berjalan selama suatu kondisi tertentu terpenuhi. Looping indefinite sering menggunakan while atau do-while, dan Anda harus berhati-hati agar tidak membuat loop tak terbatas yang tidak pernah berhenti.

Beberapa istilah terkait dengan looping meliputi:
- Inisialisasi: Langkah awal dalam looping untuk mengatur nilai awal yang diperlukan sebelum memulai perulangan, misalnya, inisialisasi penghitung.
- Pengulangan (Iterasi): Setiap "putaran" dalam loop, di mana blok kode dijalankan sekali.
- Kondisi Terminasi: Kondisi yang memutuskan kapan looping akan berhenti. Misalnya, dalam for, kondisi terminasi didefinisikan sebagai berapa kali looping akan diulangi.
- Pengembalian: Langkah akhir untuk mengubah nilai yang digunakan dalam loop, seperti meningkatkan penghitung atau mengubah nilai yang digunakan dalam kondisi terminasi.

Contoh Looping Dalam bahasa java:
- Penggunaan for Loop:
for loop sering digunakan ketika Anda sudah mengetahui berapa kali looping harus dijalankan.

>for (int i = 0; i < 5; i++) {
    System.out.println("Iterasi ke-" + i);
}
alam contoh di atas, for loop akan berjalan sebanyak 5 kali karena kita telah menentukan kondisi terminasi (i < 5). Setiap kali loop dijalankan, nilai i akan ditingkatkan, dan iterasi akan mencetak pesan sesuai dengan nilai i.

- Penggunaan while Loop:
while loop digunakan ketika Anda ingin menjalankan blok kode selama kondisi tertentu terpenuhi.

>int angka = 1;
while (angka <= 5) {
    System.out.println("Iterasi ke-" + angka);
    angka++;
}
Dalam contoh di atas, while loop akan berjalan selama nilai angka kurang dari atau sama dengan 5. Setiap iterasi, kita mencetak pesan dan kemudian meningkatkan nilai angka.

- Penggunaan do-while Loop:
do-while loop mirip dengan while loop, tetapi perbedaannya adalah bahwa do-while loop selalu menjalankan blok kode sekali sebelum memeriksa kondisi.

>int angka = 1;
do {
    System.out.println("Iterasi ke-" + angka);
    angka++;
} while (angka <= 5);
Dalam contoh di atas, blok kode akan dijalankan sekali bahkan jika kondisi angka <= 5 tidak terpenuhi. Kemudian, kondisi akan diperiksa, dan jika benar, loop akan berlanjut.

# PENJELASAN SETIAP BAGIAN SOAL
>1 soal pertama:

    public static void main(String[] args) {
        String name = "Muhammad Fadli Rahmansyah";
        String NPM = "G1A023005";
        System.out.println("Nama    : " + name);
        System.out.println("NPM    : " + NPM);
        System.out.println("===============");
        for (int i = 0; i <= 100; i++) {
            if (i >= 10) {
                System.out.println(name);
            } else {
                System.out.println(i);
            }
        }
    }
}
>Metode yang digunakan:

Kode ini menggunakan metode public static void main(String[] args) sebagai metode utama. Metode ini akan dijalankan saat program dijalankan.

>Variabel data:

Ada dua variabel yang dideklarasikan di awal:
name dengan nilai "Muhammad Fadli Rahmansyah".
NPM dengan nilai "G1A023005".

>Penjelasan kode:

Variabel name dan NPM digunakan untuk menyimpan nama dan nomor pokok mahasiswa (NPM).
System.out.println digunakan untuk mencetak teks ke konsol.

>Uraian langkah-langkah:

Program dimulai dengan mencetak nama dan NPM ke layar.
Kemudian, program mencetak garis pemisah "===============".
Selanjutnya, program memasuki loop for dengan inisialisasi i mulai dari 0 dan berlanjut hingga 100.
Di dalam loop, ada percabangan if yang memeriksa apakah i lebih besar atau sama dengan 10. Jika ya, program akan mencetak name, dan jika tidak, program akan mencetak nilai i.
Ini berarti bahwa program akan mencetak nama ("Muhammad Fadli Rahmansyah") sebanyak 91 kali (dari 10 hingga 100) dan mencetak angka dari 0 hingga 9.
Setelah loop selesai, program akan selesai dijalankan.
Hasil dari kode ini adalah mencetak nama "Muhammad Fadli Rahmansyah" sebanyak 91 kali (dari 10 hingga 100) dan mencetak angka dari 0 hingga 9. Selain itu, nama dan NPM juga dicetak di awal program, dan ada garis pemisah yang dicetak setelahnya.

> 2 soal kedua:

import java.util.Scanner

    public class task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Program menghitung bilangan genap dan ganjil.");
        System.out.println("Masukkan bilangan bulat positif (angka negatif untuk keluar): ");

        while (true) {
            int num = input.nextInt();

            if (num < 0) {
                System.out.println("Terima kasih! Program selesai.");
                break;
            }

            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Jumlah bilangan genap: " + evenCount);
        System.out.println("Jumlah bilangan ganjil: " + oddCount);
    }
}

> Metode yang digunakan:

Kode ini menggunakan metode public static void main(String[] args), yang merupakan metode utama yang akan dijalankan saat program dimulai.

>Variabel data:

input adalah objek Scanner yang digunakan untuk menerima masukan dari pengguna.
evenCount adalah variabel bertipe int yang akan digunakan untuk menghitung jumlah bilangan genap.
oddCount adalah variabel bertipe int yang akan digunakan untuk menghitung jumlah bilangan ganjil.

>Penjelasan kode:

Program dimulai dengan menciptakan objek Scanner untuk menerima masukan dari pengguna.
Variabel evenCount dan oddCount diinisialisasi ke nilai awal 0.
Program mencetak pesan pengantar yang meminta pengguna untuk memasukkan bilangan bulat positif dan memberikan petunjuk bahwa pengguna dapat mengakhiri program dengan memasukkan angka negatif.
Program memasuki loop while (true) yang akan terus berjalan sampai pengguna memasukkan angka negatif.
Di dalam loop, program membaca angka yang dimasukkan oleh pengguna dengan input.nextInt().
Program memeriksa apakah angka tersebut negatif. Jika ya, program mencetak pesan terima kasih dan keluar dari loop dengan pernyataan break.
Jika angka tersebut bukan negatif, program memeriksa apakah angka tersebut genap atau ganjil dengan menggunakan operasi modulo (num % 2). Jika angka tersebut genap, maka variabel evenCount akan ditambah satu; jika ganjil, maka variabel oddCount akan ditambah satu.
Setelah loop selesai, program mencetak jumlah bilangan genap dan jumlah bilangan ganjil yang dihitung.

>Uraian langkah-langkah:

- Program dimulai dan mencetak pesan pengantar.
- Program memasuki loop tak terbatas.
- Pengguna diminta untuk memasukkan bilangan bulat.
- Program membaca bilangan yang dimasukkan.
- Jika bilangan negatif, program mencetak pesan terima kasih dan keluar dari loop.
- Jika bilangan bukan negatif, program memeriksa apakah itu genap atau ganjil dan memperbarui hitungan sesuai.
- Langkah-langkah 3 hingga 6 diulang sampai pengguna memasukkan bilangan negatif.
Setelah itu, program mencetak jumlah bilangan genap dan ganjil yang dihitung selama sesi.

>3 soal ketiga 

import java.util.Scanner;

    public class task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat datang di Program Zodiac Finder!");
        System.out.print("Masukkan tanggal lahir (dd/mm): ");
        String inputTanggal = input.nextLine();

        String[] tanggalBulan = inputTanggal.split("/");
        if (tanggalBulan.length != 2) {
            System.out.println("Format tanggal tidak valid. Gunakan format dd/mm.");
            return;
        }

        int tanggal = Integer.parseInt(tanggalBulan[0]);
        int bulan = Integer.parseInt(tanggalBulan[1]);

        String zodiak = findZodiac(tanggal, bulan);

        if (zodiak != null) {
            System.out.println("Zodiak Anda adalah " + zodiak);
        } else {
            System.out.println("Tanggal lahir tidak valid.");
        }
    }

    public static String findZodiac(int day, int month) {
        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            return "Aries";
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            return "Taurus";
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            return "Gemini";
        } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            return "Cancer";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            return "Leo";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            return "Virgo";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            return "Libra";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            return "Scorpio";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            return "Sagittarius";
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
            return "Capricorn";
        } else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            return "Aquarius";
        } else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
            return "Pisces";
        } else {
            return null;
        }
    }
}

> Metode yang digunakan

Kode ini menggunakan metode public static void main(String[] args) sebagai metode utama yang akan dijalankan saat program dimulai.
Selain itu, kode ini juga menggunakan metode public static String findZodiac(int day, int month) untuk menentukan zodiak berdasarkan tanggal lahir yang diberikan.

>Variabel data:

input adalah objek Scanner yang digunakan untuk menerima masukan dari pengguna.
inputTanggal adalah variabel String yang digunakan untuk menyimpan masukan tanggal lahir dalam format "dd/mm".
tanggalBulan adalah array String yang digunakan untuk memisahkan tanggal dan bulan dari masukan pengguna.
tanggal adalah variabel int yang digunakan untuk menyimpan tanggal yang diambil dari masukan pengguna.
bulan adalah variabel int yang digunakan untuk menyimpan bulan yang diambil dari masukan pengguna.
zodiak adalah variabel String yang akan digunakan untuk menyimpan hasil perhitungan zodiak.

>Penjelasan kode:

Program dimulai dengan mencetak pesan selamat datang dan meminta pengguna untuk memasukkan tanggal lahir dalam format "dd/mm".
Masukan pengguna kemudian dibaca sebagai String dan dipisahkan menjadi tanggal dan bulan dengan menggunakan split("/"). Jika format tidak valid (tidak terdiri dari dua bagian), program mencetak pesan kesalahan dan berhenti.
Tanggal dan bulan yang telah dipisahkan diubah menjadi integer menggunakan Integer.parseInt().
Program memanggil metode findZodiac(day, month) untuk menentukan zodiak berdasarkan tanggal dan bulan yang diinputkan.
Hasil dari findZodiac() disimpan dalam variabel zodiak.
Program mencetak hasil berdasarkan apakah zodiak ditemukan atau tidak.

>Uraian langkah-langkah:

- Program dimulai dengan menyambut pengguna dan meminta tanggal lahir dalam format "dd/mm".
- Pengguna memasukkan tanggal lahir.
- Program memisahkan tanggal dan bulan dari masukan.
- Jika format masukan tidak valid, program mencetak pesan kesalahan dan berhenti.
- Jika format masukan valid, program mengkonversi tanggal dan bulan menjadi integer.
- Program memanggil metode findZodiac() dengan tanggal dan bulan sebagai argumen.
- Metode findZodiac() akan menentukan zodiak berdasarkan tanggal lahir.
- Hasilnya disimpan dalam variabel zodiak.
- Program mencetak hasil, yaitu zodiak pengguna berdasarkan tanggal lahir yang dimasukkan.

>4  soal keempat

    public class task4 {
    public static void main (String[] args) {
        double[] myList ={ 1.9, 2.7, 3.4, 6.1 };

        for (int i=0;   i<=3;   i++){
            System.out.println("isi variabel myList indeks ke-" + i + "adalah " + myList[i]);
        }
    }
}

>Metode yang digunakan:

Kode ini menggunakan metode public static void main(String[] args) sebagai metode utama yang akan dijalankan saat program dimulai.

>Variabel data:

myList adalah sebuah array dari tipe data double. Array ini berisi empat elemen dengan nilai-nilai [1.9, 2.7, 3.4, 6.1].

>Penjelasan kode:

Program dimulai dengan mendefinisikan array myList yang berisi empat angka desimal.
Kemudian, program memasuki sebuah loop for yang akan berjalan empat kali (dari 0 hingga 3).
Di dalam loop, program mencetak pesan yang berisi indeks array dan nilai yang ada di indeks tersebut.
Pesan tersebut mencakup indeks i dari array myList dan nilai yang ada di indeks tersebut, sehingga akan mencetak setiap elemen array dan indeksnya.

>Uraian langkah-langkah:

- Program dimulai dengan mendefinisikan array myList dengan empat elemen [1.9, 2.7, 3.4, 6.1].
- Program memasuki loop for yang akan berjalan empat kali.
- Di setiap iterasi loop, program mencetak pesan yang berisi indeks elemen array dan nilai yang - - ada di indeks tersebut.
- Setelah empat iterasi selesai, program selesai dijalankan, dan Anda akan melihat hasil cetakan - yang mencakup indeks dan nilai dari setiap elemen array myList.

# HASIL PERMASALAHAN & PEBEDAAN
1 Hasil soal pertama atau perbedaan
-
>Sebelum

for (int i = 0; i <= 100; i++) {

>Setelah

for (int i = 1; i <= 100; i++) {

     Perbedaan utama antara kedua versi kode tersebut adalah nilai awal iterasi dalam loop for. Pada versi pertama, nilai awal adalah 0, sedangkan pada versi kedua, nilai awal adalah 1.

     Sehingga, pada versi pertama, program mencetak angka dari 0 hingga 100, sedangkan pada versi kedua, program mencetak angka dari 1 hingga 100. Selain itu, output lainnya tetap sama, yaitu mencetak nama "Muhammad Fadli Rahmansyah" untuk nilai i yang lebih besar atau sama dengan 10.

2 Hasil Soal kedua atau perbedaan
-
     Tidak ada perbedaan dalam kode tersebut. Kode tersebut tetap berfungsi untuk menghitung jumlah bilangan genap dan ganjil yang dimasukkan oleh pengguna dan akan menghentikan program saat pengguna memasukkan angka negatif. Hasil yang dicetak juga akan sama, yaitu jumlah bilangan genap dan jumlah bilangan ganjil yang dimasukkan oleh pengguna.
     
3 Hasil Soal Ketiga atau perbedaan
-
     pada pembahsan kali ini tidak ada perbedaan dalam kode tersebut. Kode tersebut tetap berfungsi untuk meminta pengguna memasukkan tanggal lahir dalam format "dd/mm," kemudian menentukan zodiak berdasarkan tanggal tersebut. Hasil yang dicetak juga akan sama, yaitu zodiak berdasarkan tanggal lahir yang dimasukkan oleh pengguna, atau pesan kesalahan jika format tanggal tidak valid.

4 Hasil Soal Keempat atau perbedaan
-
     Perbedaan utama adalah pada loop for, di mana dalam kode yang Anda berikan, batas iterasi adalah i <= 3, sedangkan dalam penjelasan sebelumnya, batas iterasi adalah i < 4.Ini adalah perbedaan yang sangat kecil, dan hasilnya akan sama. Dalam kedua kasus, loop akan berjalan untuk nilai i dari 0 hingga 3 (4 iterasi) dan mencetak isi variabel myList pada indeks yang sesuai.
     Jadi, tidak ada perbedaan yang signifikan dalam hasil kode tersebut. Kode tersebut akan mencetak isi variabel myList untuk setiap indeks dari 0 hingga 3, seperti yang dijelaskan dalam penjelasan sebelumnya.
     

## KESIMPULAN 
Kesimpulan dari program ini adalah sebagai berikut:

>Program pertama mencetak angka dari 1 hingga 9 terlebih dahulu, dan kemudian mencetak nama ("Your Name") sebanyak 91 kali. Ini dilakukan dengan menggunakan loop for yang berjalan dari 1 hingga 100, dan memeriksa apakah angka lebih kecil dari 10 untuk mencetak angka, atau lebih besar atau sama dengan 10 untuk mencetak nama.

>Program kedua mengharuskan Anda membuat program dengan perulangan while yang menggunakan struktur if-else. Detail dari program ini tidak diberikan dalam pertanyaan Anda, tetapi berdasarkan deskripsi, program ini akan menjalankan perulangan while dan dalam setiap iterasinya akan melakukan pengujian if-else untuk menentukan tindakan yang sesuai.

>Program ketiga adalah "Zodiac Finder" yang meminta pengguna memasukkan tanggal lahir dalam format "dd/mm," kemudian menentukan zodiak berdasarkan tanggal tersebut. Program ini menggunakan perulangan while untuk terus meminta masukan hingga format tanggal yang valid dimasukkan, dan kemudian memanggil metode findZodiac untuk menentukan zodiak berdasarkan tanggal.

>Program keempat tidak disertakan dalam pertanyaan Anda, tetapi program ini akan melibatkan penggunaan variabel array untuk menyimpan sejumlah nilai, dan kemudian menggunakan perulangan for untuk mencetak semua nilai dalam variabel tersebut. Detail lebih lanjut akan tergantung pada implementasi program yang diinginkan.

# DAFTAR PUSTAKA
Java Official Documentation (Dokumentasi Resmi Java):

Dokumentasi resmi Java dari Oracle menyediakan informasi mendalam tentang berbagai konsep dan komponen bahasa Java, termasuk array, boolean, dan perulangan.
Situs web: Oracle Java Documentation
"Java: The Complete Reference" oleh Herbert Schildt:

Buku ini adalah referensi komprehensif tentang bahasa pemrograman Java dan mencakup berbagai topik, termasuk array, boolean, dan perulangan.
Link ke Buku
"Head First Java" oleh Kathy Sierra dan Bert Bates:

Buku ini dirancang untuk pemula dan menggunakan pendekatan yang ramah dan mudah dipahami untuk mengajarkan konsep Java, termasuk array dan perulangan.
Link ke Buku
Tutorialspoint Java Tutorial:

Tutorialspoint adalah sumber pembelajaran online yang menyediakan tutorial Java lengkap dengan penjelasan tentang array, boolean, dan perulangan.
Link ke Tutorialspoint Java Tutorial
Stack Overflow:

Stack Overflow adalah forum pemrograman yang dapat membantu Anda mendapatkan jawaban dan pemahaman lebih mendalam tentang istilah-istilah seperti array, boolean, dan perulangan melalui pertanyaan yang diajukan oleh pengguna lain.
Stack Overflow Java Section
Coursera, edX, dan Udacity:

Platform pembelajaran daring ini menawarkan kursus pemrograman Java yang mencakup topik-topik seperti array, boolean, dan perulangan.
Coursera Java Courses
edX Java Courses
Udacity Java Courses
