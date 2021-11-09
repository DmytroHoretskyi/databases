Use Labor_SQL;
select model,speed,hd,cd,price from PC
Where (cd = '12x' or cd='24px') and price <600
order by speed;

select *
from Trip
where time_in between '1900-01-01 17:00:00.00' and '1900-01-01 23:00:00.000';

select tr.plane, cm.name as company_name
from Trip tr 
right join Company cm 
on cm.ID_comp = tr.ID_comp
group by plane;

select count(maker) from Product pr
Where pr.type = 'PC';

select distinct maker
from Product pr 
Where type = 'Laptop' and maker in (select maker from Product where type = 'Printer');

select trip_no,date, ID_psg, 
concat('row ',left(place,1),' ','place ', right(place,1)) as place_info 
from Pass_in_trip;

select date, count(distinct date) as mount
from Pass_in_trip pt 
left join Trip tr on tr.trip_no = pt.trip_no
Where tr.town_to = 'Moscow';

select maker, max(price)
from Product pr right join PC pc 
on pr.model = pc.model
group by maker;

select trip_no, name, plane, town_from,town_to, Timediff(time_in,time_out) as difference 
from Trip left join Company on 
Trip.ID_comp = Company.ID_comp;

select type,min(price) 
from Product pr
right join Laptop lp on pr.model = lp.model
union 
select type,min(price) 
from Product pr
right join PC pc on pr.model = pc.model
union 
select pr.type,min(price) 
from Product pr
right join Printer pt on pr.model = pt.model

