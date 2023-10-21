
import java.util.Random;

public class RoomLinkedList {

    Rooms head;
    Rooms tail;
    int numRooms;

    public RoomLinkedList(int numRooms) {
        this.head = null;
        this.tail = null;
        this.numRooms = numRooms;
    }

    public void addRooms(int roomType) {
    Rooms newRoom;

    if (roomType == 1) {
        newRoom = new RoomTraps();
    } else if (roomType == 2) {
        newRoom = new BattlingRoom("Fighting", null); 
    } else {
        newRoom = new Items();
    }

    if (head == null) {
        head = newRoom;
        tail = newRoom;
    } else {
        tail.nextRoom = newRoom;
        tail = newRoom;
    }
}

    public void randomizeRooms() {
        Random ran = new Random();
        for (int i = 0; i < numRooms; i++) {
            int roomType = ran.nextInt(3) + 1;
            addRooms(roomType);
        }
    }

    public void showRoom(Hero hero) {
        Rooms currentRoom = head;
        while (currentRoom != null) {
            if (currentRoom instanceof Items) {
                ((Items) currentRoom).enterRoom(hero);
            } else if (currentRoom instanceof RoomTraps) {
                ((RoomTraps) currentRoom).enterRoom(hero);
            } else if (currentRoom instanceof BattlingRoom) {
                ((BattlingRoom) currentRoom).enterRoom(hero);
            }
            currentRoom = currentRoom.nextRoom;
        }
    }
public void dispayRooms(Hero hero){
showRoom(hero);
}

    void displayRooms(Hero hero) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
