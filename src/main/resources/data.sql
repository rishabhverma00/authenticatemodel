DROP TABLE IF EXISTS usertable;

CREATE TABLE usertable (
  userid_pk int(11) NOT NULL AUTO_INCREMENT,
  name varchar(255) DEFAULT NULL,
  password varchar(255) DEFAULT NULL,
  username varchar(255) DEFAULT NULL,
  enabled tinyint(1) DEFAULT 1,
  role varchar(10) DEFAULT NULL,
  email varchar(50) DEFAULT NULL,
  PRIMARY KEY (userid_pk)
);
commit;