BEGIN;
CREATE TABLE puppy(
    id  serial,
    puppy_name varchar(50) default ('NO NAME'),
    weight int,
    gender char(1),
    breed varchar(50),
    paper_trained boolean,
    CONSTRAINT PK_puppy PRIMARY KEY (id),
    CONSTRAINT CHK_gender CHECK(gender IN ('M', 'F'))
);

INSERT INTO puppy (id, puppy_name, weight, gender, breed, paper_trained) VALUES (1,'Hobbs',17,'M','Dachshund',true);
INSERT INTO puppy (id, puppy_name, weight, gender, breed, paper_trained) VALUES (2,'Olaf',113,'M','Sheepdog',true);
INSERT INTO puppy (id, puppy_name, weight, gender, breed, paper_trained) VALUES (3,'Toby',90,'M', 'Golden Retriever',true);
INSERT INTO puppy (id, puppy_name, weight, gender, breed, paper_trained) VALUES (4,'Pawla',50,'F','Boxer',false);

COMMIT;

ALTER SEQUENCE puppy_id_seq RESTART WITH 5;

DELETE FROM puppy WHERE id = 5;