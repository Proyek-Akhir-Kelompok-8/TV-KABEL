# TV-KABEL
Aplikasi TV Kabel adalah proyek perangkat lunak yang dibangun untuk membantu penyedia layanan TV kabel dalam mengelola dan menyediakan layanan kepada pelanggan mereka. Aplikasi ini dirancang untuk meningkatkan efisiensi operasional, meningkatkan kepuasan pelanggan, dan memberikan alat yang berguna untuk tim manajemen dan dukungan pelanggan.

# Flowchart
![pa-flowchart final drawio](https://github.com/Proyek-Akhir-Kelompok-8/TV-KABEL/assets/126888649/6777668b-5198-489d-82d9-6ecd94290cca)

# ERD
![image](https://github.com/Proyek-Akhir-Kelompok-8/TV-KABEL/assets/126888649/ffcf22c8-7c05-481f-809d-eff911bec395)

# HIRARKI
![HIRARHKI](https://github.com/Proyek-Akhir-Kelompok-8/TV-KABEL/assets/126888649/361c5b8e-d55a-44a2-b7d2-98c17f2d8525)

# SCREEMSHOT CODE DAN PENJELASAN
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

