# Relational Data (Many to Many) with raw SQL


We will demonstrate this with something that tracks `users` against `locations`.

Our concrete tables will be `users` and `locations`.

First lets create and set a schema for these tables.

```sql
CREATE SCHEMA locations;
SET SCHEMA locations;
```

Now create the first two tables.

```sql

DROP TABLE users;
DROP TABLE locations;

CREATE TABLE users (
  id IDENTITY PRIMARY KEY,
  name VARCHAR(255)
);

CREATE TABLE locations (
  id IDENTITY PRIMARY KEY,
  category VARCHAR(255),
  name VARCHAR(255)
);

```

## Join Table

We now need a join table that allows us to create mappings from both sides. This table will hold two columns, each tracking the id from the tables we wish to join.


```sql
DROP TABLE visits;


CREATE TABLE visits (
  id IDENTITY PRIMARY KEY,
  user_id INT,
  foreign key (user_id) references users(id),
  location_id INT,
  foreign key (location_id) references locations(id),
  date DATETIME
);
```

2013-07-31 00:00:00
## Inserting data


```sql
INSERT INTO users (name) VALUES ('James');
INSERT INTO users (name) VALUES ('Lars');
INSERT INTO users (name) VALUES ('Kirk');
INSERT INTO users (name) VALUES ('Rob');
```


```sql
INSERT INTO locations (category, name) VALUES ('city', 'San Francisco');
INSERT INTO locations (category, name) VALUES ('restaurant', 'the french laundry');
INSERT INTO locations (category, name) VALUES ('city', 'Glasgow');
INSERT INTO locations (category, name) VALUES ('venue', 'hollywood bowl');
INSERT INTO locations (category, name) VALUES ('venue', 'King Tuts Wah Wah Hut');
```



Now lets setup some data in the join table `visits` which will associate the `users` with `locations` through many to many.

```sql
INSERT INTO visits (user_id, location_id, date) VALUES (1, 1, '2013-07-31 14:00:00');
INSERT INTO visits (user_id, location_id, date) VALUES (1, 3, '2014-06-21 14:00:00');
INSERT INTO visits (user_id, location_id, date) VALUES (2, 3, '2019-06-17 14:00:00');
``

This allows us to say:

* **James was in San Francisco on 31st July 2013 at 2pm**
* **James was in Glasgow on 6th June 2014**
* **Lars was in Glasgow on 17th June 2019**
