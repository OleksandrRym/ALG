SELECT MAX(num) as num
FROM MyNumbers
WHERE num in (
    SELECT *
    FROM MyNumbers
    Group by num
    HAVING COUNT(num) = 1
)

