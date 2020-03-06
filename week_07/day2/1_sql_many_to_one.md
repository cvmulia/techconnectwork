# Relational Data (May to One) with raw SQL


It's in our interests to break related data into  separate but connected tables. There are a few different paradigms for doing this. They are:

* One to Many
* Many to Many
* One to One

In the following codealong, the example we will use as demonstration is for lightsabers owned by Jedi.

We will use One to Many to put together a structure that allows a Jedi to own many different lightsabres, but a lightsabre can only be owned by one Jedi.

First, lets create a new `SCHEMA` in our `database_playground`.

```sql
CREATE SCHEMA star_wars;
```

Now switch to use that schema;

```sql
SET SCHEMA star_wars;
```

**Switch over to a good text editor - Notepad++ or Atom**

Create a star_wars.sql file somewhere for us to edit this SQL..
Let's put together a characters table

```sql
CREATE TABLE characters (
  name VARCHAR(255),
  id IDENTITY PRIMARY KEY,
  darkside BOOLEAN,
  age INT
);
```


Finally, lets insert some data. Remember, the template for creating entries is the following:

```sql
INSERT INTO table_name (column_name1, column_name2) VALUES (value1, value2);
```

Let's create some characters!

```sql
-- We're going for prequel-era Star Wars here
INSERT INTO characters (name, darkside, age) VALUES ('Obi-Wan Kenobi', false,  27);
INSERT INTO characters (name, darkside, age) VALUES ('Anakin Skywalker', false, 19);
INSERT INTO characters (name, darkside, age) VALUES ('Darth Maul', true, 32);

SELECT * FROM characters;
```



# Inserting nulls

What would happen if we do this?

```sql
INSERT INTO characters (name, darkside) VALUES ('Yoda', false);
```
Any values that are missed just show up as `null`.

Fix it with and **update**.

```sql
UPDATE characters SET age = 300 WHERE name = 'Yoda';

```

> [TASK:]
> 
- Add a new character "Luke Skywalker" with age 17 and darkside set to false.
- Update "Obi-Wan Kenobi" to be age 65

```sql
INSERT INTO characters (name, darkside, age) VALUES ('Luke Skywalker', false, 17);
UPDATE characters SET age = 65 WHERE name = 'Obi-Wan Kenobi';
```



## Modeling a one to many relationship

Let's create a table to store the lightsabers of our characters.

Lightsabers will have

* hilt_metal
* colour

We will make the `id` the PRIMARY KEY. That is, it will be the identifier that will be used to mark uniqueness and will be reffered to from other tables.

### Foreign Key

We will make a `character_id` colum - that's a foreign key into characters `id` column.


```sql
CREATE TABLE lightsabers (
  id IDENTITY PRIMARY KEY,
  colour VARCHAR(255) NOT NULL,
  character_id INT,
  foreign key (character_id) references characters(id),
  hilt_metal VARCHAR(255) NOT NULL
);
```

We can see that the characters table now has a IDENTITY id and the lightsabers table now has a "references character(id)" statement. Our character_id is a reference to the primary key in the characters table.

Foreign keys are generally named according to the convention "table_name_singular_id", unless another name makes more 'sense' (but it would always have `_id` to indicate it's a foreign key).

Now, before we do anything else - what happens if we change the order of the drops and run this again? Because lightsabers now depends on characters, if we want to delete the character table we must remove any tables that depend on it's primary keys.

Otherwise we'd end up with a whole bunch of zombie references to it. Let's fix that up and put it back in the correct sequence.

If we inspect our newly created rows, we can see the ids of the characters. Let's use these to modify the creation of the lightsabers.






```sql
INSERT INTO lightsabers (colour, character_id, hilt_metal) VALUES ('green', 1, 'palladium');

INSERT INTO lightsabers (colour, character_id, hilt_metal) VALUES ('red', 2, 'gold');
```


## Conclusion

This is what we call a One to Many relationship. Each lightsaber has ONE owner (`character`). A Character can have MANY `lightsabers`, as different rows in the lightsaber table can have the same `character_id`.

As a final step, lets add one more lightsaber to Anakin/Darth Vader, then lets find all lightsabers that he has!

```sql
INSERT INTO lightsabers (colour, character_id, hilt_metal) VALUES ('red', 2, 'titanium');

SELECT * FROM lightsabers WHERE character_id = 2;
```



