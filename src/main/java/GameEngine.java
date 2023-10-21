
import java.util.Random;
import java.util.Scanner;

public class GameEngine {

    public void startGame() {
        int numRooms = 10; // Change this to the desired number of rooms
        RoomLinkedList roomList = new RoomLinkedList(numRooms);
        roomList.randomizeRooms();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to your demise!");
        System.out.println("Type 'y' to continue or 'n' to back away");

        String userInput = scanner.nextLine().trim();

        if (userInput.equalsIgnoreCase("y")) {
            Hero hero = new Hero(100, 10, 5, 20, 30, 1, 0);
           // roomList.displayRooms(hero);
            Random r = new Random();
            int roomIndex = r.nextInt(numRooms);
            Rooms currentRoom = roomList.head;
int currentIndex = 0;
while (currentIndex < roomIndex && currentRoom != null) {
                currentRoom = currentRoom.nextRoom;
                currentIndex++;
            }

            // Check if the room is not null and enter it with the hero
            if (currentRoom != null) {
                currentRoom.enterRoom(hero);
            } else {
                System.out.println("No rooms found. Exiting the game.");
            }
        } else {
            System.out.println("Goodbye! You have exited the game.");
        }
    }
}
