  INSERT INTO tb_user (name,  email, password) VALUES ('Alex', 'alex@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
  INSERT INTO tb_user (name,  email, password) VALUES ('Bob', 'bob@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
  INSERT INTO tb_user (name,  email, password) VALUES ('Maria', 'maria@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

  INSERT INTO tb_role (authority) VALUES ('ROLE_STUDENT');
  INSERT INTO tb_role (authority) VALUES ('ROLE_INSTRUCTOR');
  INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

  INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
  INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
  INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);
  INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 1);
  INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 2);
  INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 3);


  INSERT INTO tb_course(name, img_Uri,img_Gray_Uri) values('BootcampHTML','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSB5CkBV3OkZnA0LVgC-lwgxhEA9BjWPRoyEw&usqp=CAU','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQMXFw2oxIAsiatiCF9aAMc-AnsC-4bnwCnhho0eTH2enlCrgRrhlmSfi1C3JeCCNMb-fM&usqp=CAU');
  INSERT INTO tb_offer (edition, start_Moment, end_Moment, course_id) values ('1.0',TIMESTAMP WITH TIME ZONE '2020-07-13T20:50:07.12345Z','2021-07-13T20:50:07.12345Z',1);
  INSERT INTO tb_offer (edition, start_Moment, end_Moment, course_id) values ('2.0',TIMESTAMP WITH TIME ZONE '2020-09-13T20:50:07.12345Z','2021-09-13T20:50:07.12345Z',1);

  INSERT INTO tb_resource (title, description, position, img_Uri, type, offer_id) values ('Trilha HTML', 'Trilha principal do curso', 1,'https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcRyCxq8BenE16h5QaKuFOSiKNAy78nzcTokscIDWMLkKWe30iOi',1,1);
  INSERT INTO tb_resource (title, description, position, img_Uri, type, offer_id) values ('Forum', 'Forum de duvidas', 2,'https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcRyCxq8BenE16h5QaKuFOSiKNAy78nzcTokscIDWMLkKWe30iOi',2,1);
  INSERT INTO tb_resource (title, description, position, img_Uri, type, offer_id) values ('Lives', 'Lives Publico', 3,'https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcRyCxq8BenE16h5QaKuFOSiKNAy78nzcTokscIDWMLkKWe30iOi',0,1);

  INSERT INTO tb_section(title,description, position, img_Uri, resource_id, prerequisite_id) values('Capitulo 1','Neste Capitulo  vamos começar',1,'https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcRyCxq8BenE16h5QaKuFOSiKNAy78nzcTokscIDWMLkKWe30iOi',1,null);
  INSERT INTO tb_section(title,description, position, img_Uri, resource_id, prerequisite_id) values('Capitulo 2','Neste Capitulo  vamos continuar',2,'https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcRyCxq8BenE16h5QaKuFOSiKNAy78nzcTokscIDWMLkKWe30iOi',1,null);
  INSERT INTO tb_section(title,description, position, img_Uri, resource_id, prerequisite_id) values('Capitulo 3','Neste Capitulo  vamos finalizar',3,'https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcRyCxq8BenE16h5QaKuFOSiKNAy78nzcTokscIDWMLkKWe30iOi',1,null);