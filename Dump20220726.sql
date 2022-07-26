CREATE DATABASE  IF NOT EXISTS `nalda` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `nalda`;
-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: nalda
-- ------------------------------------------------------
-- Server version	8.0.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `airplane`
--

DROP TABLE IF EXISTS `airplane`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `airplane` (
  `airplane_id` bigint NOT NULL AUTO_INCREMENT,
  `airplane_kind` varchar(255) DEFAULT NULL,
  `passenger_num` int DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`airplane_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `airplane`
--

LOCK TABLES `airplane` WRITE;
/*!40000 ALTER TABLE `airplane` DISABLE KEYS */;
/*!40000 ALTER TABLE `airplane` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `alcohols`
--

DROP TABLE IF EXISTS `alcohols`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `alcohols` (
  `alcohols_id` bigint NOT NULL AUTO_INCREMENT,
  `dollar` float NOT NULL,
  `liter` float NOT NULL,
  `num` int NOT NULL,
  PRIMARY KEY (`alcohols_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alcohols`
--

LOCK TABLES `alcohols` WRITE;
/*!40000 ALTER TABLE `alcohols` DISABLE KEYS */;
INSERT INTO `alcohols` VALUES (3,6,2,1),(4,6,2,1),(5,6,2,1),(6,6,2,1);
/*!40000 ALTER TABLE `alcohols` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `allergy`
--

DROP TABLE IF EXISTS `allergy`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `allergy` (
  `allergy_id` bigint NOT NULL AUTO_INCREMENT,
  `allergy_type` varchar(255) DEFAULT NULL,
  `meal_id` bigint DEFAULT NULL,
  PRIMARY KEY (`allergy_id`),
  KEY `FKlv241lfjyu1rpeju0x5poy99s` (`meal_id`),
  CONSTRAINT `FKlv241lfjyu1rpeju0x5poy99s` FOREIGN KEY (`meal_id`) REFERENCES `meal` (`meal_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `allergy`
--

LOCK TABLES `allergy` WRITE;
/*!40000 ALTER TABLE `allergy` DISABLE KEYS */;
/*!40000 ALTER TABLE `allergy` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `amenity`
--

DROP TABLE IF EXISTS `amenity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `amenity` (
  `amenity_id` bigint NOT NULL AUTO_INCREMENT,
  `amenity_name` varchar(255) DEFAULT NULL,
  `service_code` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`amenity_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `amenity`
--

LOCK TABLES `amenity` WRITE;
/*!40000 ALTER TABLE `amenity` DISABLE KEYS */;
/*!40000 ALTER TABLE `amenity` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `amenity_stock`
--

DROP TABLE IF EXISTS `amenity_stock`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `amenity_stock` (
  `amenity_stock_id` bigint NOT NULL AUTO_INCREMENT,
  `total` int NOT NULL,
  `amenity_id` bigint DEFAULT NULL,
  `flight_id` bigint DEFAULT NULL,
  PRIMARY KEY (`amenity_stock_id`),
  KEY `FKc7p85dqf780o9k5sm3buspvig` (`amenity_id`),
  KEY `FK8m5htyo50m4mjiwkvwjfb7t5w` (`flight_id`),
  CONSTRAINT `FK8m5htyo50m4mjiwkvwjfb7t5w` FOREIGN KEY (`flight_id`) REFERENCES `flight` (`flight_id`),
  CONSTRAINT `FKc7p85dqf780o9k5sm3buspvig` FOREIGN KEY (`amenity_id`) REFERENCES `amenity` (`amenity_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `amenity_stock`
--

LOCK TABLES `amenity_stock` WRITE;
/*!40000 ALTER TABLE `amenity_stock` DISABLE KEYS */;
/*!40000 ALTER TABLE `amenity_stock` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customs_declaration`
--

DROP TABLE IF EXISTS `customs_declaration`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customs_declaration` (
  `customs_declaration_id` bigint NOT NULL AUTO_INCREMENT,
  `accompany` int NOT NULL,
  `cigarettes` int NOT NULL,
  `dutyfree_exceed` varchar(255) DEFAULT NULL,
  `flight_num` varchar(255) DEFAULT NULL,
  `livestock_visited` int DEFAULT NULL,
  `payment_exceed` varchar(255) DEFAULT NULL,
  `perfumes` int NOT NULL,
  `preferential_tariff` varchar(255) DEFAULT NULL,
  `prohibit_goods` int DEFAULT NULL,
  `purpose_travel` varchar(255) DEFAULT NULL,
  `sales_goods` int DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `alcohols_id` bigint DEFAULT NULL,
  `user_id` bigint DEFAULT NULL,
  PRIMARY KEY (`customs_declaration_id`),
  KEY `FKcig1hhaw4j8rkorq6v8txqlre` (`alcohols_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `customs_declaration_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`),
  CONSTRAINT `FKcig1hhaw4j8rkorq6v8txqlre` FOREIGN KEY (`alcohols_id`) REFERENCES `alcohols` (`alcohols_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customs_declaration`
--

LOCK TABLES `customs_declaration` WRITE;
/*!40000 ALTER TABLE `customs_declaration` DISABLE KEYS */;
INSERT INTO `customs_declaration` VALUES (1,3,0,'N','KAL206',1,'N',0,'N',1,'여행',1,'2022-07-23','2022-07-23',3,4),(2,3,0,'N','KAL206',1,'N',0,'N',1,'여행',1,'2022-07-23','2022-07-23',4,4),(3,3,0,'N','KAL206',1,'N',0,'N',1,'여행',1,'2022-07-23','2022-07-23',5,4),(4,3,0,'N','KAL206',1,'N',0,'N',1,'여행',1,'2022-07-23','2022-07-23',6,4),(5,3,0,'N','KAL206',1,'N',0,'N',1,'여행',1,'2022-07-23','2022-07-23',NULL,4);
/*!40000 ALTER TABLE `customs_declaration` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `etc_exceed`
--

DROP TABLE IF EXISTS `etc_exceed`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `etc_exceed` (
  `etc_exceed_id` bigint NOT NULL AUTO_INCREMENT,
  `amount` float NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `num` int NOT NULL,
  `customs_declaration_id` bigint DEFAULT NULL,
  PRIMARY KEY (`etc_exceed_id`),
  KEY `FK3bddhn143qg6vu0jlscmtg77k` (`customs_declaration_id`),
  CONSTRAINT `FK3bddhn143qg6vu0jlscmtg77k` FOREIGN KEY (`customs_declaration_id`) REFERENCES `customs_declaration` (`customs_declaration_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `etc_exceed`
--

LOCK TABLES `etc_exceed` WRITE;
/*!40000 ALTER TABLE `etc_exceed` DISABLE KEYS */;
INSERT INTO `etc_exceed` VALUES (1,4,'콜라',3,NULL),(2,4,'콜라',3,NULL),(3,4,'콜라',3,3);
/*!40000 ALTER TABLE `etc_exceed` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `flight`
--

DROP TABLE IF EXISTS `flight`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `flight` (
  `flight_id` bigint NOT NULL AUTO_INCREMENT,
  `flight_date` datetime DEFAULT NULL,
  `airplane_id` bigint DEFAULT NULL,
  `seat_id` bigint DEFAULT NULL,
  `user_id` bigint DEFAULT NULL,
  `flight_num` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`flight_id`),
  KEY `FKb8t4272gfgo1feyyidvscbjm0` (`airplane_id`),
  KEY `FK3vrc0o2p7nlbbnnpc4fm5fcgy` (`seat_id`),
  KEY `FKsybl41p362b1vsb506td0led2` (`user_id`),
  CONSTRAINT `FK3vrc0o2p7nlbbnnpc4fm5fcgy` FOREIGN KEY (`seat_id`) REFERENCES `seat` (`seat_id`),
  CONSTRAINT `FKb8t4272gfgo1feyyidvscbjm0` FOREIGN KEY (`airplane_id`) REFERENCES `airplane` (`airplane_id`),
  CONSTRAINT `FKsybl41p362b1vsb506td0led2` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `flight`
--

LOCK TABLES `flight` WRITE;
/*!40000 ALTER TABLE `flight` DISABLE KEYS */;
/*!40000 ALTER TABLE `flight` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `meal`
--

DROP TABLE IF EXISTS `meal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `meal` (
  `meal_id` bigint NOT NULL AUTO_INCREMENT,
  `calories` int NOT NULL,
  `image_name` varchar(255) DEFAULT NULL,
  `meal_country` varchar(255) DEFAULT NULL,
  `meal_menu` varchar(255) DEFAULT NULL,
  `airplane_id` bigint DEFAULT NULL,
  `seat_class` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`meal_id`),
  KEY `FKdxk0wredg6n5frmurxp4ldw3n` (`airplane_id`),
  CONSTRAINT `FKdxk0wredg6n5frmurxp4ldw3n` FOREIGN KEY (`airplane_id`) REFERENCES `airplane` (`airplane_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `meal`
--

LOCK TABLES `meal` WRITE;
/*!40000 ALTER TABLE `meal` DISABLE KEYS */;
/*!40000 ALTER TABLE `meal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `meal_detail`
--

DROP TABLE IF EXISTS `meal_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `meal_detail` (
  `meal_detail_id` bigint NOT NULL AUTO_INCREMENT,
  `meal_name` varchar(255) DEFAULT NULL,
  `meal_id` bigint DEFAULT NULL,
  PRIMARY KEY (`meal_detail_id`),
  KEY `FK481b6yw93n2nsirfpfkmrct1u` (`meal_id`),
  CONSTRAINT `FK481b6yw93n2nsirfpfkmrct1u` FOREIGN KEY (`meal_id`) REFERENCES `meal` (`meal_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `meal_detail`
--

LOCK TABLES `meal_detail` WRITE;
/*!40000 ALTER TABLE `meal_detail` DISABLE KEYS */;
/*!40000 ALTER TABLE `meal_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `meal_stock`
--

DROP TABLE IF EXISTS `meal_stock`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `meal_stock` (
  `meal_stock_id` bigint NOT NULL AUTO_INCREMENT,
  `total` int NOT NULL,
  `flight_id` bigint DEFAULT NULL,
  `meal_id` bigint DEFAULT NULL,
  PRIMARY KEY (`meal_stock_id`),
  KEY `FK6hfq5qx5oc2ak8xs5di4g4w52` (`flight_id`),
  KEY `FKfq3s9cffdejo9pjxaq0h5afdn` (`meal_id`),
  CONSTRAINT `FK6hfq5qx5oc2ak8xs5di4g4w52` FOREIGN KEY (`flight_id`) REFERENCES `flight` (`flight_id`),
  CONSTRAINT `FKfq3s9cffdejo9pjxaq0h5afdn` FOREIGN KEY (`meal_id`) REFERENCES `meal` (`meal_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `meal_stock`
--

LOCK TABLES `meal_stock` WRITE;
/*!40000 ALTER TABLE `meal_stock` DISABLE KEYS */;
/*!40000 ALTER TABLE `meal_stock` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medical`
--

DROP TABLE IF EXISTS `medical`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medical` (
  `medical_id` bigint NOT NULL AUTO_INCREMENT,
  `medical_name` varchar(255) DEFAULT NULL,
  `service_code` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`medical_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medical`
--

LOCK TABLES `medical` WRITE;
/*!40000 ALTER TABLE `medical` DISABLE KEYS */;
/*!40000 ALTER TABLE `medical` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orders` (
  `orders_id` bigint NOT NULL AUTO_INCREMENT,
  `order_message` varchar(255) DEFAULT NULL,
  `order_time` datetime DEFAULT NULL,
  `flight_id` bigint DEFAULT NULL,
  `seat_id` bigint DEFAULT NULL,
  `user_id` bigint DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`orders_id`),
  KEY `FKibsajojxv1c477axawxsjvjgl` (`flight_id`),
  KEY `FKdaqk00gv37233lylyr9ua8qf9` (`seat_id`),
  KEY `FKel9kyl84ego2otj2accfd8mr7` (`user_id`),
  CONSTRAINT `FKdaqk00gv37233lylyr9ua8qf9` FOREIGN KEY (`seat_id`) REFERENCES `seat` (`seat_id`),
  CONSTRAINT `FKel9kyl84ego2otj2accfd8mr7` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`),
  CONSTRAINT `FKibsajojxv1c477axawxsjvjgl` FOREIGN KEY (`flight_id`) REFERENCES `flight` (`flight_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders_codes`
--

DROP TABLE IF EXISTS `orders_codes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orders_codes` (
  `orders_codes_id` bigint NOT NULL AUTO_INCREMENT,
  `order_code` varchar(255) DEFAULT NULL,
  `orders_id` bigint DEFAULT NULL,
  PRIMARY KEY (`orders_codes_id`),
  KEY `FKk06jsslo8iym86v2nlg7xc7m5` (`orders_id`),
  CONSTRAINT `FKk06jsslo8iym86v2nlg7xc7m5` FOREIGN KEY (`orders_id`) REFERENCES `orders` (`orders_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders_codes`
--

LOCK TABLES `orders_codes` WRITE;
/*!40000 ALTER TABLE `orders_codes` DISABLE KEYS */;
/*!40000 ALTER TABLE `orders_codes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `seat`
--

DROP TABLE IF EXISTS `seat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `seat` (
  `seat_id` bigint NOT NULL AUTO_INCREMENT,
  `seat_class` varchar(255) DEFAULT NULL,
  `seat_num` varchar(255) DEFAULT NULL,
  `airplane_id` bigint DEFAULT NULL,
  PRIMARY KEY (`seat_id`),
  KEY `FKt7u5y813qku5lbuyr2l1pejo3` (`airplane_id`),
  CONSTRAINT `FKt7u5y813qku5lbuyr2l1pejo3` FOREIGN KEY (`airplane_id`) REFERENCES `airplane` (`airplane_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `seat`
--

LOCK TABLES `seat` WRITE;
/*!40000 ALTER TABLE `seat` DISABLE KEYS */;
/*!40000 ALTER TABLE `seat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `seat_meal`
--

DROP TABLE IF EXISTS `seat_meal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `seat_meal` (
  `seat_meal_id` bigint NOT NULL AUTO_INCREMENT,
  `meal_classification` varchar(255) DEFAULT NULL,
  `flight_id` bigint DEFAULT NULL,
  `meal_id` bigint DEFAULT NULL,
  `seat_id` bigint DEFAULT NULL,
  `user_id` bigint DEFAULT NULL,
  PRIMARY KEY (`seat_meal_id`),
  KEY `FKc69y9jhqdi0t77gtnyt7vwexf` (`flight_id`),
  KEY `FKo7kyjbmf1ahpdq7l62f1h4lcl` (`meal_id`),
  KEY `FKb2lw5ojv7m85a8urr6gmr6q1g` (`seat_id`),
  KEY `FKhsmilocycy16fnaq62a9bwfd4` (`user_id`),
  CONSTRAINT `FKb2lw5ojv7m85a8urr6gmr6q1g` FOREIGN KEY (`seat_id`) REFERENCES `seat` (`seat_id`),
  CONSTRAINT `FKc69y9jhqdi0t77gtnyt7vwexf` FOREIGN KEY (`flight_id`) REFERENCES `flight` (`flight_id`),
  CONSTRAINT `FKhsmilocycy16fnaq62a9bwfd4` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`),
  CONSTRAINT `FKo7kyjbmf1ahpdq7l62f1h4lcl` FOREIGN KEY (`meal_id`) REFERENCES `meal` (`meal_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `seat_meal`
--

LOCK TABLES `seat_meal` WRITE;
/*!40000 ALTER TABLE `seat_meal` DISABLE KEYS */;
/*!40000 ALTER TABLE `seat_meal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `service_codes`
--

DROP TABLE IF EXISTS `service_codes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `service_codes` (
  `service_codes_id` bigint NOT NULL AUTO_INCREMENT,
  `code` varchar(255) DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  `service_class` varchar(255) DEFAULT NULL,
  `service_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`service_codes_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `service_codes`
--

LOCK TABLES `service_codes` WRITE;
/*!40000 ALTER TABLE `service_codes` DISABLE KEYS */;
/*!40000 ALTER TABLE `service_codes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `snack`
--

DROP TABLE IF EXISTS `snack`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `snack` (
  `snack_id` bigint NOT NULL AUTO_INCREMENT,
  `image_name` varchar(255) DEFAULT NULL,
  `service_code` varchar(255) DEFAULT NULL,
  `snack_classification` varchar(255) DEFAULT NULL,
  `snack_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`snack_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `snack`
--

LOCK TABLES `snack` WRITE;
/*!40000 ALTER TABLE `snack` DISABLE KEYS */;
/*!40000 ALTER TABLE `snack` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `snack_stock`
--

DROP TABLE IF EXISTS `snack_stock`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `snack_stock` (
  `snackstock_id` bigint NOT NULL AUTO_INCREMENT,
  `total` int NOT NULL,
  `flight_id` bigint DEFAULT NULL,
  `snack_id` bigint DEFAULT NULL,
  PRIMARY KEY (`snackstock_id`),
  KEY `FKhi472x2hthhf1xbkl5sy8xnao` (`flight_id`),
  KEY `FK7bs1tjafw510ggak1cwh6rnql` (`snack_id`),
  CONSTRAINT `FK7bs1tjafw510ggak1cwh6rnql` FOREIGN KEY (`snack_id`) REFERENCES `snack` (`snack_id`),
  CONSTRAINT `FKhi472x2hthhf1xbkl5sy8xnao` FOREIGN KEY (`flight_id`) REFERENCES `flight` (`flight_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `snack_stock`
--

LOCK TABLES `snack_stock` WRITE;
/*!40000 ALTER TABLE `snack_stock` DISABLE KEYS */;
/*!40000 ALTER TABLE `snack_stock` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `terms`
--

DROP TABLE IF EXISTS `terms`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `terms` (
  `terms_id` bigint NOT NULL AUTO_INCREMENT,
  `location_based` varchar(255) DEFAULT NULL,
  `privacy_policy` varchar(255) DEFAULT NULL,
  `promotional_info` varchar(255) DEFAULT NULL,
  `term_service` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`terms_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `terms`
--

LOCK TABLES `terms` WRITE;
/*!40000 ALTER TABLE `terms` DISABLE KEYS */;
INSERT INTO `terms` VALUES (2,'Y','Y','Y','Y'),(4,'Y','Y','Y','Y'),(5,'Y','Y','Y','Y'),(6,'Y','Y','Y','Y');
/*!40000 ALTER TABLE `terms` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `toilet`
--

DROP TABLE IF EXISTS `toilet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `toilet` (
  `toilet_id` bigint NOT NULL AUTO_INCREMENT,
  `toilet_code` varchar(255) DEFAULT NULL,
  `airplane_id` bigint DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  PRIMARY KEY (`toilet_id`),
  KEY `FK3o3lsin22eiq8elkhgdiin9tc` (`airplane_id`),
  CONSTRAINT `FK3o3lsin22eiq8elkhgdiin9tc` FOREIGN KEY (`airplane_id`) REFERENCES `airplane` (`airplane_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `toilet`
--

LOCK TABLES `toilet` WRITE;
/*!40000 ALTER TABLE `toilet` DISABLE KEYS */;
/*!40000 ALTER TABLE `toilet` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `user_id` bigint NOT NULL AUTO_INCREMENT,
  `birthday` date DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `middle_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `user_role` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `terms_id` bigint DEFAULT NULL,
  `user_detail_id` bigint DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  KEY `FKkqxiku6kojhy4q67b8ggcvgnb` (`terms_id`),
  KEY `FKda0fetw3e5nbo2brw8c0n9bts` (`user_detail_id`),
  CONSTRAINT `FKda0fetw3e5nbo2brw8c0n9bts` FOREIGN KEY (`user_detail_id`) REFERENCES `user_detail` (`user_detail_id`),
  CONSTRAINT `FKkqxiku6kojhy4q67b8ggcvgnb` FOREIGN KEY (`terms_id`) REFERENCES `terms` (`terms_id`),
  CONSTRAINT `user_ibfk_1` FOREIGN KEY (`terms_id`) REFERENCES `terms` (`terms_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (4,'1997-10-08',NULL,'규','명','$2a$10$6b9.9I48KBOhlpQPbEVsk.RUYShAdGHuxOnKIdzvksK44HRkRPadi','ROLE_USER','audrb96',5,5),(5,'1997-10-08','박','규','명','$2a$10$LpyoMFfWLSoYUGXsZnrDZeVitwoOHxZUdms6y.KCa30XjZXgymy8e','ROLE_USER','audrb97',6,6);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_detail`
--

DROP TABLE IF EXISTS `user_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_detail` (
  `user_detail_id` bigint NOT NULL AUTO_INCREMENT,
  `detail_address` varchar(255) DEFAULT NULL,
  `main_address` varchar(255) DEFAULT NULL,
  `zipcode` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `job` varchar(255) DEFAULT NULL,
  `nationality` varchar(255) DEFAULT NULL,
  `passport_num` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `tel` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_detail_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_detail`
--

LOCK TABLES `user_detail` WRITE;
/*!40000 ALTER TABLE `user_detail` DISABLE KEYS */;
INSERT INTO `user_detail` VALUES (4,'5동 105호','경기도 남양주시 금곡동 사릉로34번길 7-1','12233','audrb96@naver.com','개발자','대한민국','M123A4567','MALE','010-2318-9857'),(5,'신명아파트 2동 101호','경기도 남양주시 평내동','11122','audrb97@naver.com','프로그래머','한국','M111A222','FEMALE','010-2222-3333'),(6,'5동 105호','경기도 남양주시 금곡동 사릉로34번길 7-1','12233','audrb96@naver.com','개발자','대한민국','M123A4567','MALE','010-2318-9857');
/*!40000 ALTER TABLE `user_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `visited_country`
--

DROP TABLE IF EXISTS `visited_country`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `visited_country` (
  `visited_country_id` bigint NOT NULL AUTO_INCREMENT,
  `country_name` varchar(255) DEFAULT NULL,
  `customs_declaration_id` bigint DEFAULT NULL,
  PRIMARY KEY (`visited_country_id`),
  KEY `FKejkdlt4h9n5o9xdp0lgwr433r` (`customs_declaration_id`),
  CONSTRAINT `FKejkdlt4h9n5o9xdp0lgwr433r` FOREIGN KEY (`customs_declaration_id`) REFERENCES `customs_declaration` (`customs_declaration_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `visited_country`
--

LOCK TABLES `visited_country` WRITE;
/*!40000 ALTER TABLE `visited_country` DISABLE KEYS */;
INSERT INTO `visited_country` VALUES (1,'미국',NULL),(2,'중국',NULL),(3,'미국',NULL),(4,'중국',NULL),(5,'미국',3),(6,'중국',3);
/*!40000 ALTER TABLE `visited_country` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-26 10:59:27
