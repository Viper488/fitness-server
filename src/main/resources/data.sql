DROP TABLE IF EXISTS trainings;

CREATE TABLE trainings (
    id INTEGER PRIMARY KEY NOT NULL,
    title VARCHAR NOT NULL,
    img VARCHAR NOT NULL
);

INSERT INTO trainings VALUES (1, 'Abdominal', 'placeholder'),
                             (2, 'Chest', 'placeholder'),
                             (3, 'Shoulders', 'placeholder'),
                             (4, 'Legs', 'placeholder'),
                             (5, 'Back', 'placeholder');

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
    (1, 1,'Jumping jacks', 30, 0, '', ''),
    (2, 1,'Abdominal crunches', 0, 12, '', ''),
    (3, 1,'Leg raises', 0, 16, '', ''),
    (4, 1,'Plank', 30, 0, '', ''),
    (5, 1,'V-ups', 0, 10, '', ''),
    (6, 1,'Abdominal crunches', 0, 12, '', ''),
    (7, 1,'Leg raises', 0, 16, '', ''),
    (8, 1,'Plank', 30, 0, '', ''),
    (9, 1,'V-ups', 0, 10, '', ''),
    (10, 1,'Side leg raises', 0, 10, '', ''),
    (11, 2,'Jumping jacks', 30, 0, '', ''),
    (12, 2,'Push-ups', 0, 16, '', ''),
    (13, 2,'Hindu push-ups', 0, 12, '', ''),
    (14, 2,'Decline push-ups', 0, 14, '', ''),
    (15, 2,'Staggered push-ups', 0, 10, '', ''),
    (16, 2,'Hindu push-ups', 0, 10, '', ''),
    (17, 2,'Decline push-ups', 0, 12, '', ''),
    (18, 2,'Staggered push-ups', 0, 8, '', ''),
    (19, 2,'Shoulder stretch', 30, 0, '', ''),
    (20, 2,'Chest stretch', 30, 0, '', '');

DROP TABLE IF EXISTS person;

CREATE TABLE person (
    id INTEGER PRIMARY KEY NOT NULL,
    name VARCHAR NOT NULL,
    password VARCHAR NOT NULL,
    height DOUBLE NOT NULL,
    weight DOUBLE NOT NULL
);

INSERT INTO person VALUES(1, 'admin', 'admin', 173, 78);

DROP TABLE IF EXISTS person_exercise;

CREATE TABLE person_exercise (
    id_person INTEGER NOT NULL,
    id_training INTEGER NOT NULL,
    title_training VARCHAR NOT NULL,
    day INTEGER NOT NULL,
    month INTEGER NOT NULL,
    year INTEGER NOT NULL
);
