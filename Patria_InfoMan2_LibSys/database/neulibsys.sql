-- MySQL dump 10.13  Distrib 8.0.45, for Win64 (x86_64)
--
-- Host: localhost    Database: neulibsys
-- ------------------------------------------------------
-- Server version	8.0.45

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
-- Table structure for table `admin_logs`
--

DROP TABLE IF EXISTS `admin_logs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin_logs` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `login_date` varchar(255) DEFAULT NULL,
  `login_time` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin_logs`
--

LOCK TABLES `admin_logs` WRITE;
/*!40000 ALTER TABLE `admin_logs` DISABLE KEYS */;
INSERT INTO `admin_logs` VALUES (1,'johnloyd.patria@neu.edu.ph','2026-03-20','17:27:13','Patria, John Loyd A.'),(2,'johnloyd.patria@neu.edu.ph','2026-03-20','17:27:56','Patria, John Loyd A.'),(3,'johnloyd.patria@neu.edu.ph','2026-03-20','17:30:58','Patria, John Loyd A.'),(4,'johnlouiree.tilos@neu.edu.ph','2026-03-20','18:19:39','Tilos, John Louiree B.'),(5,'johnloyd.patria@neu.edu.ph','2026-03-20','18:20:01','Patria, John Loyd A.');
/*!40000 ALTER TABLE `admin_logs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `blocked_employees`
--

DROP TABLE IF EXISTS `blocked_employees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `blocked_employees` (
  `employee_id` varchar(255) NOT NULL,
  PRIMARY KEY (`employee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `blocked_employees`
--

LOCK TABLES `blocked_employees` WRITE;
/*!40000 ALTER TABLE `blocked_employees` DISABLE KEYS */;
INSERT INTO `blocked_employees` VALUES ('12-34567-890'),('23-13592-615'),('31-54252-231'),('example4'),('example6');
/*!40000 ALTER TABLE `blocked_employees` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `blocked_students`
--

DROP TABLE IF EXISTS `blocked_students`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `blocked_students` (
  `student_id` varchar(255) NOT NULL,
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `blocked_students`
--

LOCK TABLES `blocked_students` WRITE;
/*!40000 ALTER TABLE `blocked_students` DISABLE KEYS */;
INSERT INTO `blocked_students` VALUES ('00-00000-000'),('12-34567-890'),('22-13061-290'),('23-13592-615'),('adasdas'),('example5');
/*!40000 ALTER TABLE `blocked_students` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee_visits`
--

DROP TABLE IF EXISTS `employee_visits`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee_visits` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `department` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `employee_id` varchar(255) DEFAULT NULL,
  `full_name` varchar(255) DEFAULT NULL,
  `purpose` varchar(255) DEFAULT NULL,
  `visit_date` date DEFAULT NULL,
  `visit_time` time DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee_visits`
--

LOCK TABLES `employee_visits` WRITE;
/*!40000 ALTER TABLE `employee_visits` DISABLE KEYS */;
INSERT INTO `employee_visits` VALUES (1,'CICS','richard.gomez@neu.edu.ph','23-23525-789','Richard Gomez','Reading','2026-03-14','21:14:18'),(2,'CICS','example.example@neu.edu.ph','00-00000-000','Example 1','To browse.','2026-03-14','21:28:46'),(3,'CICS','example2@neu.edu.ph','31-54252-231','Example 2','Reading','2026-03-14','22:09:07'),(4,'CICS','example4@neu.edu.ph','example4','example4','Reading','2026-03-14','22:27:11'),(5,'CICS','Example6@neu','example6','example6','Reading','2026-03-14','22:56:25'),(6,'CICS','unknown.example@neu.edu.ph','12-34567-890','Unknown Example','Computer Use','2026-03-15','02:18:19'),(7,'CICS','johnloyd.patria@neu.edu.ph','12-34567-890','Patria, John Loyd A.','Reading','2026-03-20','15:15:50'),(8,'CICS','johnloyd.patria@neu.edu.ph','12-34567-890','Patria, John Loyd A.','Assignments','2026-03-20','15:16:22'),(9,'CICS','johnloyd.patria@neu.edu.ph','12-34567-890','Patria, John Loyd A.','Reading','2026-03-20','15:17:08'),(10,'CICS','johnloyd.patria@neu.edu.ph','12-34567-890','Patria, John Loyd A.','Reading','2026-03-20','15:19:39'),(11,'CICS','johnloyd.patria@neu.edu.ph','12-34567-890','Patria, John Loyd A.','Research','2026-03-20','15:22:48'),(12,'CICS','johnloyd.patria@neu.edu.ph','12-34567-890','Patria, John Loyd A.','Reading','2026-03-20','15:28:09'),(13,'CICS','johnloyd.patria@neu.edu.ph','12-34567-890','Patria, John Loyd A.','Computer Use','2026-03-20','16:15:35'),(14,'CICS','johnloyd.patria@neu.edu.ph','12-34567-890','Patria, John Loyd A.','Computer Use','2026-03-20','16:16:18'),(15,'CICS','johnloyd.patria@neu.edu.ph','23-13592-615','Patria, John Loyd A.','Computer Use','2026-03-20','17:10:44'),(16,'s','johnloyd.patria@neu.edu.ph','2','Patria, John Loyd A.','Reading','2026-03-20','17:12:22'),(17,'CICS','johnloyd.patria@neu.edu.ph','23-13592-615','Patria, John Loyd A.','Computer Use','2026-03-20','18:10:32');
/*!40000 ALTER TABLE `employee_visits` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `library_visit`
--

DROP TABLE IF EXISTS `library_visit`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `library_visit` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `full_name` varchar(255) DEFAULT NULL,
  `program` varchar(255) DEFAULT NULL,
  `purpose` varchar(255) DEFAULT NULL,
  `student_id` varchar(255) DEFAULT NULL,
  `visit_date` date DEFAULT NULL,
  `visit_time` time DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `library_visit`
--

LOCK TABLES `library_visit` WRITE;
/*!40000 ALTER TABLE `library_visit` DISABLE KEYS */;
INSERT INTO `library_visit` VALUES (1,'johnloyd.patria@neu.edu.ph','John Loyd patria','BSIT','Research','23-13592-615','2026-03-14','20:02:58'),(2,'johnloyd.patria@neu.edu.ph','John Loyd patria','BSIT','Research','23-13592-615','2026-03-14','20:03:08'),(3,'yuri.patria@neu.edu.ph','Yuri Patria','BSIT','To study.','52-52467-241','2026-03-14','20:13:40'),(4,'joshua.garcia@neu.edu.ph','Joshua Garcia','BSEE','Assignments','32-23453-578','2026-03-14','20:20:29'),(5,'johnloyd.patria@neu.edu.ph','John Loyd Patria','BSIT','Reading','23-13592-615','2026-03-14','20:56:31'),(6,'johnlouiree.tilos@neu.edu.ph','John Louiree Tilos','BSIT','Research','22-23112-522','2026-03-14','21:26:54'),(7,'asdasd@sa','adasa','asdadas','Reading','adasdas','2026-03-14','22:19:44'),(8,'ryan.cruz@neu.edu.ph','Ryan Cruz','BSIT','Reading','12-34567-890','2026-03-14','22:34:06'),(9,'ryan.cruz@neu.edu.ph','Ryan Cruz','BSIT','Reading','12-34567-890','2026-03-14','22:34:49'),(10,'daniel.padilla@neu.edu.ph','Daniel Padilla','BSCS','To browse and appreciate the library.','54-52353-231','2026-03-14','22:40:58'),(11,'daniel.padilla@neu.edu.ph','Daniel Padilla','BSCS','To browse and appreciate the library.','54-52353-231','2026-03-14','22:41:22'),(12,'daniel.padilla@neu.edu.ph','Daniel Padilla','BSCS','To browse and appreciate the library.','54-52353-231','2026-03-14','22:44:27'),(13,'Example5@neu','example5','example5','Computer Use','example5','2026-03-14','22:53:54'),(14,'johnloyd.patria@neu.edu.ph','John Loyd Patria','BSIT','Reading','23-13592-615','2026-03-15','01:37:31'),(15,'example.example@neu.edu.ph','Example Example','BSIT','To study programming.','00-00000-000','2026-03-15','02:16:04'),(16,'sdsad@saa','sadsad','dadad','Reading','adsda','2026-03-15','02:22:28'),(17,'johnloyd.patria@neu.edu.ph','Patria, John Loyd A.','BSIT','Computer Use','23-13592-615','2026-03-20','15:01:33'),(18,'johnloyd.patria@neu.edu.ph','Patria, John Loyd A.','BSIT','Reading','23-13592-615','2026-03-20','15:15:29'),(19,'johnloyd.patria@neu.edu.ph','Patria, John Loyd A.','BSIT','Reading','23-13592-615','2026-03-20','15:17:46'),(20,'johnloyd.patria@neu.edu.ph','Patria, John Loyd A.','BSIT','Reading','23-13592-615','2026-03-20','15:22:33'),(21,'johnloyd.patria@neu.edu.ph','Patria, John Loyd A.','BSIT','Reading','23-13592-615','2026-03-20','15:27:24'),(22,'johnlouiree.tilos@neu.edu.ph','Tilos, John Louiree B.','BSIT','Computer Use','22-13061-290','2026-03-20','16:37:14'),(23,'johnlouiree.tilos@neu.edu.ph','Tilos, John Louiree B.','BSIT','Reading','22-13061-290','2026-03-20','16:37:52'),(24,'johnlouiree.tilos@neu.edu.ph','Tilos, John Louiree B.','BSIT','Reading','23-13592-615','2026-03-20','16:41:18'),(25,'johnloyd.patria@neu.edu.ph','Patria, John Loyd A.','BSIT','Reading','23-13592-615','2026-03-20','17:10:17'),(26,'johnloyd.patria@neu.edu.ph','Patria, John Loyd A.','BSIT','To study','23-13502-615','2026-03-20','18:10:12');
/*!40000 ALTER TABLE `library_visit` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2026-03-20 18:29:39
