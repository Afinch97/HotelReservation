import java.sql.Date;
import java.util.Calendar;

public class pentHouse extends rooms{
	int price = 2500;
	String type="Presidential Suite";
	public pentHouse(int roomNumber,int floor,  Date staringDate, Date endingDate) {
		super( roomNumber, floor,  endingDate, staringDate);
	
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
