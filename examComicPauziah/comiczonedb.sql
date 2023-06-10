-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 16, 2023 at 06:59 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `comiczonedb`
--

-- --------------------------------------------------------

--
-- Table structure for table `buku`
--

CREATE TABLE `buku` (
  `id_books` varchar(10) NOT NULL,
  `nama_buku` varchar(100) DEFAULT NULL,
  `harga` decimal(10,0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `buku`
--

INSERT INTO `buku` (`id_books`, `nama_buku`, `harga`) VALUES
('Book-001', 'Love in chaos', 30000),
('Book-002', 'Disruption', 90000),
('Book-003', 'Bintang', 20000),
('Book-004', 'Sapiens', 15000),
('Book-005', 'The life changing mangic of tidying up', 13000),
('Book-006', 'Bumi', 12000);

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `id_customer` varchar(10) NOT NULL,
  `nama_customer` varchar(50) DEFAULT NULL,
  `tanggal_lahir` date DEFAULT NULL,
  `telepon` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`id_customer`, `nama_customer`, `tanggal_lahir`, `telepon`) VALUES
('Cus-0001', 'Aldin', '1990-09-21', '08127776633'),
('Cus-0002', 'Berwyn', '1995-01-21', '08566666554'),
('Cus-0003', 'Deshi', '1997-02-08', '085202215664'),
('Cus-0004', 'Evania', '1996-06-06', '081285269462'),
('Cus-0005', 'Hansa', '1990-09-09', '085667894542'),
('Cus-0006', 'Harina', '1990-12-25', '081255446699');

-- --------------------------------------------------------

--
-- Table structure for table `karyawan`
--

CREATE TABLE `karyawan` (
  `id_karyawan` varchar(10) NOT NULL,
  `nama_karyawan` varchar(50) DEFAULT NULL,
  `telepon` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `karyawan`
--

INSERT INTO `karyawan` (`id_karyawan`, `nama_karyawan`, `telepon`) VALUES
('Kar-001', 'Javas', '08566666554'),
('Kar-002', 'Avast', '085202215664'),
('Kar-003', 'Skyper', '085667894542'),
('Kar-004', 'Nakama', '081255446699'),
('Kar-005', 'Jarvis', '081284587566'),
('Kar-006', 'Jevera', '081247856978');

-- --------------------------------------------------------

--
-- Table structure for table `sewa`
--

CREATE TABLE `sewa` (
  `id_sewa` int(10) NOT NULL,
  `id_books` varchar(10) DEFAULT NULL,
  `id_customer` varchar(10) DEFAULT NULL,
  `id_karyawan` varchar(10) DEFAULT NULL,
  `tgl_pinjam` date DEFAULT NULL,
  `tgl_pengembalian` date DEFAULT NULL,
  `harga` decimal(10,0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `sewa`
--

INSERT INTO `sewa` (`id_sewa`, `id_books`, `id_customer`, `id_karyawan`, `tgl_pinjam`, `tgl_pengembalian`, `harga`) VALUES
(4, 'Book-004', 'Cus-0006', 'Kar-001', '2023-05-16', '2023-05-16', 15000),
(5, 'Book-003', 'Cus-0006', 'Kar-001', '2023-05-16', '2023-05-16', 20000),
(6, 'Book-003', 'Cus-0001', 'Kar-001', '2023-05-16', '2023-05-16', 20000),
(7, 'Book-005', 'Cus-0001', 'Kar-001', '2023-05-16', '2023-05-16', 13000),
(8, 'Book-003', 'Cus-0001', 'Kar-001', '2023-05-16', '2023-05-16', 20000),
(9, 'Book-003', 'Cus-0001', 'Kar-001', '2023-05-16', '2023-05-16', 20000),
(10, 'Book-003', 'Cus-0001', 'Kar-001', '2023-05-16', '2023-05-16', 20000),
(11, 'Book-004', 'Cus-0001', 'Kar-001', '2023-05-16', '2023-05-16', 15000),
(12, 'Book-003', 'Cus-0004', 'Kar-006', '2023-05-16', '2023-05-16', 20000),
(13, 'Book-003', 'Cus-0001', 'Kar-002', '2023-05-16', '2023-05-16', 20000),
(14, 'Book-004', 'Cus-0001', 'Kar-005', '2023-05-16', '2023-05-16', 15000),
(15, 'Book-004', 'Cus-0001', 'Kar-005', '2023-05-16', '2023-05-16', 15000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`id_books`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`id_customer`);

--
-- Indexes for table `karyawan`
--
ALTER TABLE `karyawan`
  ADD PRIMARY KEY (`id_karyawan`);

--
-- Indexes for table `sewa`
--
ALTER TABLE `sewa`
  ADD PRIMARY KEY (`id_sewa`),
  ADD KEY `id_books` (`id_books`),
  ADD KEY `id_customer` (`id_customer`),
  ADD KEY `id_karyawan` (`id_karyawan`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `sewa`
--
ALTER TABLE `sewa`
  MODIFY `id_sewa` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `sewa`
--
ALTER TABLE `sewa`
  ADD CONSTRAINT `sewa_ibfk_1` FOREIGN KEY (`id_books`) REFERENCES `buku` (`id_books`),
  ADD CONSTRAINT `sewa_ibfk_2` FOREIGN KEY (`id_customer`) REFERENCES `customer` (`id_customer`),
  ADD CONSTRAINT `sewa_ibfk_3` FOREIGN KEY (`id_karyawan`) REFERENCES `karyawan` (`id_karyawan`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
