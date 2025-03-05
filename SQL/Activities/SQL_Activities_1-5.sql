-- Activity 1
CREATE TABLE salesman(salesman_id int , salesman_name varchar(32) , salesman_city varchar(32) , commission int)

DESCRIBE salesman;
-- Activity 2

INSERT INTO salesman VALUES (5001 , 'James Hoog' , 'New York' , 15);
INSERT INTO salesman VALUES (5002 , 'Nail Knite' , 'Paris' , 13);
INSERT INTO salesman VALUES (5005 , 'Pit Alex' , 'London' , 11);
INSERT INTO salesman VALUES (5006 , 'Mc Lyon' , 'Paularis' , 14);
INSERT INTO salesman VALUES (5007 , 'Paul Adam' , 'Rome' , 13);
INSERT INTO salesman VALUES (5003 , 'Lauson hen' , 'San Jose' , 12);

select * from salesman;

-- Activity 3
-- Show data from the salesman_id and salesman_city columns
SELECT salesman_id, salesman_city FROM salesman;

-- show data of salesman from Paris
SELECT * from salesman where salesman_city = 'Paris';

-- Show salesman_id and commission of Paul Adam
SELECT salesman_id , commission from salesman where salesman_name = 'Paul Adam';

-- Activity 4

ALTER TABLE salesman ADD grade int;
UPDATE salesman set grade = 100;
select * from salesman;


-- Activity 5

-- Update the grade score of salesman from Rome to 200
UPDATE salesman SET grade = 200 where SALESMAN_CITY='Rome';

-- Update the grade score of James Hoog to 300
UPDATE salesman SET grade = 300 where SALESMAN_NAME='JamesHoog';

-- Update the name Mc Lyon to Pierre
UPDATE salesman set salesman_name='Pierre' where salesman_name='Mc Lyon';


select * from salesman;


