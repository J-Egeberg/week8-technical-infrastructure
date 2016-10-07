#Database population
To fill data into a database is also known as _populating_ a database.
Today we will look into how to generate random realistic data. The idea behind this is:

* When demoing, it looks very much better if there are a lot of realistic looking data instead of 3 persons named test1, test2, test3.
* Having realistic size of data helps spotting some user interface design issues.
* Having realistic size data can help in spotting performance issue

##Kind of data to be generated
Each system have their own special data, so one cannot address all possibilities. We will adress the following kinds of data:

* Person names
* Street addresses
* Professions/titles
* Dates
* Numbers (different distributions)

In relational databases there are three further issues which comes up a lot:

* primary keys
* unique constraints on other keys
* foreign keys

### Person names
In Denmark we have a name format where each person has one or more first names and one last name. First names can be hyphened or not: "Lars-Peter" or  "Lars Peter", "Marie-Luise" or "Marie Louise". To generate names we will just look at a situation where we generate one first name and one last name.

In the [demo project](something) <!-- TODO update link-->
a list of Danish first names are collected. The list was obtained from <http://www.urd.dk/fornavne/fornavne.htm>. I was not so concerned with making sure the list was complete or 100% correct, only that it "was good enough" for generating random names. The list of last names is a bit different - it is taken from <https://ast.dk/born-familie/navne/navnelister/frie-efternavne>, and only includes last names used by more than 2000 people.

To generate a random name one can therefore pick one random name from the list of first names, and one from the list of last names.

### Street addresses

### Titles (in Danish)
Again, the idea is to pick a list of existing positions and pick a random one. I picked my list from <https://da.wikipedia.org/wiki/Kategori:Stillingsbetegnelser>.


