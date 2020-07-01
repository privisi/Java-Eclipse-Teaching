# Java-Eclipse-Teaching

You can access everything we've done in the *src* folder

Exercises for this week:

**------------Do this in a new package or project ------------**

1. Abstract Classes<br/>
Create an abstract class for jobs.<br/>
Create some abstract methods like DoJob.<br/>
Create some random variables like name, age, job-title etc.<br/>
Create some other classes to extend the job abstract class (doctor, fireman, teacher etc. you can make these up)<br/>
Store a bunch of these jobs into a job arraylist.<br/>
Go through the arraylist and call all the DoJob methods.<br/>
You can try to add more to this if you want (loop + scanner etc.)<br/>



<br/><br/>
**Finish other homework**
<br/>
**------------Do this in a new class ------------**

4. ArrayList problem<br/>
Create an arraylist of string.<br/>
Create an array of string.<br/>
Fill the array with 10-20 names of food.<br/>
add 5 random food to the arraylist from the array.<br/>
Write a program that loops, and asks if you want to eat food or cook food.<br/>
It should also show all the food available in the arraylist.<br/>
If you pick to eat the food, it will then ask you for a food name.<br/>
If the food exists in the arraylist, eat it and remove it from the list.<br/>
If it doesn't, warn us that it doesn't exist and don't do anything.<br/>
If there is no food in the first place, warn us and don't do anything.<br/>
If you pick to cook food, add a random food from the array into the arraylist.<br/>
Quit the loop by typing a letter / word / number of your choice.<br/>
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
you can differentiate them. For example: Goblin522 Goblin234 Goblien745...<br/>



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



**------------Grass Homework ------------**

Try to write this program using classes and methods.<br/>
I will not tell you what classes or methods to make, so you will have to decide them yourself.

You can download my version of this program here to try it out: <br/>
https://mega.nz/file/mAkEAKzT#X5pLOtlqOwqONqQhRSHs5CtpOEdw_oma8qftidt0jwU <br/>
Run start.bat to start it. <br/>
It won't run if you don't have java on your computer.

The program should display a garden with grass like this:
```
  .....
  .....
  .....
  g - grow | c - cut | q - quit
```

When you enter g, each grass should have a 1/4 chance to grow.
Grass will grow from   .  to   ,  to  / <br/>
So it might look like this after 1 grow
```
  .,..,
  ...,.
  .,..,
```
And like this after the 2nd grow
```
  ./.,,
  ,../.
  .,,.,
```

Entering c should cut all the grass and reset the garden to:
```
  .....
  .....
  .....
```

Tip: System.out.print() does not start a new line after printing <br/>
while System.out.println() starts a new line after printing
