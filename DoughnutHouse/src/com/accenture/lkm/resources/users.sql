-- Dumping database structure for doughnutdb
drop database IF EXISTS doughnutdb;
create database doughnutdb;
use doughnutdb;

-- Dumping structure for table doughnutdb.users
DROP TABLE IF EXISTS users;
CREATE TABLE `users` (
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
   PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

INSERT INTO users (userId, userName,password) VALUES
	(1, 'Jack', 'Jill'),
	(2, 'Rahul', 'Anand'),
	(3, 'Vijay', 'Kumar');
commit;