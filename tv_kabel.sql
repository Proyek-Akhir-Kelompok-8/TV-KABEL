-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 03 Nov 2023 pada 15.10
-- Versi server: 10.4.27-MariaDB
-- Versi PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tv_kabel`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `diamond`
--

CREATE TABLE `diamond` (
  `ID_Paket` int(11) NOT NULL,
  `Saluran_Khusus` varchar(50) NOT NULL,
  `Layanan_VIP` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `diamond`
--

INSERT INTO `diamond` (`ID_Paket`, `Saluran_Khusus`, `Layanan_VIP`) VALUES
(10001, 'CNBC MTV Food Network Disney Channel TLC (The Lear', 'Fitur replay tayangan');

-- --------------------------------------------------------

--
-- Struktur dari tabel `paket_tv_kabel`
--

CREATE TABLE `paket_tv_kabel` (
  `ID_Paket` int(11) NOT NULL,
  `Nama_Paket` varchar(50) NOT NULL,
  `Harga` int(11) NOT NULL,
  `Masa_Berlaku` varchar(10) NOT NULL,
  `Daftar_Saluran` varchar(100) NOT NULL,
  `Fitur_Tambahan` varchar(50) DEFAULT NULL,
  `PEGAWAI_ID_Pegawai` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `paket_tv_kabel`
--

INSERT INTO `paket_tv_kabel` (`ID_Paket`, `Nama_Paket`, `Harga`, `Masa_Berlaku`, `Daftar_Saluran`, `Fitur_Tambahan`, `PEGAWAI_ID_Pegawai`) VALUES
(10001, 'Paket Diamond', 100000, '1 BULAN', 'BBC News\r\nESPN\r\nHBO\r\nFOX\r\nNational Geographic\r\nCartoon Network\r\nDiscovery Channel\r\nSerta TV INDO', 'Kestabilan jaringan TV', 230033),
(10002, 'Paket Platinum', 50000, '1 BULAN', 'TVRI\r\nRCTI\r\nSCTV\r\nIndosiar\r\nTrans TV', 'Kestabilan jaringan TV', 230034);

-- --------------------------------------------------------

--
-- Struktur dari tabel `pegawai`
--

CREATE TABLE `pegawai` (
  `ID_Pegawai` int(11) NOT NULL,
  `Nama_Pegawai` varchar(50) NOT NULL,
  `Username` varchar(30) NOT NULL,
  `Password` varchar(20) NOT NULL,
  `No_Handphone` varchar(15) NOT NULL,
  `Hak_Akses_Sistem` varchar(20) DEFAULT NULL,
  `PEGAWAI_ID_Pegawai` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `pegawai`
--

INSERT INTO `pegawai` (`ID_Pegawai`, `Nama_Pegawai`, `Username`, `Password`, `No_Handphone`, `Hak_Akses_Sistem`, `PEGAWAI_ID_Pegawai`) VALUES
(230033, 'Doni Arya Rachmadi', 'doni33', 'doni33', '0895602790842', 'admin', NULL),
(230034, 'Remanda Dheva', 'dheva34', 'dheva34', '082253170986', 'admin', NULL);

-- --------------------------------------------------------

--
-- Struktur dari tabel `pelanggan`
--

CREATE TABLE `pelanggan` (
  `ID_Pelanggan` int(11) NOT NULL,
  `Nama_Pelanggan` varchar(50) NOT NULL,
  `PAKET_TV_KABEL_ID_Paket` int(11) NOT NULL,
  `Alamat` varchar(50) NOT NULL,
  `No_Handphone` varchar(15) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `Tanggal_Berlangganan` datetime NOT NULL,
  `Status_Langganan` varchar(30) NOT NULL,
  `PEGAWAI_ID_Pegawai` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `pelanggan`
--

INSERT INTO `pelanggan` (`ID_Pelanggan`, `Nama_Pelanggan`, `PAKET_TV_KABEL_ID_Paket`, `Alamat`, `No_Handphone`, `Email`, `Tanggal_Berlangganan`, `Status_Langganan`, `PEGAWAI_ID_Pegawai`) VALUES
(123, 'doni', 10001, 'gang masjid', '0853', 'faizaja', '2012-12-12 00:00:00', 'Tidak Aktif', 230033),
(1203, 'asektampan', 10001, 'mangkurawang', '2423452345', 'dgdfg@sdfsdg', '2010-10-10 00:00:00', 'Aktif', 230033),
(2312, 'udin', 10001, 'asdadasd', '19238917231', 'asdads@mmcom', '2012-12-12 00:00:00', 'Tidak Aktif', 230033);

-- --------------------------------------------------------

--
-- Struktur dari tabel `platinum`
--

CREATE TABLE `platinum` (
  `ID_Paket` int(11) NOT NULL,
  `Konten_Premium` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `platinum`
--

INSERT INTO `platinum` (`ID_Paket`, `Konten_Premium`) VALUES
(10002, 'MTV Food Network Disney Channel TLC (The Learning ');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `diamond`
--
ALTER TABLE `diamond`
  ADD PRIMARY KEY (`ID_Paket`);

--
-- Indeks untuk tabel `paket_tv_kabel`
--
ALTER TABLE `paket_tv_kabel`
  ADD PRIMARY KEY (`ID_Paket`),
  ADD KEY `PAKET_TV_KABEL_PEGAWAI_FK` (`PEGAWAI_ID_Pegawai`);

--
-- Indeks untuk tabel `pegawai`
--
ALTER TABLE `pegawai`
  ADD PRIMARY KEY (`ID_Pegawai`),
  ADD KEY `PEGAWAI_PEGAWAI_FK` (`PEGAWAI_ID_Pegawai`);

--
-- Indeks untuk tabel `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD PRIMARY KEY (`ID_Pelanggan`),
  ADD KEY `PELANGGAN_PAKET_TV_KABEL_FK` (`PAKET_TV_KABEL_ID_Paket`),
  ADD KEY `PELANGGAN_PEGAWAI_FK` (`PEGAWAI_ID_Pegawai`);

--
-- Indeks untuk tabel `platinum`
--
ALTER TABLE `platinum`
  ADD PRIMARY KEY (`ID_Paket`);

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `diamond`
--
ALTER TABLE `diamond`
  ADD CONSTRAINT `DIAMOND_PAKET_TV_KABEL_FK` FOREIGN KEY (`ID_Paket`) REFERENCES `paket_tv_kabel` (`ID_Paket`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Ketidakleluasaan untuk tabel `paket_tv_kabel`
--
ALTER TABLE `paket_tv_kabel`
  ADD CONSTRAINT `PAKET_TV_KABEL_PEGAWAI_FK` FOREIGN KEY (`PEGAWAI_ID_Pegawai`) REFERENCES `pegawai` (`ID_Pegawai`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Ketidakleluasaan untuk tabel `pegawai`
--
ALTER TABLE `pegawai`
  ADD CONSTRAINT `PEGAWAI_PEGAWAI_FK` FOREIGN KEY (`PEGAWAI_ID_Pegawai`) REFERENCES `pegawai` (`ID_Pegawai`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Ketidakleluasaan untuk tabel `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD CONSTRAINT `PELANGGAN_PAKET_TV_KABEL_FK` FOREIGN KEY (`PAKET_TV_KABEL_ID_Paket`) REFERENCES `paket_tv_kabel` (`ID_Paket`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `PELANGGAN_PEGAWAI_FK` FOREIGN KEY (`PEGAWAI_ID_Pegawai`) REFERENCES `pegawai` (`ID_Pegawai`) ON DELETE CASCADE ON UPDATE NO ACTION;

--
-- Ketidakleluasaan untuk tabel `platinum`
--
ALTER TABLE `platinum`
  ADD CONSTRAINT `PLATINUM_PAKET_TV_KABEL_FK` FOREIGN KEY (`ID_Paket`) REFERENCES `paket_tv_kabel` (`ID_Paket`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
