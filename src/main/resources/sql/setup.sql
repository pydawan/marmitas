-- =====================================================
-- autor: thiago-amm
-- data:  21/09/2017
-- =====================================================
USE mysql;

DROP DATABASE IF EXISTS bazar;
DROP USER IF EXISTS bazar;

CREATE DATABASE IF NOT EXISTS bazar DEFAULT CHARACTER SET utf8 DEFAULT COLLATE utf8_general_ci;
CREATE USER IF NOT EXISTS bazar;

GRANT ALL PRIVILEGES ON bazar.* TO 'bazar'@'%' IDENTIFIED BY 'bazar';

FLUSH PRIVILEGES;
