#[DOOR](https://massasoit.instructure.com/courses/1807485/assignments/13895857)

A computer game usually has many objects that can be seen and manipulated. One typical object is a door. Whether a player runs through a castle, attacks the forces of an evil empire, or places furniture in a room, a door often comes into play.

### **Part 1: Write a program `Door.java` as described below:**

**A Door object can:**
* display an inscription 
* be either open or closed 
* be either locked or unlocked

**The rules of how Doors work are:**

* Once the writing on a Door is set, it cannot be changed
* You may open a Door if and only if it is unlocked and closed
* You may close a Door if and only if it is open
* You may lock a Door if and only if it is unlocked, and unlock a Door if and only if it is locked. You should be able to check whether or not a Door is closed, check whether or not it is locked, and look at the writing on the Door if there is any.

**The instance variables (all public) of a Door are:**

* String inscription
* boolean locked
* boolean closed

**The methods (all public and non-static) should be:**

* Door(); //Constructor - initializes a Door with inscription "unknown", open and unlocked
* Door(String c); //Constructor - initializes a Door with inscription c, closed and locked
* isClosed(); //Returns true if the Door is closed, false if it is not
* isLocked(); //Returns true if the Door is locked, false if it is not
* open(): //Opens a Door if it is closed and unlocked
* close(); //Closes a Door if it is open
* lock(); //Locks a Door if it is unlocked
* unlock(); // Unlocks a Door if it is locked

**If any conditions of the methods are violated the action should not be taken and an appropriate error messages should be displayed**

### **Part 2: Write a program TestDoor_yourInitials.java (where yourInitials represents your initials) that instantiates three Door objects (name them d1, d2 and d3) with the door inscriptions: "Enter," "Exit", "Treasure"and "Trap" respectively.

Call the methods you have developed to manipulate the instances to be in the following states:

* The "Enter" door should be open and unlocked.
* The "Exit" door should be closed and locked.
* The "Treasure" door should be open and locked.
* The "Trap" door should be closed and  unlocked.


Submit Door.java and TestDoor_yourInitials.java.