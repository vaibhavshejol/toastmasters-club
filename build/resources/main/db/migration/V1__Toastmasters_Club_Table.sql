CREATE TABLE meeting (
    meeting_id SERIAL PRIMARY KEY,
    meeting_title VARCHAR(255) NOT NULL,
    meeting_description TEXT,
    meeting_date DATE NOT NULL,
    meeting_start_time TIME NOT NULL,
    meeting_end_time TIME NOT NULL
);

CREATE TABLE member (
    member_id SERIAL PRIMARY KEY,
    first_name VARCHAR(255) NOT NULL,
    middle_name VARCHAR(255),
    last_name VARCHAR(255) NOT NULL,
    gender VARCHAR(10),
    date_of_birth DATE,
    profession VARCHAR(255),
    email VARCHAR(255) UNIQUE NOT NULL,
    contact VARCHAR(20),
    address TEXT,
    is_active BOOLEAN DEFAULT TRUE
);

CREATE TABLE role (
    role_id SERIAL PRIMARY KEY,
    role_name VARCHAR(255) NOT NULL,
    role_description TEXT,
    is_deleted BOOLEAN DEFAULT FALSE
);

CREATE TABLE meeting_role_join (
    meeting_id INT NOT NULL,
    role_id INT NOT NULL,
    PRIMARY KEY (meeting_id, role_id),
    FOREIGN KEY (meeting_id) REFERENCES meeting(meeting_id) ON DELETE CASCADE,
    FOREIGN KEY (role_id) REFERENCES role(role_id) ON DELETE CASCADE
);

CREATE TABLE member_role_join (
    member_id INT NOT NULL,
    role_id INT NOT NULL,
    PRIMARY KEY (member_id, role_id),
    FOREIGN KEY (member_id) REFERENCES member(member_id) ON DELETE CASCADE,
    FOREIGN KEY (role_id) REFERENCES role(role_id) ON DELETE CASCADE
);
