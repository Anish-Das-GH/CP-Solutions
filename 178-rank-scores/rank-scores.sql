/* Write your PL/SQL query statement below */
select * from (
    select score, dense_rank() over (order by score desc) as rank 
    from Scores order by score desc
)ranked_scores;