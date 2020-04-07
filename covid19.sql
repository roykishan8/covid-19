create database covid;
use covid;
create table Cases(
date_occur varchar(30),
cases int);
create table statewise(
state varchar(30),
confirmed_case int,
active_case int,
recovered_case int,
death int);
insert into cases values("FEB 15",3);
insert into cases values("FEB 17",3);
insert into cases values("FEB 19",3);
insert into cases values("FEB 21",3);
insert into cases values("FEB 23",3);
insert into cases values("FEB 25",3);
insert into cases values("FEB 27",3);
insert into cases values("FEB 29",3);
insert into cases values("MAR 2",6);
insert into cases values("MAR 4",29);
insert into cases values("MAR 6",31);
insert into cases values("MAR 8",40);
insert into cases values("MAR 10",62);
insert into cases values("MAR 12",74);
insert into cases values("MAR 14",100);
insert into cases values("MAR 16",129);
insert into cases values("MAR 18",169);
insert into cases values("MAR 20",249);
insert into cases values("MAR 22",396);
insert into cases values("MAR 24",536);
insert into cases values("MAR 26",727);
insert into cases values("MAR 28",987);
insert into cases values("MAR 30",1251);
insert into cases values("APR 1",1998);
insert into cases values("APR 3",3059);
insert into cases values("APR 5",4289);
insert into cases values("APR 7",4858);
select * from cases;
insert into statewise values("Maharashtra",868,746,70,52);
insert into statewise values("Tamil Nadu",621,603,13,5);
insert into statewise values("Delhi",525,502,16,7);
insert into statewise values("Kerala",327,266,59,2);
insert into statewise values("Telangana",364,320,33,11);
insert into statewise values("Andhra Pradesh",303,295,5,3);
insert into statewise values("Rajasthan",301,274,25,2);
insert into statewise values("Uttar Pradesh",305,281,21,3);
insert into statewise values("Bihar",32,22,9,1);
select * from statewise;


