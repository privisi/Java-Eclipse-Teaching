# Java-Eclipse-Teaching

You can access everything we've done in the *src* folder

Exercises for this week:

**------------Do this in a new class ------------**

1. Foreach Loop<br/>
Create a hashmap of string and potions, this will be used to store potions <br/>
Create an hashmap of string and integer, this will be used to store the effects of consumed potions <br/>
The potions should have a name, effect and duration.
Add some potions to the hashmap, the key being the name of the potion.
Your game should be a loop that takes input.
Something like: 1. drink random potion 2. wait 3. quit<br/>
When you drink a potion, add the effect 

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
