# Java-Eclipse-Teaching

You can access everything we've done in the *src* folder

Exercises for this week:

**------------Do this in a new class ------------**

1. HashMaps<br/>
Create a class called Spell which has a name, mana cost and power variables inside it.<br/>
Store a bunch of the spells inside a arraylist.<br/>
Create a hashmap of <String, Spell>.<br/>
Copy all of the spells from the arraylist into the hashmap, use the spell name as the key value.<br/>

2. HashMaps - Casting Spells<br/>
Create a variable that stores mana.<br/>
Create a while loop with scanner input that asks which spell you want to cast.<br/>
The while loop should print out how much mana you have every loop.<br/>
When you type the spell name, it should cast it by saying "Casting SPELL-NAME: Boom! Damage XX"<br/>
replace the spell-name and xx with the spells values.<br/>
You should also minus the mana-cost from your mana.<br/>
Once cast, you should remove the spell from the hashmap.<br/>

3. HashMaps - Showing all spells (Hard) <br/>
Extend the while loop to show you all available spells and the info of the spell (mana cost and power) every loop.<br/>
This uses a for each loop for which I will teach you more in detail next week.<br/>
Here is a hint on how to loop through all the keys and all the values in a hashmap.<br/>
```
// This loops through all the keys inside a hashmap
HashMap<String, Weapon> weps = new ....
weps.put("gun", new Weapon())
weps.put("gun2", new Weapon())

for (String i : capitalCities.keySet()) {
  System.out.println(i);
}

This will print out "gun" and "gun2"
```


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
