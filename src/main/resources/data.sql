INSERT INTO recipe(id, title, portions, time, instruction, author, IMAGE_URL, likes, category, level) VALUES (1, 'Kanapki', 2, 20, 'Posmaruj kanapki masłem, nałóż ser', 'Michał', 'http://img4.garnek.pl/a.garnek.pl/031/265/31265395_800.0.jpg/kanapki-z-serem-i-pomidorem.jpg', 4, 'DINNER', 'EASY');

INSERT INTO ingredient(id, name, quantity, unit, recipe_id) VALUES (1, 'Chleb', 200, 'g', 1);
INSERT INTO ingredient(id, name, quantity, unit, recipe_id) VALUES (2, 'Pomidor', 1, 'piece', 1);

