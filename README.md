# Java-Eclipse-Teaching

You can access everything we've done in the *src* folder

Exercises for this week:

1. Write a program that fills an array.
```
  double[] halves = new double[50]
  Each answer should be half of the arrays position
  
  !!! Make sure you divide using  2.0  or it won't work !!!
  
  For example
  halves[1] = 0.5
  halves[2] = 1
  halves[7] = 3.5
  ...
  halves[50] = 25
```

2. Write a program that fills an array.

```
  int[][] multiples = new int[10][10]
  Each one should contain: The row * the column
  For example
  multiples[0][0] = 0         // 0 x 0
  multiples[1][1] = 1         // 1 * 1
  multiples[2][6] = 12        // 2 * 6
  ...
  multiples[5][5] = 25        // 5 * 5
  multiples[9][9] = 81        // 9 * 9
```

3. Write a method that: 
```
  Takes 3 ints
  Multiples the first 2 ints together
  Adds the 3rd int to the previous result
  Double the previous result
  
  For Example
  Numbers are: 3, 4, 5
  Final answer is: 34
```

4. White a method that does a factorial (explanation below)

```
  A factorial is a number that times everything below it
  For example:
  factorial of  5  is  5 x 4 x 3 x 2 x 1 = 120
  factorial of  3  is  3 x 2 x 1 = 6
  
  The method should take 1 int and then do a factorial on it.
  Hint: Use for loop!
  
```

5. Bonus challenge (Hard):

```
  Copy the previous method (factorial) and change it so that:
  The method takes 2 ints: start and end
  
  The method should do a factorial to the int start, but stop at
  the int end instead of going all the way to 1.
  
  For example:
  Start = 6
  End = 4
  
  What the method does: 
  6 * 5 * 4 = 120
  
  Another example:
  Start = 5
  End = 2
  
  What the method does:
  5 * 4 * 3 * 2 = 120
```
