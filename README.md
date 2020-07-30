# Java-Eclipse-Teaching

You can access everything we've done in the *src* folder

Exercises for this week:

**Do this in a new project**

Recreate a simple version of your battle game but using javax.swing.<br/>
You should have an application that lets you play this battle game using buttons.<br/>
You should have text that displays the enemy and its details<br/>
You should also have text that displays the hero and his details<br/>
You should have buttons to do stuff like: attack, heal, run (quit) etc.<br/>
If the hero does an action (such as attack or heal) the enemy should attack the hero back<br/>
Game ends if you run, hero dies, or enemy dies.
<br/>
After you get that to work, you can try to implement some other elements such as <br/>
- Colour the enemy / hero text.
- Add colour / background to buttons (make the attack button a sword etc.)
- A picture for the enemy and hero

**You will definately have to search stuff up to do this exercise!!!!**

I recommend this site for some of the basics:
https://www.javatpoint.com/java-jbutton
<br/><br/>

Extend your application to:
- use radio buttons to select heavy or light attack
- have a text field that allows you to give an enemy a name
- try to use some other elements if your own choice

**------------Fix last weeks homework ------------**<br/>

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
