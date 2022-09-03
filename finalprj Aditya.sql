create database finalprj;

use finalprj;

Create table users (user_id int Auto_increment NOT NULL Primary Key, user_name varchar(100) Not Null, email_id varchar(100) Not Null Unique);
Create table movie (movie_id INT Auto_increment NOT NULL Primary Key, movie_name varchar(100) Not Null, Summary varchar(500), cast varchar(200), Genre varchar(200), Average_rating float, user_id int, FOREIGN KEY (user_id) REFERENCES users(user_id));
Create table review (review_id INT Auto_increment NOT NULL Primary Key, movie_id  int not Null, Review varchar(500), user_id int, FOREIGN KEY (user_id) REFERENCES users(user_id));
Create table rating (rating_id INT Auto_increment NOT NULL Primary Key, movie_id int not Null, Rating int , user_id int, FOREIGN KEY (user_id) REFERENCES users(user_id));

insert into users (user_id, user_name, email_id) values (1, 'admin', 'admin@example.com');
select * from users;
