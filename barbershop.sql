-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 30 Nov 2019 pada 20.50
-- Versi server: 10.1.37-MariaDB
-- Versi PHP: 7.3.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `barbershop`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `member`
--

CREATE TABLE `member` (
  `id_member` char(6) NOT NULL,
  `nama_member` varchar(50) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `tanggal_lahir` varchar(50) NOT NULL,
  `no_telp` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `member`
--

INSERT INTO `member` (`id_member`, `nama_member`, `alamat`, `tanggal_lahir`, `no_telp`, `email`) VALUES
('-', '-', '-', '-', '-', '-'),
('6OL62Q', 'Farhan Reninda', 'Griya Asri', '13-11-2019', '087833925596', 'farhan@gmail.com'),
('YS56HZ', 'Titan Hafizh', 'Sapta Taruna', '04-07-2000', '087822175563', 'titanhafizh@gmail.com');

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksi`
--

CREATE TABLE `transaksi` (
  `id_transaksi` int(11) NOT NULL,
  `tanggal` varchar(20) NOT NULL,
  `menu` varchar(50) NOT NULL,
  `username_barber` varchar(50) NOT NULL,
  `username_cashier` varchar(50) NOT NULL,
  `id_member` char(6) NOT NULL,
  `total_harga` int(11) NOT NULL,
  `uang_bayar` int(11) NOT NULL,
  `diskon` int(11) NOT NULL,
  `kembalian` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `transaksi`
--

INSERT INTO `transaksi` (`id_transaksi`, `tanggal`, `menu`, `username_barber`, `username_cashier`, `id_member`, `total_harga`, `uang_bayar`, `diskon`, `kembalian`) VALUES
(1, '27-11-2019 0:5:38', 'Haircut & Wash', 'azmirf20', 'kas', 'ys56hz', 35000, 50000, 0, 15000),
(2, '27-11-2019 0:5:58', 'Shave', 'azmirf20', 'kas', 'ys56hz', 20000, 20000, 0, 0),
(4, '27-11-2019 0:7:37', 'Design', 'azmirf20', 'kas', '-', 40000, 50000, 0, 10000),
(8, '27-11-2019 0:13:17', 'Haircut', 'azmirf20', 'kas', 'ys56hz', 27000, 30000, 3000, 3000),
(9, '27-11-2019 3:33:32', 'Haircut', 'Aziz Alfauzi', 'kas', '-', 30000, 30000, 0, 0),
(10, '27-11-2019 3:44:33', 'Beard Trim / Lineup', 'alfathGans', 'pradina', '-', 22000, 25000, 0, 3000),
(11, '27-11-2019 11:53:17', 'Haircut & Wash', 'Aziz Alfauzi', 'kas', '-', 35000, 40000, 0, 5000),
(12, '27-12-2019 11:53:17', 'Haircut & Wash', 'azmirf20', 'kas', '-', 35000, 40000, 0, 5000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `users`
--

CREATE TABLE `users` (
  `id_user` int(11) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `nik` varchar(100) NOT NULL,
  `alamat` varchar(255) NOT NULL,
  `jenis_kelamin` tinyint(1) NOT NULL,
  `level` varchar(10) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `users`
--

INSERT INTO `users` (`id_user`, `nama`, `nik`, `alamat`, `jenis_kelamin`, `level`, `username`, `password`) VALUES
(8, 'admin', '-', '-', 1, 'Admin', 'admin', '40bd001563085fc35165329ea1ff5c5ecbdbbeef'),
(9, 'Muhamad Azmi Rizkifar', '554023942304', 'Perum Citalang Indah', 1, 'Barber', 'azmirf20', '40bd001563085fc35165329ea1ff5c5ecbdbbeef'),
(10, 'Muhammad Alfath Abibi', '545284704239', 'Makassar', 1, 'Barber', 'alfathGans', '40bd001563085fc35165329ea1ff5c5ecbdbbeef'),
(11, 'kasir Sugiono', '4055', 'Wonosobo, Jawa Tengah', 1, 'Cashier', 'kas', '40bd001563085fc35165329ea1ff5c5ecbdbbeef'),
(12, 'Aziz Alfauzi', '4325830123', 'Klaten wonosobo', 1, 'Barber', 'Aziz Alfauzi', '40bd001563085fc35165329ea1ff5c5ecbdbbeef'),
(13, 'ST Sheillya Pradina', '43254017310', 'SMK Telkom Makassar', 2, 'Cashier', 'pradina', '40bd001563085fc35165329ea1ff5c5ecbdbbeef'),
(14, 'Farhan Reninda Budiansyah', '231295231248', 'Perum Griya Asri', 1, 'Barber', 'farhan', '40bd001563085fc35165329ea1ff5c5ecbdbbeef'),
(15, 'Vira Ayu Indita', '4345331231', 'Griya Bandung Asri', 2, 'Cashier', 'vira', '40bd001563085fc35165329ea1ff5c5ecbdbbeef');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `member`
--
ALTER TABLE `member`
  ADD PRIMARY KEY (`id_member`);

--
-- Indeks untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id_transaksi`),
  ADD KEY `fk_idMember` (`id_member`);

--
-- Indeks untuk tabel `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `id_transaksi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT untuk tabel `users`
--
ALTER TABLE `users`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `fk_idMember` FOREIGN KEY (`id_member`) REFERENCES `member` (`id_member`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
