sahil@SAHILs-MacBook-Air ~ % mysql -u root
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 10
Server version: 9.4.0 Homebrew

Copyright (c) 2000, 2025, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| assignments        |
| company            |
| information_schema |
| mycompany          |
| mysql              |
| OurCOmpany         |
| performance_schema |
| school             |
| sys                |
+--------------------+
9 rows in set (0.051 sec)

mysql> use company;
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed
mysql> show tables;
+-------------------+
| Tables_in_company |
+-------------------+
| address           |
| emp               |
+-------------------+
2 rows in set (0.002 sec)

mysql> select * from emp;
+--------+-------+-------+--------+--------+
| emp_id | name  | dept  | salary | add_id |
+--------+-------+-------+--------+--------+
|    101 | Amit  | IT    |  45000 |      1 |
|    102 | Sahil | IT    |  75000 |      2 |
|    103 | Rahul | HR    |  95000 |      1 |
|    104 | Sam   | Sales |  34000 |      2 |
|    105 | Ronit | IT    |  65000 |      1 |
+--------+-------+-------+--------+--------+
5 rows in set (0.001 sec)

mysql> mysql> alter table add column doj date;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'addadd column doj date' at line 1
mysql> 
mysql> 
mysql> 
mysql> alter table emp addadd column doj date;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'addadd column doj date' at line 1
mysql> 
mysql> 
mysql> 
mysql> alter table emp add column doj date;
Query OK, 0 rows affected (0.098 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> select * from emp;
+--------+-------+-------+--------+--------+------+
| emp_id | name  | dept  | salary | add_id | doj  |
+--------+-------+-------+--------+--------+------+
|    101 | Amit  | IT    |  45000 |      1 | NULL |
|    102 | Sahil | IT    |  75000 |      2 | NULL |
|    103 | Rahul | HR    |  95000 |      1 | NULL |
|    104 | Sam   | Sales |  34000 |      2 | NULL |
|    105 | Ronit | IT    |  65000 |      1 | NULL |
+--------+-------+-------+--------+--------+------+
5 rows in set (0.009 sec)

mysql> desc emp;
+--------+-------------+------+-----+---------+-------+
| Field  | Type        | Null | Key | Default | Extra |
+--------+-------------+------+-----+---------+-------+
| emp_id | int         | NO   | PRI | NULL    |       |
| name   | varchar(20) | YES  |     | NULL    |       |
| dept   | varchar(10) | YES  |     | NULL    |       |
| salary | int         | YES  |     | NULL    |       |
| add_id | int         | YES  |     | NULL    |       |
| doj    | date        | YES  |     | NULL    |       |
+--------+-------------+------+-----+---------+-------+
6 rows in set (0.020 sec)

mysql> alter table emp modify column doj text;
Query OK, 5 rows affected (0.028 sec)
Records: 5  Duplicates: 0  Warnings: 0

mysql> desc emp;
+--------+-------------+------+-----+---------+-------+
| Field  | Type        | Null | Key | Default | Extra |
+--------+-------------+------+-----+---------+-------+
| emp_id | int         | NO   | PRI | NULL    |       |
| name   | varchar(20) | YES  |     | NULL    |       |
| dept   | varchar(10) | YES  |     | NULL    |       |
| salary | int         | YES  |     | NULL    |       |
| add_id | int         | YES  |     | NULL    |       |
| doj    | text        | YES  |     | NULL    |       |
+--------+-------------+------+-----+---------+-------+
6 rows in set (0.002 sec)

mysql> alter table emp modify column doj date;
Query OK, 5 rows affected (0.019 sec)
Records: 5  Duplicates: 0  Warnings: 0

mysql> desc emp;
+--------+-------------+------+-----+---------+-------+
| Field  | Type        | Null | Key | Default | Extra |
+--------+-------------+------+-----+---------+-------+
| emp_id | int         | NO   | PRI | NULL    |       |
| name   | varchar(20) | YES  |     | NULL    |       |
| dept   | varchar(10) | YES  |     | NULL    |       |
| salary | int         | YES  |     | NULL    |       |
| add_id | int         | YES  |     | NULL    |       |
| doj    | date        | YES  |     | NULL    |       |
+--------+-------------+------+-----+---------+-------+
6 rows in set (0.001 sec)

mysql> alter table emp drop column doj;
Query OK, 0 rows affected (0.016 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> select * from emp;
+--------+-------+-------+--------+--------+
| emp_id | name  | dept  | salary | add_id |
+--------+-------+-------+--------+--------+
|    101 | Amit  | IT    |  45000 |      1 |
|    102 | Sahil | IT    |  75000 |      2 |
|    103 | Rahul | HR    |  95000 |      1 |
|    104 | Sam   | Sales |  34000 |      2 |
|    105 | Ronit | IT    |  65000 |      1 |
+--------+-------+-------+--------+--------+
5 rows in set (0.001 sec)

mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| assignments        |
| company            |
| information_schema |
| mycompany          |
| mysql              |
| OurCOmpany         |
| performance_schema |
| school             |
| sys                |
+--------------------+
9 rows in set (0.003 sec)

mysql> drop database OurCOmpany;
Query OK, 1 row affected (0.021 sec)

mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| assignments        |
| company            |
| information_schema |
| mycompany          |
| mysql              |
| performance_schema |
| school             |
| sys                |
+--------------------+
8 rows in set (0.001 sec)

mysql> use school;
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed
mysql> show tables
    -> ;
+------------------+
| Tables_in_school |
+------------------+
| students         |
+------------------+
1 row in set (0.001 sec)

mysql> drop table students;
Query OK, 0 rows affected (0.008 sec)

mysql> show tables
    -> ;
Empty set (0.001 sec)

mysql> use company;
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed
mysql> select * from emp;
+--------+-------+-------+--------+--------+
| emp_id | name  | dept  | salary | add_id |
+--------+-------+-------+--------+--------+
|    101 | Amit  | IT    |  45000 |      1 |
|    102 | Sahil | IT    |  75000 |      2 |
|    103 | Rahul | HR    |  95000 |      1 |
|    104 | Sam   | Sales |  34000 |      2 |
|    105 | Ronit | IT    |  65000 |      1 |
+--------+-------+-------+--------+--------+
5 rows in set (0.001 sec)

mysql> select distinct(dept) from emp;
+-------+
| dept  |
+-------+
| IT    |
| HR    |
| Sales |
+-------+
3 rows in set (0.001 sec)

mysql> select * from emp order by salary ;
+--------+-------+-------+--------+--------+
| emp_id | name  | dept  | salary | add_id |
+--------+-------+-------+--------+--------+
|    104 | Sam   | Sales |  34000 |      2 |
|    101 | Amit  | IT    |  45000 |      1 |
|    105 | Ronit | IT    |  65000 |      1 |
|    102 | Sahil | IT    |  75000 |      2 |
|    103 | Rahul | HR    |  95000 |      1 |
+--------+-------+-------+--------+--------+
5 rows in set (0.001 sec)

mysql> select * from emp order by salary asc;
+--------+-------+-------+--------+--------+
| emp_id | name  | dept  | salary | add_id |
+--------+-------+-------+--------+--------+
|    104 | Sam   | Sales |  34000 |      2 |
|    101 | Amit  | IT    |  45000 |      1 |
|    105 | Ronit | IT    |  65000 |      1 |
|    102 | Sahil | IT    |  75000 |      2 |
|    103 | Rahul | HR    |  95000 |      1 |
+--------+-------+-------+--------+--------+
5 rows in set (0.000 sec)

mysql> select * from emp order by salary desc;
+--------+-------+-------+--------+--------+
| emp_id | name  | dept  | salary | add_id |
+--------+-------+-------+--------+--------+
|    103 | Rahul | HR    |  95000 |      1 |
|    102 | Sahil | IT    |  75000 |      2 |
|    105 | Ronit | IT    |  65000 |      1 |
|    101 | Amit  | IT    |  45000 |      1 |
|    104 | Sam   | Sales |  34000 |      2 |
+--------+-------+-------+--------+--------+
5 rows in set (0.000 sec)

mysql> 
mysql> select dept, count(dept) from emp;
ERROR 1140 (42000): In aggregated query without GROUP BY, expression #1 of SELECT list contains nonaggregated column 'company.emp.dept'; this is incompatible with sql_mode=only_full_group_by
mysql> 
mysql> select dept, count(dept) from emp group by dept;
+-------+-------------+
| dept  | count(dept) |
+-------+-------------+
| IT    |           3 |
| HR    |           1 |
| Sales |           1 |
+-------+-------------+
3 rows in set (0.002 sec)

mysql> select dept, count(dept) from emp group by dept having dept="IT";
+------+-------------+
| dept | count(dept) |
+------+-------------+
| IT   |           3 |
+------+-------------+
1 row in set (0.003 sec)

mysql> 
mysql> select * from emp;
+--------+-------+-------+--------+--------+
| emp_id | name  | dept  | salary | add_id |
+--------+-------+-------+--------+--------+
|    101 | Amit  | IT    |  45000 |      1 |
|    102 | Sahil | IT    |  75000 |      2 |
|    103 | Rahul | HR    |  95000 |      1 |
|    104 | Sam   | Sales |  34000 |      2 |
|    105 | Ronit | IT    |  65000 |      1 |
+--------+-------+-------+--------+--------+
5 rows in set (0.045 sec)

mysql> update emp set salary = salary+salary*0.20;
Query OK, 5 rows affected (0.064 sec)
Rows matched: 5  Changed: 5  Warnings: 0

mysql> select * from emp;
+--------+-------+-------+--------+--------+
| emp_id | name  | dept  | salary | add_id |
+--------+-------+-------+--------+--------+
|    101 | Amit  | IT    |  54000 |      1 |
|    102 | Sahil | IT    |  90000 |      2 |
|    103 | Rahul | HR    | 114000 |      1 |
|    104 | Sam   | Sales |  40800 |      2 |
|    105 | Ronit | IT    |  78000 |      1 |
+--------+-------+-------+--------+--------+
5 rows in set (0.004 sec)

mysql> delete from emp where emp_id=105;
Query OK, 1 row affected (0.007 sec)

mysql> select * from emp;
+--------+-------+-------+--------+--------+
| emp_id | name  | dept  | salary | add_id |
+--------+-------+-------+--------+--------+
|    101 | Amit  | IT    |  54000 |      1 |
|    102 | Sahil | IT    |  90000 |      2 |
|    103 | Rahul | HR    | 114000 |      1 |
|    104 | Sam   | Sales |  40800 |      2 |
+--------+-------+-------+--------+--------+
4 rows in set (0.000 sec)

mysql>  
