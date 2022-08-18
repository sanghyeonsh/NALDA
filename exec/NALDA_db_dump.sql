-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: nalda-db.c2k2xt6qu8x0.ap-northeast-2.rds.amazonaws.com    Database: NALDA_db
-- ------------------------------------------------------
-- Server version	8.0.28

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
SET @MYSQLDUMP_TEMP_LOG_BIN = @@SESSION.SQL_LOG_BIN;
SET @@SESSION.SQL_LOG_BIN= 0;

--
-- GTID state at the beginning of the backup 
--

SET @@GLOBAL.GTID_PURGED=/*!80000 '+'*/ '';

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
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `airplane`
--

LOCK TABLES `airplane` WRITE;
/*!40000 ALTER TABLE `airplane` DISABLE KEYS */;
INSERT INTO `airplane` VALUES (1,'A380',407,NULL),(2,'777-200ER-1',261,'700-200ER.jpg');
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
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alcohols`
--

LOCK TABLES `alcohols` WRITE;
/*!40000 ALTER TABLE `alcohols` DISABLE KEYS */;
INSERT INTO `alcohols` VALUES (33,0,100,10),(34,0,0,0),(35,80,200,1);
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
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `allergy`
--

LOCK TABLES `allergy` WRITE;
/*!40000 ALTER TABLE `allergy` DISABLE KEYS */;
INSERT INTO `allergy` VALUES (1,'유제품 알러지',2),(2,'땅콩 알러지',3),(3,'유제품 알러지',5),(4,'갑각류 알러지',6);
/*!40000 ALTER TABLE `allergy` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customs_declaration`
--

DROP TABLE IF EXISTS `customs_declaration`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customs_declaration` (
  `customs_declaration_id` bigint NOT NULL AUTO_INCREMENT,
  `accompany` int DEFAULT NULL,
  `cigarettes` int DEFAULT NULL,
  `dutyfree_exceed` varchar(255) DEFAULT NULL,
  `flight_num` varchar(255) DEFAULT NULL,
  `livestock_visited` varchar(255) DEFAULT NULL,
  `payment_exceed` varchar(255) DEFAULT NULL,
  `perfumes` int DEFAULT NULL,
  `preferential_tariff` varchar(255) DEFAULT NULL,
  `prohibit_goods` varchar(255) DEFAULT NULL,
  `purpose_travel` varchar(255) DEFAULT NULL,
  `sales_goods` varchar(255) DEFAULT NULL,
  `alcohols_id` bigint DEFAULT NULL,
  `user_id` bigint DEFAULT NULL,
  `dutyfree_exceed_value` int DEFAULT NULL,
  `payment_exceed_value` int DEFAULT NULL,
  `date` datetime DEFAULT NULL,
  `travel_period` int DEFAULT NULL,
  PRIMARY KEY (`customs_declaration_id`),
  KEY `FKcig1hhaw4j8rkorq6v8txqlre` (`alcohols_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `customs_declaration_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`),
  CONSTRAINT `FKcig1hhaw4j8rkorq6v8txqlre` FOREIGN KEY (`alcohols_id`) REFERENCES `alcohols` (`alcohols_id`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customs_declaration`
--

LOCK TABLES `customs_declaration` WRITE;
/*!40000 ALTER TABLE `customs_declaration` DISABLE KEYS */;
INSERT INTO `customs_declaration` VALUES (32,5,0,'N','NALDA1004','N','N',0,'N','N','business','N',33,9,0,0,'2018-08-27 00:00:00',0),(33,0,0,'N','NALDA1004','N','N',0,'N','N','travel','N',34,9,0,0,'2019-04-26 00:00:00',0),(34,2,0,'N','NALDA1004','N','N',0,'N','Y','travel','N',35,9,0,0,'2019-09-08 00:00:00',0);
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
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `etc_exceed`
--

LOCK TABLES `etc_exceed` WRITE;
/*!40000 ALTER TABLE `etc_exceed` DISABLE KEYS */;
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
  `flight_num` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`flight_id`),
  KEY `FKb8t4272gfgo1feyyidvscbjm0` (`airplane_id`),
  CONSTRAINT `FKb8t4272gfgo1feyyidvscbjm0` FOREIGN KEY (`airplane_id`) REFERENCES `airplane` (`airplane_id`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `flight`
--

LOCK TABLES `flight` WRITE;
/*!40000 ALTER TABLE `flight` DISABLE KEYS */;
INSERT INTO `flight` VALUES (37,'2022-08-18 20:18:21',2,'NALDA1004','PROGRESS');
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
  `content` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`meal_id`),
  KEY `FKdxk0wredg6n5frmurxp4ldw3n` (`airplane_id`),
  CONSTRAINT `FKdxk0wredg6n5frmurxp4ldw3n` FOREIGN KEY (`airplane_id`) REFERENCES `airplane` (`airplane_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `meal`
--

LOCK TABLES `meal` WRITE;
/*!40000 ALTER TABLE `meal` DISABLE KEYS */;
INSERT INTO `meal` VALUES (2,620,'Curryrice.jpg',NULL,'카레라이스',1,'ECONOMY','고기와 채소를 볶아 카레가루와 육수를 넣고 끓인 요리로 고형카레로 풍미를 더하고 돼지고기가 들어가 식감을 더하여 만들었으니 식사해보세요.'),(3,640,'Beefbowl.jpg',NULL,'제육덮밥',1,'ECONOMY','얇게 썬 돼지고기를 고추장 양념에 버무려서 재워놓고 철판에 볶은 음식으로 매콤달달한 맛을 느낄 수 있습니다.  양념이 잘 베이고 소스가 많아 입맛을 돋우어 밥과 잘 어울리니 식사해보세요.'),(4,700,'Beefbibimbap.jpg',NULL,'소불고기비빔밥',1,'ECONOMY','각종 반찬들이 밥 위에 푸짐하게 올려져 있는 기존의 비빔밥에 맛있게 양념된 소고기와 고소한 맛을 위한 계란을 곁들여 고기의 맛은 최대한 살리면서 느끼하지 않고 상큼한 맛을 내었으니 식사해보세요.'),(5,620,'Chickensteak.jpg',NULL,'치킨스테이크',1,'ECONOMY','굽기만 해도 맛있는 촉촉한 치킨스테이크 지방과 살의 적당한 비율과 촉촉한 육즙으로 많은 이들의 사랑을 받는 부위, 치킨 다리살입니다. 스테이크용으로 먹기 좋게 손질해서 시즈닝했으니 간편하게 구워내 식사해보세요.'),(6,630,'Shrimppasta.jpg',NULL,'새우파스타',1,'ECONOMY','마늘, 페퍼론치노 등을 넣은 올리브오일에 새우 등을 넣어 만든 파스타로 치킨 스톡을 넣어 감칠맛이 폭발하니 식사해보세요.'),(7,400,'Tofumushroomsalad.jpg',NULL,'두부버섯샐러드',1,'ECONOMY','두부에 밑간을 하여 달궈진 팬에 부치고 버섯은 약간의 소금을 넣고 구워준 뒤 상추와 어린잎 채소와 함께 버무려 만들어 가벼우면서 맛있으니 식사해보세요.');
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
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `meal_detail`
--

LOCK TABLES `meal_detail` WRITE;
/*!40000 ALTER TABLE `meal_detail` DISABLE KEYS */;
INSERT INTO `meal_detail` VALUES (1,'김치',2),(2,'미니탕수육',2),(3,'푸딩',2),(4,'요구르트',2),(5,'김치',3),(6,'멸치볶음',3),(7,'한과',3),(8,'식혜',3),(9,'김치',4),(10,'고추장',4),(11,'한과',4),(12,'식혜',4),(13,'미니샐러드',5),(14,'피클',5),(15,'모닝빵',5),(16,'우유',5),(17,'미니샐러드',6),(18,'피클',6),(19,'바게트',6),(20,'콜라',6),(21,'오렌지주스',7);
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
  `status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`meal_stock_id`),
  KEY `FK6hfq5qx5oc2ak8xs5di4g4w52` (`flight_id`),
  KEY `FKfq3s9cffdejo9pjxaq0h5afdn` (`meal_id`),
  CONSTRAINT `FK6hfq5qx5oc2ak8xs5di4g4w52` FOREIGN KEY (`flight_id`) REFERENCES `flight` (`flight_id`),
  CONSTRAINT `FKfq3s9cffdejo9pjxaq0h5afdn` FOREIGN KEY (`meal_id`) REFERENCES `meal` (`meal_id`)
) ENGINE=InnoDB AUTO_INCREMENT=207 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `meal_stock`
--

LOCK TABLES `meal_stock` WRITE;
/*!40000 ALTER TABLE `meal_stock` DISABLE KEYS */;
INSERT INTO `meal_stock` VALUES (203,150,37,3,'PROGRESS'),(204,200,37,4,'PROGRESS'),(205,200,37,5,'READY'),(206,170,37,6,'READY');
/*!40000 ALTER TABLE `meal_stock` ENABLE KEYS */;
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
  `order_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `flight_id` bigint DEFAULT NULL,
  `seat_id` bigint DEFAULT NULL,
  `user_id` bigint DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `complete_time` datetime DEFAULT NULL,
  PRIMARY KEY (`orders_id`),
  KEY `FKibsajojxv1c477axawxsjvjgl` (`flight_id`),
  KEY `FKdaqk00gv37233lylyr9ua8qf9` (`seat_id`),
  KEY `FKel9kyl84ego2otj2accfd8mr7` (`user_id`),
  CONSTRAINT `FKdaqk00gv37233lylyr9ua8qf9` FOREIGN KEY (`seat_id`) REFERENCES `seat` (`seat_id`),
  CONSTRAINT `FKel9kyl84ego2otj2accfd8mr7` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`),
  CONSTRAINT `FKibsajojxv1c477axawxsjvjgl` FOREIGN KEY (`flight_id`) REFERENCES `flight` (`flight_id`)
) ENGINE=InnoDB AUTO_INCREMENT=221 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES (213,'','2022-08-18 20:27:59',37,8,9,'PROGRESS',NULL),(214,'','2022-08-18 20:28:09',37,8,9,'PROGRESS',NULL),(215,'','2022-08-18 20:29:17',37,8,9,'PROGRESS',NULL),(218,'','2022-08-18 20:41:17',37,30,10,'PROGRESS',NULL),(219,'','2022-08-18 20:41:41',37,30,10,'PROGRESS',NULL);
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
  `cnt` int DEFAULT NULL,
  PRIMARY KEY (`orders_codes_id`),
  KEY `FKk06jsslo8iym86v2nlg7xc7m5` (`orders_id`),
  CONSTRAINT `FKk06jsslo8iym86v2nlg7xc7m5` FOREIGN KEY (`orders_id`) REFERENCES `orders` (`orders_id`)
) ENGINE=InnoDB AUTO_INCREMENT=363 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders_codes`
--

LOCK TABLES `orders_codes` WRITE;
/*!40000 ALTER TABLE `orders_codes` DISABLE KEYS */;
INSERT INTO `orders_codes` VALUES (348,'A004',213,1),(349,'A009',213,5),(350,'A110',213,2),(351,'C002',214,1),(352,'B002',215,1),(357,'A007',218,4),(358,'A008',218,2),(359,'A207',218,2),(360,'C003',219,1);
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
  `ip` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`seat_id`),
  KEY `FKt7u5y813qku5lbuyr2l1pejo3` (`airplane_id`),
  CONSTRAINT `FKt7u5y813qku5lbuyr2l1pejo3` FOREIGN KEY (`airplane_id`) REFERENCES `airplane` (`airplane_id`)
) ENGINE=InnoDB AUTO_INCREMENT=268 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `seat`
--

LOCK TABLES `seat` WRITE;
/*!40000 ALTER TABLE `seat` DISABLE KEYS */;
INSERT INTO `seat` VALUES (7,'FIRST','A02',2,'58.233.55.143'),(8,'FIRST','D01',2,'127.0.0.1'),(9,'FIRST','D02',2,'112.169.54.47'),(10,'FIRST','E01',2,'116.126.126.252'),(11,'FIRST','E02',2,'211.178.168.77'),(12,'FIRST','J01',2,'218.238.61.222'),(13,'FIRST','J02',2,'121.133.150.144'),(14,'FIRST','A01',2,'223.38.46.131'),(15,'BUSINESS','A07',2,'223.38.45.126'),(16,'BUSINESS','B07',2,'211.192.210.66'),(17,'BUSINESS','D07',2,'223.62.174.28'),(18,'BUSINESS','E07',2,'211.192.210.68'),(19,'BUSINESS','F07',2,'211.192.252.47'),(20,'BUSINESS','H07',2,'211.192.210.69'),(21,'BUSINESS','J07',2,'61.74.164.199'),(22,'BUSINESS','A08',2,'223.62.175.28'),(23,'BUSINESS','B08',2,NULL),(24,'BUSINESS','D08',2,NULL),(25,'BUSINESS','E08',2,NULL),(26,'BUSINESS','F08',2,NULL),(27,'BUSINESS','H08',2,NULL),(28,'BUSINESS','J08',2,NULL),(29,'BUSINESS','A09',2,NULL),(30,'BUSINESS','B09',2,'61.74.164.199'),(31,'BUSINESS','D09',2,NULL),(32,'BUSINESS','E09',2,NULL),(33,'BUSINESS','F09',2,NULL),(34,'BUSINESS','H09',2,NULL),(35,'BUSINESS','J09',2,NULL),(36,'BUSINESS','A10',2,NULL),(37,'BUSINESS','B10',2,NULL),(38,'BUSINESS','D10',2,NULL),(39,'BUSINESS','E10',2,NULL),(40,'BUSINESS','F10',2,NULL),(41,'BUSINESS','H10',2,NULL),(42,'BUSINESS','J10',2,NULL),(43,'ECONOMY','A28',2,NULL),(44,'ECONOMY','B28',2,NULL),(45,'ECONOMY','C28',2,NULL),(46,'ECONOMY','D28',2,NULL),(47,'ECONOMY','E28',2,NULL),(48,'ECONOMY','F28',2,NULL),(49,'ECONOMY','G28',2,NULL),(50,'ECONOMY','H28',2,NULL),(51,'ECONOMY','J28',2,NULL),(52,'ECONOMY','A29',2,NULL),(53,'ECONOMY','B29',2,NULL),(54,'ECONOMY','C29',2,NULL),(55,'ECONOMY','D29',2,NULL),(56,'ECONOMY','E29',2,NULL),(57,'ECONOMY','F29',2,NULL),(58,'ECONOMY','G29',2,NULL),(59,'ECONOMY','H29',2,NULL),(60,'ECONOMY','J29',2,NULL),(61,'ECONOMY','A30',2,NULL),(62,'ECONOMY','B30',2,NULL),(63,'ECONOMY','C30',2,NULL),(64,'ECONOMY','D30',2,NULL),(65,'ECONOMY','E30',2,NULL),(66,'ECONOMY','F30',2,NULL),(67,'ECONOMY','G30',2,NULL),(68,'ECONOMY','H30',2,NULL),(69,'ECONOMY','J30',2,NULL),(70,'ECONOMY','A31',2,NULL),(71,'ECONOMY','B31',2,NULL),(72,'ECONOMY','C31',2,NULL),(73,'ECONOMY','D31',2,NULL),(74,'ECONOMY','E31',2,NULL),(75,'ECONOMY','F31',2,NULL),(76,'ECONOMY','G31',2,NULL),(77,'ECONOMY','H31',2,NULL),(78,'ECONOMY','J31',2,NULL),(79,'ECONOMY','A32',2,NULL),(80,'ECONOMY','B32',2,NULL),(81,'ECONOMY','C32',2,NULL),(82,'ECONOMY','D32',2,NULL),(83,'ECONOMY','E32',2,NULL),(84,'ECONOMY','F32',2,NULL),(85,'ECONOMY','G32',2,NULL),(86,'ECONOMY','H32',2,NULL),(87,'ECONOMY','J32',2,NULL),(88,'ECONOMY','A33',2,NULL),(89,'ECONOMY','B33',2,NULL),(90,'ECONOMY','C33',2,NULL),(91,'ECONOMY','D33',2,NULL),(92,'ECONOMY','E33',2,NULL),(93,'ECONOMY','F33',2,NULL),(94,'ECONOMY','G33',2,NULL),(95,'ECONOMY','H33',2,NULL),(96,'ECONOMY','J33',2,NULL),(97,'ECONOMY','A34',2,NULL),(98,'ECONOMY','B34',2,NULL),(99,'ECONOMY','C34',2,NULL),(100,'ECONOMY','D34',2,NULL),(101,'ECONOMY','E34',2,NULL),(102,'ECONOMY','F34',2,NULL),(103,'ECONOMY','G34',2,NULL),(104,'ECONOMY','H34',2,NULL),(105,'ECONOMY','J34',2,NULL),(106,'ECONOMY','A35',2,NULL),(107,'ECONOMY','B35',2,NULL),(108,'ECONOMY','C35',2,NULL),(109,'ECONOMY','D35',2,NULL),(110,'ECONOMY','E35',2,NULL),(111,'ECONOMY','F35',2,NULL),(112,'ECONOMY','G35',2,NULL),(113,'ECONOMY','H35',2,NULL),(114,'ECONOMY','J35',2,NULL),(115,'ECONOMY','A36',2,NULL),(116,'ECONOMY','B36',2,NULL),(117,'ECONOMY','C36',2,NULL),(118,'ECONOMY','D36',2,NULL),(119,'ECONOMY','E36',2,NULL),(120,'ECONOMY','F36',2,NULL),(121,'ECONOMY','G36',2,NULL),(122,'ECONOMY','H36',2,NULL),(123,'ECONOMY','J36',2,NULL),(124,'ECONOMY','A37',2,NULL),(125,'ECONOMY','B37',2,NULL),(126,'ECONOMY','C37',2,NULL),(127,'ECONOMY','D37',2,NULL),(128,'ECONOMY','E37',2,NULL),(129,'ECONOMY','F37',2,NULL),(130,'ECONOMY','G37',2,NULL),(131,'ECONOMY','H37',2,NULL),(132,'ECONOMY','J37',2,NULL),(133,'ECONOMY','A38',2,NULL),(134,'ECONOMY','B38',2,NULL),(135,'ECONOMY','C38',2,NULL),(136,'ECONOMY','D38',2,NULL),(137,'ECONOMY','E38',2,NULL),(138,'ECONOMY','F38',2,NULL),(139,'ECONOMY','G38',2,NULL),(140,'ECONOMY','H38',2,NULL),(141,'ECONOMY','J38',2,NULL),(142,'ECONOMY','A39',2,NULL),(143,'ECONOMY','B39',2,NULL),(144,'ECONOMY','C39',2,NULL),(145,'ECONOMY','D39',2,NULL),(146,'ECONOMY','E39',2,NULL),(147,'ECONOMY','F39',2,NULL),(148,'ECONOMY','G39',2,NULL),(149,'ECONOMY','H39',2,NULL),(150,'ECONOMY','J39',2,NULL),(151,'ECONOMY','A40',2,NULL),(152,'ECONOMY','B40',2,NULL),(153,'ECONOMY','C40',2,NULL),(154,'ECONOMY','D40',2,NULL),(155,'ECONOMY','E40',2,NULL),(156,'ECONOMY','F40',2,NULL),(157,'ECONOMY','G40',2,NULL),(158,'ECONOMY','H40',2,NULL),(159,'ECONOMY','J40',2,NULL),(160,'ECONOMY','A41',2,NULL),(161,'ECONOMY','B41',2,NULL),(162,'ECONOMY','D41',2,NULL),(163,'ECONOMY','E41',2,NULL),(164,'ECONOMY','F41',2,NULL),(165,'ECONOMY','A42',2,NULL),(166,'ECONOMY','B42',2,NULL),(167,'ECONOMY','C42',2,NULL),(168,'ECONOMY','G42',2,NULL),(169,'ECONOMY','H42',2,NULL),(170,'ECONOMY','J42',2,NULL),(171,'ECONOMY','A43',2,NULL),(172,'ECONOMY','B43',2,NULL),(173,'ECONOMY','C43',2,NULL),(174,'ECONOMY','D43',2,NULL),(175,'ECONOMY','E43',2,NULL),(176,'ECONOMY','F43',2,NULL),(177,'ECONOMY','G43',2,NULL),(178,'ECONOMY','H43',2,NULL),(179,'ECONOMY','J43',2,NULL),(180,'ECONOMY','A44',2,NULL),(181,'ECONOMY','B44',2,NULL),(182,'ECONOMY','C44',2,NULL),(183,'ECONOMY','D44',2,NULL),(184,'ECONOMY','E44',2,NULL),(185,'ECONOMY','F44',2,NULL),(186,'ECONOMY','G44',2,NULL),(187,'ECONOMY','H44',2,NULL),(188,'ECONOMY','J44',2,NULL),(189,'ECONOMY','A45',2,NULL),(190,'ECONOMY','B45',2,NULL),(191,'ECONOMY','C45',2,NULL),(192,'ECONOMY','D45',2,NULL),(193,'ECONOMY','E45',2,NULL),(194,'ECONOMY','F45',2,NULL),(195,'ECONOMY','G45',2,NULL),(196,'ECONOMY','H45',2,NULL),(197,'ECONOMY','J45',2,NULL),(198,'ECONOMY','A46',2,NULL),(199,'ECONOMY','B46',2,NULL),(200,'ECONOMY','C46',2,NULL),(201,'ECONOMY','D46',2,NULL),(202,'ECONOMY','E46',2,NULL),(203,'ECONOMY','F46',2,NULL),(204,'ECONOMY','G46',2,NULL),(205,'ECONOMY','H46',2,NULL),(206,'ECONOMY','J46',2,NULL),(207,'ECONOMY','A47',2,NULL),(208,'ECONOMY','B47',2,NULL),(209,'ECONOMY','C47',2,NULL),(210,'ECONOMY','D47',2,NULL),(211,'ECONOMY','E47',2,NULL),(212,'ECONOMY','F47',2,NULL),(213,'ECONOMY','G47',2,NULL),(214,'ECONOMY','H47',2,NULL),(215,'ECONOMY','J47',2,NULL),(216,'ECONOMY','A48',2,NULL),(217,'ECONOMY','B48',2,NULL),(218,'ECONOMY','C48',2,NULL),(219,'ECONOMY','D48',2,NULL),(220,'ECONOMY','E48',2,NULL),(221,'ECONOMY','F48',2,NULL),(222,'ECONOMY','G48',2,NULL),(223,'ECONOMY','H48',2,NULL),(224,'ECONOMY','J48',2,NULL),(225,'ECONOMY','A49',2,NULL),(226,'ECONOMY','B49',2,NULL),(227,'ECONOMY','C49',2,NULL),(228,'ECONOMY','D49',2,NULL),(229,'ECONOMY','E49',2,NULL),(230,'ECONOMY','F49',2,NULL),(231,'ECONOMY','G49',2,NULL),(232,'ECONOMY','H49',2,NULL),(233,'ECONOMY','J49',2,NULL),(234,'ECONOMY','A50',2,NULL),(235,'ECONOMY','B50',2,NULL),(236,'ECONOMY','C50',2,NULL),(237,'ECONOMY','D50',2,NULL),(238,'ECONOMY','E50',2,NULL),(239,'ECONOMY','F50',2,NULL),(240,'ECONOMY','G50',2,NULL),(241,'ECONOMY','H50',2,NULL),(242,'ECONOMY','J50',2,NULL),(243,'ECONOMY','A51',2,NULL),(244,'ECONOMY','B51',2,NULL),(245,'ECONOMY','C51',2,NULL),(246,'ECONOMY','D51',2,NULL),(247,'ECONOMY','E51',2,NULL),(248,'ECONOMY','F51',2,NULL),(249,'ECONOMY','G51',2,NULL),(250,'ECONOMY','H51',2,NULL),(251,'ECONOMY','J51',2,NULL),(252,'ECONOMY','A52',2,NULL),(253,'ECONOMY','B52',2,NULL),(254,'ECONOMY','C52',2,NULL),(255,'ECONOMY','D52',2,NULL),(256,'ECONOMY','E52',2,NULL),(257,'ECONOMY','F52',2,NULL),(258,'ECONOMY','G52',2,NULL),(259,'ECONOMY','H52',2,NULL),(260,'ECONOMY','J52',2,NULL),(261,'ECONOMY','A53',2,NULL),(262,'ECONOMY','B53',2,NULL),(263,'ECONOMY','D53',2,NULL),(264,'ECONOMY','E53',2,NULL),(265,'ECONOMY','F53',2,NULL),(266,'ECONOMY','H53',2,NULL),(267,'ECONOMY','J53',2,NULL);
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
  `status` varchar(255) DEFAULT NULL,
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
) ENGINE=InnoDB AUTO_INCREMENT=82 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `seat_meal`
--

LOCK TABLES `seat_meal` WRITE;
/*!40000 ALTER TABLE `seat_meal` DISABLE KEYS */;
INSERT INTO `seat_meal` VALUES (80,'PROGRESS',37,4,8,9),(81,'PROGRESS',37,3,10,10);
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
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `service_codes`
--

LOCK TABLES `service_codes` WRITE;
/*!40000 ALTER TABLE `service_codes` DISABLE KEYS */;
INSERT INTO `service_codes` VALUES (1,'A001','Nacho.jpg','SNACK','나쵸'),(2,'A002','MixNut.jpg','SNACK','믹스넛'),(3,'A003','Postick.jpg','SNACK','포스틱'),(4,'A004','Kancho.jpg','SNACK','칸쵸'),(5,'A005','Lays.jpg','SNACK','Lays'),(6,'A006','Saeukkang.jpg','SNACK','새우깡'),(7,'A007','Baebae.jpg','SNACK','배배'),(8,'A008','Mommyson.jpg','SNACK','엄마손파이'),(9,'A009','Chocosongee.jpg','SNACK','초코송이'),(10,'A010','Chocopie.jpg','SNACK','초코파이'),(11,'A101','Ballantines17.jpg','ALCOHOLS','발렌타인 17년'),(12,'A102','Redwine.jpg','ALCOHOLS','레드와인'),(13,'A103','Whitewine.jpg','ALCOHOLS','화이트와인'),(14,'A104','Cass.jpg','ALCOHOLS','카스'),(15,'A105','Heineken.jpg','ALCOHOLS','하이네켄'),(16,'A106','Budweiser.jpg','ALCOHOLS','버드와이저'),(17,'A107','Suntory.jpg','ALCOHOLS','산토리 하이볼'),(18,'A108','Jackcoke.jpg','ALCOHOLS','잭콕'),(19,'A109','Chamiseul.jpg','ALCOHOLS','참이슬'),(20,'A110','Iseultoktok.jpg','ALCOHOLS','이슬톡톡'),(21,'A201','Cocacola.jpg','NON-ALCOHOLS','코카콜라'),(22,'A202','Pepsi.jpg','NON-ALCOHOLS','펩시'),(23,'A203','Pepsizero.jpg','NON-ALCOHOLS','펩시제로'),(24,'A204','Sprite.jpg','NON-ALCOHOLS','스프라이트'),(25,'A205','Spritezero.jpg','NON-ALCOHOLS','스프라이트제로'),(26,'A206','Orangejuice.jpg','NON-ALCOHOLS','오렌지주스'),(27,'A207','Milk.jpg','NON-ALCOHOLS','우유'),(28,'A208','Pocarisweat.jpg','NON-ALCOHOLS','포카리스웨트'),(29,'A209','Tomatojuice.jpg','NON-ALCOHOLS','토마토주스'),(30,'A210','Aloejuice.jpg','NON-ALCOHOLS','알로에주스'),(31,'B001',NULL,'MEDICAL','두통'),(32,'B002',NULL,'MEDICAL','복통'),(33,'B003',NULL,'MEDICAL','외상'),(34,'B004',NULL,'MEDICAL','기타'),(35,'C001',NULL,'AMENITY','담요'),(36,'C002',NULL,'AMENITY','이어플러그'),(37,'C003',NULL,'AMENITY','배게'),(38,'C004',NULL,'AMENITY','슬리퍼'),(39,'A000',NULL,'ATTENDANT','승무원호출');
/*!40000 ALTER TABLE `service_codes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `service_stock`
--

DROP TABLE IF EXISTS `service_stock`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `service_stock` (
  `service_stock_id` bigint NOT NULL AUTO_INCREMENT,
  `total` int DEFAULT NULL,
  `flight_id` bigint NOT NULL,
  `service_codes_id` bigint NOT NULL,
  PRIMARY KEY (`service_stock_id`),
  KEY `fk_service_stock_flight1_idx` (`flight_id`),
  KEY `fk_service_stock_service_code1_idx` (`service_codes_id`),
  CONSTRAINT `fk_service_stock_flight1` FOREIGN KEY (`flight_id`) REFERENCES `flight` (`flight_id`),
  CONSTRAINT `fk_service_stock_service_code1` FOREIGN KEY (`service_codes_id`) REFERENCES `service_codes` (`service_codes_id`)
) ENGINE=InnoDB AUTO_INCREMENT=699 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `service_stock`
--

LOCK TABLES `service_stock` WRITE;
/*!40000 ALTER TABLE `service_stock` DISABLE KEYS */;
INSERT INTO `service_stock` VALUES (665,30,37,1),(666,30,37,2),(667,30,37,3),(668,30,37,4),(669,30,37,5),(670,30,37,6),(671,30,37,7),(672,30,37,8),(673,30,37,9),(674,30,37,10),(675,20,37,11),(676,10,37,12),(677,10,37,13),(678,80,37,14),(679,80,37,15),(680,80,37,16),(681,80,37,17),(682,80,37,18),(683,80,37,19),(684,80,37,20),(685,100,37,21),(686,100,37,22),(687,100,37,23),(688,100,37,24),(689,100,37,25),(690,100,37,26),(691,100,37,27),(692,100,37,28),(693,100,37,29),(694,100,37,30),(695,200,37,35),(696,200,37,36),(697,200,37,37),(698,200,37,38);
/*!40000 ALTER TABLE `service_stock` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subway`
--

DROP TABLE IF EXISTS `subway`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `subway` (
  `subway_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  `end` varchar(45) DEFAULT NULL,
  `day_code` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`subway_id`)
) ENGINE=InnoDB AUTO_INCREMENT=877 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subway`
--

LOCK TABLES `subway` WRITE;
/*!40000 ALTER TABLE `subway` DISABLE KEYS */;
INSERT INTO `subway` VALUES (127,'인천공항2터미널','2022-08-06 05:15:00','서울역','01'),(128,'인천공항2터미널','2022-08-06 05:18:00','서울역','01'),(129,'인천공항2터미널','2022-08-06 05:25:00','서울역','01'),(130,'인천공항2터미널','2022-08-06 05:31:00','서울역','01'),(131,'인천공항2터미널','2022-08-06 05:37:00','서울역','01'),(132,'인천공항2터미널','2022-08-06 05:43:00','서울역','01'),(133,'인천공항2터미널','2022-08-06 05:50:00','서울역','01'),(134,'인천공항2터미널','2022-08-06 05:53:00','서울역','01'),(135,'인천공항2터미널','2022-08-06 06:01:00','서울역','01'),(136,'인천공항2터미널','2022-08-06 06:09:00','서울역','01'),(137,'인천공항2터미널','2022-08-06 06:17:00','서울역','01'),(138,'인천공항2터미널','2022-08-06 06:23:00','서울역','01'),(139,'인천공항2터미널','2022-08-06 06:27:00','서울역','01'),(140,'인천공항2터미널','2022-08-06 06:30:00','서울역','01'),(141,'인천공항2터미널','2022-08-06 06:34:30','서울역','01'),(142,'인천공항2터미널','2022-08-06 06:40:30','서울역','01'),(143,'인천공항2터미널','2022-08-06 06:50:30','서울역','01'),(144,'인천공항2터미널','2022-08-06 07:01:30','서울역','01'),(145,'인천공항2터미널','2022-08-06 07:12:30','서울역','01'),(146,'인천공항2터미널','2022-08-06 07:20:00','서울역','01'),(147,'인천공항2터미널','2022-08-06 07:24:00','서울역','01'),(148,'인천공항2터미널','2022-08-06 07:35:30','서울역','01'),(149,'인천공항2터미널','2022-08-06 07:47:00','서울역','01'),(150,'인천공항2터미널','2022-08-06 07:57:00','서울역','01'),(151,'인천공항2터미널','2022-08-06 08:00:00','서울역','01'),(152,'인천공항2터미널','2022-08-06 08:06:00','서울역','01'),(153,'인천공항2터미널','2022-08-06 08:18:00','서울역','01'),(154,'인천공항2터미널','2022-08-06 08:27:30','서울역','01'),(155,'인천공항2터미널','2022-08-06 08:40:00','서울역','01'),(156,'인천공항2터미널','2022-08-06 08:43:00','서울역','01'),(157,'인천공항2터미널','2022-08-06 08:56:00','서울역','01'),(158,'인천공항2터미널','2022-08-06 09:07:00','서울역','01'),(159,'인천공항2터미널','2022-08-06 09:20:00','서울역','01'),(160,'인천공항2터미널','2022-08-06 09:22:30','서울역','01'),(161,'인천공항2터미널','2022-08-06 09:33:00','서울역','01'),(162,'인천공항2터미널','2022-08-06 09:42:00','서울역','01'),(163,'인천공항2터미널','2022-08-06 09:56:00','서울역','01'),(164,'인천공항2터미널','2022-08-06 10:00:00','서울역','01'),(165,'인천공항2터미널','2022-08-06 10:12:00','서울역','01'),(166,'인천공항2터미널','2022-08-06 10:26:00','서울역','01'),(167,'인천공항2터미널','2022-08-06 10:33:00','서울역','01'),(168,'인천공항2터미널','2022-08-06 10:40:00','서울역','01'),(169,'인천공항2터미널','2022-08-06 10:43:00','서울역','01'),(170,'인천공항2터미널','2022-08-06 10:55:00','서울역','01'),(171,'인천공항2터미널','2022-08-06 11:07:00','서울역','01'),(172,'인천공항2터미널','2022-08-06 11:16:30','서울역','01'),(173,'인천공항2터미널','2022-08-06 11:20:00','서울역','01'),(174,'인천공항2터미널','2022-08-06 11:30:00','서울역','01'),(175,'인천공항2터미널','2022-08-06 11:44:00','서울역','01'),(176,'인천공항2터미널','2022-08-06 11:53:00','서울역','01'),(177,'인천공항2터미널','2022-08-06 12:03:00','서울역','01'),(178,'인천공항2터미널','2022-08-06 12:10:00','서울역','01'),(179,'인천공항2터미널','2022-08-06 12:17:00','서울역','01'),(180,'인천공항2터미널','2022-08-06 12:30:30','서울역','01'),(181,'인천공항2터미널','2022-08-06 12:46:00','서울역','01'),(182,'인천공항2터미널','2022-08-06 12:50:00','서울역','01'),(183,'인천공항2터미널','2022-08-06 13:00:30','서울역','01'),(184,'인천공항2터미널','2022-08-06 13:13:00','서울역','01'),(185,'인천공항2터미널','2022-08-06 13:20:00','서울역','01'),(186,'인천공항2터미널','2022-08-06 13:24:00','서울역','01'),(187,'인천공항2터미널','2022-08-06 13:35:00','서울역','01'),(188,'인천공항2터미널','2022-08-06 13:47:00','서울역','01'),(189,'인천공항2터미널','2022-08-06 14:00:00','서울역','01'),(190,'인천공항2터미널','2022-08-06 14:02:30','서울역','01'),(191,'인천공항2터미널','2022-08-06 14:14:00','서울역','01'),(192,'인천공항2터미널','2022-08-06 14:22:00','서울역','01'),(193,'인천공항2터미널','2022-08-06 14:33:30','서울역','01'),(194,'인천공항2터미널','2022-08-06 14:40:00','서울역','01'),(195,'인천공항2터미널','2022-08-06 14:47:00','서울역','01'),(196,'인천공항2터미널','2022-08-06 14:57:00','서울역','01'),(197,'인천공항2터미널','2022-08-06 15:07:00','서울역','01'),(198,'인천공항2터미널','2022-08-06 15:20:00','서울역','01'),(199,'인천공항2터미널','2022-08-06 15:22:30','서울역','01'),(200,'인천공항2터미널','2022-08-06 15:31:00','서울역','01'),(201,'인천공항2터미널','2022-08-06 15:43:00','서울역','01'),(202,'인천공항2터미널','2022-08-06 15:53:00','서울역','01'),(203,'인천공항2터미널','2022-08-06 16:00:00','서울역','01'),(204,'인천공항2터미널','2022-08-06 16:03:00','서울역','01'),(205,'인천공항2터미널','2022-08-06 16:11:00','서울역','01'),(206,'인천공항2터미널','2022-08-06 16:26:30','서울역','01'),(207,'인천공항2터미널','2022-08-06 16:36:00','서울역','01'),(208,'인천공항2터미널','2022-08-06 16:40:00','서울역','01'),(209,'인천공항2터미널','2022-08-06 16:50:00','서울역','01'),(210,'인천공항2터미널','2022-08-06 17:00:00','서울역','01'),(211,'인천공항2터미널','2022-08-06 17:13:00','서울역','01'),(212,'인천공항2터미널','2022-08-06 17:20:00','서울역','01'),(213,'인천공항2터미널','2022-08-06 17:27:00','서울역','01'),(214,'인천공항2터미널','2022-08-06 17:34:00','서울역','01'),(215,'인천공항2터미널','2022-08-06 17:47:00','서울역','01'),(216,'인천공항2터미널','2022-08-06 18:00:00','서울역','01'),(217,'인천공항2터미널','2022-08-06 18:02:30','서울역','01'),(218,'인천공항2터미널','2022-08-06 18:14:00','서울역','01'),(219,'인천공항2터미널','2022-08-06 18:21:00','서울역','01'),(220,'인천공항2터미널','2022-08-06 18:33:00','서울역','01'),(221,'인천공항2터미널','2022-08-06 18:40:00','서울역','01'),(222,'인천공항2터미널','2022-08-06 18:48:00','서울역','01'),(223,'인천공항2터미널','2022-08-06 18:59:00','서울역','01'),(224,'인천공항2터미널','2022-08-06 19:12:30','서울역','01'),(225,'인천공항2터미널','2022-08-06 19:20:00','서울역','01'),(226,'인천공항2터미널','2022-08-06 19:26:00','서울역','01'),(227,'인천공항2터미널','2022-08-06 19:35:00','서울역','01'),(228,'인천공항2터미널','2022-08-06 19:47:00','서울역','01'),(229,'인천공항2터미널','2022-08-06 20:00:00','서울역','01'),(230,'인천공항2터미널','2022-08-06 20:02:30','서울역','01'),(231,'인천공항2터미널','2022-08-06 20:14:00','서울역','01'),(232,'인천공항2터미널','2022-08-06 20:24:00','서울역','01'),(233,'인천공항2터미널','2022-08-06 20:33:00','서울역','01'),(234,'인천공항2터미널','2022-08-06 20:40:00','서울역','01'),(235,'인천공항2터미널','2022-08-06 20:47:00','서울역','01'),(236,'인천공항2터미널','2022-08-06 20:56:00','서울역','01'),(237,'인천공항2터미널','2022-08-06 21:08:30','서울역','01'),(238,'인천공항2터미널','2022-08-06 21:18:00','서울역','01'),(239,'인천공항2터미널','2022-08-06 21:27:00','서울역','01'),(240,'인천공항2터미널','2022-08-06 21:36:00','서울역','01'),(241,'인천공항2터미널','2022-08-06 21:40:00','서울역','01'),(242,'인천공항2터미널','2022-08-06 21:49:00','서울역','01'),(243,'인천공항2터미널','2022-08-06 22:04:00','서울역','01'),(244,'인천공항2터미널','2022-08-06 22:16:00','서울역','01'),(245,'인천공항2터미널','2022-08-06 22:27:00','서울역','01'),(246,'인천공항2터미널','2022-08-06 22:36:30','서울역','01'),(247,'인천공항2터미널','2022-08-06 22:40:00','서울역','01'),(248,'인천공항2터미널','2022-08-06 22:55:00','서울역','01'),(249,'인천공항2터미널','2022-08-06 23:13:00','서울역','01'),(250,'인천공항2터미널','2022-08-06 23:32:00','서울역','01'),(251,'인천공항2터미널','2022-08-06 23:50:00','디지털미디어시티','01'),(252,'인천공항2터미널','2022-08-06 05:15:00','서울역','02'),(253,'인천공항2터미널','2022-08-06 05:18:00','서울역','02'),(254,'인천공항2터미널','2022-08-06 05:25:00','서울역','02'),(255,'인천공항2터미널','2022-08-06 05:31:00','서울역','02'),(256,'인천공항2터미널','2022-08-06 05:43:00','서울역','02'),(257,'인천공항2터미널','2022-08-06 05:50:00','서울역','02'),(258,'인천공항2터미널','2022-08-06 05:53:00','서울역','02'),(259,'인천공항2터미널','2022-08-06 06:01:00','서울역','02'),(260,'인천공항2터미널','2022-08-06 06:09:00','서울역','02'),(261,'인천공항2터미널','2022-08-06 06:17:00','서울역','02'),(262,'인천공항2터미널','2022-08-06 06:23:00','서울역','02'),(263,'인천공항2터미널','2022-08-06 06:27:00','서울역','02'),(264,'인천공항2터미널','2022-08-06 06:30:00','서울역','02'),(265,'인천공항2터미널','2022-08-06 06:34:30','서울역','02'),(266,'인천공항2터미널','2022-08-06 06:40:30','서울역','02'),(267,'인천공항2터미널','2022-08-06 06:50:30','서울역','02'),(268,'인천공항2터미널','2022-08-06 07:01:30','서울역','02'),(269,'인천공항2터미널','2022-08-06 07:12:30','서울역','02'),(270,'인천공항2터미널','2022-08-06 07:20:00','서울역','02'),(271,'인천공항2터미널','2022-08-06 07:24:00','서울역','02'),(272,'인천공항2터미널','2022-08-06 07:35:30','서울역','02'),(273,'인천공항2터미널','2022-08-06 07:47:00','서울역','02'),(274,'인천공항2터미널','2022-08-06 07:57:00','서울역','02'),(275,'인천공항2터미널','2022-08-06 08:00:00','서울역','02'),(276,'인천공항2터미널','2022-08-06 08:06:00','서울역','02'),(277,'인천공항2터미널','2022-08-06 08:18:00','서울역','02'),(278,'인천공항2터미널','2022-08-06 08:27:30','서울역','02'),(279,'인천공항2터미널','2022-08-06 08:40:00','서울역','02'),(280,'인천공항2터미널','2022-08-06 08:43:00','서울역','02'),(281,'인천공항2터미널','2022-08-06 08:56:00','서울역','02'),(282,'인천공항2터미널','2022-08-06 09:07:00','서울역','02'),(283,'인천공항2터미널','2022-08-06 09:20:00','서울역','02'),(284,'인천공항2터미널','2022-08-06 09:22:30','서울역','02'),(285,'인천공항2터미널','2022-08-06 09:33:00','서울역','02'),(286,'인천공항2터미널','2022-08-06 09:42:00','서울역','02'),(287,'인천공항2터미널','2022-08-06 09:56:00','서울역','02'),(288,'인천공항2터미널','2022-08-06 10:00:00','서울역','02'),(289,'인천공항2터미널','2022-08-06 10:12:00','서울역','02'),(290,'인천공항2터미널','2022-08-06 10:26:00','서울역','02'),(291,'인천공항2터미널','2022-08-06 10:33:00','서울역','02'),(292,'인천공항2터미널','2022-08-06 10:40:00','서울역','02'),(293,'인천공항2터미널','2022-08-06 10:43:00','서울역','02'),(294,'인천공항2터미널','2022-08-06 10:55:00','서울역','02'),(295,'인천공항2터미널','2022-08-06 11:07:00','서울역','02'),(296,'인천공항2터미널','2022-08-06 11:16:30','서울역','02'),(297,'인천공항2터미널','2022-08-06 11:20:00','서울역','02'),(298,'인천공항2터미널','2022-08-06 11:30:00','서울역','02'),(299,'인천공항2터미널','2022-08-06 11:44:00','서울역','02'),(300,'인천공항2터미널','2022-08-06 11:53:00','서울역','02'),(301,'인천공항2터미널','2022-08-06 12:03:00','서울역','02'),(302,'인천공항2터미널','2022-08-06 12:10:00','서울역','02'),(303,'인천공항2터미널','2022-08-06 12:17:00','서울역','02'),(304,'인천공항2터미널','2022-08-06 12:30:30','서울역','02'),(305,'인천공항2터미널','2022-08-06 12:46:00','서울역','02'),(306,'인천공항2터미널','2022-08-06 12:50:00','서울역','02'),(307,'인천공항2터미널','2022-08-06 13:00:30','서울역','02'),(308,'인천공항2터미널','2022-08-06 13:13:00','서울역','02'),(309,'인천공항2터미널','2022-08-06 13:20:00','서울역','02'),(310,'인천공항2터미널','2022-08-06 13:24:00','서울역','02'),(311,'인천공항2터미널','2022-08-06 13:35:00','서울역','02'),(312,'인천공항2터미널','2022-08-06 13:47:00','서울역','02'),(313,'인천공항2터미널','2022-08-06 14:00:00','서울역','02'),(314,'인천공항2터미널','2022-08-06 14:02:30','서울역','02'),(315,'인천공항2터미널','2022-08-06 14:14:00','서울역','02'),(316,'인천공항2터미널','2022-08-06 14:22:00','서울역','02'),(317,'인천공항2터미널','2022-08-06 14:33:30','서울역','02'),(318,'인천공항2터미널','2022-08-06 14:40:00','서울역','02'),(319,'인천공항2터미널','2022-08-06 14:47:00','서울역','02'),(320,'인천공항2터미널','2022-08-06 14:57:00','서울역','02'),(321,'인천공항2터미널','2022-08-06 15:07:00','서울역','02'),(322,'인천공항2터미널','2022-08-06 15:20:00','서울역','02'),(323,'인천공항2터미널','2022-08-06 15:22:30','서울역','02'),(324,'인천공항2터미널','2022-08-06 15:31:00','서울역','02'),(325,'인천공항2터미널','2022-08-06 15:43:00','서울역','02'),(326,'인천공항2터미널','2022-08-06 15:53:00','서울역','02'),(327,'인천공항2터미널','2022-08-06 16:00:00','서울역','02'),(328,'인천공항2터미널','2022-08-06 16:03:00','서울역','02'),(329,'인천공항2터미널','2022-08-06 16:11:00','서울역','02'),(330,'인천공항2터미널','2022-08-06 16:26:30','서울역','02'),(331,'인천공항2터미널','2022-08-06 16:36:00','서울역','02'),(332,'인천공항2터미널','2022-08-06 16:40:00','서울역','02'),(333,'인천공항2터미널','2022-08-06 16:50:00','서울역','02'),(334,'인천공항2터미널','2022-08-06 17:00:00','서울역','02'),(335,'인천공항2터미널','2022-08-06 17:13:00','서울역','02'),(336,'인천공항2터미널','2022-08-06 17:20:00','서울역','02'),(337,'인천공항2터미널','2022-08-06 17:27:00','서울역','02'),(338,'인천공항2터미널','2022-08-06 17:34:00','서울역','02'),(339,'인천공항2터미널','2022-08-06 17:47:00','서울역','02'),(340,'인천공항2터미널','2022-08-06 18:00:00','서울역','02'),(341,'인천공항2터미널','2022-08-06 18:02:30','서울역','02'),(342,'인천공항2터미널','2022-08-06 18:14:00','서울역','02'),(343,'인천공항2터미널','2022-08-06 18:21:00','서울역','02'),(344,'인천공항2터미널','2022-08-06 18:33:00','서울역','02'),(345,'인천공항2터미널','2022-08-06 18:40:00','서울역','02'),(346,'인천공항2터미널','2022-08-06 18:48:00','서울역','02'),(347,'인천공항2터미널','2022-08-06 18:59:00','서울역','02'),(348,'인천공항2터미널','2022-08-06 19:12:30','서울역','02'),(349,'인천공항2터미널','2022-08-06 19:20:00','서울역','02'),(350,'인천공항2터미널','2022-08-06 19:26:00','서울역','02'),(351,'인천공항2터미널','2022-08-06 19:35:00','서울역','02'),(352,'인천공항2터미널','2022-08-06 19:47:00','서울역','02'),(353,'인천공항2터미널','2022-08-06 20:00:00','서울역','02'),(354,'인천공항2터미널','2022-08-06 20:02:30','서울역','02'),(355,'인천공항2터미널','2022-08-06 20:08:00','서울역','02'),(356,'인천공항2터미널','2022-08-06 20:14:00','서울역','02'),(357,'인천공항2터미널','2022-08-06 20:24:00','서울역','02'),(358,'인천공항2터미널','2022-08-06 20:33:00','서울역','02'),(359,'인천공항2터미널','2022-08-06 20:40:00','서울역','02'),(360,'인천공항2터미널','2022-08-06 20:47:00','서울역','02'),(361,'인천공항2터미널','2022-08-06 20:56:00','서울역','02'),(362,'인천공항2터미널','2022-08-06 21:08:30','서울역','02'),(363,'인천공항2터미널','2022-08-06 21:18:00','서울역','02'),(364,'인천공항2터미널','2022-08-06 21:27:00','서울역','02'),(365,'인천공항2터미널','2022-08-06 21:36:00','서울역','02'),(366,'인천공항2터미널','2022-08-06 21:40:00','서울역','02'),(367,'인천공항2터미널','2022-08-06 21:49:00','서울역','02'),(368,'인천공항2터미널','2022-08-06 22:04:00','서울역','02'),(369,'인천공항2터미널','2022-08-06 22:16:00','서울역','02'),(370,'인천공항2터미널','2022-08-06 22:27:00','서울역','02'),(371,'인천공항2터미널','2022-08-06 22:36:30','서울역','02'),(372,'인천공항2터미널','2022-08-06 22:40:00','서울역','02'),(373,'인천공항2터미널','2022-08-06 22:55:00','서울역','02'),(374,'인천공항2터미널','2022-08-06 23:13:00','서울역','02'),(375,'인천공항2터미널','2022-08-06 23:32:00','서울역','02'),(376,'인천공항2터미널','2022-08-06 23:50:00','디지털미디어시티','02'),(377,'인천공항2터미널','2022-08-06 05:15:00','서울역','03'),(378,'인천공항2터미널','2022-08-06 05:18:00','서울역','03'),(379,'인천공항2터미널','2022-08-06 05:25:00','서울역','03'),(380,'인천공항2터미널','2022-08-06 05:31:00','서울역','03'),(381,'인천공항2터미널','2022-08-06 05:43:00','서울역','03'),(382,'인천공항2터미널','2022-08-06 05:50:00','서울역','03'),(383,'인천공항2터미널','2022-08-06 05:53:00','서울역','03'),(384,'인천공항2터미널','2022-08-06 06:01:00','서울역','03'),(385,'인천공항2터미널','2022-08-06 06:09:00','서울역','03'),(386,'인천공항2터미널','2022-08-06 06:17:00','서울역','03'),(387,'인천공항2터미널','2022-08-06 06:23:00','서울역','03'),(388,'인천공항2터미널','2022-08-06 06:27:00','서울역','03'),(389,'인천공항2터미널','2022-08-06 06:30:00','서울역','03'),(390,'인천공항2터미널','2022-08-06 06:34:30','서울역','03'),(391,'인천공항2터미널','2022-08-06 06:40:30','서울역','03'),(392,'인천공항2터미널','2022-08-06 06:50:30','서울역','03'),(393,'인천공항2터미널','2022-08-06 07:01:30','서울역','03'),(394,'인천공항2터미널','2022-08-06 07:12:30','서울역','03'),(395,'인천공항2터미널','2022-08-06 07:20:00','서울역','03'),(396,'인천공항2터미널','2022-08-06 07:24:00','서울역','03'),(397,'인천공항2터미널','2022-08-06 07:35:30','서울역','03'),(398,'인천공항2터미널','2022-08-06 07:47:00','서울역','03'),(399,'인천공항2터미널','2022-08-06 07:57:00','서울역','03'),(400,'인천공항2터미널','2022-08-06 08:00:00','서울역','03'),(401,'인천공항2터미널','2022-08-06 08:06:00','서울역','03'),(402,'인천공항2터미널','2022-08-06 08:18:00','서울역','03'),(403,'인천공항2터미널','2022-08-06 08:27:30','서울역','03'),(404,'인천공항2터미널','2022-08-06 08:40:00','서울역','03'),(405,'인천공항2터미널','2022-08-06 08:43:00','서울역','03'),(406,'인천공항2터미널','2022-08-06 08:56:00','서울역','03'),(407,'인천공항2터미널','2022-08-06 09:07:00','서울역','03'),(408,'인천공항2터미널','2022-08-06 09:20:00','서울역','03'),(409,'인천공항2터미널','2022-08-06 09:22:30','서울역','03'),(410,'인천공항2터미널','2022-08-06 09:33:00','서울역','03'),(411,'인천공항2터미널','2022-08-06 09:42:00','서울역','03'),(412,'인천공항2터미널','2022-08-06 09:56:00','서울역','03'),(413,'인천공항2터미널','2022-08-06 10:00:00','서울역','03'),(414,'인천공항2터미널','2022-08-06 10:12:00','서울역','03'),(415,'인천공항2터미널','2022-08-06 10:26:00','서울역','03'),(416,'인천공항2터미널','2022-08-06 10:33:00','서울역','03'),(417,'인천공항2터미널','2022-08-06 10:40:00','서울역','03'),(418,'인천공항2터미널','2022-08-06 10:43:00','서울역','03'),(419,'인천공항2터미널','2022-08-06 10:55:00','서울역','03'),(420,'인천공항2터미널','2022-08-06 11:07:00','서울역','03'),(421,'인천공항2터미널','2022-08-06 11:16:30','서울역','03'),(422,'인천공항2터미널','2022-08-06 11:20:00','서울역','03'),(423,'인천공항2터미널','2022-08-06 11:30:00','서울역','03'),(424,'인천공항2터미널','2022-08-06 11:44:00','서울역','03'),(425,'인천공항2터미널','2022-08-06 11:53:00','서울역','03'),(426,'인천공항2터미널','2022-08-06 12:03:00','서울역','03'),(427,'인천공항2터미널','2022-08-06 12:10:00','서울역','03'),(428,'인천공항2터미널','2022-08-06 12:17:00','서울역','03'),(429,'인천공항2터미널','2022-08-06 12:30:30','서울역','03'),(430,'인천공항2터미널','2022-08-06 12:46:00','서울역','03'),(431,'인천공항2터미널','2022-08-06 12:50:00','서울역','03'),(432,'인천공항2터미널','2022-08-06 13:00:30','서울역','03'),(433,'인천공항2터미널','2022-08-06 13:13:00','서울역','03'),(434,'인천공항2터미널','2022-08-06 13:20:00','서울역','03'),(435,'인천공항2터미널','2022-08-06 13:24:00','서울역','03'),(436,'인천공항2터미널','2022-08-06 13:35:00','서울역','03'),(437,'인천공항2터미널','2022-08-06 13:47:00','서울역','03'),(438,'인천공항2터미널','2022-08-06 14:00:00','서울역','03'),(439,'인천공항2터미널','2022-08-06 14:02:30','서울역','03'),(440,'인천공항2터미널','2022-08-06 14:14:00','서울역','03'),(441,'인천공항2터미널','2022-08-06 14:22:00','서울역','03'),(442,'인천공항2터미널','2022-08-06 14:33:30','서울역','03'),(443,'인천공항2터미널','2022-08-06 14:40:00','서울역','03'),(444,'인천공항2터미널','2022-08-06 14:47:00','서울역','03'),(445,'인천공항2터미널','2022-08-06 14:57:00','서울역','03'),(446,'인천공항2터미널','2022-08-06 15:07:00','서울역','03'),(447,'인천공항2터미널','2022-08-06 15:20:00','서울역','03'),(448,'인천공항2터미널','2022-08-06 15:22:30','서울역','03'),(449,'인천공항2터미널','2022-08-06 15:31:00','서울역','03'),(450,'인천공항2터미널','2022-08-06 15:43:00','서울역','03'),(451,'인천공항2터미널','2022-08-06 15:53:00','서울역','03'),(452,'인천공항2터미널','2022-08-06 16:00:00','서울역','03'),(453,'인천공항2터미널','2022-08-06 16:03:00','서울역','03'),(454,'인천공항2터미널','2022-08-06 16:11:00','서울역','03'),(455,'인천공항2터미널','2022-08-06 16:26:30','서울역','03'),(456,'인천공항2터미널','2022-08-06 16:36:00','서울역','03'),(457,'인천공항2터미널','2022-08-06 16:40:00','서울역','03'),(458,'인천공항2터미널','2022-08-06 16:50:00','서울역','03'),(459,'인천공항2터미널','2022-08-06 17:00:00','서울역','03'),(460,'인천공항2터미널','2022-08-06 17:13:00','서울역','03'),(461,'인천공항2터미널','2022-08-06 17:20:00','서울역','03'),(462,'인천공항2터미널','2022-08-06 17:27:00','서울역','03'),(463,'인천공항2터미널','2022-08-06 17:34:00','서울역','03'),(464,'인천공항2터미널','2022-08-06 17:47:00','서울역','03'),(465,'인천공항2터미널','2022-08-06 18:00:00','서울역','03'),(466,'인천공항2터미널','2022-08-06 18:02:30','서울역','03'),(467,'인천공항2터미널','2022-08-06 18:14:00','서울역','03'),(468,'인천공항2터미널','2022-08-06 18:21:00','서울역','03'),(469,'인천공항2터미널','2022-08-06 18:33:00','서울역','03'),(470,'인천공항2터미널','2022-08-06 18:40:00','서울역','03'),(471,'인천공항2터미널','2022-08-06 18:48:00','서울역','03'),(472,'인천공항2터미널','2022-08-06 18:59:00','서울역','03'),(473,'인천공항2터미널','2022-08-06 19:12:30','서울역','03'),(474,'인천공항2터미널','2022-08-06 19:20:00','서울역','03'),(475,'인천공항2터미널','2022-08-06 19:26:00','서울역','03'),(476,'인천공항2터미널','2022-08-06 19:35:00','서울역','03'),(477,'인천공항2터미널','2022-08-06 19:47:00','서울역','03'),(478,'인천공항2터미널','2022-08-06 20:00:00','서울역','03'),(479,'인천공항2터미널','2022-08-06 20:02:30','서울역','03'),(480,'인천공항2터미널','2022-08-06 20:08:00','서울역','03'),(481,'인천공항2터미널','2022-08-06 20:14:00','서울역','03'),(482,'인천공항2터미널','2022-08-06 20:24:00','서울역','03'),(483,'인천공항2터미널','2022-08-06 20:33:00','서울역','03'),(484,'인천공항2터미널','2022-08-06 20:40:00','서울역','03'),(485,'인천공항2터미널','2022-08-06 20:47:00','서울역','03'),(486,'인천공항2터미널','2022-08-06 20:56:00','서울역','03'),(487,'인천공항2터미널','2022-08-06 21:08:30','서울역','03'),(488,'인천공항2터미널','2022-08-06 21:18:00','서울역','03'),(489,'인천공항2터미널','2022-08-06 21:27:00','서울역','03'),(490,'인천공항2터미널','2022-08-06 21:36:00','서울역','03'),(491,'인천공항2터미널','2022-08-06 21:40:00','서울역','03'),(492,'인천공항2터미널','2022-08-06 21:49:00','서울역','03'),(493,'인천공항2터미널','2022-08-06 22:04:00','서울역','03'),(494,'인천공항2터미널','2022-08-06 22:16:00','서울역','03'),(495,'인천공항2터미널','2022-08-06 22:27:00','서울역','03'),(496,'인천공항2터미널','2022-08-06 22:36:30','서울역','03'),(497,'인천공항2터미널','2022-08-06 22:40:00','서울역','03'),(498,'인천공항2터미널','2022-08-06 22:55:00','서울역','03'),(499,'인천공항2터미널','2022-08-06 23:13:00','서울역','03'),(500,'인천공항2터미널','2022-08-06 23:32:00','서울역','03'),(501,'인천공항2터미널','2022-08-06 23:50:00','디지털미디어시티','03'),(502,'인천공항1터미널','2022-08-06 05:23:00','서울역','01'),(503,'인천공항1터미널','2022-08-06 05:25:00','서울역','01'),(504,'인천공항1터미널','2022-08-06 05:32:00','서울역','01'),(505,'인천공항1터미널','2022-08-06 05:38:00','서울역','01'),(506,'인천공항1터미널','2022-08-06 05:44:00','서울역','01'),(507,'인천공항1터미널','2022-08-06 05:50:00','서울역','01'),(508,'인천공항1터미널','2022-08-06 05:58:00','서울역','01'),(509,'인천공항1터미널','2022-08-06 06:00:00','서울역','01'),(510,'인천공항1터미널','2022-08-06 06:08:00','서울역','01'),(511,'인천공항1터미널','2022-08-06 06:16:00','서울역','01'),(512,'인천공항1터미널','2022-08-06 06:24:00','서울역','01'),(513,'인천공항1터미널','2022-08-06 06:30:00','서울역','01'),(514,'인천공항1터미널','2022-08-06 06:34:00','서울역','01'),(515,'인천공항1터미널','2022-08-06 06:38:00','서울역','01'),(516,'인천공항1터미널','2022-08-06 06:41:30','서울역','01'),(517,'인천공항1터미널','2022-08-06 06:47:30','서울역','01'),(518,'인천공항1터미널','2022-08-06 06:57:30','서울역','01'),(519,'인천공항1터미널','2022-08-06 07:08:30','서울역','01'),(520,'인천공항1터미널','2022-08-06 07:19:30','서울역','01'),(521,'인천공항1터미널','2022-08-06 07:28:00','서울역','01'),(522,'인천공항1터미널','2022-08-06 07:31:00','서울역','01'),(523,'인천공항1터미널','2022-08-06 07:42:30','서울역','01'),(524,'인천공항1터미널','2022-08-06 07:54:00','서울역','01'),(525,'인천공항1터미널','2022-08-06 08:04:00','서울역','01'),(526,'인천공항1터미널','2022-08-06 08:08:00','서울역','01'),(527,'인천공항1터미널','2022-08-06 08:13:00','서울역','01'),(528,'인천공항1터미널','2022-08-06 08:25:00','서울역','01'),(529,'인천공항1터미널','2022-08-06 08:34:30','서울역','01'),(530,'인천공항1터미널','2022-08-06 08:48:00','서울역','01'),(531,'인천공항1터미널','2022-08-06 08:50:00','서울역','01'),(532,'인천공항1터미널','2022-08-06 09:03:00','서울역','01'),(533,'인천공항1터미널','2022-08-06 09:14:00','서울역','01'),(534,'인천공항1터미널','2022-08-06 09:28:00','서울역','01'),(535,'인천공항1터미널','2022-08-06 09:29:30','서울역','01'),(536,'인천공항1터미널','2022-08-06 09:40:00','서울역','01'),(537,'인천공항1터미널','2022-08-06 09:49:00','서울역','01'),(538,'인천공항1터미널','2022-08-06 10:03:00','서울역','01'),(539,'인천공항1터미널','2022-08-06 10:08:00','서울역','01'),(540,'인천공항1터미널','2022-08-06 10:19:00','서울역','01'),(541,'인천공항1터미널','2022-08-06 10:33:00','서울역','01'),(542,'인천공항1터미널','2022-08-06 10:40:00','서울역','01'),(543,'인천공항1터미널','2022-08-06 10:48:00','서울역','01'),(544,'인천공항1터미널','2022-08-06 10:50:00','서울역','01'),(545,'인천공항1터미널','2022-08-06 11:02:00','서울역','01'),(546,'인천공항1터미널','2022-08-06 11:14:00','서울역','01'),(547,'인천공항1터미널','2022-08-06 11:23:30','서울역','01'),(548,'인천공항1터미널','2022-08-06 11:28:00','서울역','01'),(549,'인천공항1터미널','2022-08-06 11:37:00','서울역','01'),(550,'인천공항1터미널','2022-08-06 11:51:00','서울역','01'),(551,'인천공항1터미널','2022-08-06 12:00:00','서울역','01'),(552,'인천공항1터미널','2022-08-06 12:10:00','서울역','01'),(553,'인천공항1터미널','2022-08-06 12:18:00','서울역','01'),(554,'인천공항1터미널','2022-08-06 12:24:00','서울역','01'),(555,'인천공항1터미널','2022-08-06 12:37:30','서울역','01'),(556,'인천공항1터미널','2022-08-06 12:53:00','서울역','01'),(557,'인천공항1터미널','2022-08-06 12:58:00','서울역','01'),(558,'인천공항1터미널','2022-08-06 13:07:30','서울역','01'),(559,'인천공항1터미널','2022-08-06 13:20:00','서울역','01'),(560,'인천공항1터미널','2022-08-06 13:28:00','서울역','01'),(561,'인천공항1터미널','2022-08-06 13:31:00','서울역','01'),(562,'인천공항1터미널','2022-08-06 13:42:00','서울역','01'),(563,'인천공항1터미널','2022-08-06 13:54:00','서울역','01'),(564,'인천공항1터미널','2022-08-06 14:08:00','서울역','01'),(565,'인천공항1터미널','2022-08-06 14:09:30','서울역','01'),(566,'인천공항1터미널','2022-08-06 14:21:00','서울역','01'),(567,'인천공항1터미널','2022-08-06 14:29:00','서울역','01'),(568,'인천공항1터미널','2022-08-06 14:40:30','서울역','01'),(569,'인천공항1터미널','2022-08-06 14:48:00','서울역','01'),(570,'인천공항1터미널','2022-08-06 14:54:00','서울역','01'),(571,'인천공항1터미널','2022-08-06 15:04:00','서울역','01'),(572,'인천공항1터미널','2022-08-06 15:14:00','서울역','01'),(573,'인천공항1터미널','2022-08-06 15:28:00','서울역','01'),(574,'인천공항1터미널','2022-08-06 15:29:30','서울역','01'),(575,'인천공항1터미널','2022-08-06 15:38:00','서울역','01'),(576,'인천공항1터미널','2022-08-06 15:50:00','서울역','01'),(577,'인천공항1터미널','2022-08-06 16:00:00','서울역','01'),(578,'인천공항1터미널','2022-08-06 16:08:00','서울역','01'),(579,'인천공항1터미널','2022-08-06 16:10:00','서울역','01'),(580,'인천공항1터미널','2022-08-06 16:18:00','서울역','01'),(581,'인천공항1터미널','2022-08-06 16:33:30','서울역','01'),(582,'인천공항1터미널','2022-08-06 16:43:00','서울역','01'),(583,'인천공항1터미널','2022-08-06 16:48:00','서울역','01'),(584,'인천공항1터미널','2022-08-06 16:57:00','서울역','01'),(585,'인천공항1터미널','2022-08-06 17:07:00','서울역','01'),(586,'인천공항1터미널','2022-08-06 17:20:00','서울역','01'),(587,'인천공항1터미널','2022-08-06 17:28:00','서울역','01'),(588,'인천공항1터미널','2022-08-06 17:34:00','서울역','01'),(589,'인천공항1터미널','2022-08-06 17:41:00','서울역','01'),(590,'인천공항1터미널','2022-08-06 17:54:00','서울역','01'),(591,'인천공항1터미널','2022-08-06 18:08:00','서울역','01'),(592,'인천공항1터미널','2022-08-06 18:09:30','서울역','01'),(593,'인천공항1터미널','2022-08-06 18:21:00','서울역','01'),(594,'인천공항1터미널','2022-08-06 18:28:00','서울역','01'),(595,'인천공항1터미널','2022-08-06 18:40:00','서울역','01'),(596,'인천공항1터미널','2022-08-06 18:48:00','서울역','01'),(597,'인천공항1터미널','2022-08-06 18:55:00','서울역','01'),(598,'인천공항1터미널','2022-08-06 19:06:00','서울역','01'),(599,'인천공항1터미널','2022-08-06 19:19:30','서울역','01'),(600,'인천공항1터미널','2022-08-06 19:28:00','서울역','01'),(601,'인천공항1터미널','2022-08-06 19:33:00','서울역','01'),(602,'인천공항1터미널','2022-08-06 19:42:00','서울역','01'),(603,'인천공항1터미널','2022-08-06 19:54:00','서울역','01'),(604,'인천공항1터미널','2022-08-06 20:08:00','서울역','01'),(605,'인천공항1터미널','2022-08-06 20:09:30','서울역','01'),(606,'인천공항1터미널','2022-08-06 20:21:00','서울역','01'),(607,'인천공항1터미널','2022-08-06 20:31:00','서울역','01'),(608,'인천공항1터미널','2022-08-06 20:40:00','서울역','01'),(609,'인천공항1터미널','2022-08-06 20:48:00','서울역','01'),(610,'인천공항1터미널','2022-08-06 20:54:00','서울역','01'),(611,'인천공항1터미널','2022-08-06 21:03:00','서울역','01'),(612,'인천공항1터미널','2022-08-06 21:15:30','서울역','01'),(613,'인천공항1터미널','2022-08-06 21:25:00','서울역','01'),(614,'인천공항1터미널','2022-08-06 21:34:00','서울역','01'),(615,'인천공항1터미널','2022-08-06 21:43:00','서울역','01'),(616,'인천공항1터미널','2022-08-06 21:48:00','서울역','01'),(617,'인천공항1터미널','2022-08-06 21:56:00','서울역','01'),(618,'인천공항1터미널','2022-08-06 22:11:00','서울역','01'),(619,'인천공항1터미널','2022-08-06 22:23:00','서울역','01'),(620,'인천공항1터미널','2022-08-06 22:34:00','서울역','01'),(621,'인천공항1터미널','2022-08-06 22:43:30','서울역','01'),(622,'인천공항1터미널','2022-08-06 22:48:00','서울역','01'),(623,'인천공항1터미널','2022-08-06 23:02:00','서울역','01'),(624,'인천공항1터미널','2022-08-06 23:20:00','서울역','01'),(625,'인천공항1터미널','2022-08-06 23:39:00','서울역','01'),(626,'인천공항1터미널','2022-08-06 23:57:00','디지털미디어시티','01'),(627,'인천공항1터미널','2022-08-06 05:23:00','서울역','02'),(628,'인천공항1터미널','2022-08-06 05:25:00','서울역','02'),(629,'인천공항1터미널','2022-08-06 05:32:00','서울역','02'),(630,'인천공항1터미널','2022-08-06 05:38:00','서울역','02'),(631,'인천공항1터미널','2022-08-06 05:50:00','서울역','02'),(632,'인천공항1터미널','2022-08-06 05:58:00','서울역','02'),(633,'인천공항1터미널','2022-08-06 06:00:00','서울역','02'),(634,'인천공항1터미널','2022-08-06 06:08:00','서울역','02'),(635,'인천공항1터미널','2022-08-06 06:16:00','서울역','02'),(636,'인천공항1터미널','2022-08-06 06:24:00','서울역','02'),(637,'인천공항1터미널','2022-08-06 06:30:00','서울역','02'),(638,'인천공항1터미널','2022-08-06 06:34:00','서울역','02'),(639,'인천공항1터미널','2022-08-06 06:38:00','서울역','02'),(640,'인천공항1터미널','2022-08-06 06:41:30','서울역','02'),(641,'인천공항1터미널','2022-08-06 06:47:30','서울역','02'),(642,'인천공항1터미널','2022-08-06 06:57:30','서울역','02'),(643,'인천공항1터미널','2022-08-06 07:08:30','서울역','02'),(644,'인천공항1터미널','2022-08-06 07:19:30','서울역','02'),(645,'인천공항1터미널','2022-08-06 07:28:00','서울역','02'),(646,'인천공항1터미널','2022-08-06 07:31:00','서울역','02'),(647,'인천공항1터미널','2022-08-06 07:42:30','서울역','02'),(648,'인천공항1터미널','2022-08-06 07:54:00','서울역','02'),(649,'인천공항1터미널','2022-08-06 08:04:00','서울역','02'),(650,'인천공항1터미널','2022-08-06 08:08:00','서울역','02'),(651,'인천공항1터미널','2022-08-06 08:13:00','서울역','02'),(652,'인천공항1터미널','2022-08-06 08:25:00','서울역','02'),(653,'인천공항1터미널','2022-08-06 08:34:30','서울역','02'),(654,'인천공항1터미널','2022-08-06 08:48:00','서울역','02'),(655,'인천공항1터미널','2022-08-06 08:50:00','서울역','02'),(656,'인천공항1터미널','2022-08-06 09:03:00','서울역','02'),(657,'인천공항1터미널','2022-08-06 09:14:00','서울역','02'),(658,'인천공항1터미널','2022-08-06 09:28:00','서울역','02'),(659,'인천공항1터미널','2022-08-06 09:29:30','서울역','02'),(660,'인천공항1터미널','2022-08-06 09:40:00','서울역','02'),(661,'인천공항1터미널','2022-08-06 09:49:00','서울역','02'),(662,'인천공항1터미널','2022-08-06 10:03:00','서울역','02'),(663,'인천공항1터미널','2022-08-06 10:08:00','서울역','02'),(664,'인천공항1터미널','2022-08-06 10:19:00','서울역','02'),(665,'인천공항1터미널','2022-08-06 10:33:00','서울역','02'),(666,'인천공항1터미널','2022-08-06 10:40:00','서울역','02'),(667,'인천공항1터미널','2022-08-06 10:48:00','서울역','02'),(668,'인천공항1터미널','2022-08-06 10:50:00','서울역','02'),(669,'인천공항1터미널','2022-08-06 11:02:00','서울역','02'),(670,'인천공항1터미널','2022-08-06 11:14:00','서울역','02'),(671,'인천공항1터미널','2022-08-06 11:23:30','서울역','02'),(672,'인천공항1터미널','2022-08-06 11:28:00','서울역','02'),(673,'인천공항1터미널','2022-08-06 11:37:00','서울역','02'),(674,'인천공항1터미널','2022-08-06 11:51:00','서울역','02'),(675,'인천공항1터미널','2022-08-06 12:00:00','서울역','02'),(676,'인천공항1터미널','2022-08-06 12:10:00','서울역','02'),(677,'인천공항1터미널','2022-08-06 12:18:00','서울역','02'),(678,'인천공항1터미널','2022-08-06 12:24:00','서울역','02'),(679,'인천공항1터미널','2022-08-06 12:37:30','서울역','02'),(680,'인천공항1터미널','2022-08-06 12:53:00','서울역','02'),(681,'인천공항1터미널','2022-08-06 12:58:00','서울역','02'),(682,'인천공항1터미널','2022-08-06 13:07:30','서울역','02'),(683,'인천공항1터미널','2022-08-06 13:20:00','서울역','02'),(684,'인천공항1터미널','2022-08-06 13:28:00','서울역','02'),(685,'인천공항1터미널','2022-08-06 13:31:00','서울역','02'),(686,'인천공항1터미널','2022-08-06 13:42:00','서울역','02'),(687,'인천공항1터미널','2022-08-06 13:54:00','서울역','02'),(688,'인천공항1터미널','2022-08-06 14:08:00','서울역','02'),(689,'인천공항1터미널','2022-08-06 14:09:30','서울역','02'),(690,'인천공항1터미널','2022-08-06 14:21:00','서울역','02'),(691,'인천공항1터미널','2022-08-06 14:29:00','서울역','02'),(692,'인천공항1터미널','2022-08-06 14:40:30','서울역','02'),(693,'인천공항1터미널','2022-08-06 14:48:00','서울역','02'),(694,'인천공항1터미널','2022-08-06 14:54:00','서울역','02'),(695,'인천공항1터미널','2022-08-06 15:04:00','서울역','02'),(696,'인천공항1터미널','2022-08-06 15:14:00','서울역','02'),(697,'인천공항1터미널','2022-08-06 15:28:00','서울역','02'),(698,'인천공항1터미널','2022-08-06 15:29:30','서울역','02'),(699,'인천공항1터미널','2022-08-06 15:38:00','서울역','02'),(700,'인천공항1터미널','2022-08-06 15:50:00','서울역','02'),(701,'인천공항1터미널','2022-08-06 16:00:00','서울역','02'),(702,'인천공항1터미널','2022-08-06 16:08:00','서울역','02'),(703,'인천공항1터미널','2022-08-06 16:10:00','서울역','02'),(704,'인천공항1터미널','2022-08-06 16:18:00','서울역','02'),(705,'인천공항1터미널','2022-08-06 16:33:30','서울역','02'),(706,'인천공항1터미널','2022-08-06 16:43:00','서울역','02'),(707,'인천공항1터미널','2022-08-06 16:48:00','서울역','02'),(708,'인천공항1터미널','2022-08-06 16:57:00','서울역','02'),(709,'인천공항1터미널','2022-08-06 17:07:00','서울역','02'),(710,'인천공항1터미널','2022-08-06 17:20:00','서울역','02'),(711,'인천공항1터미널','2022-08-06 17:28:00','서울역','02'),(712,'인천공항1터미널','2022-08-06 17:34:00','서울역','02'),(713,'인천공항1터미널','2022-08-06 17:41:00','서울역','02'),(714,'인천공항1터미널','2022-08-06 17:54:00','서울역','02'),(715,'인천공항1터미널','2022-08-06 18:08:00','서울역','02'),(716,'인천공항1터미널','2022-08-06 18:09:30','서울역','02'),(717,'인천공항1터미널','2022-08-06 18:21:00','서울역','02'),(718,'인천공항1터미널','2022-08-06 18:28:00','서울역','02'),(719,'인천공항1터미널','2022-08-06 18:40:00','서울역','02'),(720,'인천공항1터미널','2022-08-06 18:48:00','서울역','02'),(721,'인천공항1터미널','2022-08-06 18:55:00','서울역','02'),(722,'인천공항1터미널','2022-08-06 19:06:00','서울역','02'),(723,'인천공항1터미널','2022-08-06 19:19:30','서울역','02'),(724,'인천공항1터미널','2022-08-06 19:28:00','서울역','02'),(725,'인천공항1터미널','2022-08-06 19:33:00','서울역','02'),(726,'인천공항1터미널','2022-08-06 19:42:00','서울역','02'),(727,'인천공항1터미널','2022-08-06 19:54:00','서울역','02'),(728,'인천공항1터미널','2022-08-06 20:08:00','서울역','02'),(729,'인천공항1터미널','2022-08-06 20:09:30','서울역','02'),(730,'인천공항1터미널','2022-08-06 20:15:00','서울역','02'),(731,'인천공항1터미널','2022-08-06 20:21:00','서울역','02'),(732,'인천공항1터미널','2022-08-06 20:31:00','서울역','02'),(733,'인천공항1터미널','2022-08-06 20:40:00','서울역','02'),(734,'인천공항1터미널','2022-08-06 20:48:00','서울역','02'),(735,'인천공항1터미널','2022-08-06 20:54:00','서울역','02'),(736,'인천공항1터미널','2022-08-06 21:03:00','서울역','02'),(737,'인천공항1터미널','2022-08-06 21:15:30','서울역','02'),(738,'인천공항1터미널','2022-08-06 21:25:00','서울역','02'),(739,'인천공항1터미널','2022-08-06 21:34:00','서울역','02'),(740,'인천공항1터미널','2022-08-06 21:43:00','서울역','02'),(741,'인천공항1터미널','2022-08-06 21:48:00','서울역','02'),(742,'인천공항1터미널','2022-08-06 21:56:00','서울역','02'),(743,'인천공항1터미널','2022-08-06 22:11:00','서울역','02'),(744,'인천공항1터미널','2022-08-06 22:23:00','서울역','02'),(745,'인천공항1터미널','2022-08-06 22:34:00','서울역','02'),(746,'인천공항1터미널','2022-08-06 22:43:30','서울역','02'),(747,'인천공항1터미널','2022-08-06 22:48:00','서울역','02'),(748,'인천공항1터미널','2022-08-06 23:02:00','서울역','02'),(749,'인천공항1터미널','2022-08-06 23:20:00','서울역','02'),(750,'인천공항1터미널','2022-08-06 23:39:00','서울역','02'),(751,'인천공항1터미널','2022-08-06 23:57:00','디지털미디어시티','02'),(752,'인천공항1터미널','2022-08-06 05:23:00','서울역','03'),(753,'인천공항1터미널','2022-08-06 05:25:00','서울역','03'),(754,'인천공항1터미널','2022-08-06 05:32:00','서울역','03'),(755,'인천공항1터미널','2022-08-06 05:38:00','서울역','03'),(756,'인천공항1터미널','2022-08-06 05:50:00','서울역','03'),(757,'인천공항1터미널','2022-08-06 05:58:00','서울역','03'),(758,'인천공항1터미널','2022-08-06 06:00:00','서울역','03'),(759,'인천공항1터미널','2022-08-06 06:08:00','서울역','03'),(760,'인천공항1터미널','2022-08-06 06:16:00','서울역','03'),(761,'인천공항1터미널','2022-08-06 06:24:00','서울역','03'),(762,'인천공항1터미널','2022-08-06 06:30:00','서울역','03'),(763,'인천공항1터미널','2022-08-06 06:34:00','서울역','03'),(764,'인천공항1터미널','2022-08-06 06:38:00','서울역','03'),(765,'인천공항1터미널','2022-08-06 06:41:30','서울역','03'),(766,'인천공항1터미널','2022-08-06 06:47:30','서울역','03'),(767,'인천공항1터미널','2022-08-06 06:57:30','서울역','03'),(768,'인천공항1터미널','2022-08-06 07:08:30','서울역','03'),(769,'인천공항1터미널','2022-08-06 07:19:30','서울역','03'),(770,'인천공항1터미널','2022-08-06 07:28:00','서울역','03'),(771,'인천공항1터미널','2022-08-06 07:31:00','서울역','03'),(772,'인천공항1터미널','2022-08-06 07:42:30','서울역','03'),(773,'인천공항1터미널','2022-08-06 07:54:00','서울역','03'),(774,'인천공항1터미널','2022-08-06 08:04:00','서울역','03'),(775,'인천공항1터미널','2022-08-06 08:08:00','서울역','03'),(776,'인천공항1터미널','2022-08-06 08:13:00','서울역','03'),(777,'인천공항1터미널','2022-08-06 08:25:00','서울역','03'),(778,'인천공항1터미널','2022-08-06 08:34:30','서울역','03'),(779,'인천공항1터미널','2022-08-06 08:48:00','서울역','03'),(780,'인천공항1터미널','2022-08-06 08:50:00','서울역','03'),(781,'인천공항1터미널','2022-08-06 09:03:00','서울역','03'),(782,'인천공항1터미널','2022-08-06 09:14:00','서울역','03'),(783,'인천공항1터미널','2022-08-06 09:28:00','서울역','03'),(784,'인천공항1터미널','2022-08-06 09:29:30','서울역','03'),(785,'인천공항1터미널','2022-08-06 09:40:00','서울역','03'),(786,'인천공항1터미널','2022-08-06 09:49:00','서울역','03'),(787,'인천공항1터미널','2022-08-06 10:03:00','서울역','03'),(788,'인천공항1터미널','2022-08-06 10:08:00','서울역','03'),(789,'인천공항1터미널','2022-08-06 10:19:00','서울역','03'),(790,'인천공항1터미널','2022-08-06 10:33:00','서울역','03'),(791,'인천공항1터미널','2022-08-06 10:40:00','서울역','03'),(792,'인천공항1터미널','2022-08-06 10:48:00','서울역','03'),(793,'인천공항1터미널','2022-08-06 10:50:00','서울역','03'),(794,'인천공항1터미널','2022-08-06 11:02:00','서울역','03'),(795,'인천공항1터미널','2022-08-06 11:14:00','서울역','03'),(796,'인천공항1터미널','2022-08-06 11:23:30','서울역','03'),(797,'인천공항1터미널','2022-08-06 11:28:00','서울역','03'),(798,'인천공항1터미널','2022-08-06 11:37:00','서울역','03'),(799,'인천공항1터미널','2022-08-06 11:51:00','서울역','03'),(800,'인천공항1터미널','2022-08-06 12:00:00','서울역','03'),(801,'인천공항1터미널','2022-08-06 12:10:00','서울역','03'),(802,'인천공항1터미널','2022-08-06 12:18:00','서울역','03'),(803,'인천공항1터미널','2022-08-06 12:24:00','서울역','03'),(804,'인천공항1터미널','2022-08-06 12:37:30','서울역','03'),(805,'인천공항1터미널','2022-08-06 12:53:00','서울역','03'),(806,'인천공항1터미널','2022-08-06 12:58:00','서울역','03'),(807,'인천공항1터미널','2022-08-06 13:07:30','서울역','03'),(808,'인천공항1터미널','2022-08-06 13:20:00','서울역','03'),(809,'인천공항1터미널','2022-08-06 13:28:00','서울역','03'),(810,'인천공항1터미널','2022-08-06 13:31:00','서울역','03'),(811,'인천공항1터미널','2022-08-06 13:42:00','서울역','03'),(812,'인천공항1터미널','2022-08-06 13:54:00','서울역','03'),(813,'인천공항1터미널','2022-08-06 14:08:00','서울역','03'),(814,'인천공항1터미널','2022-08-06 14:09:30','서울역','03'),(815,'인천공항1터미널','2022-08-06 14:21:00','서울역','03'),(816,'인천공항1터미널','2022-08-06 14:29:00','서울역','03'),(817,'인천공항1터미널','2022-08-06 14:40:30','서울역','03'),(818,'인천공항1터미널','2022-08-06 14:48:00','서울역','03'),(819,'인천공항1터미널','2022-08-06 14:54:00','서울역','03'),(820,'인천공항1터미널','2022-08-06 15:04:00','서울역','03'),(821,'인천공항1터미널','2022-08-06 15:14:00','서울역','03'),(822,'인천공항1터미널','2022-08-06 15:28:00','서울역','03'),(823,'인천공항1터미널','2022-08-06 15:29:30','서울역','03'),(824,'인천공항1터미널','2022-08-06 15:38:00','서울역','03'),(825,'인천공항1터미널','2022-08-06 15:50:00','서울역','03'),(826,'인천공항1터미널','2022-08-06 16:00:00','서울역','03'),(827,'인천공항1터미널','2022-08-06 16:08:00','서울역','03'),(828,'인천공항1터미널','2022-08-06 16:10:00','서울역','03'),(829,'인천공항1터미널','2022-08-06 16:18:00','서울역','03'),(830,'인천공항1터미널','2022-08-06 16:33:30','서울역','03'),(831,'인천공항1터미널','2022-08-06 16:43:00','서울역','03'),(832,'인천공항1터미널','2022-08-06 16:48:00','서울역','03'),(833,'인천공항1터미널','2022-08-06 16:57:00','서울역','03'),(834,'인천공항1터미널','2022-08-06 17:07:00','서울역','03'),(835,'인천공항1터미널','2022-08-06 17:20:00','서울역','03'),(836,'인천공항1터미널','2022-08-06 17:28:00','서울역','03'),(837,'인천공항1터미널','2022-08-06 17:34:00','서울역','03'),(838,'인천공항1터미널','2022-08-06 17:41:00','서울역','03'),(839,'인천공항1터미널','2022-08-06 17:54:00','서울역','03'),(840,'인천공항1터미널','2022-08-06 18:08:00','서울역','03'),(841,'인천공항1터미널','2022-08-06 18:09:30','서울역','03'),(842,'인천공항1터미널','2022-08-06 18:21:00','서울역','03'),(843,'인천공항1터미널','2022-08-06 18:28:00','서울역','03'),(844,'인천공항1터미널','2022-08-06 18:40:00','서울역','03'),(845,'인천공항1터미널','2022-08-06 18:48:00','서울역','03'),(846,'인천공항1터미널','2022-08-06 18:55:00','서울역','03'),(847,'인천공항1터미널','2022-08-06 19:06:00','서울역','03'),(848,'인천공항1터미널','2022-08-06 19:19:30','서울역','03'),(849,'인천공항1터미널','2022-08-06 19:28:00','서울역','03'),(850,'인천공항1터미널','2022-08-06 19:33:00','서울역','03'),(851,'인천공항1터미널','2022-08-06 19:42:00','서울역','03'),(852,'인천공항1터미널','2022-08-06 19:54:00','서울역','03'),(853,'인천공항1터미널','2022-08-06 20:08:00','서울역','03'),(854,'인천공항1터미널','2022-08-06 20:09:30','서울역','03'),(855,'인천공항1터미널','2022-08-06 20:15:00','서울역','03'),(856,'인천공항1터미널','2022-08-06 20:21:00','서울역','03'),(857,'인천공항1터미널','2022-08-06 20:31:00','서울역','03'),(858,'인천공항1터미널','2022-08-06 20:40:00','서울역','03'),(859,'인천공항1터미널','2022-08-06 20:48:00','서울역','03'),(860,'인천공항1터미널','2022-08-06 20:54:00','서울역','03'),(861,'인천공항1터미널','2022-08-06 21:03:00','서울역','03'),(862,'인천공항1터미널','2022-08-06 21:15:30','서울역','03'),(863,'인천공항1터미널','2022-08-06 21:25:00','서울역','03'),(864,'인천공항1터미널','2022-08-06 21:34:00','서울역','03'),(865,'인천공항1터미널','2022-08-06 21:43:00','서울역','03'),(866,'인천공항1터미널','2022-08-06 21:48:00','서울역','03'),(867,'인천공항1터미널','2022-08-06 21:56:00','서울역','03'),(868,'인천공항1터미널','2022-08-06 22:11:00','서울역','03'),(869,'인천공항1터미널','2022-08-06 22:23:00','서울역','03'),(870,'인천공항1터미널','2022-08-06 22:34:00','서울역','03'),(871,'인천공항1터미널','2022-08-06 22:43:30','서울역','03'),(872,'인천공항1터미널','2022-08-06 22:48:00','서울역','03'),(873,'인천공항1터미널','2022-08-06 23:02:00','서울역','03'),(874,'인천공항1터미널','2022-08-06 23:20:00','서울역','03'),(875,'인천공항1터미널','2022-08-06 23:39:00','서울역','03'),(876,'인천공항1터미널','2022-08-06 23:57:00','디지털미디어시티','03');
/*!40000 ALTER TABLE `subway` ENABLE KEYS */;
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
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `terms`
--

LOCK TABLES `terms` WRITE;
/*!40000 ALTER TABLE `terms` DISABLE KEYS */;
INSERT INTO `terms` VALUES (10,'N','Y','N','Y'),(11,'Y','Y','Y','Y'),(12,'Y','Y','Y','Y'),(13,'Y','Y','Y','Y'),(14,'N','Y','N','Y'),(15,'Y','Y','N','Y');
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
  `airplane_id` bigint NOT NULL,
  PRIMARY KEY (`toilet_id`),
  KEY `FK3o3lsin22eiq8elkhgdiin9tc` (`airplane_id`),
  CONSTRAINT `FK3o3lsin22eiq8elkhgdiin9tc` FOREIGN KEY (`airplane_id`) REFERENCES `airplane` (`airplane_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `toilet`
--

LOCK TABLES `toilet` WRITE;
/*!40000 ALTER TABLE `toilet` DISABLE KEYS */;
INSERT INTO `toilet` VALUES (2,'HR01',2),(4,'HL01',2);
/*!40000 ALTER TABLE `toilet` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `toilet_log`
--

DROP TABLE IF EXISTS `toilet_log`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `toilet_log` (
  `toilet_log_id` bigint NOT NULL AUTO_INCREMENT,
  `time` datetime DEFAULT CURRENT_TIMESTAMP,
  `used` int DEFAULT NULL,
  `toilet_id` bigint NOT NULL,
  PRIMARY KEY (`toilet_log_id`),
  KEY `fk_toilet_log_toilet1_idx` (`toilet_id`),
  CONSTRAINT `fk_toilet_log_toilet1` FOREIGN KEY (`toilet_id`) REFERENCES `toilet` (`toilet_id`)
) ENGINE=InnoDB AUTO_INCREMENT=94 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `toilet_log`
--

LOCK TABLES `toilet_log` WRITE;
/*!40000 ALTER TABLE `toilet_log` DISABLE KEYS */;
INSERT INTO `toilet_log` VALUES (1,'2022-08-01 08:52:04',1,2),(2,'2022-08-01 09:14:01',1,2),(9,'2022-08-01 12:07:37',1,2),(10,'2022-08-01 12:07:37',1,2),(11,'2022-08-01 12:07:37',1,2),(12,'2022-08-01 12:07:37',1,2),(13,'2022-08-01 12:07:38',1,2),(14,'2022-08-01 12:07:38',1,2),(15,'2022-08-01 12:07:39',1,2),(16,'2022-08-01 12:07:39',1,2),(17,'2022-08-01 12:07:40',1,2),(18,'2022-08-01 12:07:40',1,2),(19,'2022-08-01 12:07:41',0,2),(20,'2022-08-01 12:07:41',0,2),(21,'2022-08-01 12:07:42',0,2),(22,'2022-08-01 12:07:42',0,2),(23,'2022-08-01 12:07:43',1,2),(24,'2022-08-01 12:24:29',1,2),(25,'2022-08-01 12:24:30',1,2),(26,'2022-08-01 12:24:30',1,2),(27,'2022-08-01 12:24:31',1,2),(28,'2022-08-01 12:24:31',1,2),(29,'2022-08-01 12:24:32',1,2),(30,'2022-08-01 12:24:32',1,2),(31,'2022-08-01 12:24:33',1,2),(32,'2022-08-01 12:24:33',1,2),(33,'2022-08-01 12:24:34',1,2),(34,'2022-08-01 12:24:50',1,2),(35,'2022-08-01 12:24:51',1,2),(36,'2022-08-01 12:24:51',1,2),(37,'2022-08-01 12:24:52',1,2),(38,'2022-08-01 12:24:52',1,2),(39,'2022-08-01 12:24:53',1,2),(40,'2022-08-01 12:24:58',1,2),(41,'2022-08-01 12:24:59',1,2),(42,'2022-08-01 12:24:59',0,2),(43,'2022-08-01 12:25:00',0,2),(44,'2022-08-01 12:25:00',0,2),(45,'2022-08-01 12:25:01',0,2),(46,'2022-08-01 12:25:01',0,2),(47,'2022-08-01 12:25:02',1,2),(48,'2022-08-01 12:25:02',1,2),(49,'2022-08-01 12:25:03',1,2),(50,'2022-08-02 05:50:50',1,2),(51,'2022-08-02 05:52:35',1,2),(52,'2022-08-02 05:54:10',1,2),(53,'2022-08-02 05:56:16',1,2),(54,'2022-08-02 05:57:25',1,2),(55,'2022-08-02 05:57:55',1,2),(56,'2022-08-02 05:59:11',1,2),(57,'2022-08-02 05:59:16',1,2),(58,'2022-08-02 05:59:21',1,2),(59,'2022-08-02 05:59:26',1,2),(60,'2022-08-02 05:59:31',1,2),(61,'2022-08-02 05:59:36',1,2),(62,'2022-08-02 05:59:41',1,2),(63,'2022-08-02 06:07:06',1,2),(64,'2022-08-02 06:07:41',1,2),(65,'2022-08-02 06:18:42',1,4),(66,'2022-08-02 06:18:47',0,4),(67,'2022-08-02 06:18:52',0,4),(68,'2022-08-02 06:19:52',1,4),(69,'2022-08-02 06:19:53',1,2),(70,'2022-08-02 06:19:57',1,4),(71,'2022-08-02 06:19:58',0,2),(72,'2022-08-02 06:20:02',1,4),(73,'2022-08-02 06:20:03',1,2),(74,'2022-08-02 06:20:07',0,4),(75,'2022-08-02 06:20:08',1,2),(76,'2022-08-02 06:20:12',1,4),(77,'2022-08-02 06:20:13',1,2),(78,'2022-08-02 06:21:47',1,4),(79,'2022-08-02 06:21:48',1,2),(80,'2022-08-02 06:21:52',1,4),(81,'2022-08-02 06:21:53',1,2),(82,'2022-08-02 06:21:57',1,4),(83,'2022-08-02 06:21:58',1,2),(84,'2022-08-02 06:22:02',1,4),(85,'2022-08-02 06:22:03',1,2),(86,'2022-08-02 06:22:07',0,4),(87,'2022-08-02 06:22:08',1,2),(88,'2022-08-02 06:22:12',0,4),(89,'2022-08-02 06:22:13',1,2),(90,'2022-08-02 06:22:18',1,4),(91,'2022-08-02 06:22:18',1,2),(92,'2022-08-02 06:22:22',1,4),(93,'2022-08-02 06:22:23',0,2);
/*!40000 ALTER TABLE `toilet_log` ENABLE KEYS */;
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
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (9,'1997-10-08','규','박','명','$2a$10$0f2P0ji07aJyqkf00PI/Zu0Bd46z8GhQT078ByYabhvtBUQdmUSDe','ROLE_USER','audrb96',10,29),(10,'1997-06-28','현','김','상','$2a$10$UKvBMEz6BQvh1raY5yjasOG7Z24BcfLJFY/JK/ZIsaEXzfeIcrCOW','ROLE_USER','ksh3967',11,30),(11,'2022-08-18','원','승','무','$2a$10$ZwUKrpWjSZGNCp7wyEdyKepC0klBqXo.k9axEYnGAG5kpG8zt3rYK','ROLE_ATTENDANT','attendant',12,31),(12,'1994-11-11','진','정','형','$2a$10$UbW8ih3hTT3xqX4nJnXc4.gwfHHakkJAFC0clUqFy/Ppy.6tk2o2O','ROLE_USER','hyungjin2949',13,32),(13,'1993-08-26','아','김','정','$2a$10$XuDUw.RLpMOjJLBMy.I5leOWUtTZ7Rw2/jL9LR7Fo2c27tH5ZjF.u','ROLE_USER','jkimlow',14,33),(14,'1999-01-20','수','김','혜','$2a$10$D3fcBopLNi5Ti9g1KYDYpuspBnj9Sid9DS3/TbCtw8G54XbgN9CEm','ROLE_USER','h__2__y',15,34);
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
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_detail`
--

LOCK TABLES `user_detail` WRITE;
/*!40000 ALTER TABLE `user_detail` DISABLE KEYS */;
INSERT INTO `user_detail` VALUES (29,' (금곡동, 효창아파트) ','경기 남양주시 사릉로34번길 7-1','12233','audrb96@naver.com','IT','대한민국','M12345678','MALE','010-2318-9857'),(30,' (번동)송림주택','서울 강북구 한천로123가길 40-3','01064','ksh3967@naver.com','IT','대한민국','M01230123','MALE','010-5877-5285'),(31,' (운서동)국제공항역','인천 중구 공항로 271','22382','attendant@','etc','대한민국','M10002000','MALE','000-000-0000'),(32,' (보문동1가)','서울 성북구 고려대로 1','02851','hyungin2949@','IT','대한민국','M29492949','MALE','010-2083-8789'),(33,' (회기동)','서울 동대문구 이문로 3','02461','moopama@','IT','대한민국','M11111111','FEMALE','010-3162-7422'),(34,' (반포동)','서울 서초구 주흥길 31-7','06539','h__2__y@','IT','대한민국','M00000000','FEMALE','010-3187-3843');
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
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `visited_country`
--

LOCK TABLES `visited_country` WRITE;
/*!40000 ALTER TABLE `visited_country` DISABLE KEYS */;
INSERT INTO `visited_country` VALUES (26,'프랑스',32),(27,'네덜란드',32),(28,'일본',33),(29,'호주',34);
/*!40000 ALTER TABLE `visited_country` ENABLE KEYS */;
UNLOCK TABLES;
SET @@SESSION.SQL_LOG_BIN = @MYSQLDUMP_TEMP_LOG_BIN;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-08-18 20:53:01
