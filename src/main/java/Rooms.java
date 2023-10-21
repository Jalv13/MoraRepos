public class Rooms {
    
String roomType;
Rooms nextRoom;

public Rooms(String roomType, Rooms nextRoom){
this.roomType = roomType;
this.nextRoom = nextRoom;
}
public void enterRoom(Hero hero){
System.out.println("welcome to the room!");
}
}
