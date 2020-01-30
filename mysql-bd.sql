-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--by @cequattro@gmail.com
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 30-01-2020 a las 13:58:25
-- Versión del servidor: 10.4.10-MariaDB
-- Versión de PHP: 7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `grantia`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `account`
--

DROP TABLE IF EXISTS `account`;
CREATE TABLE IF NOT EXISTS `account` (
  `accointid` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `iban` varchar(32) NOT NULL,
  `overallbalance` double NOT NULL,
  `producttype` varchar(100) NOT NULL,
  `currency` varchar(3) NOT NULL,
  PRIMARY KEY (`accointid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `account`
--

INSERT INTO `account` (`accointid`, `iban`, `overallbalance`, `producttype`, `currency`) VALUES
(1, 'ES123123123123', 6000, 'DEBIT', 'EUR'),
(2, 'ES723127123127', 3000, 'DEBIT', 'EUR'),
(3, 'ES1231231237777', 40, 'DEBIT', 'USD'),
(4, 'ES1231231954985', 100, 'DEBIT', 'CHF'),
(5, 'ES39875894757495', 200, 'DEBIT', 'EUR');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `customacc`
--

DROP TABLE IF EXISTS `customacc`;
CREATE TABLE IF NOT EXISTS `customacc` (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `UUIDCustomer` int(10) UNSIGNED NOT NULL,
  `accointid` int(10) UNSIGNED NOT NULL,
  `holdertype` varchar(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `customacc`
--

INSERT INTO `customacc` (`id`, `UUIDCustomer`, `accointid`, `holdertype`) VALUES
(1, 2, 1, 'H'),
(2, 1, 2, 'H'),
(3, 1, 3, 'H'),
(4, 1, 5, 'H');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `customer`
--

DROP TABLE IF EXISTS `customer`;
CREATE TABLE IF NOT EXISTS `customer` (
  `UUIDCustomer` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `surname` varchar(100) NOT NULL,
  `address` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  PRIMARY KEY (`UUIDCustomer`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `customer`
--

INSERT INTO `customer` (`UUIDCustomer`, `name`, `surname`, `address`, `email`) VALUES
(1, 'Willy Rayniero', 'Castro Alvarado', 'Guadarrama 14', 'cequattro@gmail.com'),
(2, 'Miguel Angel', 'Vilca Castro', 'Majadahonda 12', 'miguel.vilca@gmail.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dayregister`
--

DROP TABLE IF EXISTS `dayregister`;
CREATE TABLE IF NOT EXISTS `dayregister` (
  `datereg` datetime NOT NULL,
  `valuereg` int(11) NOT NULL,
  PRIMARY KEY (`datereg`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `dayregister`
--

INSERT INTO `dayregister` (`datereg`, `valuereg`) VALUES
('2020-01-07 04:15:28', 10),
('2020-01-10 02:18:00', 2),
('2020-01-10 03:04:11', 20),
('2020-01-10 10:00:25', 13),
('2020-01-10 15:00:12', 40);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `transaction`
--

DROP TABLE IF EXISTS `transaction`;
CREATE TABLE IF NOT EXISTS `transaction` (
  `transactionid` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `orderedby` int(10) UNSIGNED NOT NULL,
  `amount` int(10) UNSIGNED NOT NULL,
  `originaccountid` int(10) UNSIGNED NOT NULL,
  `destinationaccountid` int(10) UNSIGNED NOT NULL,
  `executiondate` datetime NOT NULL,
  `orderdate` datetime NOT NULL,
  `description` varchar(100) NOT NULL,
  PRIMARY KEY (`transactionid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
