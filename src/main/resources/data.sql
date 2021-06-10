DROP TABLE IF EXISTS trainings;

CREATE TABLE trainings (
    id INTEGER PRIMARY KEY NOT NULL,
    title VARCHAR NOT NULL,
    img VARCHAR NOT NULL
);

INSERT INTO trainings VALUES (1, 'Abdominal', 'https://stalowezdrowie.pl/wp-content/uploads/2014/01/trening-abs-696x392.jpg'),
                             (2, 'Chest', 'https://onnitacademy.imgix.net/wp-content/uploads/2020/06/sizzlchestBIG.jpg'),
                             (3, 'Shoulders and back', 'https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/mh-strong-muscular-back-royalty-free-image-1580927608.jpg?crop=0.774xw:0.580xh;0.107xw,0.0408xh&resize=1200:*'),
                             (4, 'Legs', 'https://cdn3.omidoo.com/sites/default/files/imagecache/2560x2560/images/headline/201808/legsstrongmuscular.jpg');

DROP TABLE IF EXISTS exercises;

CREATE TABLE exercises (
    id_exercise INTEGER PRIMARY KEY NOT NULL,
    id_training INTEGER NOT NULL,
    title VARCHAR NOT NULL,
    time INTEGER,
    reps INTEGER,
    gif VARCHAR,
    video VARCHAR
);

INSERT INTO exercises VALUES
    (1, 1,'Jumping jacks', 30, 0, 'https://thumbs.gfycat.com/BlaringTornBelugawhale-small.gif', '1b98WrRrmUs'),
    (2, 1,'Abdominal crunches', 0, 12, 'https://i.imgur.com/UJAnRhJ.gif', '_YVhhXc2pSY'),
    (3, 1,'Leg raises', 0, 16, 'https://i.imgur.com/JtgnFH1.gif', 'l4kQd9eWclE'),
    (4, 1,'Plank', 30, 0, 'https://i.pinimg.com/originals/cf/b5/67/cfb5677a755fe7288b608a4fec6f09a0.gif', 'y1hXARQhHZM'),
    (5, 1,'V-ups', 0, 10, 'https://i.makeagif.com/media/7-08-2015/-Zeu6Z.gif', 'iP2fjvG0g3w'),
    (6, 1,'Abdominal crunches', 0, 12, 'https://i.imgur.com/UJAnRhJ.gif', '_YVhhXc2pSY'),
    (7, 1,'Leg raises', 0, 16, 'https://i.imgur.com/JtgnFH1.gif', 'l4kQd9eWclE'),
    (8, 1,'Plank', 30, 0, 'https://i.pinimg.com/originals/cf/b5/67/cfb5677a755fe7288b608a4fec6f09a0.gif', 'y1hXARQhHZM'),
    (9, 1,'V-ups', 0, 10, 'https://i.makeagif.com/media/7-08-2015/-Zeu6Z.gif', 'iP2fjvG0g3w'),
    (10, 1,'Side leg raises', 0, 10, 'https://i.pinimg.com/originals/b9/b3/59/b9b359a6ed5d438117fabef655a2f605.gif', 'wJo8inKVKus'),

    (11, 2,'Jumping jacks', 30, 0, '', ''),
    (12, 2,'Push-ups', 0, 16, '', ''),
    (13, 2,'Hindu push-ups', 0, 12, '', ''),
    (14, 2,'Decline push-ups', 0, 14, '', ''),
    (15, 2,'Staggered push-ups', 0, 10, '', ''),
    (16, 2,'Hindu push-ups', 0, 10, '', ''),
    (17, 2,'Decline push-ups', 0, 12, '', ''),
    (18, 2,'Staggered push-ups', 0, 8, '', ''),
    (19, 2,'Shoulder stretch', 30, 0, '', ''),
    (20, 2,'Chest stretch', 30, 0, '', ''),


    (21, 3,'Jumping jacks', 30, 0, '', ''),
    (22, 3,'Low-plank', 30, 0, '', ''),
    (23, 3,'High-plank', 30, 0, '', ''),
    (24, 3,'Bridge', 30, 0, '', ''),
    (25, 3,'Superman', 30, 0, '', ''),
    (26, 3,'Quadruped limb raises', 0, 16, '', ''),
    (27, 3,'Push-ups', 0, 16, '', ''),
    (28, 3,'Lawn-movers', 0, 20, '', ''),
    (29, 3,'Forward bends', 0, 20, '', ''),
    (30, 3,'Double chest expansion', 30, 0, '', ''),

    (31, 4,'Jumping jacks', 30, 0, '', ''),
    (32, 4,'Squats', 0, 16, '', ''),
    (33, 4,'Split squats', 0, 12, '', ''),
    (34, 4,'Lunges', 0, 14, '', ''),
    (35, 4,'Side leg raises', 0, 16, '', ''),
    (36, 4,'Side-to-side lunges', 0, 14, '', ''),
    (37, 4,'Squats', 0, 12, '', ''),
    (38, 4,'Split squats', 0, 8, '', ''),
    (39, 4,'Lunges', 0, 10, '', ''),
    (40, 4,'Side leg raises', 0, 10, '', '');

DROP TABLE IF EXISTS person;

CREATE TABLE person (
    id INTEGER PRIMARY KEY NOT NULL,
    name VARCHAR NOT NULL,
    password VARCHAR NOT NULL,
    height DOUBLE NOT NULL,
    weight DOUBLE NOT NULL
);

INSERT INTO person VALUES(1, 'admin', 'admin', 173, 78);

DROP TABLE IF EXISTS person_training;

CREATE TABLE person_training (
    id_person INTEGER NOT NULL,
    id_training INTEGER NOT NULL,
    title_training VARCHAR NOT NULL,
    day INTEGER NOT NULL,
    month INTEGER NOT NULL,
    year INTEGER NOT NULL
);
