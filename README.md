# Java-Eclipse-Teaching

You can access everything we've done in the *src* folder

Exercises for this week:

### There is a major assessement at the bottom, you should try to finish everything else before doing it. If you cannot do / finish the other tasks, you should still do the major assessement ###

**Re-implement this but with a currency converter**
**Instead of 100 if else statements**
**(You are not allowed to use IF statements for comparing currencies!)**

Check this out for a currency converter example --> (https://github.com/privisi/Java-Eclipse-Teaching-Appendix)

**Make sure you are using Lambda Expressions!!!**

Make a java swing application that converts currency to other currencies.<br/>
You should have a **combo box** that lets you select some currencies to convert from (such as aud, yen, usd etc.)<br/>
You should have another **combo box** that lets you select some currencies to convert to (such as aud, yen, usd etc.)<br/>
Then you should have a text field to enter how much currency to convert.<br/>
You should have a button to convert <br/>
When the button is clicked, you should have a pop up box (new window) open up to tell you how much the converted currency is<br/>
Something like this:
```
100 Aud to Yen is: 7500 Yen
[ Click here to close ]
```

**Challenge**
Output the conversions into text files, so every time you click convert, a new line is added to a text file (without overwriting the previous lines) with the conversion string.

**Challenge 2**
Put a scroll bar in with 0 on the bottom side and 100 on the top side.<br/>
When you scroll the bar, it changes the number in the text field to where the scroll bar is.<br/>
For example: If the scroll bar is 25% of the way, the text field should say 25.0,<br/>
If the scroll is 2/3rds of the way, the text field should say 66.66 or something close<br/>

**------------Finish Making this------------**

**Make sure you are using the MVC approach**

Again, Check this out for a simple MVC exampme --> (https://github.com/privisi/Java-Eclipse-Teaching-Appendix)

Make [this (click here)](http://www.java2s.com/Code/JavaImages/ScrollBarColorSelect.PNG)

**------------Try do bonus challenge ------------**<br/>

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



## Major Assessement ##

Make this using the MVC approach ->
https://github.com/privisi/Java-Eclipse-Teaching-Appendix/raw/master/EvenOddGame.jar
