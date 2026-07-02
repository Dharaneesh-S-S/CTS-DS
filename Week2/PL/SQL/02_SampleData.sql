-- ===========================================
-- Insert Customers
-- ===========================================

INSERT INTO Customers VALUES (
1,'John Doe',TO_DATE('1955-05-15','YYYY-MM-DD'),
12000,'N',SYSDATE);

INSERT INTO Customers VALUES (
2,'Jane Smith',TO_DATE('1992-07-20','YYYY-MM-DD'),
8000,'N',SYSDATE);

INSERT INTO Customers VALUES (
3,'Robert Wilson',TO_DATE('1958-03-11','YYYY-MM-DD'),
15000,'N',SYSDATE);

INSERT INTO Customers VALUES (
4,'Emily Davis',TO_DATE('1988-11-08','YYYY-MM-DD'),
9500,'N',SYSDATE);

INSERT INTO Customers VALUES (
5,'Michael Brown',TO_DATE('1960-09-25','YYYY-MM-DD'),
20000,'N',SYSDATE);

INSERT INTO Customers VALUES (
6,'Sophia Taylor',TO_DATE('1998-01-12','YYYY-MM-DD'),
3000,'N',SYSDATE);

INSERT INTO Customers VALUES (
7,'David Miller',TO_DATE('1952-12-01','YYYY-MM-DD'),
50000,'N',SYSDATE);

INSERT INTO Customers VALUES (
8,'Olivia Thomas',TO_DATE('1995-06-30','YYYY-MM-DD'),
7000,'N',SYSDATE);

-- ===========================================
-- Insert Accounts
-- ===========================================

INSERT INTO Accounts VALUES
(101,1,'Savings',12000,SYSDATE);

INSERT INTO Accounts VALUES
(102,2,'Checking',8000,SYSDATE);

INSERT INTO Accounts VALUES
(103,3,'Savings',15000,SYSDATE);

INSERT INTO Accounts VALUES
(104,4,'Savings',9500,SYSDATE);

INSERT INTO Accounts VALUES
(105,5,'Checking',20000,SYSDATE);

INSERT INTO Accounts VALUES
(106,6,'Savings',3000,SYSDATE);

INSERT INTO Accounts VALUES
(107,7,'Savings',50000,SYSDATE);

INSERT INTO Accounts VALUES
(108,8,'Checking',7000,SYSDATE);

-- ===========================================
-- Insert Loans
-- ===========================================

INSERT INTO Loans VALUES
(201,1,50000,8,SYSDATE-100,SYSDATE+20);

INSERT INTO Loans VALUES
(202,2,30000,9,SYSDATE-200,SYSDATE+90);

INSERT INTO Loans VALUES
(203,3,100000,7,SYSDATE-150,SYSDATE+10);

INSERT INTO Loans VALUES
(204,4,45000,8.5,SYSDATE-80,SYSDATE+45);

INSERT INTO Loans VALUES
(205,5,90000,6.5,SYSDATE-250,SYSDATE+15);

INSERT INTO Loans VALUES
(206,7,120000,7.5,SYSDATE-300,SYSDATE+5);

-- ===========================================
-- Insert Transactions
-- ===========================================

INSERT INTO Transactions VALUES
(301,101,SYSDATE-2,2000,'Deposit');

INSERT INTO Transactions VALUES
(302,101,SYSDATE-1,1000,'Withdrawal');

INSERT INTO Transactions VALUES
(303,103,SYSDATE-3,5000,'Deposit');

INSERT INTO Transactions VALUES
(304,105,SYSDATE-5,7000,'Deposit');

INSERT INTO Transactions VALUES
(305,107,SYSDATE-4,4000,'Withdrawal');

-- ===========================================
-- Insert Employees
-- ===========================================

INSERT INTO Employees VALUES
(401,'Alice Johnson','Manager',70000,'HR',
TO_DATE('2015-06-15','YYYY-MM-DD'));

INSERT INTO Employees VALUES
(402,'Bob Brown','Developer',60000,'IT',
TO_DATE('2017-03-20','YYYY-MM-DD'));

INSERT INTO Employees VALUES
(403,'Chris Evans','Developer',65000,'IT',
TO_DATE('2018-08-12','YYYY-MM-DD'));

INSERT INTO Employees VALUES
(404,'Diana Prince','Analyst',55000,'Finance',
TO_DATE('2019-09-15','YYYY-MM-DD'));

INSERT INTO Employees VALUES
(405,'Ethan Hunt','Manager',80000,'Sales',
TO_DATE('2014-04-01','YYYY-MM-DD'));

COMMIT;