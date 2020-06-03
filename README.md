# Java-Eclipse-Teaching

You can access everything we've done in the *src* folder

Exercises for this week:

1. Write a program that fills an array.
```
  int[][][] sums = new int[5][5][5]
  Each answer should be the total of the positions in the array
  
  For example
  sums[0][0][0] = 0; // 0 + 1 + 2
  sums[1][2][3] = 6; // 1 + 2 + 3
  sums[3][4][1] = 8; // 3 + 4 + 1
```
2. Write a program that fills **both** arrays.
```
  int[] first = new int[15]
  int[] second = new int[15];
  
  first should be filled in increments of 15.
  (15, 30, 45 ...)
  second should be the positions of the array times itself
  (0, 1, 4, 9, 16 ...) // (0x0, 1x1, 2x2, 3x3, 4x4 ...)
```
3. Write a program that uses the two arrays that you've filled and 
minuses each value in **first** with each value in **second**
Then store the resut in a third array called result.
```
 int[] result = new int[15]
 
 Result should be:
 result[0] = 15 // 15 - 0
 result[1] = 29 // 30 - 1
 result[2] = 41 // 45 - 4
 ...
```

**------------Do this in a new Class------------**

4. Using the factorial method you did last week that uses start and end,
create a method that takes the parameters start and end and then returns
the factorial result as an int.
```
  For example
  GetFactorial(5, 2) should return: 120   // 5x4x3x2x1
```

5. Create a method that asks the user for 2 doubles, first and second,
and then asks the user for an instruction of either "add" "subtract" "multiply" "divide".
Use a switch/case statement to detect what instruction is being used and do the
correct calculation.
Return the final result
```
  For example
  first = 5.0
  second = 8.0
  
  instruction = "add"
  
  the result should be 5.0 + 8.0 = 13.0
  
  Hint: You can use scanner inside methods
  
```

**------------Do this in a new Class------------**

6. Create a method called AddAll that takes an array of int as a parameter and returns
the total sum of everything in the array as an int.
```
  For example
  int[] add = new int[5]
  for(int i = 0; i < add.length; i++){
    add[i] = i + 1;
  }
  // This sets add[0] to 1, add[1] to 2 and so on...
  // Make sure this method works with all arrays of int at any length.
  
  AddAll(add) should return: 15   // 1 + 2 + 3 + 4 + 5
  
```
**Bonus Challenge (Very Hard, I don't expect you to complete this but give it an attempt)**
7. Create an int array that goes up in increments of 1, starting from 1 (1, 2, 3 ...)
Then use a for loop to add each value inside the array to the next value.
The loop should start in the second position so that you can add the first value to the second value.
```
For example
int[] challenge = new int [10]
this array should be filled as (1, 2, 3, ..., 10)

// Run the loop ...
...

// The result should be
challenge[0] = 1; // don't add, if you try to add this it will error as you are trying (challenge[-1] + challenge[0])
challenge[1] = 3; // 1 + 2  (challenge[0] + challenge[1])
challenge[2] = 6; // 3 + 3  (challenge[1] + challenge[2])
challenge[3] = 10; // 4 + 6  (challenge[2] + challenge[3])
challenge[4] = 15; // 5 + 10  (challenge[3] + challenge[4])
...

Challenge array before:  1  2  3  4  5  ...
Challenge array after :  1  3  6  10 15 ...

```
