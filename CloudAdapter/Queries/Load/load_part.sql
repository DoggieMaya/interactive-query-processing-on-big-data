distributed create table part as external
select
  cast(c1 as int) as p_partkey,
  cast(c2 as text) as p_name,
  cast(c3 as text) as p_mfgr,
  cast(c4 as text) as p_brand,
  cast(c5 as text) as p_type,
  cast(c6 as float) as p_size,
  cast(c7 as text) as p_container,
  cast(c8 as float) as p_retailprice,
  cast(c9 as text) as p_comment
from (file '/home/adp/data/part.tbl.gz' delimiter:|);
