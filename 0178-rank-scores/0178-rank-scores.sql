# Write your MySQL query statement below
Select score, Dense_rank()over(Order by score Desc) as 'rank' from scores;