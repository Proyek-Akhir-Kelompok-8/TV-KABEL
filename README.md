# Manajemen TV Kabel
## Kelompok 8
## Doni Arya Rachmadi (2209116033)
## Remanda Dheva      (2209116034)
## Tugas Proyek Akhir (Capstone Project) Praktikum Pemrograman Berorientasi Objek dan Praktikum Desain Basis Data
## Deskripsi Project
Aplikasi TV Kabel adalah proyek perangkat lunak yang dibangun untuk membantu penyedia layanan TV kabel dalam mengelola dan menyediakan layanan kepada pelanggan mereka. Aplikasi ini dirancang untuk meningkatkan efisiensi operasional, meningkatkan kepuasan pelanggan, dan memberikan alat yang berguna untuk tim manajemen dan dukungan pelanggan. Proyek Manajemen TV Kabel akan melibatkan penggunaan konsep-konsep dasar seperti kelas, objek, pewarisan, enkapsulasi, dan polimorfisme. Dalam proyek ini, kelas-kelas akan digunakan untuk merepresentasikan entitas-entitas yang terlibat, seperti paket TV kabel, pelanggan, dan pegawai. Setiap kelas akan memiliki atribut-atribut yang relevan dengan entitas yang diwakilinya, serta metode-metode yang digunakan untuk mengelola dan memanipulasi data.

Dengan menggunakan konsep-konsep pemrograman berorientasi objek ini, proyek manajemen TV kabel dapat diorganisir dengan lebih terstruktur dan mudah dipelihara. Selain itu, pendekatan ini juga memungkinkan pengembang untuk mengelola kompleksitas proyek dengan lebih efisien dan meningkatkan fleksibilitas dalam menghadapi perubahan kebutuhan atau penambahan fitur di masa depan.

## Flowchart
![pa-flowchart final drawio](https://github.com/Proyek-Akhir-Kelompok-8/PA-PBO/assets/126783072/68160de4-ea54-4b2a-a5c4-a0dad9c37f55)

Flowchart ini dimulai dengan simbol awal (start) yang menandakan awal dari proses. Langkah pertama adalah pengguna melakukan login. Setelah itu, flowchart bercabang ke simbol keputusan, di mana pengguna harus memutuskan apakah ingin login atau keluar. Jika pengguna memilih login, alur proses akan melanjutkan ke Langkah berikutnya, yaitu memasukan username dan password. Jika login berhasil, maka lanjut ke Langkah berikutnya, yaitu menu admin. Flowchart kembali bercabang ke simbol keputusan, di mana pengguna harus memutuskan apakah ingin melanjutkan ke data pelanggan, data paket tv, atau keluar. 

Jika pengguna memilih menu data pelanggan, maka akan dilanjutkan ke proses selanjutnya yang dimana pengguna akan diminta untuk memilih menu yang tersedia dan melanjutkan proses selanjutnya berdasarkan flowchart. Jika pengguna memilih menu data paket tv, maka akan dilanjutkan ke proses selanjutnya yang dimana pengguna akan diminta untuk memilih menu yang tersedia dan melanjutkan proses selanjutnya berdasarkan flowchart. Dan jika pengguna memilih menu keluar, maka akan dilanjutkan ke proses selanjutnya yang dimana pengguna akan kembali pada menu login diawal, lalu pengguna akan diminta untuk memilih menu yang tersedia dan melanjutkan proses selanjutnya berdasarkan flowchart. Jika pengguna memilih keluar pada menu login, maka alur proses in akan berhenti berjalan dan program selesai.

Flowchart ini membantu pengguna dan pihak terkait memahami alur proses manajemen tv kabel secara online dengan jelas. Dengan melihat flowchart, dapat dilihat langkah-langkah yang harus diikuti dan keputusan yang harus diambil dalam setiap tahap. Hal ini memudahkan pengguna untuk mengikuti proses pemesanan dengan benar dan memastikan bahwa semua informasi yang diperlukan telah dimasukkan dengan tepat. Flowchart juga membantu dalam mengidentifikasi dan memperbaiki masalah yang mungkin terjadi dalam proses pendataan.

## ERD

* Logical ERD
  
  ![image](https://github.com/Proyek-Akhir-Kelompok-8/PA-PBO/assets/126783072/740fc388-c906-4b7f-a340-9a68a2f28b2e)

  Logical ERD (Entity Relationship Diagram) dapat digunakan sebagai panduan untuk merancang struktur kelas dan hubungan antar kelas dalam proyek pemrograman. Setiap entitas dalam Logical ERD dapat direpresentasikan sebagai kelas dalam pemrograman berorientasi objek, dengan atribut-atribut entitas menjadi atribut-atribut kelas dan hubungan antar entitas menjadi hubungan antar kelas.

  Misalnya, entitas "Pelanggan" dapat direpresentasikan sebagai kelas "Pelanggan" dalam Pemrograman Berorientasi Objek. Atribut-atribut entitas seperti id pelanggan, nama pelanggan, alamat, no handphone, email, tanggal berlangganan, dan status langganan dapat menjadi atribut pada kelas "Pelanggan". Metode-metode dalam kelas "Pelanggan" dapat digunakan untuk mengelola data pelanggan, seperti mengubah alamat, no handphone, atau status langganan.

  Selain itu, hubungan antara entitas dalam Logical ERD juga dapat direpresentasikan sebagai hubungan antar kelas dalam pemrograman berorientasi objek. Misalnya, hubungan "One-to-Many" antara entitas "Pegawai" dan "Pelanggan" dapat diimplementasikan dengan menggunakan objek "Pegawai" yang memiliki koleksi objek "Pelanggan" sebagai atributnya. Dengan demikian, setiap objek "Pegawai" dapat terhubung dengan banyak objek "Pelanggan", dan setiap objek "Pelanggan" hanya terhubung dengan satu objek "Pegawai".

  Dengan menggunakan Logical ERD sebagai panduan, pemrogram dapat merancang struktur kelas dan hubungan antar kelas yang sesuai dengan kebutuhan proyek. Hal ini memungkinkan pengorganisasian kode yang lebih terstruktur, pemisahan tanggung jawab yang jelas antara kelas-kelas, dan memudahkan pengembangan dan pemeliharaan proyek pemrograman berorientasi objek secara keseluruhan.

* Relational ERD
  ![image](https://github.com/Proyek-Akhir-Kelompok-8/PA-PBO/assets/126783072/4ba2705e-45c1-4059-afaa-4bbb44e0813f)

  Dalam pemrograman berorientasi objek, Relational ERD dapat digunakan sebagai panduan untuk merancang struktur kelas dan hubungan antar kelas dalam proyek pemrograman. Setiap entitas dalam Relational ERD dapat direpresentasikan sebagai kelas dalam pemrograman berorientasi objek, dengan atribut-atribut entitas menjadi atribut-atribut kelas.

  Selain itu, hubungan antara entitas dalam Relational ERD juga dapat direpresentasikan sebagai hubungan antar kelas dalam pemrograman berorientasi objek. Misalnya, hubungan "One-to-Many" antara entitas "Paket TV Kabel" dan "Pelanggan" dapat diimplementasikan dengan menggunakan objek "PaketTV" yang memiliki koleksi objek "Pelanggan" sebagai atributnya. Dengan demikian, setiap objek "PaketTV" dapat terhubung dengan banyak objek "Pelanggan", dan setiap objek "Pelanggan" hanya terhubung dengan satu objek "PaketTV".
  
  Dengan menggunakan Relational ERD sebagai panduan, pemrogram dapat merancang struktur kelas dan hubungan antar kelas yang sesuai dengan kebutuhan proyek. Hal ini memungkinkan pengorganisasian kode yang lebih terstruktur, pemisahan tanggung jawab yang jelas antara kelas-kelas, dan memudahkan pengembangan dan pemeliharaan proyek pemrograman berorientasi objek secara keseluruhan. Selain itu, struktur database yang sesuai dengan Relational ERD juga dapat diimplementasikan menggunakan ORM (Object-Relational Mapping) untuk memudahkan interaksi antara objek dalam pemrograman dengan basis data.


## Hierarki
![pa-hierarki drawio](https://github.com/Proyek-Akhir-Kelompok-8/PA-PBO/assets/126783072/6ef738c0-c9d8-469f-9037-e3aa224d0750)

Hierarki paket TV dimulai dengan tingkat teratas, yaitu "Paket TV". Ini adalah entitas supertype yang mewakili kategori umum dari paket TV yang tersedia. Paket TV memiliki atribut-atribut seperti ID paket, nama paket, harga, masa berlaku, daftar saluran, dan fitur tambahan.
Di bawah "Paket TV", terdapat dua subtype yang lebih spesifik, yaitu "Platinum" dan "Diamond". "Platinum" adalah salah satu jenis paket TV yang termasuk dalam kategori "Paket TV". Ini memiliki atribut-atribut yang diturunkan dari "Paket TV", seperti ID paket (sebagai primary key dan foreign key), konten premium, dan atribut-atribut lain yang mungkin spesifik untuk paket Platinum.
Di tingkat yang lebih rendah lagi, terdapat subtype "Diamond". "Diamond" juga merupakan jenis paket TV yang termasuk dalam kategori "Paket TV". Seperti "Platinum", "Diamond" memiliki atribut-atribut yang diturunkan dari "Paket TV", seperti ID paket (sebagai primary key dan foreign key), saluran khusus, layanan VIP, dan atribut-atribut lain yang mungkin spesifik untuk paket Diamond.

Dengan hierarki ini, "Paket TV" berfungsi sebagai entitas supertype yang menggambarkan kategori umum dari paket TV yang tersedia. "Platinum" dan "Diamond" berperan sebagai subtype yang lebih spesifik, mewarisi atribut-atribut dari "Paket TV" dan menambahkan atribut-atribut tambahan yang unik untuk masing-masing jenis paket. Hierarki ini memungkinkan pengelompokan dan pengorganisasian yang jelas dari paket TV berdasarkan tingkat kekayaan atau fitur-fitur tambahan yang ditawarkan.

# SCREENSHOT CODE DAN PENJELASAN
CLASS DATABASE
![image](https://github.com/Proyek-Akhir-Kelompok-8/TV-KABEL/assets/126888649/ebef2eb4-0e2b-447c-a6f0-5a08b215a8e7)
1. **Package Declaration**: Kode dimulai dengan deklarasi paket yang menunjukkan kelas ini berada dalam paket "db."

2. **Class Declaration**: Kelas `database` dideklarasikan. Kelas ini berfungsi sebagai pengelola koneksi basis data.

3. **Atribut**: 
   - `connection`: Merepresentasikan objek koneksi ke basis data MySQL.
   - `statement`: Digunakan untuk mengeksekusi perintah SQL biasa.
   - `preparedStatement`: Tidak digunakan dalam kode ini.
   - `resultSet`: Digunakan untuk menyimpan hasil dari perintah SQL SELECT.
   - `dbHost`, `dbName`, `dbUser`, dan `dbPass`: Variabel konstan yang berisi informasi koneksi basis data seperti nama host, nama basis data, username, dan password.

4. **Constructor `database()`**: Konstruktor inisialisasi koneksi ke basis data MySQL. Ini menggunakan informasi seperti nama host, nama basis data, username, dan password untuk membuat URL koneksi. Jika koneksi berhasil, pesan "Database Connected!" dicetak; jika terdapat kesalahan, pesan kesalahan dicetak.

5. **Method `getConnection()`**: Metode ini mengembalikan objek koneksi ke panggilan yang menggunakannya.

6. **Method `select(String query)`**: Metode ini digunakan untuk menjalankan perintah SQL SELECT dan mengembalikan hasilnya dalam bentuk objek `ResultSet`.

7. **Method `update(String qq)`**: Metode ini digunakan untuk menjalankan perintah SQL yang mengubah data, seperti perintah UPDATE, INSERT, atau DELETE.

8. **Method `disconnected()`**: Metode ini digunakan untuk menutup koneksi ke basis data setelah selesai digunakan. Pesan "Database Closed" dicetak jika penutupan berhasil; jika terjadi kesalahan, pesan "Database Failed to Close" dicetak.

Kode ini menyediakan fungsionalitas dasar untuk mengelola koneksi dan operasi basis data dalam konteks aplikasi manajemen pelanggan TV kabel. Pastikan untuk mengganti nilai-nilai seperti nama host, basis data, username, dan password sesuai dengan pengaturan basis data yang Anda gunakan.

CLASS PAKET
![image](https://github.com/Proyek-Akhir-Kelompok-8/TV-KABEL/assets/126888649/5238fccd-8bc2-432d-9089-313615f76dea)
![image](https://github.com/Proyek-Akhir-Kelompok-8/TV-KABEL/assets/126888649/ce5c47ff-3717-432d-88e9-6e3c9fc1b2ba)
![image](https://github.com/Proyek-Akhir-Kelompok-8/TV-KABEL/assets/126888649/bc16bfe6-4252-41b3-b506-b59afb34f7d0)
1. **Import dan Package Declaration**: Kode dimulai dengan impor paket-paket yang diperlukan, dan deklarasi paket entitas yang mencakup kelas `Paket`.

2. **Atribut**: Kelas `Paket` memiliki beberapa atribut yang merepresentasikan berbagai detail tentang paket TV kabel, seperti ID paket, nama paket, harga, masa berlaku, daftar saluran, fitur tambahan, ID pegawai, saluran khusus, layanan VIP, dan konten premium.

3. **Constructor `Paket()`**: Ini adalah konstruktor kelas yang digunakan untuk membuat objek `Paket`. Konstruktor ini menerima sejumlah parameter yang digunakan untuk menginisialisasi atribut-atribut objek `Paket`.

4. **Getter Methods**: Terdapat sejumlah metode getter untuk mengakses nilai-nilai atribut objek `Paket. Contohnya, `getIdPaket()`, `getNamaPaket()`, dan lainnya.

5. **Method `readPaket()`**: Metode ini merupakan metode statis yang digunakan untuk membaca data paket dari basis data. Langkah-langkahnya adalah sebagai berikut:
   - Membuka koneksi ke basis data MySQL menggunakan `DriverManager`.
   - Membuat objek `Statement` untuk mengeksekusi perintah SQL.
   - Membuat objek `ArrayList<Paket>` untuk menyimpan data paket.
   - Membuat pernyataan SQL yang menggabungkan data dari tabel `paket_tv_kabel`, `diamond`, dan `platinum` menggunakan `LEFT JOIN`.
   - Mengeksekusi pernyataan SQL dan menyimpan hasilnya dalam objek `ResultSet`.
   - Membaca hasil `ResultSet` dan membuat objek `Paket` untuk setiap baris data yang ditemukan. Data paket ini kemudian dimasukkan ke dalam `ArrayList<Paket>`.

Kode ini bertujuan untuk mengambil data paket TV kabel dari basis data dan menyimpannya dalam sebuah `ArrayList` untuk penggunaan lebih lanjut dalam aplikasi. Pastikan koneksi basis data sesuai dengan pengaturan yang digunakan dalam lingkungan pengembangan Anda.

CLASS PELANGGAN
![image](https://github.com/Proyek-Akhir-Kelompok-8/TV-KABEL/assets/126888649/b2478ebc-31f1-4ad6-9c14-040f958918e3)
![image](https://github.com/Proyek-Akhir-Kelompok-8/TV-KABEL/assets/126888649/628d4864-af58-413a-8b3d-39778f5721a1)
![image](https://github.com/Proyek-Akhir-Kelompok-8/TV-KABEL/assets/126888649/3190ee00-24eb-42da-aadf-51c9c9c4e148)
![image](https://github.com/Proyek-Akhir-Kelompok-8/TV-KABEL/assets/126888649/e88267c4-e48f-464c-ae88-42202ee715a3)
1. **Import dan Package Declaration**: Kode dimulai dengan impor paket-paket yang diperlukan, dan deklarasi paket entitas yang mencakup kelas `Paket`.

2. **Atribut**: Kelas `Paket` memiliki beberapa atribut yang merepresentasikan berbagai detail tentang paket TV kabel, seperti ID paket, nama paket, harga, masa berlaku, daftar saluran, fitur tambahan, ID pegawai, saluran khusus, layanan VIP, dan konten premium.

3. **Constructor `Paket()`**: Ini adalah konstruktor kelas yang digunakan untuk membuat objek `Paket`. Konstruktor ini menerima sejumlah parameter yang digunakan untuk menginisialisasi atribut-atribut objek `Paket`.

4. **Getter Methods**: Terdapat sejumlah metode getter untuk mengakses nilai-nilai atribut objek `Paket. Contohnya, `getIdPaket()`, `getNamaPaket()`, dan lainnya.

5. **Method `readPaket()`**: Metode ini merupakan metode statis yang digunakan untuk membaca data paket dari basis data. Langkah-langkahnya adalah sebagai berikut:
   - Membuka koneksi ke basis data MySQL menggunakan `DriverManager`.
   - Membuat objek `Statement` untuk mengeksekusi perintah SQL.
   - Membuat objek `ArrayList<Paket>` untuk menyimpan data paket.
   - Membuat pernyataan SQL yang menggabungkan data dari tabel `paket_tv_kabel`, `diamond`, dan `platinum` menggunakan `LEFT JOIN`.
   - Mengeksekusi pernyataan SQL dan menyimpan hasilnya dalam objek `ResultSet`.
   - Membaca hasil `ResultSet` dan membuat objek `Paket` untuk setiap baris data yang ditemukan. Data paket ini kemudian dimasukkan ke dalam `ArrayList<Paket>`.

Kode ini bertujuan untuk mengambil data paket TV kabel dari basis data dan menyimpannya dalam sebuah `ArrayList` untuk penggunaan lebih lanjut dalam aplikasi. Pastikan koneksi basis data sesuai dengan pengaturan yang digunakan dalam lingkungan pengembangan Anda.

# SCREENSHOT OUTPUT
1. Tampilan login
![image](https://github.com/Proyek-Akhir-Kelompok-8/TV-KABEL/assets/126888649/7734f864-99d0-4056-aec4-a7f9d2a13c7d)

2. Tampilan menu utama
![image](https://github.com/Proyek-Akhir-Kelompok-8/TV-KABEL/assets/126888649/5859807e-1dcb-46de-907f-1f1b770f3be8)

3. Tampilan menu paket
![image](https://github.com/Proyek-Akhir-Kelompok-8/TV-KABEL/assets/126888649/64a5210f-d0af-45cb-b13d-a7ebf58e38a3)


4. Tampilan menu pelanggan
![image](https://github.com/Proyek-Akhir-Kelompok-8/TV-KABEL/assets/126888649/05f9a945-30c2-419f-acdf-6cdd1e0e2b0b)

