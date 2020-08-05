# Java-Eclipse-Teaching

You can access everything we've done in the *src* folder

Exercises for this week:

**Do this in a new project**

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

**------------Try bonus challenge ------------**<br/>

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
