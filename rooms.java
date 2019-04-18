import java.sql.Date;

public class rooms {
	private int roomNumber;
	private int floor;
	private String custumberName;
 	boolean booked;
	Date staringDate;
	Date endingDate;
	public rooms(int roomNumber,int floor) {
		this.roomNumber = roomNumber;
		this.floor = floor;
	}
	
	public int getRoomNumber() {
		return roomNumber;
	}
	public int getFloor() {
		return floor;
	}
	public String getCustumberName() {
		return custumberName;
	}
	public void setCustumberName(String custumberName) {
		this.custumberName = custumberName;
	}
	public Date getStaringDate() {
		return staringDate;
	}
	public void setStaringDate(Date date) {
		this.staringDate = date;
	}
	public Date getEndingDate() {
		return endingDate;
	}
	public void setEndingDate(Date date) {
		this.endingDate = date;
	}
	

 }
