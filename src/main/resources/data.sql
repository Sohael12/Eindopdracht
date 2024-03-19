INSERT INTO zaal (id, Zaalnaam, locatie, capaciteit, beschrijving, image, tarief, kleedkamers)
VALUES
    (1, 'Sporthal Luchtbal', 'Santiagostraat 2, 2030 Antwerpen', 60, 'In deze sporthal kan je terecht voor badminton, baseball, basketbal, handbal, volleybal, zaalvoetbal en vechtsport.', '/images/sporthalluchtbal.jpg', 8, true),
    (2, 'Sporthal Plantin Moretus - Borgerhout', 'Plantin en Moretuslei 343, 2140 Antwerpen', 60, 'In deze sporthal kan je terecht voor badminton, baseball, basketbal, gehandicaptensport, handbal, korfbal, tennis, volleybal en zaalvoetbal.', 'https://i0.wp.com/www.regionoordkop.nl/wp-content/uploads/2023/05/20230512_2-scaled-e1684045880864.jpg?fit=1920%2C1156&ssl=1', 12, true),
    (3, 'Sporthal IGLO', 'Louis Paul Boon Straat 41, 2050 Antwerpen', 50, 'In deze sporthal kan je terecht voor zaalvoetbal, handbal, basketbal, badminton, volleybal. Er is geen supportersruimte voorzien.', 'https://pixii.be/sites/default/files/styles/colorbox_full/public/20160909_110759.jpg?itok=dSLAriZ8', 12, true),
    (4, 'Sporthal Linkeroever', 'Blancefloerlaan 183, 2050 Antwerpen', 50, 'In deze sporthal kan je terecht voor badminton, basketbal, handbal, korfbal, tafeltennis, volleybal en zaalvoetbal.', '/images/linkroever.jpg', 12, true),
    (5, 'Sporthal Parkloods', 'Damplein 36, 2060 Antwerpen', 50, 'Je kan in deze sporthal terecht voor zaalvoetbal, basketbal, badminton, vechtsporten, gymnastiek en volleybal.', '/images/Sporthal Parkloods.jpg', 12, true),
    (6, 'Sporthal Arena', 'Arenaplein 1, 2100 Antwerpen', 50, 'In deze sporthal kan u terecht voor basketbal en volleybal.', 'https://www.volley-brabo-antwerp.be/wp-content/uploads/2023/01/IMG_7249-kopie-825x500.jpg', 18, false),
    (7, 'Sporthal De Rode Loop', 'Rodeloopstraat 2, 2170 Antwerpen', 50, 'In sporthal De Rode Loop kan je terecht voor basketbal, handbal, korfbal, tennis, volleybal en zaalvoetbal. In de vechtsportzaal kan je onder meer judo, karate en jiu jitsu beoefenen', 'https://www.lennik.be/imagecache/1EDA418AA3A548B007BE3E13C53F469B/13829.jpg?w=900&h=800', 24, true),
    (8, 'Sporthal Het Rooi in Berchem', 'Rodeloopstraat 2, 2170 Antwerpen', 30, 'In sporthal Het Rooi kunt u terecht voor badminton, basketbal, handbal, korfbal, tennis, volleybal, zaalvoetbal in de grote zaal. Er is ook een kleinere zaal waar u kan turnen, tafeltennissen en schermen.', '/images/Berchem.jpg', 22, true),
    (9, 'Sporthal De Rode Loop - Merksem', 'Rodeloopstraat 2, 2170 Antwerpen', 35, 'In sporthal De Rode Loop kan je terecht voor basketbal, handbal, korfbal, tennis, volleybal en zaalvoetbal. In de vechtsportzaal kan je onder meer judo, karate en jiu jitsu beoefenen.', '/images/Sporthal De Rode Loop - Merksem.jpg', 10, true),
    (10, 'Sporthal Kiel - Antwerpen', 'Emiel Vloorsstraat 2, 2020 Antwerpen', 22, 'In sporthal De Rode Loop kan je terecht voor basketbal, handbal, korfbal, tennis, volleybal en zaalvoetbal. In de vechtsportzaal kan je onder meer judo, karate en jiu jitsu beoefenen.', '/images/Sporthal Kiel.jpg', 14, true),
    (11, 'Sporthal Fort VIII Hoboken', 'Hoofdfrontweg 9, 2660 Hoboken', 35, 'In deze sporthal kan je terecht voor atletiek, badminton, baseball, handbal, korfbal, volleybal en zaalvoetbal.', '/images/Sporthal-Fort-VIII-2.jpg', 16, true),
    (12, 'Sporthal Wilrijkse Plein - Antwerpen', 'Vogelzanglaan 6, 2020 Antwerpen', 35, 'In deze sporthal kunt u terecht voor basketbal, volleybal, zaalvoetbal, korfbal, handbal en badminton. Voor turnen en bewegingsonderwijs moet u in de kleine zaal zijn.', '/images/wilrijkseplein.jpg', 18, false);
INSERT INTO zaaluser (id, username, password, email)
VALUES
    (1, 'gebruiker1', 'wachtwoord1',  'gebruiker1@example.com'),
    (2, 'gebruiker2', 'wachtwoord2', 'gebruiker2@example.com'),
    (3, 'gebruiker3', 'wachtwoord3', 'gebruiker3@example.com'),
    (4, 'gebruiker4', 'wachtwoord4',  'gebruiker4@example.com'),
    (5, 'gebruiker5', 'wachtwoord5', 'gebruiker5@example.com');



INSERT INTO Reservatie (id, status, opmerkingen ,user_Id,zaal_ID)
VALUES
    (1,  'Bevestigd', 'Geen opmerkingen',2,6),
    (2,  'In afwachting', 'Gelieve te bevestigen',1,4),
    (3,  'Geannuleerd', 'Klant heeft geannuleerd',1,5),
    (4,  'Bevestigd', 'Geen opmerkingen',3,10),
    (5, 'In afwachting', 'Wacht op bevestiging van manager',2,3);



INSERT INTO ZAALUSER_ZAALS  (USERS_ID,ZAALS_ID )
VALUES
    (1,6),
    (2,4),
    (3,5),
    (4,5),
    (5,3);


INSERT INTO BICYCLE_PARKING(ID, NAME, STREET, NUMBER, PRICE_PER_DAY_IN_EUR, RAIN_PROOF, GUARDED, NUMBER_OF_PLACES,
                            NUMBER_OF_PLACES_FREE)
VALUES (1, 'Centraal Park Fietsenstalling', 'Brusselsesteenweg', '123', 5.99, true, false, 100, 50);

INSERT INTO BICYCLE_PARKING (ID, NAME, STREET, NUMBER, PRICE_PER_DAY_IN_EUR, RAIN_PROOF, GUARDED, NUMBER_OF_PLACES,
                             NUMBER_OF_PLACES_FREE)
VALUES (2, 'Fietsen Haven', 'Oscar Van Kesbeeckstraat', '45', 8.99, false, true, 80, 10);

INSERT INTO BICYCLE_PARKING (ID, NAME, STREET, NUMBER, PRICE_PER_DAY_IN_EUR, RAIN_PROOF, GUARDED, NUMBER_OF_PLACES,
                             NUMBER_OF_PLACES_FREE)
VALUES (3, 'Groenweg Fietsenstalling', 'Leuvensesteenweg', '79', 6.50, true, false, 120, 80);

INSERT INTO BICYCLE_PARKING (ID, NAME, STREET, NUMBER, PRICE_PER_DAY_IN_EUR, RAIN_PROOF, GUARDED, NUMBER_OF_PLACES,
                             NUMBER_OF_PLACES_FREE)
VALUES (4, 'Zonsondergang Fietsenwinkel', 'Antwerpsesteenweg', '11', 9.25, false, true, 60, 30);

INSERT INTO BICYCLE_PARKING (ID, NAME, STREET, NUMBER, PRICE_PER_DAY_IN_EUR, RAIN_PROOF, GUARDED, NUMBER_OF_PLACES,
                             NUMBER_OF_PLACES_FREE)
VALUES (5, 'Fiets Paleis', 'Battelsesteenweg', '123', 7.75, true, true, 150, 100);

INSERT INTO BICYCLE_PARKING (ID, NAME, STREET, NUMBER, PRICE_PER_DAY_IN_EUR, RAIN_PROOF, GUARDED, NUMBER_OF_PLACES,
                             NUMBER_OF_PLACES_FREE)
VALUES (6, 'Wielhuis Fietsenstalling', 'Tervuursesteenweg', '115', 4.99, false, true, 90, 20);

INSERT INTO BICYCLE_PARKING (ID, NAME, STREET, NUMBER, PRICE_PER_DAY_IN_EUR, RAIN_PROOF, GUARDED, NUMBER_OF_PLACES,
                             NUMBER_OF_PLACES_FREE)
VALUES (7, 'Rivierpark Fietsen Haven', 'Stationsstraat', '17', 6.75, true, true, 200, 150);

INSERT INTO BICYCLE_PARKING (ID, NAME, STREET, NUMBER, PRICE_PER_DAY_IN_EUR, RAIN_PROOF, GUARDED, NUMBER_OF_PLACES,
                             NUMBER_OF_PLACES_FREE)
VALUES (8, 'Gouden Poort Fiets Stop', 'Hanswijkstraat', '9', 8.50, true, false, 70, 0);









