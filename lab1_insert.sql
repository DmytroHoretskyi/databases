/*
-- Query: SELECT * FROM horetskyi.driver
LIMIT 0, 1000

-- Date: 2021-11-01 13:10
*/
INSERT INTO `` (`iddriver`,`name`,`surname`,`age`,`number_of_cars`,`rating_idrating`,`experience`) VALUES (1,'joe','biden',45,3,1,15);
INSERT INTO `` (`iddriver`,`name`,`surname`,`age`,`number_of_cars`,`rating_idrating`,`experience`) VALUES (2,'bil','qwerty',18,1,2,3);
INSERT INTO `` (`iddriver`,`name`,`surname`,`age`,`number_of_cars`,`rating_idrating`,`experience`) VALUES (3,'ann','ytrewq',23,2,3,2);
INSERT INTO `` (`iddriver`,`name`,`surname`,`age`,`number_of_cars`,`rating_idrating`,`experience`) VALUES (4,'sarah','adam',45,1,4,1);
INSERT INTO `` (`iddriver`,`name`,`surname`,`age`,`number_of_cars`,`rating_idrating`,`experience`) VALUES (5,'ino','choe',22,1,5,12);
INSERT INTO `` (`iddriver`,`name`,`surname`,`age`,`number_of_cars`,`rating_idrating`,`experience`) VALUES (6,'jihn','pie',26,1,6,13);
INSERT INTO `` (`iddriver`,`name`,`surname`,`age`,`number_of_cars`,`rating_idrating`,`experience`) VALUES (7,'anna','rex',37,1,7,2);
INSERT INTO `` (`iddriver`,`name`,`surname`,`age`,`number_of_cars`,`rating_idrating`,`experience`) VALUES (8,'July','bell',42,2,8,7);
INSERT INTO `` (`iddriver`,`name`,`surname`,`age`,`number_of_cars`,`rating_idrating`,`experience`) VALUES (9,'rob','miligun',19,1,9,5);
INSERT INTO `` (`iddriver`,`name`,`surname`,`age`,`number_of_cars`,`rating_idrating`,`experience`) VALUES (10,'bob','minigun',33,1,10,6);

INSERT INTO `` (`idcar`,`model`,`mark`,`color`,`driver_iddriver`,`car_number`) VALUES (1,'x8','bmw','black',1,'bc2345rs');
INSERT INTO `` (`idcar`,`model`,`mark`,`color`,`driver_iddriver`,`car_number`) VALUES (2,'x5','bmw','white',1,'bc2315rs');
INSERT INTO `` (`idcar`,`model`,`mark`,`color`,`driver_iddriver`,`car_number`) VALUES (3,'x3','bmw','pink',2,'bc2325rs');
INSERT INTO `` (`idcar`,`model`,`mark`,`color`,`driver_iddriver`,`car_number`) VALUES (4,'3','lada','black',3,'bc2355rs');
INSERT INTO `` (`idcar`,`model`,`mark`,`color`,`driver_iddriver`,`car_number`) VALUES (5,'pasat','WW','yelow',4,'bc2365rs');
INSERT INTO `` (`idcar`,`model`,`mark`,`color`,`driver_iddriver`,`car_number`) VALUES (6,'bug','WW','blue',5,'bc2375rs');
INSERT INTO `` (`idcar`,`model`,`mark`,`color`,`driver_iddriver`,`car_number`) VALUES (7,'pasat','WW','black',6,'bc2385rs');
INSERT INTO `` (`idcar`,`model`,`mark`,`color`,`driver_iddriver`,`car_number`) VALUES (8,'1910','lada','black',7,'bc2335rs');
INSERT INTO `` (`idcar`,`model`,`mark`,`color`,`driver_iddriver`,`car_number`) VALUES (9,'x5','bmw','white',8,'bc2395rs');
INSERT INTO `` (`idcar`,`model`,`mark`,`color`,`driver_iddriver`,`car_number`) VALUES (10,'x3','bmw','gray',9,'bc2310rs');

INSERT INTO `` (`idrating`,`stars`) VALUES (1,5);
INSERT INTO `` (`idrating`,`stars`) VALUES (2,3);
INSERT INTO `` (`idrating`,`stars`) VALUES (3,3);
INSERT INTO `` (`idrating`,`stars`) VALUES (4,2);
INSERT INTO `` (`idrating`,`stars`) VALUES (5,1);
INSERT INTO `` (`idrating`,`stars`) VALUES (6,4);
INSERT INTO `` (`idrating`,`stars`) VALUES (7,5);
INSERT INTO `` (`idrating`,`stars`) VALUES (8,2);
INSERT INTO `` (`idrating`,`stars`) VALUES (9,3);
INSERT INTO `` (`idrating`,`stars`) VALUES (10,4);

INSERT INTO `` (`idroute`,`start`,`end`,`data`,`price`,`user_iduser`,`driver_iddriver`) VALUES (1,'london','london','01.02.2001',67,1,2);
INSERT INTO `` (`idroute`,`start`,`end`,`data`,`price`,`user_iduser`,`driver_iddriver`) VALUES (2,'london','poland','01.02.2001',555,1,1);
INSERT INTO `` (`idroute`,`start`,`end`,`data`,`price`,`user_iduser`,`driver_iddriver`) VALUES (3,'london','london','01.02.2001',453,2,3);
INSERT INTO `` (`idroute`,`start`,`end`,`data`,`price`,`user_iduser`,`driver_iddriver`) VALUES (4,'germany','london','01.02.2001',234,3,4);
INSERT INTO `` (`idroute`,`start`,`end`,`data`,`price`,`user_iduser`,`driver_iddriver`) VALUES (5,'simferopol','germany','01.02.2001',43,4,5);
INSERT INTO `` (`idroute`,`start`,`end`,`data`,`price`,`user_iduser`,`driver_iddriver`) VALUES (6,'germany','london','01.02.2001',234,5,6);
INSERT INTO `` (`idroute`,`start`,`end`,`data`,`price`,`user_iduser`,`driver_iddriver`) VALUES (7,'schyrets','lviv','01.02.2001',123,6,7);
INSERT INTO `` (`idroute`,`start`,`end`,`data`,`price`,`user_iduser`,`driver_iddriver`) VALUES (8,'italy','germany','01.02.2001',222,7,8);
INSERT INTO `` (`idroute`,`start`,`end`,`data`,`price`,`user_iduser`,`driver_iddriver`) VALUES (9,'germany','london','01.02.2001',134,8,9);
INSERT INTO `` (`idroute`,`start`,`end`,`data`,`price`,`user_iduser`,`driver_iddriver`) VALUES (10,'germany','germany','01.02.2001',665,9,10);

INSERT INTO `` (`iduser`,`name`,`surname`,`age`,`gender`) VALUES (1,'joe','qwerty',15,'male');
INSERT INTO `` (`iduser`,`name`,`surname`,`age`,`gender`) VALUES (2,'bol','ytrewq',23,'male');
INSERT INTO `` (`iduser`,`name`,`surname`,`age`,`gender`) VALUES (3,'bil','wqe',42,'neutral gender');
INSERT INTO `` (`iduser`,`name`,`surname`,`age`,`gender`) VALUES (4,'bob','rqw',65,'female');
INSERT INTO `` (`iduser`,`name`,`surname`,`age`,`gender`) VALUES (5,'rob','qwe',43,'male');
INSERT INTO `` (`iduser`,`name`,`surname`,`age`,`gender`) VALUES (6,'nick','sae',23,'female');
INSERT INTO `` (`iduser`,`name`,`surname`,`age`,`gender`) VALUES (7,'ash','qwes',43,'male');
INSERT INTO `` (`iduser`,`name`,`surname`,`age`,`gender`) VALUES (8,'kayle','wrdg',12,'female');
INSERT INTO `` (`iduser`,`name`,`surname`,`age`,`gender`) VALUES (9,'ihor','aweq',32,'male');
INSERT INTO `` (`iduser`,`name`,`surname`,`age`,`gender`) VALUES (10,'sem','xfdw',45,'female');