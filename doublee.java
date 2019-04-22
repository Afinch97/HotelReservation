import java.sql.Date;

public class doublee extends rooms{
	int price = 220;
	String type="double";
	public doublee(int roomNumber,int floor,  Date staringDate, Date endingDate) {
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
