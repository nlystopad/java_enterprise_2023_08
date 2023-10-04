create sequence authorities_seq start with 1 increment by 50;
create sequence users_seq start with 1 increment by 50;
create table authorities (id bigint not null, user_id bigint, authority varchar(255), primary key (id));
create table users (enabled boolean not null, expires timestamp(6), id bigint not null, password varchar(255), token varchar(255), username varchar(255), primary key (id));
alter table if exists authorities add constraint FKk91upmbueyim93v469wj7b2qh foreign key (user_id) references users;
