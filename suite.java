import java.sql.Date;

public class suite extends rooms{
	int price = 379;
	String type="suite";
	public suite(int roomNumber,int floor,  Date staringDate, Date endingDate) {
		super( roomNumber, floor,  endingDate, staringDate);
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public String toString() {
		return type +": " +"  RoomNumber: "+ this.getRoomNumber() + "  Floor: "+this.getFloor();
	}
	public String bookedString() {
		return "You have selected a " + type +" of room located at "+super.toString()+ " at a price of $"+(price*daysDiff(staringDate,endingDate )+"  price * days at room");
	}
}
