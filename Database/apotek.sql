-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 12 Des 2019 pada 16.16
-- Versi server: 10.1.37-MariaDB
-- Versi PHP: 7.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `apotek`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `apoteker`
--

CREATE TABLE `apoteker` (
  `id_apoteker` varchar(7) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `jenis_kelamin` char(1) NOT NULL,
  `tempat_lahir` varchar(20) NOT NULL,
  `tgl_lahir` date NOT NULL,
  `alamat` varchar(60) NOT NULL,
  `no_hp` varchar(13) NOT NULL,
  `username` varchar(20) NOT NULL,
  `Password` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `apoteker`
--

INSERT INTO `apoteker` (`id_apoteker`, `nama`, `jenis_kelamin`, `tempat_lahir`, `tgl_lahir`, `alamat`, `no_hp`, `username`, `Password`) VALUES
('APT0001', 'Inaayah Guzman', 'P', 'Kalimantan', '1992-03-01', 'Jalan Alpine RT.01 RW.03', '089876500841', 'gon12', '123'),
('APT0002', 'Malak Gonzales', 'L', 'Pekanbaru', '1989-05-11', 'Jalan Angsa RT.04 RW.21', '082362155334', '', ''),
('APT0003', 'Margot Bender', 'L', 'Jakarta', '1987-10-10', 'Jalan Anis RT.01 RW.05', '089876504131', '', ''),
('APT0004', 'Angelo Fuller', 'P', 'Bandung', '1993-07-23', 'Jalan Apung RT.04 RW.21', '087845365426', '', ''),
('APT0005', 'Yolanda Sheridan', 'P', 'Yogyakarta', '1989-08-03', 'Jalan Asi RT.07 RW.12', '081377063005', '', ''),
('APT0006', 'Christian Sheldon', 'P', 'Bekasi', '1985-07-20', 'Jalan Astrapia RT.04 RW.21', '085234465788', '', ''),
('APT0007', 'Constance Fountain', 'L', 'Semarang', '1980-07-09', 'Jalan Atoku RT.01 RW.05', '089587293567', '', ''),
('APT0008', 'Shah Knox', 'L', 'Depok', '1990-10-20', 'Jalan Bangau RT.03 RW.03', '081376666388', '', ''),
('APT0009', 'Farhana Spears', 'L', 'Sragen', '1993-11-05', 'Jalan Baza RT.07 RW.20', '082155467363', '', ''),
('APT0010', 'Farhan kurs', 'L', 'Bandung', '1994-06-06', 'Jalan Belibis RT.03 RW.02', '085346662541', '', '');

-- --------------------------------------------------------

--
-- Struktur dari tabel `kasir`
--

CREATE TABLE `kasir` (
  `id_kasir` varchar(7) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `jenis_kelamin` char(1) NOT NULL,
  `tempat_lahir` varchar(20) NOT NULL,
  `tgl_lahir` date NOT NULL,
  `alamat` varchar(60) NOT NULL,
  `no_hp` varchar(13) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `kasir`
--

INSERT INTO `kasir` (`id_kasir`, `nama`, `jenis_kelamin`, `tempat_lahir`, `tgl_lahir`, `alamat`, `no_hp`, `username`, `password`) VALUES
('KSR0001', 'Ardhia', 'P', 'tasik', '1999-10-16', 'bandung', '085223123400', '0', ''),
('KSR0002', 'Fitroh', 'L', 'Medan', '1996-12-12', 'jakarta', '085223123500', '0', ''),
('KSR0003', 'Putri', 'P', 'Bogor', '1998-05-08', 'cirebon', '085223123601', 'paw1120', 'sayaaja'),
('KSR0004', 'Marayu', 'P', 'Bekasi', '2000-08-09', 'aceh', '085223123703', 'MerCy', 'okelah'),
('KSR0005', 'Adelia', 'P', 'Cirebon', '1999-01-12', 'cirebon', '085223123809', '0', ''),
('KSR0006', 'Dety', 'P', 'Cianjur', '1999-08-22', 'cianjur', '085223123907', '0', ''),
('KSR0007', 'Jundi', 'L', 'Jakarta', '1999-08-18', 'Margahayu', '085226123102', '0', ''),
('KSR0008', 'Rakha', 'L', 'Surabaya', '1996-04-05', 'kopo', '085224123119', '0', ''),
('KSR0009', 'Hema', 'P', 'Boyolali', '1999-07-09', 'boyolali', '085223123125', '0', ''),
('KSR0010', 'Hilmi', 'L', 'Batak', '1987-09-07', 'bojongsoang', '085223123137', '0', '');

-- --------------------------------------------------------

--
-- Struktur dari tabel `manager`
--

CREATE TABLE `manager` (
  `id_manager` varchar(7) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `jenis_kelamin` char(1) NOT NULL,
  `tempat_lahir` varchar(20) NOT NULL,
  `tgl_lahir` date NOT NULL,
  `alamat` varchar(60) NOT NULL,
  `no_hp` varchar(13) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `manager`
--

INSERT INTO `manager` (`id_manager`, `nama`, `jenis_kelamin`, `tempat_lahir`, `tgl_lahir`, `alamat`, `no_hp`, `username`, `password`) VALUES
('MGR0001', 'Afham', 'L', 'Medan', '1993-08-10', 'Jl. Perjuangan No.101', '082277889966', '', ''),
('MGR0002', 'Mar ayu', 'P', 'Jakarta', '1985-06-09', 'Jl. Kemerdekaan No. 8', '085277781976', 'fotin', '123456'),
('MGR0003', 'Fauzi dzulfikar', 'L', 'Serang', '1997-09-12', 'Jl. Maladewa No.16 ', '085376593452', '', ''),
('MGR0004', 'Aji santoso', 'L', 'Solo', '1993-09-16', 'Jl. Batu Nunggal No. 18', '082156723458', '', ''),
('MGR0005', 'Dzakky', 'L', 'Bali', '1993-05-10', 'Jl. Sukajadi No. 76', '085277685436', '', ''),
('MGR0006', 'Araysa', 'L', 'Bandung', '1992-06-12', 'Jl. Damai No. 5', '082361826025', '', ''),
('MGR0007', 'Tuti pujiastuti', 'P', 'Bogor', '1995-07-13', 'Jl. Kemerdekaan No. 45 C', '082122564378', '', ''),
('MGR0008', 'Melsandy', 'P', 'Yogyakarta', '1989-09-08', 'Jl. Braga No.24 C ', '085377689245', '', ''),
('MGR0009', 'Maira iramawan', 'P', 'Riau', '1993-07-19', 'Jl. Cikapundung No.18 ', '082361789234', '', ''),
('MGR0010', 'Imeldawati', 'P', 'Sukakarta', '1985-01-20', 'Jl. Diponegoro No. 108', '082135672165', '', '');

-- --------------------------------------------------------

--
-- Struktur dari tabel `obat`
--

CREATE TABLE `obat` (
  `id_obat` varchar(7) NOT NULL,
  `nama_obat` varchar(20) NOT NULL,
  `jenis` varchar(15) NOT NULL,
  `dosis` varchar(10) NOT NULL,
  `expire_date` date NOT NULL,
  `komposisi` varchar(300) NOT NULL,
  `indikasi` varchar(400) NOT NULL,
  `aturan_pakai` varchar(150) NOT NULL,
  `id_supplier` varchar(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `obat`
--

INSERT INTO `obat` (`id_obat`, `nama_obat`, `jenis`, `dosis`, `expire_date`, `komposisi`, `indikasi`, `aturan_pakai`, `id_supplier`) VALUES
('OBT0001', 'Ibuprofen', 'Analgesik', '400 mg', '2022-09-10', 'Ibuprofen', 'Mual dan muntah,Perut kembung,Nyeri ulu hati,Gangguan pencernaan,\r\nDiare atau konstipasi,Sakit kepala,Tukak lambung,Muntah darah,Tinja berwarna hitam atau disertai darah', 'Dewasa inflamasi & analgesik: 3 - 4 kali sehari 400mg. \r\nAnalgesik: 3 - 4 kali sehari 200 -400 mg, maks. 2400mg/hari. Anak (8 - 12 tahun) : 3-4 kali s', 'SUP0001'),
('OBT0002', 'Dexamathasone', 'Anti Alergi', '0.5 mg', '2022-10-10', 'dexamethasone', 'Badan terasa lelah atau lemas,Gangguan pola tidur,Sakit kepala.\r\nVertigo,Keringat berlebihan, Jerawat,Kulit kering dan menipis serta gampang memar,Pertumbuhan rambut yang tidak biasa,Perubahan suasana hati seperti depresi dan mudah tersinggung.\r\nMudah haus,Sering buang air kecil,Nyeri otot,Nyeri pada sendi atau/dan tulang,Sakit perut atau perut terasa kembung,Rentan terhadap infeksi', 'Dikonsumsi setelah makan Dewasa : 0.5 - 10 mg dalam dosis terbagi.\r\n Anak (0 - 1 tahun) : 0.1 - 0.25 mg, 2 kali per hari. Anak (1 - 5 tahun) : 0.25 - ', 'SUP0002'),
('OBT0003', 'Paracetamol', 'Analgesik', '500 mg', '2022-10-10', 'Paracetamol', 'Penurunan jumlah sel-sel darah, seperti sel darah putih atau trombosit,Muncul ruam, terjadi pembengkakan, atau kesulitan bernapas karena alergi.\r\nTekanan darah rendah (hipotensi) dan jantung berdetak cepat (takikardia),Kerusakan pada hati dan ginjal \r\njika menggunakan obat ini secara berlebihan, Bisa menyebabkan overdosis jika digunakan lebih dari 200 mg/kg, atau lebih dari 10 gram, dalam 24 jam', 'Diminum sebelum atau sesudah makan. Dewasa: 1-2 kaplet, 3-4 kali per hari. Penggunaan maximum 8 kaplet per hari. Anak 7-12 tahun : 0.5 - 1 kaplet, 3-4', 'SUP0003'),
('OBT0004', 'Simvastatin', 'Antihiperlipide', '10 mg', '2022-11-12', 'Simvastatin', 'Sakit kepala.\r\nGangguan pencernaan,\r\nKonstipasi,\r\nGangguan tidur,\r\nPenipisan rambut,\r\nRuam,\r\nKram otot,\r\nBingug atau gangguan daya ingat,\r\nPeningkatan kadar gula darah dan HbA1C pada pemeriksaan darah', 'Sebelum atau sesudah makan pada malam hari, hindari konsumsi jus anggur berlebihan (> 1 L/hari)\r\n.Usia dewasa : 10 mg - 20 mg, 1 kali per hari pada ma', 'SUP0004'),
('OBT0005', 'Omeprazole', 'AINS', '20 mg', '2022-09-09', 'Omeprazole', 'Gangguan pencernaan,ruam, pusing, hingga sesak napas', 'Dikonsumsi sebelum makan.Dewasa : 1 kali sehari 1 tablet (20 - 40 mg per hari selama 2-4 minggu)', 'SUP0005'),
('OBT0006', 'Amoxicillin', 'Antibiotik', '500 mg', '2023-02-11', 'Amoxicillin', 'Mual dan muntah,Mengalami diare,Sakit kepala,Ruam', 'Dikonsumsi sesudah makan. Dewasa 250 sampai 500 mg tiap 8 jam. Anak 20 mg/kgBB/hari terbagi tiap 8 jam. Infeksi berat diberikan dosis ganda. Jika akut', 'SUP0006'),
('OBT0007', 'Asmadex', 'Antiasma', '25 mg', '2021-11-10', 'Ephedrine Hcl 10 Mg, Theophylline Anhydrous 130 Mg', 'Iritasi pada hidung,Sakit kepala,Mulut kering dan merasa haus,Kehilangan selera makan,Berdebar-debar', 'Dikonsumsi bersamaan dengan makanan. Dewasa : 3 kali sehari 1-2 tablet. Anak-anak : 2 kali sehari 1/2 tablet.\r\n', 'SUP0007'),
('OBT0008', 'Methylprednisolone', 'Anti Inflamasi', '4 mg', '2021-05-06', 'Methyprednisolone', 'Mual dan muntah,Nyeri ulu hati,Sakit perut,\r\nGangguan pencernaan,Lemas dan lelah,Mengeluarkan banyak keringat,Uring-uringan,Kecemasan dan depresi,Sulit tidur.', 'Dikonsumsi setelah makan.  1 tablet, 1-2 kali sehari. Dosis per hari: 4 - 48 mg per hari, tergantung dari jenis dan beratnya penyakit dan respon pasie', 'SUP0008'),
('OBT0009', 'FG Throches', 'Antibiotik', '1 kaplet', '2021-05-08', 'Fradiomicin 2.5 mg dan Gramidicin 1.0 mg', 'Kehitaman pada lidah, mukosa mulut berwarna kemerahan, dan glossitis,\r\nDefisiensi vitamin K yang ditandai dengan resiko pendarahan (jarang)\r\nDefisiensi vitamin B seperti glositis, stomatitis (sariawan), tidak nafsu makan, dan nyeri-nyeri pada saraf', 'Dihisap hingga larut. Dewasa: 1 - 2 tablet, dihisap 4 - 5 kali perhari. Anak-anak : 1 tablet, dihisap 4 - 5 kali perhari', 'SUP0009'),
('OBT0010', 'Chlorpheniramine', 'Antihistamin', '4 mg', '2022-08-04', 'Chlorpheniramine maleat 4 mg', 'Sakit kepala,Mengantuk,Mual,Muntah,Nafsu makan berkurang,Sembelit atau konstipasi\r\n,Mulut, hidung, dan tenggorokan kering\r\n,Gangguan penglihatan\r\nSulit buang air kecil.', 'Diberikan bersama atau tanpa makanan.Dewasa 3-4 kali/hari 1/2-1 tablet, Anak 3-4 kali/hari 1/4-1/2 tablet', 'SUP0010');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pembayaran`
--

CREATE TABLE `pembayaran` (
  `id_pembayaran` varchar(7) NOT NULL,
  `id_pemesanan` varchar(7) NOT NULL,
  `id_kasir` varchar(7) NOT NULL,
  `tgl_pembayaran` date NOT NULL,
  `total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pembayaran`
--

INSERT INTO `pembayaran` (`id_pembayaran`, `id_pemesanan`, `id_kasir`, `tgl_pembayaran`, `total`) VALUES
('PBR0001', 'PMS0001', 'KSR0001', '2018-01-12', 30000),
('PBR0002', 'PMS0002', 'KSR0002', '2018-02-03', 10000),
('PBR0003', 'PMS0003', 'KSR0003', '2018-04-22', 15000),
('PBR0004', 'PMS0004', 'KSR0004', '2018-05-31', 25000),
('PBR0005', 'PMS0005', 'KSR0005', '2018-07-12', 60000),
('PBR0006', 'PMS0006', 'KSR0006', '2018-07-15', 70000),
('PBR0007', 'PMS0007', 'KSR0007', '2018-10-01', 85000),
('PBR0008', 'PMS0008', 'KSR0008', '2018-10-12', 100000),
('PBR0009', 'PMS0009', 'KSR0009', '2018-11-25', 65000),
('PBR0010', 'PMS0010', 'KSR0010', '2018-12-30', 100000),
('PBR0011', 'PMS0010', 'KSR0001', '2019-12-12', 50000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `pemesanan`
--

CREATE TABLE `pemesanan` (
  `id_pemesanan` varchar(7) NOT NULL,
  `tgl_pemesanan` date NOT NULL,
  `total_pemesanan` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pemesanan`
--

INSERT INTO `pemesanan` (`id_pemesanan`, `tgl_pemesanan`, `total_pemesanan`) VALUES
('PMS0001', '2018-01-12', 1),
('PMS0002', '2018-02-03', 1),
('PMS0003', '2018-04-22', 1),
('PMS0004', '2018-05-31', 1),
('PMS0005', '2018-07-12', 2),
('PMS0006', '2018-07-15', 1),
('PMS0007', '2018-10-01', 1),
('PMS0008', '2018-10-12', 1),
('PMS0009', '2018-11-25', 1),
('PMS0010', '2018-12-30', 1),
('PMS0011', '2019-09-24', 2),
('PMS0012', '2019-12-09', 2);

-- --------------------------------------------------------

--
-- Struktur dari tabel `pendata`
--

CREATE TABLE `pendata` (
  `id_pendata` varchar(7) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `jenis_kelamin` char(1) NOT NULL,
  `tempat_lahir` varchar(20) NOT NULL,
  `tgl_lahir` date NOT NULL,
  `alamat` varchar(60) NOT NULL,
  `no_hp` varchar(13) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pendata`
--

INSERT INTO `pendata` (`id_pendata`, `nama`, `jenis_kelamin`, `tempat_lahir`, `tgl_lahir`, `alamat`, `no_hp`, `username`, `password`) VALUES
('PDA0001', 'Suryanto', 'L', 'Medan', '1992-08-17', 'Jl. Beo No. 11', '085247681904', '', ''),
('PDA0002', 'Deriyano', 'L', 'Jakarta', '1987-02-19', 'Jl. Buah Batu No. 8', '082356784909', 'DeryXo', '123456'),
('PDA0003', 'Alfinsyah', 'L', 'Serang', '1988-09-15', 'Jl. Ahmad yani No.10, Bandung ', '085578983456', '', ''),
('PDA0004', 'Putri agustina', 'P', 'Solo', '1993-08-16', 'Jl. Maladewa No.101', '089834567218', '', ''),
('PDA0005', 'Dela Puspita', 'P', 'Bali', '1995-05-17', 'JL. Mekarsari No. 102B', '081945682347', '', ''),
('PDA0006', 'Meilania ZA', 'P', 'Bandung', '1996-06-12', 'Jl. Taman Kota No. 145', '081398345745', '', ''),
('PDA0007', 'Fachrian', 'L', 'Bogor', '1995-07-13', 'Jl. Medan Tempur No. 45', '082267893456', '', ''),
('PDA0008', 'Ricky Harun', 'L', 'Yogyakarta', '1989-09-05', 'Jl. Sutomo ujung No. 121 A', '082145678923', '', ''),
('PDA0009', 'Mayland dewa', 'L', 'Riau', '1992-07-19', 'Jl. Perjuangan No. 10', '081545627892', '', ''),
('PDA0010', 'Kartika dewi', 'P', 'Sukakarta', '1985-01-20', 'Jl. Sutomo ujung No. 10 A', '082354678923', '', '');

-- --------------------------------------------------------

--
-- Struktur dari tabel `resep`
--

CREATE TABLE `resep` (
  `id_resep` varchar(7) NOT NULL,
  `id_apoteker` varchar(7) NOT NULL,
  `tgl_resep` date NOT NULL,
  `deskripsi` varchar(400) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `resep`
--

INSERT INTO `resep` (`id_resep`, `id_apoteker`, `tgl_resep`, `deskripsi`) VALUES
('RSP0001', 'APT0001', '2018-01-01', 'Aminofilin Supp,Asam Mefenamat'),
('RSP0002', 'APT0002', '2018-01-04', 'Bisakodil Supp,Bromhexin,Desoksimetason'),
('RSP0003', 'APT0003', '2018-01-15', 'Asetilsistein,Astemizole Betametason'),
('RSP0004', 'APT0004', '2018-02-05', 'Dexchlorpheniramine,Difluocortolon,Dimethinden'),
('RSP0005', 'APT0005', '2018-02-09', 'Ekonazol,Eritromisin'),
('RSP0006', 'APT0006', '2018-02-19', 'Framisetna SO4'),
('RSP0007', 'APT0007', '2018-03-12', 'Glafenin,Heksakklorofene'),
('RSP0008', 'APT0008', '2018-03-19', 'Hexetidine,Hidrokortison,Hidroquinon'),
('RSP0009', 'APT0009', '2018-03-24', 'Homochlorcyclizin HCl Karbosistein'),
('RSP0010', 'APT0010', '2018-04-01', 'Fluokortolon,Fopredniliden,Gentamisin SO4');

-- --------------------------------------------------------

--
-- Struktur dari tabel `supplier`
--

CREATE TABLE `supplier` (
  `id_supplier` varchar(7) NOT NULL,
  `nama_supplier` varchar(30) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `no_telp` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `supplier`
--

INSERT INTO `supplier` (`id_supplier`, `nama_supplier`, `alamat`, `no_telp`) VALUES
('SUP0001', 'PT Dexa Medica', 'Jl Kelapa Gading Slt Kompl Gading Serpong Sktr 1-B Bl BJ-8/2 Tangerang', '(021) 54200134'),
('SUP0002', 'CV Karsa Mandiri', 'Jl Lampersari 12 Semarang', '(024) 8415540'),
('SUP0003', 'PT Brayat Sehat Farma', 'Jl Bukit Indah I 7 Kompl Sukajadi Batam', '(0778) 7022453'),
('SUP0004', 'PT Trimitra Medika Sejahtera', 'Jl Kapuas 2 Surabaya', '(031) 5686161'),
('SUP0005', 'PT Mandara Medika Utama', 'Jl Pantai Indah Utr III Jakarta', '(021) 5881090'),
('SUP0006', 'PT Comphar', 'Jl. Citarum No. 16 Bandung', '(022) 50238'),
('SUP0007', 'Kimia Farma', 'Jl. Ir H Juanda No. 53 Bandung', '(022) 50331'),
('SUP0008', 'PT M E T A Farma', 'Jl. Talagabodas No.40 Rt 01/08 Kel Malabar - Kec Lengkong Bandung ', '(022) 7309663'),
('SUP0009', 'PT Merapi Utama Pharma', 'Jl. Terusan Jakarta No. 75 Bandung', '(022) 7102984'),
('SUP0010', 'PT Multi Prodin Utama', 'Jl. Bapa Husen Dalam Blk No. 2 Bandung', '(022) 233438');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `apoteker`
--
ALTER TABLE `apoteker`
  ADD PRIMARY KEY (`id_apoteker`);

--
-- Indeks untuk tabel `kasir`
--
ALTER TABLE `kasir`
  ADD PRIMARY KEY (`id_kasir`);

--
-- Indeks untuk tabel `manager`
--
ALTER TABLE `manager`
  ADD PRIMARY KEY (`id_manager`);

--
-- Indeks untuk tabel `obat`
--
ALTER TABLE `obat`
  ADD PRIMARY KEY (`id_obat`),
  ADD KEY `supplier_fk` (`id_supplier`);

--
-- Indeks untuk tabel `pembayaran`
--
ALTER TABLE `pembayaran`
  ADD PRIMARY KEY (`id_pembayaran`),
  ADD KEY `kasir_fk` (`id_kasir`),
  ADD KEY `pemesanan_fk` (`id_pemesanan`);

--
-- Indeks untuk tabel `pemesanan`
--
ALTER TABLE `pemesanan`
  ADD PRIMARY KEY (`id_pemesanan`);

--
-- Indeks untuk tabel `pendata`
--
ALTER TABLE `pendata`
  ADD PRIMARY KEY (`id_pendata`);

--
-- Indeks untuk tabel `resep`
--
ALTER TABLE `resep`
  ADD PRIMARY KEY (`id_resep`),
  ADD KEY `apoteker_fk` (`id_apoteker`);

--
-- Indeks untuk tabel `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`id_supplier`);

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `obat`
--
ALTER TABLE `obat`
  ADD CONSTRAINT `supplier_fk` FOREIGN KEY (`id_supplier`) REFERENCES `supplier` (`id_supplier`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Ketidakleluasaan untuk tabel `pembayaran`
--
ALTER TABLE `pembayaran`
  ADD CONSTRAINT `kasir_fk` FOREIGN KEY (`id_kasir`) REFERENCES `kasir` (`id_kasir`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `pemesanan_fk` FOREIGN KEY (`id_pemesanan`) REFERENCES `pemesanan` (`id_pemesanan`);

--
-- Ketidakleluasaan untuk tabel `resep`
--
ALTER TABLE `resep`
  ADD CONSTRAINT `apoteker_fk` FOREIGN KEY (`id_apoteker`) REFERENCES `apoteker` (`id_apoteker`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
