public class Door {
    public String inscription;
    public boolean locked;
    public boolean closed;

    public Door(){
        inscription = "unknown";
        closed = false;
        locked = false;
    }
    
    public Door(String c){
        inscription = c;
        closed = true;
        locked = true;
    }
    // Returns true if the Door is closed, false if it is not
    public boolean isClosed(){return closed;}

    // Returns true if the Door is locked, false if it is not
    public boolean isLocked(){return !locked;}

    // open(): //Opens a Door if it is closed and unlocked
    public void open(){
        if (closed && !locked ) {
            closed = false;
        }else{
            System.out.println("Door is not closed or unlocked.");
        }
    }

    //Closes a Door if it is open
    public void close(){
        if (!closed) {
            closed = true;
        }else{
            System.out.println("Door is already closed.");
        }
    }

    //Locks a Door if it is unlocked
    public void lock(){
        if (!locked) {
            locked = true;
        }else{
            System.out.println("Door is already locked.");
        }
    }

    //Unlocks a Door if it is locked
    public void unlock(){
        if (locked) {
            locked = false;
        }else{
            System.out.println("Door is already unlocked.");
        }
    }
}
