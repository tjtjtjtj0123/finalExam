DELETE FROM ARTIST;
DELETE FROM COMPANY;

INSERT INTO COMPANY VALUES (500, 'YG','황보경','서울특별시 마포구 희우정로1길 3','2011-11-23','https://www.ygfamily.com/');
INSERT INTO COMPANY VALUES (501, 'SM','이성수','서울특별시 강남구 압구정로 423','1989-02-14','https://www.smentertainment.com/');

INSERT INTO ARTIST VALUES (artistId.nextval,'BIGBANG','2006', 500,'댄스, 힙합, R&B','G-DRAGON, T.O.P, 태양, 대성');
INSERT INTO ARTIST VALUES (artistId.nextval,'AKMU','2012', 500,'K-pop, 포크','이찬혁, 이수현');
INSERT INTO ARTIST VALUES (artistId.nextval,'ICON','2012', 500,'랩, 힙합, 댄스, 발라드','김진환, 송윤형, 김동혁, 구준회, 정찬우, BOBBY');
INSERT INTO ARTIST VALUES (artistId.nextval,'SHINee','2008', 501,'댄스, 팝', '민호, 온유, Key, 태민');
INSERT INTO ARTIST VALUES (artistId.nextval,'Red Velvet','2014', 501,'K-pop, 댄스, 랩, 힙합, R&B', '아이린, 슬기, 웬디, 조이, 예리');

commit;

select * from artist;