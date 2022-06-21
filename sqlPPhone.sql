CREATE TABLE role(
	role_id serial not null  primary key,
	role_name varchar(100) not null
);

CREATE TABLE account(
	account_id serial not null  primary key,
	account_email varchar(100) not null,
	account_password varchar(100) not null,
	account_createat timestamp not null,
	account_updateat timestamp not null,
	role_id int not null,
	constraint fk_role_id_account_role foreign key (role_id) references role(role_id)
);

CREATE TABLE accountinfo(
	accountinfo_id serial not null  primary key,
	accountinfo_name varchar(100) not null,
	accountinfo_phone varchar(100) not null,
	account_id int not null,
	constraint fk_account_id_accountinfo_account foreign key (account_id) references account(account_id)
);


CREATE TABLE category(
	category_id serial not null  primary key,
	category_name varchar(100) not null
);

CREATE TABLE product(
	product_id serial not null  primary key,
	product_name varchar(100) not null,
	product_image varchar(100) not null,
	product_price varchar(100) not null,
	product_countinstock int not null,
	product_isselling boolean not null,
	product_createat timestamp not null,
	product_updateat timestamp not null,
	category_id int not null,
	constraint fk_category_id_product_category foreign key (category_id) references category(category_id)
);

CREATE TABLE orders(
	orders_id serial not null  primary key,
	orders_date timestamp not null,
	orders_total decimal(15,0) not null,
	account_id int not null,
	constraint fk_account_id_order_account foreign key (account_id) references account(account_id)
);

CREATE TABLE orderdetails(
	orderdt_id serial not null  primary key,
	orderdt_name varchar(100) not null,
	orderdt_qty int not null,
	orderdt_price decimal(15,0) not null,
	product_id int not null,
	category_id int not null,
	constraint fk_product_id_id_orderdetail_product foreign key (product_id) references product(product_id),
	constraint fk_category_id_orderdetail_category foreign key (category_id) references category(category_id)
);

CREATE TABLE review(
	review_id serial not null  primary key,
	review_rating varchar(100),
	review_comment varchar(5000),
	review_createat varchar(100) not null,
	product_id int not null,
	account_id int not null,
	constraint fk_product_id_review_product foreign key (product_id) references product(product_id),
	constraint fk_account_id_review_account foreign key (account_id) references account(account_id)
);



