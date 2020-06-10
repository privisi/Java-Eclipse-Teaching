# Java-Eclipse-Teaching

You can access everything we've done in the *src* folder

Exercises for this week:

**------------Do this in a new class ------------**

Fill an array using random numbers between 0 - 100 <br/>
Print out everything in the array on a straight line (use System.out.print)<br/>
It should be show something like:   13, 33, 2, 42, 23, 66, 54, 4, 74 ... (random numbers)<br/>
Then swap the value of each pair of values with each other:
A pair is the value 0 and value 1, value 2 and value 3, value 4 and value 5 ..
For example
```
  int[] swap = new int[6]
  // swap should be initialized with random numbers
  // for this example, assume swap is:
  // 1 2 3 4 5 6
  
  Swap the values inside swap:
  1 2 3 4 5 6 
  becomes
  2 1 4 3 6 5
  swap[0] becomes swap[1] and swap[1] becomes swap[0]
  swap[2] becomes swap[3] and swap[3] becomes swap[2]
  swap[4] becomes swap[5] and swap[5] becomes swap[4]
  
  and then print out the array again.
  
  hint: You will need to use a temporary variable to store one of the values
        in order to swap them.
```




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
