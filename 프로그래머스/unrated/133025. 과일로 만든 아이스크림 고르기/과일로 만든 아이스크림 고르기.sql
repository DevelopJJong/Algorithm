-- 코드를 입력하세요
SELECT f.flavor
from first_half as f inner join icecream_info as i
on f.flavor = i.flavor
# FLAVOR
# from FIRST_HALF f 
# join ICECRAM_INFO i
# on f.FLAVOR = i.FLAVOR
where i.INGREDIENT_TYPE = 'fruit_based' and f.total_order > 3000
order by f.total_order desc;