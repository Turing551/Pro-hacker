with x as(
    select level+1 x
    from dual
    connect by level<=999
)
select x.x
from x
where not exists(
  select 1 from x y
  where x.x>y.x and remainder(x.x,y.x)=0
)
;
