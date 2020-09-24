# Java-Eclipse-Teaching

Exercises for this week:

**1. Change all coordinate related variables from int to float (If you haven't done it already)**

**2. Make enemies spawn moving in random directions**

**3. Make enemies shoot in random directions**

**4. Implement collision between player and enemies, and player and enemy bullets (Player should die)**

**5. When the player gets hit, display a game over screen. Allow the player to press "R" to restart the game (reset everything back to normal)**

**6. Make an enemy abstract class and replace the enemies you have as BasicEnemy**

**7. Create a few different type of enemies, (small and fast), (large and slow), (weird movement pattern etc.)**

**8. Assign your bullets damage values (declare in the abstract class and then initialize it in the children class)**

**9. Assign your enemies different health values (So that some don't die in 1 hit)**

**10. Have a random enemy spawn every few seconds somewhere that is atleast 100 pixels away from the player**

### Challenging (don't have to do in order)

**1. Have random enemies spawn in from the top of the screen (Outside the window), this is hard because the enemies must enter from outside the window (y < 0) and not bounce, and then start bouncing when they are inside**

Hint - don't let the balls bounce when they are y > 0 until they first enter the visible area. (Remember how our coordinate system starts at 0,0 (Top left) and goes to 600,600 (bottom right) but stuff can be outside of the screen).

**2. Oscillating bullets (Bullets that shake up and down, or side to side)**

Hint - Look into math sin and/or cos

You can give these bullets to an enemy

**3. Give your player health, so that they may receive multiple attacks from enemies and survive, and display the health via a red health bar somewhere.**
