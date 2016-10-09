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
* Dates
* Numbers

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
The principle for street addresses are the same as for persons. We need to find some lists of reasonably looking street names, and then pick from them at random. 
The ones from the list are taken from <https://monera.dk/adresser/kobenhavn-o> and <https://monera.dk/adresser/kobenhavn-sv>. Anything list would most likely work just as well. 
I did choose to get the list of propper zip and city codes for Denmark. They were taken from <http://www.postnumre.dk>.

#### How to convert data from the net into Java 
For both persons and street addresses....

###Unique values
Sometime we have to generate N unique, but random values. There are several different ways to do this, but often it can be done by inserting ramdom values into a Set. The following code illustrates the principle:

```java
Random rnd = new Random();
Set<Integer> uniqueElements = new HashSet<>();
while ( uniqueElements.size() < N ){
	uniqueElements.add( rnd.nextInt(maxNo) );
}
return uniqueElements;
```

Notice: _N_ is the number of random elements we want, and the numbers we produce is between _0_ and _maxNo-1_. 
If _maxNo_ is less than N, the code will never stop. We can not produce a 100 different integer numbers between 0 and 10 for example. The program works best i _N_ is _very much smaller_ than _maxNo_. 

###Shuffling
Sometimes we need to get the numbers 1..100 in random order. Again, there are several ways to do this, but the easiest is to make an arraylist of the numbers, and then shuffle them:

```java
    public static List<Integer> shuffled(int N){
        ArrayList<Integer> list = new ArrayList();
        for (int i=0; i<N;i++) list.add(i);
        Collections.shuffle(list);
        return list;
    }
```
##Keys
###Primary keys
When we want to generate primary keys we can often just give each record an index number, first record getting id 1, next id 2, next id 3 etc. This can be coded using a simple counter.

###Foreign keys
When we are generating rows for a table A where one of the columns is a foreign key for table B, we must ensure that the foreign key is a valid key. 
Say we want to generate buildings (table A) who all have a foreign key to their caretaker (table B), we will collect all the primary keys of the caretaker in an ArrayList _caretakerIDs_, and as we generate buildings we will randomly pick a caretaker by picking a random random element from _caretakerIDs_.

