INSERT INTO developers VALUES (5, 'Valentin', 'Ivanov', 1);


SELECT *
FROM developers
WHERE last_name IN (
  SELECT d.last_name
  FROM developers d
  GROUP BY last_name
  HAVING COUNT(d.last_name) > 1
);