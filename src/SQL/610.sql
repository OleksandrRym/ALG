SELECT x
     , y
     , z
     , case
           WHEN x + y > z
               AND x + z > y
               AND z + y > x
               THEN 'Yes'
           Else 'No'
    END AS triangle
FROM Triangle
