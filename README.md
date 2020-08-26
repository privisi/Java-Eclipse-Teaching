# Java-Eclipse-Teaching

You can access everything we've done in the *src* folder

Exercises for this week:

**------------Try do bonus challenge ------------**<br/>

**------------Do this in a new class ------------**<br/>
1. Read and Write to files.<br/>

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


2. Create a text editor using java swing (mvc). 
It should be able to create a file, open up a file, edit the text, save the file etc.<br/>

3. (mvc) Extend the dotter program to have 2 views, one where the dot appears and another where you can select options.

In the options view, you should use a scroll to select size of dots, and have checkboxes with different options such as:
- triangle
- square
- circle
- oval
- etc.
You should be able to check multiple of them at the same time. What ever is checked should be spawned in the dotter view.

**Challenge**

4. Make a mvc program that has a filled circle follow the mouse.

When you click the mouse, it should create / draw a circle where you clicked.

Bonus: make a second view that has a button to erase what you drew, and also circle settings such as size, colour etc/

**Hard**

5. Create a program that places 5 - 10 circles randomly. <br/>
The color and size are up to you but should be sensible.<br/>
These circles should all move in random directions and when they hit the edge of the window, they should bounce.

They should behave something like this: https://www.youtube.com/watch?v=Kxms-OtUXS0

**Extreme**

5.5 Make the circles bounce off each other aswell

