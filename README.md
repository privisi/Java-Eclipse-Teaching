# Java-Eclipse-Teaching

You can access everything we've done in the *src* folder

Exercises for this week:

**Do this in a new project**

Make a java swing application that converts currency to other currencies.
You should have a **combo box** that lets you select some currencies (such as aud, yen, usd etc.)

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
