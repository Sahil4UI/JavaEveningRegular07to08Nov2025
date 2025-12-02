Last login: Tue Dec  2 15:29:26 on ttys003
sahil@MacBookAir ~ % mysql -u root
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 11
Server version: 9.4.0 Homebrew

Copyright (c) 2000, 2025, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> create database school;
ERROR 1007 (HY000): Can't create database 'school'; database exists
mysql> 
mysql> create database schools;
Query OK, 1 row affected (0.038 sec)

mysql> use schools;
Database changed
mysql> 
mysql> create table 10th_class (roll int primary key,Name text,marks int);
Query OK, 0 rows affected (0.091 sec)

mysql> desc 10th_class;
+-------+------+------+-----+---------+-------+
| Field | Type | Null | Key | Default | Extra |
+-------+------+------+-----+---------+-------+
| roll  | int  | NO   | PRI | NULL    |       |
| Name  | text | YES  |     | NULL    |       |
| marks | int  | YES  |     | NULL    |       |
+-------+------+------+-----+---------+-------+
3 rows in set (0.091 sec)

mysql> describe 10th_class;
+-------+------+------+-----+---------+-------+
| Field | Type | Null | Key | Default | Extra |
+-------+------+------+-----+---------+-------+
| roll  | int  | NO   | PRI | NULL    |       |
| Name  | text | YES  |     | NULL    |       |
| marks | int  | YES  |     | NULL    |       |
+-------+------+------+-----+---------+-------+
3 rows in set (0.003 sec)

mysql> DESCRIbe 10th_class;
+-------+------+------+-----+---------+-------+
| Field | Type | Null | Key | Default | Extra |
+-------+------+------+-----+---------+-------+
| roll  | int  | NO   | PRI | NULL    |       |
| Name  | text | YES  |     | NULL    |       |
| marks | int  | YES  |     | NULL    |       |
+-------+------+------+-----+---------+-------+
3 rows in set (0.007 sec)

mysql> insert into 10th_class values 
    -> (101,"Amit",98),
    -> (102,"Mohan",50),
    -> (103,"Aman",20),
    -> (104,"Rahul,0),
    "> ;
    "> ;
    "> 
    "> ^C^M

^C
mysql> 
mysql> 
mysql> insert into 10th_class values
    -> (101,"Amit",98),
    -> (102,"Mohan",50),
    -> (103,"Aman",20),
    -> (104,"Rahul",0),
    -> (105,"Priya",30);
Query OK, 5 rows affected (0.057 sec)
Records: 5  Duplicates: 0  Warnings: 0

mysql> select * from 10th_class;
+------+-------+-------+
| roll | Name  | marks |
+------+-------+-------+
|  101 | Amit  |    98 |
|  102 | Mohan |    50 |
|  103 | Aman  |    20 |
|  104 | Rahul |     0 |
|  105 | Priya |    30 |
+------+-------+-------+
5 rows in set (0.001 sec)

mysql> select * from 10th_class where roll=101;
+------+------+-------+
| roll | Name | marks |
+------+------+-------+
|  101 | Amit |    98 |
+------+------+-------+
1 row in set (0.002 sec)

mysql> select * from 10th_class where roll between 101 and 103;
+------+-------+-------+
| roll | Name  | marks |
+------+-------+-------+
|  101 | Amit  |    98 |
|  102 | Mohan |    50 |
|  103 | Aman  |    20 |
+------+-------+-------+
3 rows in set (0.003 sec)

mysql> select * from 10th_class where roll in (101,103);
+------+------+-------+
| roll | Name | marks |
+------+------+-------+
|  101 | Amit |    98 |
|  103 | Aman |    20 |
+------+------+-------+
2 rows in set (0.000 sec)

mysql> select roll,name from 10th_class;
+------+-------+
| roll | name  |
+------+-------+
|  101 | Amit  |
|  102 | Mohan |
|  103 | Aman  |
|  104 | Rahul |
|  105 | Priya |
+------+-------+
5 rows in set (0.001 sec)

mysql> select min(marks) from 10th_class;
+------------+
| min(marks) |
+------------+
|          0 |
+------------+
1 row in set (0.003 sec)

mysql> select max(marks) from 10th_class;
+------------+
| max(marks) |
+------------+
|         98 |
+------------+
1 row in set (0.001 sec)

mysql> select avg(marks) from 10th_class;
+------------+
| avg(marks) |
+------------+
|    39.6000 |
+------------+
1 row in set (0.002 sec)

mysql> select count(*) from 10th_class;
+----------+
| count(*) |
+----------+
|        5 |
+----------+
1 row in set (0.005 sec)

mysql> select * from 10th_class;
+------+-------+-------+
| roll | Name  | marks |
+------+-------+-------+
|  101 | Amit  |    98 |
|  102 | Mohan |    50 |
|  103 | Aman  |    20 |
|  104 | Rahul |     0 |
|  105 | Priya |    30 |
+------+-------+-------+
5 rows in set (0.001 sec)

mysql> select * from 10th_class where name like "R%";
+------+-------+-------+
| roll | Name  | marks |
+------+-------+-------+
|  104 | Rahul |     0 |
+------+-------+-------+
1 row in set (0.003 sec)

mysql> select * from 10th_class where name like "%n";
+------+-------+-------+
| roll | Name  | marks |
+------+-------+-------+
|  102 | Mohan |    50 |
|  103 | Aman  |    20 |
+------+-------+-------+
2 rows in set (0.008 sec)

mysql> select * from 10th_class where name like "%m%";
+------+-------+-------+
| roll | Name  | marks |
+------+-------+-------+
|  101 | Amit  |    98 |
|  102 | Mohan |    50 |
|  103 | Aman  |    20 |
+------+-------+-------+
3 rows in set (0.002 sec)

mysql> select * from 10th_class where name like "__m%";
Empty set (0.001 sec)

mysql> select * from 10th_class where name like "_m%";
+------+------+-------+
| roll | Name | marks |
+------+------+-------+
|  101 | Amit |    98 |
|  103 | Aman |    20 |
+------+------+-------+
2 rows in set (0.001 sec)

mysql> insert into 10th_class values (101,"Adarsh",100);
ERROR 1062 (23000): Duplicate entry '101' for key '10th_class.PRIMARY'
mysql> 
mysql> select * from 10th_class;
+------+-------+-------+
| roll | Name  | marks |
+------+-------+-------+
|  101 | Amit  |    98 |
|  102 | Mohan |    50 |
|  103 | Aman  |    20 |
|  104 | Rahul |     0 |
|  105 | Priya |    30 |
+------+-------+-------+
5 rows in set (0.001 sec)

mysql> delete from 10th_class where roll = 105;
Query OK, 1 row affected (0.013 sec)

mysql> select * from 10th_class;
+------+-------+-------+
| roll | Name  | marks |
+------+-------+-------+
|  101 | Amit  |    98 |
|  102 | Mohan |    50 |
|  103 | Aman  |    20 |
|  104 | Rahul |     0 |
+------+-------+-------+
4 rows in set (0.000 sec)

mysql> 
