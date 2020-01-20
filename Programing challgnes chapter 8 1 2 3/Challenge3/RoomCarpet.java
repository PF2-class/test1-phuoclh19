package Challenge3;

public class RoomCarpet {
	private RoomDimension roomArea;
    private double carpetCost;

    public RoomCarpet(RoomDimension roomArea, double carpetCost) {
        super();
        this.roomArea = roomArea;
        this.carpetCost = carpetCost;
    }

    public double getTotalCost() {
        return carpetCost * roomArea.calculateArea();
    }

    @Override
    public String toString() {
        return "RoomCarpet [roomDimensions=" + roomDimensions
                + ", costOfCarpet=" + costOfCarpet + ", "
                        + "total cost=" + getTotalCost() + "]";
    }
}
