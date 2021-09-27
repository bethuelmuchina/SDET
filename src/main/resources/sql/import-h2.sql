-- password in plaintext: "password"
INSERT INTO USER (user_id, password, email, username, name, last_name, active)
VALUES
  (1, '$2a$06$OAPObzhRdRXBCbk7Hj/ot.jY3zPwR8n7/mfLtKIgTzdJa4.6TwsIm', 'user@mail.com', 'user', 'Name', 'Surname',
   1);
-- password in plaintext: "password"
INSERT INTO USER (user_id, password, email, username, name, last_name, active)
VALUES
  (2, '$2a$06$OAPObzhRdRXBCbk7Hj/ot.jY3zPwR8n7/mfLtKIgTzdJa4.6TwsIm', 'johndoe@gmail.com', 'johndoe', 'John', 'Doe', 1);
-- password in plaintext: "password"
INSERT INTO USER (user_id, password, email, username, name, last_name, active)
VALUES (3, '$2a$06$OAPObzhRdRXBCbk7Hj/ot.jY3zPwR8n7/mfLtKIgTzdJa4.6TwsIm', 'name@gmail.com', 'namesurname', 'Name',
        'Surname', 1);

INSERT INTO ROLE (role_id, role)
VALUES (1, 'ROLE_ADMIN');
INSERT INTO ROLE (role_id, role)
VALUES (2, 'ROLE_USER');

INSERT INTO USER_ROLE (user_id, role_id)
VALUES (1, 1);
INSERT INTO USER_ROLE (user_id, role_id)
VALUES (1, 2);
INSERT INTO USER_ROLE (user_id, role_id)
VALUES (2, 2);
INSERT INTO USER_ROLE (user_id, role_id)
VALUES (3, 2);

INSERT INTO PRODUCT (name, description, quantity, price)
VALUES ('SunRice Basmati', '2KG', 1, 350.00);
INSERT INTO PRODUCT (name, description, quantity, price)
VALUES ('FreshFri Vegetable Oil', '2L', 5, 300.00);
INSERT INTO PRODUCT (name, description, quantity, price)
VALUES ('Soko Ugali', '1Kg', 3, 100.00);
INSERT INTO PRODUCT (name, description, quantity, price)
VALUES ('Kensalt', '1kg', 40, 10.00);
INSERT INTO PRODUCT (name, description, quantity, price)
VALUES ('Keringet Water', '1L', 80, 50.00);
INSERT INTO PRODUCT (name, description, quantity, price)
VALUES ('OMO', '500grams', 800, 25.00);
INSERT INTO PRODUCT (name, description, quantity, price)
VALUES ('Passion Juice', '1L', 700, 400.00);
INSERT INTO PRODUCT (name, description, quantity, price)
VALUES ('Shampoo', 'Head and Shoulders Shampoo', 500, 300.00);
INSERT INTO PRODUCT (name, description, quantity, price)
VALUES ('BlueBand', '500grams', 1000, 50.00);
INSERT INTO PRODUCT (name, description, quantity, price)
VALUES ('Jam', '500grams', 10, 85.00);