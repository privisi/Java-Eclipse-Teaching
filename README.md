# Java-Eclipse-Teaching

Exercises for this week:

**1. Make a menu where you can click start to begin the game, or exit**

**2. Create an explosive enemy that when killed, explodes into several large balls that dissapear after a second**

You can be creative with this one

**3. Create a save key in the that when pressed, saves the state of the game (enemy, player etc.)

You don't have to save everything, just save what seems to be sensible.

**4. Create a button in the menu that lets you load the game from the saved state.

**5. Create a drop item abstract class

**6. Create some drops such as score, health drops etc.

**7. When an enemy is killed give it a random chance to drop something

**8. The dropped item slowly falls down the screen and removes itself when it is out.

**9. The player should be able to pickup the dropped item.

### Challenging (don't have to do in order)

**1. Have random enemies spawn in from the top of the screen (Outside the window), this is hard because the enemies must enter from outside the window (y < 0) and not bounce, and then start bouncing when they are inside**

The enemies shoud be able to spawn anywhere from the top of the screen (not just the top left corner)

Hint - don't let the balls bounce when they are y > 0 until they first enter the visible area. (Remember how our coordinate system starts at 0,0 (Top left) and goes to 600,600 (bottom right) but stuff can be outside of the screen).

**2. Create a crosshair (Something that follows the mouse)**
Try to get it to replace your cursor so that it looks something like [this](https://upload.wikimedia.org/wikipedia/commons/thumb/9/95/Crosshairs_Red.svg/1200px-Crosshairs_Red.svg.png)
