-- 权限表
CREATE TABLE permission (
  pid INT(11) NOT NULL AUTO_INCREMENT,
  name VARCHAR(255) NOT NULL DEFAULT '',
  url VARCHAR(255) NOT NULL DEFAULT '',
  PRIMARY KEY(pid)
)ENGINE = innoDB DEFAULT CHARSET = utf8;

-- 用户表
CREATE TABLE user(
  uid INT(11) NOT NULL AUTO_INCREMENT,
  username VARCHAR(255) NOT NULL DEFAULT '',
  password VARCHAR(255) NOT NULL DEFAULT '',
  PRIMARY KEY (uid)
)ENGINE = innoDB DEFAULT CHARSET = utf8;

-- 角色表
CREATE TABLE role (
  rid  INT(11)      NOT NULL AUTO_INCREMENT,
  name VARCHAR(255) NOT NULL DEFAULT '',
  PRIMARY KEY (rid)
)ENGINE = innoDB DEFAULT CHARSET = utf8;

-- 用户角色关系表
CREATE TABLE user_role(
  uid INT(11) NOT NULL ,
  rid INT(11) NOT NULL ,
  KEY idx_rid(rid),
  KEY idx_uid(uid)
)ENGINE = innoDB DEFAULT CHARSET = utf8;

-- 角色权限表
CREATE TABLE role_permission(
  rid INT(11) NOT NULL ,
  pid INT(11) NOT NULL ,
  KEY idx_rid(rid),
  KEY idx_uid(pid)
)ENGINE = innoDB DEFAULT CHARSET = utf8;