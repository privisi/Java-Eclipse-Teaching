# Java-Eclipse-Teaching

You can access everything we've done in the *src* folder

Exercises for this week:

**------------Do this in a new project ------------**

**Write a program using classes.**

Create classes for:
- Character (this class contains main)
- Enemy
- Weapon
- Potion

Create the following in each class (You should try to use methods):

The character should have health, have a weapon and have multple potions.

The enemy should have health and a random damage range (such as 5-10 damage)
The enemy should be able to attack the player

The weapon should have a random damage range (such as 10-15 damage)
The weapon should have multiple different types of attacks:
- light (100% hit rate, lower damage)
- heavy (50% hit rate, higher damage)

The potions should heal a random amount (such as 30-40 health)
The character should be able to use these potions until he runs out.

The game should run with something like this:
```
  Player Health: 100 | Enemy Health: 400
  Potions left: 4
  a - light attack | h - heavy attack | p - potion
```

**------------Do this in a new project ------------**

Try to write this program using classes and methods.
I will not tell you what classes or methods to make, so you will have to decide them yourself.

The program should display grass like this:
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
