-- Inserts for PRICES --
INSERT INTO PRICES (BRAND_ID, START_DATE, END_DATE, PRICE_LIST, PRODUCT_ID, PRIORITY, PRICE, CURR) VALUES
(1, {ts '2020-06-14 00.00.00'}, {ts '2020-12-31 23.59.59'}, 1, 35455, 0, 35.50, 'EUR'),
(1, {ts '2020-06-14 15.00.00'}, {ts '2020-06-14 18.30.00'}, 2, 35455, 1, 25.45, 'EUR'),
(1, {ts '2020-06-15 00.00.00'}, {ts '2020-06-15 11.00.00'}, 3, 35455, 1, 30.50, 'EUR'),
(1, {ts '2020-06-15 16.00.00'}, {ts '2020-12-31 23.59.59'}, 4, 35455, 1, 38.95, 'EUR');
