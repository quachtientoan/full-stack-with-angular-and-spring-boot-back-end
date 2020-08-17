-- todo
insert into todo(id, username,description,target_date,is_done)
values(10001, 'admin', 'Learn JPA', sysdate(), false);

insert into todo(id, username,description,target_date,is_done)
values(10002, 'admin', 'Learn Data JPA', sysdate(), false);

insert into todo(id, username,description,target_date,is_done)
values(10003, 'admin', 'Learn Microservices', sysdate(), false);

-- customer
insert into CUSTOMER(id, name,branch,created_date,age)
values(10001, 'toanqt', 'NHS', sysdate(), 27);

insert into CUSTOMER(id, name,branch,created_date,age)
values(10002, 'Hungnc', 'NHS', sysdate(), 27);

insert into CUSTOMER(id, name,branch,created_date,age)
values(10003, 'abc', 'NHS', sysdate(), 27);

-- user
insert into USER(id, username,password,email,role)
values(10001,'admin', '$2a$10$Iz51LzCXVqPs6idmYDFVGORITFGw5ygvTf3dZmiWQlMvaucSdLAwK', 'admin@bidv.com.vn', 'ADMIN');

-- source account
insert into SOURCE_ACCOUNT(id, name, account_number)
values(10001,'ADMIN','19394838929292');
insert into SOURCE_ACCOUNT(id, name, account_number)
values(10002,'TOANQT','848299294949484');

-- bank
insert into BANK(id, name)
values(10001,'BIDV');
insert into BANK(id, name)
values(10002,'VIETCOMBANK');
insert into BANK(id, name)
values(10003,'VIETINBANK');
insert into BANK(id, name)
values(10004,'TPBANK');

-- recipient account
insert into RECIPIENT_ACCOUNT(id, name,account_number)
values(10001,'NGUYEN VAN A', '12349584949403');
insert into RECIPIENT_ACCOUNT(id, name,account_number)
values(10002,'TRAN VAN B', '0003984929220949');
-- money tranfer list
--drop table if exists money_tranfer_view; 
--CREATE VIEW MONEY_TRANFER_VIEW
--AS
--SELECT m.id, m.amount,m.content,m.money_tranfer_date,m.payer, b.name as bank_name, r.name as recipient_account_name, s.name as source_account_name FROM MONEY_TRANFER m 
--LEFT JOIN BANK b  ON m.bank_id = b.id
--LEFT JOIN RECIPIENT_ACCOUNT r ON m.recipient_account_id = r.id
--LEFT JOIN SOURCE_ACCOUNT s ON m.source_account_id = s.id;

-- money tranfer
insert into MONEY_TRANFER(id, amount,content, money_tranfer_date,payer,bank_id,recipient_account_id,source_account_id,status)
values(10001, 133333, '111111', null,'Sender',10004,10001,10002,'1');

insert into MONEY_TRANFER(id, amount,content, money_tranfer_date,payer,bank_id,recipient_account_id,source_account_id,status)
values(10002, 133333, '111111', null,'Sender',10004,10001,10002,'1');

insert into MONEY_TRANFER(id, amount,content, money_tranfer_date,payer,bank_id,recipient_account_id,source_account_id,status)
values(10003, 133333, '111111', null,'Sender',10004,10001,10002,'1');

insert into MONEY_TRANFER(id, amount,content, money_tranfer_date,payer,bank_id,recipient_account_id,source_account_id,status)
values(10004, 133333, '111111', null,'Sender',10004,10001,10002,'1');

insert into MONEY_TRANFER(id, amount,content, money_tranfer_date,payer,bank_id,recipient_account_id,source_account_id,status)
values(10005, 133333, '111111', null,'Sender',10004,10001,10002,'1');

 	