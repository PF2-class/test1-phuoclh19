package Challenge3;

public class RoomDimension {
	private double w;
	private double l;

	public double calculateArea() {
		return this.l * this.w;
	}

	public RoomDimension(double length, double width ) {	
		this.length = length;
		this.width = width;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	@Override
	public String toString() {
		return "RoomDimension [length=" + length + ", width=" + width + "]";
	}
}
