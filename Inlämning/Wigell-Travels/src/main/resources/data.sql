insert into destination (city, country) values
                                            ('Uppsala', 'Sverige'),
                                            ('York', 'England');
insert into customers (address, first_name, last_name, user_name) values
                                                                     ('Solvägen 19', 'Huggo', 'Andersson', 'H-Andersson'),
                                                                     ('Nattgatan 2a', 'Lisa', 'Svensson', 'LisaS'),
                                                                     ('Catgatan 1', 'Frans', 'Wolf', 'Wolf'),
                                                                     ('Dagvägen 132', 'Sara', 'Anderman', 'SaraAnderman');
insert into trips (hotal_name,destination_id) values
                                                 ('Grand Hotel', 1),
                                                 ('The Savoy', 2);
insert into bookings (time_of_departure, total_price_insek, total_price_in_euro,destination_id, trip_id, id_number) values
                                                                                                                       ('2024-02-05', '5000', '500', '1','1','1'),
                                                                                                                       ('2024-08-30', '3000', '300', '2','2','2'),
                                                                                                                       ('2024-10-12', '12000', '1200', '2','1','4'),
                                                                                                                       ('2024-04-20', '2304', '60', '1','2','3');


