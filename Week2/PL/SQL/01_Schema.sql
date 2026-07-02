-- ===========================================
-- Drop Tables (Ignore errors if first run)
-- ===========================================

DROP TABLE Transactions CASCADE CONSTRAINTS;
DROP TABLE Accounts CASCADE CONSTRAINTS;
DROP TABLE Loans CASCADE CONSTRAINTS;
DROP TABLE Employees CASCADE CONSTRAINTS;
DROP TABLE Customers CASCADE CONSTRAINTS;

-- ===========================================
-- Customers
-- ===========================================

CREATE TABLE Customers (
    CustomerID NUMBER PRIMARY KEY,
    Name VARCHAR2(100),
    DOB DATE,
    Balance NUMBER(12,2),
    IsVIP CHAR(1) DEFAULT 'N',
    LastModified DATE
);

-- ===========================================
-- Accounts
-- ===========================================

CREATE TABLE Accounts (
    AccountID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    AccountType VARCHAR2(20),
    Balance NUMBER(12,2),
    LastModified DATE,

    CONSTRAINT fk_account_customer
    FOREIGN KEY(CustomerID)
    REFERENCES Customers(CustomerID)
);

-- ===========================================
-- Loans
-- ===========================================

CREATE TABLE Loans (
    LoanID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    LoanAmount NUMBER(12,2),
    InterestRate NUMBER(5,2),
    StartDate DATE,
    EndDate DATE,

    CONSTRAINT fk_loan_customer
    FOREIGN KEY(CustomerID)
    REFERENCES Customers(CustomerID)
);

-- ===========================================
-- Transactions
-- ===========================================

CREATE TABLE Transactions (
    TransactionID NUMBER PRIMARY KEY,
    AccountID NUMBER,
    TransactionDate DATE,
    Amount NUMBER(12,2),
    TransactionType VARCHAR2(20),

    CONSTRAINT fk_transaction_account
    FOREIGN KEY(AccountID)
    REFERENCES Accounts(AccountID)
);

-- ===========================================
-- Employees
-- ===========================================

CREATE TABLE Employees (
    EmployeeID NUMBER PRIMARY KEY,
    Name VARCHAR2(100),
    Position VARCHAR2(50),
    Salary NUMBER(12,2),
    Department VARCHAR2(50),
    HireDate DATE
);