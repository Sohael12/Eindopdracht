INSERT INTO Sporthall (id, Zaalnaam, locatie, capaciteit, beschrijving, image_Url, tarief, kleedkamers)
VALUES
    (1, 'Sporthal Luchtbal', 'Santiagostraat 2, 2030 Antwerpen', 60, 'In deze sporthal kan je terecht voor badminton, baseball, basketbal, handbal, volleybal, zaalvoetbal en vechtsport.', 'https://firebasestorage.googleapis.com/v0/b/zaalfindr.appspot.com/o/sporthalluchtbal.jpg?alt=media&token=21093490-bc30-4409-8706-265ec5eadece', 8, true),
    (2, 'Sporthal Plantin Moretus - Borgerhout', 'Plantin en Moretuslei 343, 2140 Antwerpen', 60, 'In deze sporthal kan je terecht voor badminton, baseball, basketbal, gehandicaptensport, handbal, korfbal, tennis, volleybal en zaalvoetbal.', 'https://firebasestorage.googleapis.com/v0/b/zaalfindr.appspot.com/o/borgerhout.jpg?alt=media&token=16dba92c-18c2-4f61-8c95-34d41f26c679', 12, true),
    (3, 'Sporthal IGLO', 'Louis Paul Boon Straat 41, 2050 Antwerpen', 50, 'In deze sporthal kan je terecht voor zaalvoetbal, handbal, basketbal, badminton, volleybal. Er is geen supportersruimte voorzien.', 'https://firebasestorage.googleapis.com/v0/b/zaalfindr.appspot.com/o/iglo.jpg?alt=media&token=7655a4ed-9e96-4517-9e5b-273cd6ae1f9b', 12, true),
    (4, 'Sporthal Linkeroever', 'Blancefloerlaan 183, 2050 Antwerpen', 50, 'In deze sporthal kan je terecht voor badminton, basketbal, handbal, korfbal, tafeltennis, volleybal en zaalvoetbal.', 'https://firebasestorage.googleapis.com/v0/b/zaalfindr.appspot.com/o/linkroever.jpg?alt=media&token=134368fc-6c47-429b-aa2b-3074d81fd9bb', 12, true),
    (5, 'Sporthal Parkloods', 'Damplein 36, 2060 Antwerpen', 50, 'Je kan in deze sporthal terecht voor zaalvoetbal, basketbal, badminton, vechtsporten, gymnastiek en volleybal.', 'https://firebasestorage.googleapis.com/v0/b/zaalfindr.appspot.com/o/Sporthal%20Parkloods.jpg?alt=media&token=c83edb64-9e08-457c-9ebd-d23e34667772', 12, true),
    (6, 'Sporthal Arena', 'Arenaplein 1, 2100 Antwerpen', 50, 'In deze sporthal kan u terecht voor basketbal en volleybal.', 'https://www.volley-brabo-antwerp.be/wp-content/uploads/2023/01/IMG_7249-kopie-825x500.jpg', 18, false),
    (7, 'Sporthal De Rode Loop', 'Rodeloopstraat 2, 2170 Antwerpen', 50, 'In sporthal De Rode Loop kan je terecht voor basketbal, handbal, korfbal, tennis, volleybal en zaalvoetbal. In de vechtsportzaal kan je onder meer judo, karate en jiu jitsu beoefenen', 'https://firebasestorage.googleapis.com/v0/b/zaalfindr.appspot.com/o/rodeloop.jpg?alt=media&token=a01d99c6-1f2f-47ca-a03f-c3a2bf1e9e4c', 24, true),
    (8, 'Sporthal Het Rooi in Berchem', 'Rodeloopstraat 2, 2170 Antwerpen', 30, 'In sporthal Het Rooi kunt u terecht voor badminton, basketbal, handbal, korfbal, tennis, volleybal, zaalvoetbal in de grote zaal. Er is ook een kleinere zaal waar u kan turnen, tafeltennissen en schermen.', 'https://firebasestorage.googleapis.com/v0/b/zaalfindr.appspot.com/o/Berchem.jpg?alt=media&token=411ca717-5172-4194-9120-869675dd0c49', 22, true),
    (9, 'Sporthal De Rode Loop - Merksem', 'Rodeloopstraat 2, 2170 Antwerpen', 35, 'In sporthal De Rode Loop kan je terecht voor basketbal, handbal, korfbal, tennis, volleybal en zaalvoetbal. In de vechtsportzaal kan je onder meer judo, karate en jiu jitsu beoefenen.', 'https://firebasestorage.googleapis.com/v0/b/zaalfindr.appspot.com/o/Sporthal%20De%20Rode%20Loop%20-%20Merksem.jpg?alt=media&token=5c4a53f0-4b19-457f-86bf-dbae70e7f622', 10, true),
    (10, 'Sporthal Kiel - Antwerpen', 'Emiel Vloorsstraat 2, 2020 Antwerpen', 22, 'In sporthal De Rode Loop kan je terecht voor basketbal, handbal, korfbal, tennis, volleybal en zaalvoetbal. In de vechtsportzaal kan je onder meer judo, karate en jiu jitsu beoefenen.', 'https://firebasestorage.googleapis.com/v0/b/zaalfindr.appspot.com/o/Sporthal%20Kiel.jpg?alt=media&token=fc18b61d-628b-415f-a02e-43c5c355662d', 14, true),
    (11, 'Sporthal Fort VIII Hoboken', 'Hoofdfrontweg 9, 2660 Hoboken', 35, 'In deze sporthal kan je terecht voor atletiek, badminton, baseball, handbal, korfbal, volleybal en zaalvoetbal.', 'https://firebasestorage.googleapis.com/v0/b/zaalfindr.appspot.com/o/Sporthal-Fort-VIII-2.jpg?alt=media&token=1e013bdf-76f1-4543-a39c-e1c93807b199', 16, true),
    (12, 'Sporthal Wilrijkse Plein - Antwerpen', 'Vogelzanglaan 6, 2020 Antwerpen', 35, 'In deze sporthal kunt u terecht voor basketbal, volleybal, zaalvoetbal, korfbal, handbal en badminton. Voor turnen en bewegingsonderwijs moet u in de kleine zaal zijn.', 'https://firebasestorage.googleapis.com/v0/b/zaalfindr.appspot.com/o/wilrijkseplein.jpg?alt=media&token=61b164a2-c0ac-4927-abbb-8ed343cd2ea7', 18, false);
INSERT INTO Sporthalluser (id, username, password, email, firstname, lastname ,image_Url)
VALUES
    (1, 'Jan', 'wachtwoord1', 'gebruiker1@example.com', 'Jan', 'Achternaam1','https://firebasestorage.googleapis.com/v0/b/zaalfindr.appspot.com/o/persoon1.jpeg?alt=media&token=c7dd22a6-a227-4b96-9be3-e06ef69dbff6'),
    (2, 'Sarah', 'wachtwoord2', 'gebruiker2@example.com', 'Sarah', 'Achternaam2' ,'https://firebasestorage.googleapis.com/v0/b/zaalfindr.appspot.com/o/persoon2.jpg?alt=media&token=0e921607-e267-4bc5-8b1c-e57d869338cd'),
    (3, 'Michelle', 'wachtwoord3', 'gebruiker3@example.com', 'Michelle', 'Achternaam3','https://firebasestorage.googleapis.com/v0/b/zaalfindr.appspot.com/o/persoon3.jpg?alt=media&token=10572cb3-c8d3-4bf3-bd4e-aaf7103ace8f'),
    (4, 'Bart', 'wachtwoord4', 'gebruiker4@example.com', 'Bart', 'Achternaam4','https://firebasestorage.googleapis.com/v0/b/zaalfindr.appspot.com/o/persoon4.jpg?alt=media&token=865f005b-da0f-4e2d-9ed8-2e97babf68ef'),
    (5, 'Yannick', 'wachtwoord5', 'gebruiker5@example.com', 'Yannick', 'Achternaam5','https://firebasestorage.googleapis.com/v0/b/zaalfindr.appspot.com/o/persoon5.jpg?alt=media&token=b449728b-1ae7-4aef-a60b-8f5c8657df88'),
    (6, 'Sanna', 'wachtwoord6', 'gebruiker6@example.com', 'Sanna', 'Achternaam6','https://firebasestorage.googleapis.com/v0/b/zaalfindr.appspot.com/o/persoon6.jpg?alt=media&token=fcac12fe-54c1-465b-a258-9a9dcf7fc0af');



INSERT INTO Reservation (id, status, opmerkingen ,user_Id,sporthall_ID)
VALUES
    (1,  'Bevestigd', 'Geen opmerkingen',2,6),
    (2,  'In afwachting', 'Gelieve te bevestigen',4,4),
    (3,  'Geannuleerd', 'Klant heeft geannuleerd',5,5),
    (4,  'Bevestigd', 'Geen opmerkingen',3,10),
    (5, 'In afwachting', 'Wacht op bevestiging van manager',2,3),
    (6, ' Bevestigd', 'Wacht op bevestiging van manager',1,2);




INSERT INTO equipment (id, artikel, prijs, sport, merk, beschikbaar, image_Url)
VALUES
    (1, 'Voetbal', 5.0, 'Voetbal', 'Adidas', true, 'https://firebasestorage.googleapis.com/v0/b/zaalfindr.appspot.com/o/Voetbal.jpg?alt=media&token=5ccbe5aa-ae9b-4a0e-abaa-daa5d5242cdb'),
    (2, 'Tennisracket', 10.0, 'Tennis', 'Wilson', true, 'https://firebasestorage.googleapis.com/v0/b/zaalfindr.appspot.com/o/Tennisracket.jpg?alt=media&token=317a072a-7aee-46d1-a5a3-4191ce97715b'),
    (3, 'Yoga Mat', 4.0, 'Yoga', 'Gaiam', true, 'https://firebasestorage.googleapis.com/v0/b/zaalfindr.appspot.com/o/yoga.jpg?alt=media&token=d29fa420-6960-4145-9327-87b971863758'),
    (5, 'Basketbal', 6.0, 'Basketbal', 'Spalding', true, 'https://firebasestorage.googleapis.com/v0/b/zaalfindr.appspot.com/o/Basketbal.jpg?alt=media&token=52e5890e-be11-45cc-b838-30b9025cbec3'),
    (8, 'Squashracket', 9.0, 'Squash', 'Head', true, 'https://firebasestorage.googleapis.com/v0/b/zaalfindr.appspot.com/o/Squashracket.jpg?alt=media&token=bb19d27f-225b-445b-b75e-c99581c26b7c'),
    (9, 'Badmintonracket', 7.0, 'Badminton', 'Yonex', true, 'https://firebasestorage.googleapis.com/v0/b/zaalfindr.appspot.com/o/Badmintonracket.jpg?alt=media&token=c46ff513-c46d-4cd5-97d4-8f26392e87f5'),
    (10, 'Bokshandschoenen', 11.0, 'Boksen', 'Everlast', true, 'https://firebasestorage.googleapis.com/v0/b/zaalfindr.appspot.com/o/Bokshandschoenen.jpg?alt=media&token=5cde63f5-3b7d-446e-b26f-02c017c15328'),
    (11, 'Hockey stick', 8.0, 'Hockey', 'Grays', true, 'https://firebasestorage.googleapis.com/v0/b/zaalfindr.appspot.com/o/Hockeystick.jpg?alt=media&token=e9b4191e-415b-4024-b19c-d50c522af5e3');

INSERT INTO USERS (USERNAME, PASSWORD, ENABLED)
VALUES ('admin', '$2a$10$9MIX8kYPkuB7uE/H5nHF8.KG6.YdjBA/voOnjSZnZDxLXL/2BIerS', true);
INSERT INTO AUTHORITIES (USERNAME, AUTHORITY)
VALUES ('admin', 'ADMIN');
INSERT INTO USERS (USERNAME, PASSWORD, ENABLED)
VALUES ('marie', '$2a$10$9TeBFudS7HsgCa4sSvP//O627sMq.KiTFrOr8IzrVlYw5c8aoKzNm', true);
INSERT INTO AUTHORITIES (USERNAME, AUTHORITY)
VALUES ('marie', 'USER');




-- the party animal users:
INSERT INTO USERS (USERNAME, PASSWORD, ENABLED)
VALUES ('giraf', '$2a$10$9TeBFudS7HsgCa4sSvP//O627sMq.KiTFrOr8IzrVlYw5c8aoKzNm', true);
INSERT INTO AUTHORITIES (USERNAME, AUTHORITY)
VALUES ('giraf', 'USER');







