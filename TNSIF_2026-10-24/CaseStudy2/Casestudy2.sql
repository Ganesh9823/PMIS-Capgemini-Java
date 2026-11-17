CREATE DATABASE banking_db;

USE banking_db;

CREATE TABLE bank_accounts (
                               account_number BIGINT PRIMARY KEY,
                               customer_name VARCHAR(100) NOT NULL,
                               password VARCHAR(255) NOT NULL,
                               email VARCHAR(100) NOT NULL,
                               phone VARCHAR(15) NOT NULL,
                               date_of_birth DATE NOT NULL,
                               gender VARCHAR(10) NOT NULL,
                               address VARCHAR(200) NOT NULL,
                               account_type VARCHAR(20) NOT NULL,
                               balance DECIMAL(12 , 2 ) NOT NULL
);




INSERT INTO bank_accounts
(account_number, customer_name, password, email, phone,
 date_of_birth, gender, address, account_type, balance)
VALUES
    (100000000001, 'Aarav Sharma', 'Aarav@123', 'aarav@example.com', '9000000001', '1995-04-12', 'Male', 'Kolkata, West Bengal', 'Savings', 25000.00),
    (100000000002, 'Priya Das', 'Priya@123', 'priya@example.com', '9000000002', '1998-07-23', 'Female', 'Howrah, West Bengal', 'Savings', 32000.50),
    (100000000003, 'Rahul Verma', 'Rahul@123', 'rahul@example.com', '9000000003', '1992-01-15', 'Male', 'Delhi, India', 'Current', 85000.00),
    (100000000004, 'Sneha Roy', 'Sneha@123', 'sneha@example.com', '9000000004', '2000-11-09', 'Female', 'Durgapur, West Bengal', 'Savings', 18000.00),
    (100000000005, 'Arjun Singh', 'Arjun@123', 'arjun@example.com', '9000000005', '1994-06-18', 'Male', 'Mumbai, Maharashtra', 'Salary', 54000.00),
    (100000000006, 'Ananya Bose', 'Ananya@123', 'ananya@example.com', '9000000006', '1997-02-25', 'Female', 'Siliguri, West Bengal', 'Savings', 41000.75),
    (100000000007, 'Rohan Gupta', 'Rohan@123', 'rohan@example.com', '9000000007', '1991-09-14', 'Male', 'Pune, Maharashtra', 'Current', 125000.00),
    (100000000008, 'Ishita Sen', 'Ishita@123', 'ishita@example.com', '9000000008', '1999-03-30', 'Female', 'Bhubaneswar, Odisha', 'Savings', 27500.00),
    (100000000009, 'Vikram Patel', 'Vikram@123', 'vikram@example.com', '9000000009', '1993-12-05', 'Male', 'Ahmedabad, Gujarat', 'Salary', 67000.00),
    (100000000010, 'Kavya Nair', 'Kavya@123', 'kavya@example.com', '9000000010', '1996-08-17', 'Female', 'Kochi, Kerala', 'Savings', 36000.00),
    (100000000011, 'Aditya Kumar', 'Aditya@123', 'aditya@example.com', '9000000011', '1990-05-22', 'Male', 'Patna, Bihar', 'Current', 92000.00),
    (100000000012, 'Meera Iyer', 'Meera@123', 'meera@example.com', '9000000012', '2001-10-11', 'Female', 'Chennai, Tamil Nadu', 'Savings', 15500.00),
    (100000000013, 'Siddharth Jain', 'Siddharth@123', 'siddharth@example.com', '9000000013', '1994-07-07', 'Male', 'Jaipur, Rajasthan', 'Salary', 48000.00),
    (100000000014, 'Riya Ghosh', 'Riya@123', 'riya@example.com', '9000000014', '1998-01-28', 'Female', 'Kolkata, West Bengal', 'Savings', 29500.00),
    (100000000015, 'Karan Malhotra', 'Karan@123', 'karan@example.com', '9000000015', '1992-04-19', 'Male', 'Chandigarh, India', 'Current', 110000.00),
    (100000000016, 'Pooja Reddy', 'Pooja@123', 'pooja@example.com', '9000000016', '1997-09-03', 'Female', 'Hyderabad, Telangana', 'Savings', 22500.00),
    (100000000017, 'Amit Chatterjee', 'Amit@123', 'amit@example.com', '9000000017', '1989-02-16', 'Male', 'Howrah, West Bengal', 'Salary', 73500.00),
    (100000000018, 'Nisha Kapoor', 'Nisha@123', 'nisha@example.com', '9000000018', '2000-06-27', 'Female', 'Lucknow, Uttar Pradesh', 'Savings', 19000.00),
    (100000000019, 'Dev Mehta', 'Dev@123', 'dev@example.com', '9000000019', '1995-11-13', 'Male', 'Surat, Gujarat', 'Current', 88000.00),
    (100000000020, 'Tanya Dutta', 'Tanya@123', 'tanya@example.com', '9000000020', '1999-12-21', 'Female', 'Kharagpur, West Bengal', 'Savings', 31500.00);





USE banking_db;

-- Add a role column so one account can be an admin.
ALTER TABLE bank_accounts
    ADD COLUMN role VARCHAR(10) NOT NULL DEFAULT 'CUSTOMER';

-- Designate one existing account as the administrator.
-- Demo admin account: 100000000001
UPDATE bank_accounts
SET role = 'ADMIN'
WHERE account_number = 100000000001;

-- Store deposits, withdrawals and transfers for the passbook.
CREATE TABLE IF NOT EXISTS transactions (
                                            transaction_id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                            account_number BIGINT NOT NULL,
                                            related_account BIGINT NULL,
                                            transaction_type VARCHAR(20) NOT NULL,
    amount DECIMAL(12,2) NOT NULL,
    balance_after DECIMAL(12,2) NOT NULL,
    description VARCHAR(255) NOT NULL,
    transaction_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    INDEX idx_account_time (account_number, transaction_time)
    );



