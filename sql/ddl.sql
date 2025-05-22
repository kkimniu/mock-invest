CREATE TABLE member (
         id BIGINT PRIMARY KEY AUTO_INCREMENT,
         userid VARCHAR(50) UNIQUE NOT NULL,
         password VARCHAR(255) NOT NULL,
          name VARCHAR(100),
          email VARCHAR(255),
          tel VARCHAR(20),
          joindate TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
