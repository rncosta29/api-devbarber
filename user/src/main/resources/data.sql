INSERT INTO tb_user (name, email, password) VALUES ('Rafael', 'rafa@teste.com', '123456');
INSERT INTO tb_user (name, email, password) VALUES ('Maria', 'maria@teste.com', '123456');
INSERT INTO tb_user (name, email, password) VALUES ('Alex', 'alex@teste.com', '123456');

INSERT INTO tb_role (role_name) VALUES ('ROLE_OPERATOR');
INSERT INTO tb_role (role_name) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 1);