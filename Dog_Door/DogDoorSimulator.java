package Dog_Door;

public class DogDoorSimulator { 

    public static void main(String[] args){ 
        DogDoor door = new DogDoor(); 
        Remote remote = new Remote(door); 
        System.out.println("\nFido barks to go outside..."); 
        remote.pressButton(); 
        System.out.println("\nFido has gone outside..."); 
        remote.pressButton(); 
        System.out.println("\nFido's all done..."); 
        remote.pressButton(); 
        System.out.println("\nFido's back inside..."); 
        remote.pressButton(); 
    }
}
