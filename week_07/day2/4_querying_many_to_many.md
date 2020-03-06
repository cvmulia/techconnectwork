


# Many To Many - Join Tables

So we've seen how we can join 2 tables. But what if we have more than that? Let's switch back across to our `locations` database schema.

```sql
SET SCHEMA locations;
```


## Inner Joining Multiple Tables


Like before we'll decide what our left and right table will be. Let's say that the left table is `users` and the right table is `locations`.

## Let's make the magic happen

STEP ONE: Get all the columns from the left table 

```sql
SELECT users.* FROM users;
```


STEP TWO: 

```sql
SELECT users.* FROM users
INNER JOIN visits
ON visits.user_id = visits.id;
```

This is just like what we had before, we've found all the matching entries for the `users` in the `visits` table i.e. every user that visited a location.

We can now think about this entire statement as being the entire left side now, that we want to bring in some more information to.

STEP THREE: Bring in the NEXT table you want to join on.

```sql
-- queries.sql
SELECT users.* FROM users
INNER JOIN visits
ON visits.user_id = visits.id
INNER JOIN locations
ON locations.id = visits.location_id;
```

At this point we *should* be seeing the exact same information as from the previous query.

We're still seeing the rows from victims, but if there's no errors our join has been successful.

STEP FOUR: Select the data from each table you are interested in.

```sql
-- queries.sql
SELECT locations.name, users.name, visits.date FROM users
INNER JOIN visits
ON visits.user_id = visits.id
INNER JOIN locations
ON locations.id = visits.location_id;
```

We've now generated a new table. This table isn't stored, it's just generated on the fly with this query and then we select relevant data from it.

## Additional Resources:

https://blog.codinghorror.com/a-visual-explanation-of-sql-joins/
