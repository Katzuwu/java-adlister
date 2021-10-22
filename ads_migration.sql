use adlister_db;

drop table if exists ads;

create table ads(
                    id int unsigned not null auto_increment,
                    user_id int unsigned not null,
                    title varchar(140),
                    description text,
                    PRIMARY KEY (id),
                    FOREIGN KEY (user_id) REFERENCES users (id)
);