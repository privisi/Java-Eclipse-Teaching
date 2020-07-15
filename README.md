# Java-Eclipse-Teaching

You can access everything we've done in the *src* folder

Exercises for this week:

**------------Do this in a new class ------------**<br/>

1. Foreach Loop.<br/>

Create a hashmap of string and potions, this will be used to store potions <br/>
Create an arraylist of string used for storing what effects you have from drinking potions.<br/>
The potions should have a name (string), effect (string) and colour (string)<br/>
Create a loop that takes user input: 1 drink random potions, 2 smash potion, 3 cleanse<br/>
When you drink random potions, you have a 25% chance to drink each potion in the hashmap<br/>
When you smash a potion, ask which potion you want to smash, and remove it from the hashmap.<br/>
When a potion is drunk, display its name, effect and colour.<br/>
Also add the effect into the arraylist<br/>
When you choose cleanse, each effect should have a 25% chance of dissapearing.<br/><br/>
Show all potions available and all active efects in each loop<br/>
In order to do this, you will probably need to use foreach loops, as well as a forloop for deleting <br/>
(look at the deletion example we did).<br/><br/>

**------------Do this in a new class ------------**<br/>
2. Read and Write to files.<br/>

Create a loop that asks if you want to:<br/>
Create a file, write to a file, read a file, or quit loop<br/>
It should ask you for the file name after you pick an option<br/>
<br/>
**Bonus Challenge:**<br/>
Create other options to: delete a file and to copy a files content to another file.<br/>

Here is the code for reading from a file:
```
    try {
      File myObj = new File("filename.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
```



<br/><br/>
**Finish other homework**
<br/>

**------------Do this in your battle game ------------**

5. ArrayList problem - hard<br/>
**Use arraylist to store enemies.**<br/>
Change your battle game so that you can fight multiple enemies at the same time.<br/>
Each enemy should be able to attack you, and you should be able to select which enemy to attack.<br/>
You should probably make the character stronger or the enemies weaker etc. so you can survive.<br/>
You should also have an option to spawn more enemies. <br/>
You should have error checking for cases when there are no enemies, or if the player decides to attack<br/>
an enemy that doesn't exist (for example you have 3 enemies but the player chooses to attack enemy 7).<br/>
Killing an enemy removes it from the arraylist, spawning an enemy adds it to the arraylist.<br/>
A suggestion would be to have enemies spawn with a name and a random number attatched to that name so<br/>
you can differentiate them. For example: Goblin522 Goblin234 Goblin745...<br/>



<br/><br/>


**------------Do this in our school project ------------**

Create classes for:
- Student
- Teacher
- Class
- SchoolDay
- Main (this is where your program runs)

A student should have a name, a student id, and marks for english, math, history etc... you can make these up<br/>

A student should also have a random learning rate from 50 to 100<br/>

A teacher should have a name, a skill level and a subject they teach.
The skill level should be between 1 and 4;
You should make a teacher for every subject you decide to add.

A class should have a teacher and students

When a student attends and learns in a class, his marks go up by the teachers skill level. This mark should only be for<br/>
what the subject teacher teaches.

A schoolday should have 4 classes<br/>
Each class should assign a random teacher, and assign all students<br/>
for example, a student with an learning rate of 100 has a 100% chance of gaining marks in the subject, while<br/>
an learning rate of 50 has a 50% of gaining marks. A student with an learning rate of 75 should<br/>
have a chance of 75% of gaining marks.

As a schoolday has 4 classes, this should happen four times, once for each class.

After all the calculation has done, print out for each:
The students name, the student id, and the all the subject marks.

Do this with 5 students to begin with. 
Your program should still work if you add or remove students.

You should use methods, and constructors (you can see an example of a constructor in the Student class we did last lesson)

after everything works

you should modify schooldays so that its constructor can take a int parameter. This parameter should change<br/>
how many classes there are in a schoolday, for example if i do ```new SchoolDay(10)```, there should be 10 classes that are run<br/>
instead of 4. But if I leave it as ```new SchoolDay()```, it should by default be 4 classes.


Use methods, classes, constructors etc. just like how we did in the school project.<br/>
Make sure the grass program runs forever until we quit.<br/><br/>
When you cut the grass, you should still be able to grow it after.<br/>
Try to use a 2-dimensional array to store grass<br/>
