create table student
(
    id integer,
    name text,
    address integer,
    phone_number integer,
    parentID integer,
    parentName text,
    present boolean default(true),
    class integer,
    primary key (id),
    foreign key (parentID) references parent (id)
        on delete restrict on update cascade,
    foreign key (parentName) references parent (name)
        on delete restrict on update cascade,
    foreign key (class) references course (id)
        on delete restrict on update cascade
);

create table parent
(
    id integer,
    name text,
    workplace text,
    phone_number integer,
    address integer,
    childID integer,
    childName text,
    primary key (id),
    foreign key (childID) references student (id)
        on delete restrict on update cascade,
    foreign key (childName) references student (name)
        on delete restrict on update cascade
);

create table teacher
(
    id integer,
    name text,
    courseID integer,
    courseName text,
    phone_number integer,
    address integer,
    primary key (id),
    foreign key (courseID) references course (id)
        on delete restrict on update cascade,
    foreign key (courseName) references course (name)
        on delete restrict on update cascade
);

create table presence
(
    id integer,
    studentID integer,
    studentName text,
    courseID integer,
    courseName text,
    presenceDate integer,
    presenceCode integer,
    primary key (id),
    foreign key (studentID) references student (id)
        on delete restrict on update cascade,
    foreign key (studentName) references student (name)
        on delete restrict on update cascade,
    foreign key (courseID) references course (id)
        on delete restrict on update cascade,
    foreign key (courseName) references course (name)
        on delete restrict on update cascade
);

create table course
(
    id integer,
    name text,
    teacherID integer,
    teacherName text,
    primary key (id),
    foreign key (teacherID) references teacher (id)
        on delete restrict on update cascade,
    foreign key (teacherName) references teacher (name)
        on delete restrict on update cascade
);
