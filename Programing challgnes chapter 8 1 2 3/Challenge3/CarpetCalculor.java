package Challenge3;

import java.util.Scanner;

public class CarpetCalculor {
	public static void main(String[] args) {
        final double CARPET_PRICE_PER_SQUARE_FEET = 8.0;
        double width, length;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the length of room: ");
        length = keyboard.nextDouble();
        System.out.print("Enter the width of room: ");
        width = keyboard.nextDouble();
        
        RoomDimension area = new RoomDimension(length,width);
        RoomCarpet roomCarpet = new RoomCarpet(dimensions,CARPET_PRICE_PER_SQUARE_FEET);

        System.out.println(roomCarpet);
    }
}


