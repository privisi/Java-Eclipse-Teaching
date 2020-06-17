# Java-Eclipse-Teaching

You can access everything we've done in the *src* folder

Exercises for this week:

**------------Do this in a new class ------------**

Fill an array with even slots with random numbers <br/>
Print out everything in the array on a straight line (use System.out.print)<br/>
It should be show something like:   13, 33, 2, 42, 23, 66, 54, 4, 74 ... (random numbers)<br/>
Then swap the first with the last, the 2nd with the 2nd last... and so on:<br/>
**Make sure you use an array with an even number of slots or this will not work**<br/>

**Make sure this can work with any even slots amount (2, 6, 18, 400 etc.)**<br/>
**You can only use the swap array, no creating other arrays**<br/>
For example:
```
  int amount = 6
  // once it works with 6, make sure it works with 100 aswell
  int[] swap = new int[amount]
  // swap should be initialized with random numbers
  // for this example, assume swap is:
  // 1 2 3 4 5 6
  
  Print out the values inside swap so we know what they are
  
  Swap the values inside swap:
  1 2 3 4 5 6 
  becomes
  6 5 4 3 2 1
  
  swap[0] becomes swap[5] and swap[5] becomes swap[0]
  swap[1] becomes swap[4] and swap[4] becomes swap[1]
  swap[2] becomes swap[3] and swap[3] becomes swap[2]
  
  and then print out the swap again.
```

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

<br/><br/>
**Fix last weeks homework**

Use methods, classes, constructors etc. just like how we did in the school project.<br/>
Make sure the grass program runs forever until we quit.<br/><br/>
When you cut the grass, you should still be able to grow it after.<br/>
Try to use a 2-dimensional array to store grass


**------------Do this in a new project ------------**

**Write a program using classes.**

Create classes for:
- Battle (this class contains main)
- Character 
- Enemy
- Weapon
- Potion

Create the following in each class (You should try to use methods):

Battle should have main and run the fight in a while loop and take inputs. <br/>
This is where all your objects (Character, Enemy etc.) are created.

The character should have health, have a weapon and have multple potions.
The character should be able to attack the enemy using the weapon.

The enemy should have health and a random damage range (such as 5-10 damage)<br/>
The enemy should be able to attack the player

The weapon should have a random damage range (such as 10-15 damage)<br/>
The weapon should have multiple different types of attacks:<br/>
- light (100% hit rate, lower damage)
- heavy (50% hit rate, higher damage)

The potions should heal a random amount (such as 30-40 health)<br/>
The character should be able to use these potions until he runs out.

The game should run with something like this:
```
  Player Health: 100 | Enemy Health: 400
  Potions left: 4
  a - light attack | h - heavy attack | p - potion
```
Note: try to create methods that take object parameters such as:
```
Character hero = new Character();
Enemy enemy = new Enemy();
...

  (This is in the Character class)
        public void TakeDamage(int damage){
          health -= damage;
        }
  (This is in the Character class)


  (This is in the Enemy class)
        public void HitCharacter(Character c){
          c.TakeDamage(3);
        }
  (This is in the Enemy class)
  

enemy.HitCharacter(hero);

// this makes it so that the Character you put the parameters inside will take damage from the enemy.
```
This is just an example, you will have to create your own methods.

**------------Do this in a new project ------------**

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
