/* Drop Tables */
DROP TABLE IF EXISTS shopping;

/* Create Tables */
CREATE TABLE shopping
(
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(128),
    num INTEGER,
    place VARCHAR(128)
);


