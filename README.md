# Java-Eclipse-Teaching

Exercises for this week:

**1. Make the circles bounce off each other**

You should use the circle bouncing class we finished for last week.

You might need to use the circles radius and https://www.mathsisfun.com/algebra/distance-2-points.html

**2. Make our bullets in the shooter game delete when they leave the screen**

Currently the bullets go on forever even if they exit the screen, make sure to delete them when they exit the screen. We can confirm this by printing out the size of the bullets arraylist every loop.

**3. Create a player class for shooter to replace the current x, y stuff stored inside shooter**

Just like how we created a bullet class to represent the bullets coordinates, movement, and drawing, we should do the same with the player. You should pass the movement booleans in as parameters to the player movement updating method.

**4. Try to generate some enemies that float around the screen and shoots in a random direction **

You should make an enemy class, the enemy class should be circles that bounce around the screen and occassionaly shoot a bullet in a random direction

**5. Convert the bullet into an abstract class and create PlayerBullet and EnemyBullet**

You should use PlayerBullet for the player, and EnemyBullet for the enemy.

**6. Collision**

**This works with the same logic as exercise 1**

Make the player bullets kill enemies, and the enemy bullets kill the player if they touch.
