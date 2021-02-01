DROP TABLE IF EXISTS products;
DROP TABLE IF EXISTS labels;
DROP TABLE IF EXISTS labels_products©;

CREATE TABLE  products (
    id   INTEGER      NOT NULL AUTO_INCREMENT,
    name VARCHAR(128) NOT NULL,
    price DOUBLE NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE labels (
    id   INTEGER NOT NULL AUTO_INCREMENT,
    name VARCHAR(30) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE labels_products (
    product_id INTEGER NOT NULL,
    label_id INTEGER NOT NULL,
    PRIMARY KEY (product_id, label_id)
);
