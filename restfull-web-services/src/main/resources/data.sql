insert into todo(id, username,description,target_date,is_done)
values(10001, 'admin', 'Learn JPA', sysdate(), false);

insert into todo(id, username,description,target_date,is_done)
values(10002, 'admin', 'Learn Data JPA', sysdate(), false);

insert into todo(id, username,description,target_date,is_done)
values(10003, 'admin', 'Learn Microservices', sysdate(), false);

insert into CUSTOMER(id, name,branch,created_date,age)
values(10001, 'toanqt', 'NHS', sysdate(), 27);

insert into CUSTOMER(id, name,branch,created_date,age)
values(10002, 'Hungnc', 'NHS', sysdate(), 27);

insert into CUSTOMER(id, name,branch,created_date,age)
values(10003, 'abc', 'NHS', sysdate(), 27);

insert into USER(id, username,password,email,role)
values(10001,'admin', '$2a$10$Iz51LzCXVqPs6idmYDFVGORITFGw5ygvTf3dZmiWQlMvaucSdLAwK', 'admin@bidv.com.vn', 'ADMIN');

--insert into USER(id, password,role,token,username)
--values(10001, 'admin', 'ADMIN', '', 'admin');