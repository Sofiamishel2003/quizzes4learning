-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 03-11-2022 a las 10:54:50
-- Versión del servidor: 10.4.20-MariaDB
-- Versión de PHP: 8.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `quizzes4learning`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materias`
--

CREATE TABLE `materias` (
  `usuario` varchar(20) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `matematica` int(11) NOT NULL,
  `ingles` int(11) NOT NULL,
  `literatura` int(11) NOT NULL,
  `historia` int(11) NOT NULL,
  `aleman` int(11) NOT NULL,
  `informatica` int(11) NOT NULL,
  `contraseña` varchar(20) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `colegio` varchar(30) NOT NULL,
  `grado` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `materias`
--

INSERT INTO `materias` (`usuario`, `matematica`, `ingles`, `literatura`, `historia`, `aleman`, `informatica`, `contraseña`, `colegio`, `grado`) VALUES
('cami', 1, 0, 0, 0, 0, 0, '1234', 'suizo', 2),
('maria', 0, 0, 0, 0, 0, 0, 'sap123', 'suizo', 4),
('Sofia', 0, 0, 0, 0, 0, 0, 'Blabla1', 'americano', 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `materias`
--
ALTER TABLE `materias`
  ADD PRIMARY KEY (`usuario`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
