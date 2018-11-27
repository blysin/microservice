create table dept
(
  dept_id   int         not null,
  dept_name varchar(32) null,
  db_name   varchar(32) null,
  constraint dept_dept_id_uindex
  unique (dept_id)
)
  engine = InnoDB;

INSERT INTO micro_db1.dept (dept_id, dept_name, db_name) VALUES (18, '南威测试部', 'micro_db1');
INSERT INTO micro_db1.dept (dept_id, dept_name, db_name) VALUES (20, '创意部', 'micro_db1');