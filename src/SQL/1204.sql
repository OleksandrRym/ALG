SELECT person_name
FROM (
         SELECT person_name
              , SUM(weight) OVER(ORDER BY turn) as weight
         FROM Queue
     ) t
WHERE t.weight <= 1000
ORDER BY t.weight DESC
LIMIT 1