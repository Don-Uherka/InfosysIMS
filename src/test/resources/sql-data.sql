INSERT INTO `customers` (`first_name`, `surname`) VALUES ('jordan', 'harrison');
INSERT INTO `items` (`name`, `price`) VALUES ('xbox', 600);
INSERT INTO `orders` (id, fkCustomerId) VALUES (1, 1);
INSERT INTO `orderItems` (`id`, `fkOrderId`, `fkItemId`) VALUES (1, 1, 1);
