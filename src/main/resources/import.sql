INSERT INTO universities (name, registration_number) VALUES ('CUET', '123');
INSERT INTO universities (name, registration_number) VALUES ('KUET', '124');
INSERT INTO universities (name, registration_number) VALUES ('RUET', '125');
INSERT INTO universities (name, registration_number) VALUES ('BUET', '126');

INSERT INTO departments (department_name, university_id) VALUES ('CSE', '1');
INSERT INTO departments (department_name, university_id) VALUES ('ME', '1');
INSERT INTO departments (department_name, university_id) VALUES ('CIVIL', '1');
INSERT INTO departments (department_name, university_id) VALUES ('EEE', '1');
INSERT INTO departments (department_name, university_id) VALUES ('Computing', '2');
INSERT INTO departments (department_name, university_id) VALUES ('Electrical', '2');
INSERT INTO departments (department_name, university_id) VALUES ('CIVIL', '2');
INSERT INTO departments (department_name, university_id) VALUES ('Architecture', '2');
INSERT INTO departments (department_name, university_id) VALUES ('CSE', '3');
INSERT INTO departments (department_name, university_id) VALUES ('Mechanical', '3');
INSERT INTO departments (department_name, university_id) VALUES ('EEE', '3');
INSERT INTO departments (department_name, university_id) VALUES ('CIVIL', '3');
INSERT INTO departments (department_name, university_id) VALUES ('IT', '4');
INSERT INTO departments (department_name, university_id) VALUES ('Architecture', '4');
INSERT INTO departments (department_name, university_id) VALUES ('CIVIL', '4');
INSERT INTO departments (department_name, university_id) VALUES ('Physics', '4');

INSERT INTO batches (name, level, term, university_id) VALUES ('2007', 'L1', 'T1', 1);
INSERT INTO batches (name, level, term, university_id) VALUES ('2006', 'L2', 'T1', 1);
INSERT INTO batches (name, level, term, university_id) VALUES ('2005', 'L3', 'T1', 1);
INSERT INTO batches (name, level, term, university_id) VALUES ('2004', 'L4', 'T1', 1);
INSERT INTO batches (name, level, term, university_id) VALUES ('44', 'L1', 'T1', 2);
INSERT INTO batches (name, level, term, university_id) VALUES ('43', 'L2', 'T1', 2);
INSERT INTO batches (name, level, term, university_id) VALUES ('42', 'L3', 'T1', 2);
INSERT INTO batches (name, level, term, university_id) VALUES ('41', 'L4', 'T1', 2);
INSERT INTO batches (name, level, term, university_id) VALUES ('104', 'L1', 'T1', 3);
INSERT INTO batches (name, level, term, university_id) VALUES ('103', 'L2', 'T1', 3);
INSERT INTO batches (name, level, term, university_id) VALUES ('102', 'L3', 'T1', 3);
INSERT INTO batches (name, level, term, university_id) VALUES ('100', 'L4', 'T1', 3);
INSERT INTO batches (name, level, term, university_id) VALUES ('2007', 'L1', 'T1', 4);
INSERT INTO batches (name, level, term, university_id) VALUES ('2006', 'L2', 'T1', 4);
INSERT INTO batches (name, level, term, university_id) VALUES ('2005', 'L3', 'T1', 4);
INSERT INTO batches (name, level, term, university_id) VALUES ('2004', 'L4', 'T1', 4);

INSERT INTO class_representatives (name, roll_number, batch_id, department_id) VALUES ('Mahedi Kaysar', '0704014', 1, 1);
INSERT INTO class_representatives (name, roll_number, batch_id, department_id) VALUES ('Irin Akhtar', '0704023', 1, 1);
INSERT INTO class_representatives (name, roll_number, batch_id, department_id) VALUES ('Mahedi Kaysar', '1', 1, 5);
INSERT INTO class_representatives (name, roll_number, batch_id, department_id) VALUES ('Mahedi Kaysar', '2', 1, 5);
INSERT INTO class_representatives (name, roll_number, batch_id, department_id) VALUES ('Mahedi Kaysar', '1', 1, 6);
INSERT INTO class_representatives (name, roll_number, batch_id, department_id) VALUES ('Mahedi Kaysar', '101', 1, 9);
INSERT INTO class_representatives (name, roll_number, batch_id, department_id) VALUES ('Mahedi Kaysar', '102', 1, 9);
INSERT INTO class_representatives (name, roll_number, batch_id, department_id) VALUES ('Mahedi Kaysar', '1001', 1, 13);
INSERT INTO class_representatives (name, roll_number, batch_id, department_id) VALUES ('Mahedi Kaysar', '1002', 1, 13);

INSERT INTO calender_events (event_type, title, start_date, end_date, university_id) VALUES ('Class', 'Physics', now(), now(), 1);
INSERT INTO calender_events (event_type, title, start_date, end_date, university_id) VALUES ('Seminar', 'Physics', now(), now(), 1);
INSERT INTO calender_events (event_type, title, start_date, end_date, university_id) VALUES ('Class', 'Physics', now(), now(), 2);
INSERT INTO calender_events (event_type, title, start_date, end_date, university_id) VALUES ('Conference', 'Physics', now(), now(), 2);
INSERT INTO calender_events (event_type, title, start_date, end_date, university_id) VALUES ('Class', 'Physics', now(), now(), 3);
INSERT INTO calender_events (event_type, title, start_date, end_date, university_id) VALUES ('Seminar', 'Physics', now(), now(), 3);
INSERT INTO calender_events (event_type, title, start_date, end_date, university_id) VALUES ('Class', 'Physics', now(), now(), 4);
INSERT INTO calender_events (event_type, title, start_date, end_date, university_id) VALUES ('Class', 'Physics', now(), now(), 4);
INSERT INTO calender_events (event_type, title, start_date, end_date, university_id) VALUES ('Lab', 'Physics', now(), now(), 4);

INSERT INTO attendees (event_id, batch_id) VALUES (1, 1);
INSERT INTO attendees (event_id, batch_id) VALUES (2, 1);
INSERT INTO attendees (event_id, batch_id) VALUES (2, 2);
INSERT INTO attendees (event_id, batch_id) VALUES (3, 5);
INSERT INTO attendees (event_id, batch_id) VALUES (4, 5);
INSERT INTO attendees (event_id, batch_id) VALUES (4, 6);
INSERT INTO attendees (event_id, batch_id) VALUES (5, 9);
INSERT INTO attendees (event_id, batch_id) VALUES (6, 10);
INSERT INTO attendees (event_id, batch_id) VALUES (6, 11);
INSERT INTO attendees (event_id, batch_id) VALUES (7, 13);
INSERT INTO attendees (event_id, batch_id) VALUES (8, 13);
INSERT INTO attendees (event_id, batch_id) VALUES (9, 13);


