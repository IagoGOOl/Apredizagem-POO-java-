package Model;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	
	private Integer roomNumber;
	protected Date checkin;
	protected Date checkout;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	public Reservation(Integer roomNumber, Date checkin, Date checkout) {
		super();
		this.roomNumber = roomNumber;
		this.checkin = checkin;
		this.checkout = checkout;
	
	}
	public Integer getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}
	public Date getCheckin() {
		return checkin;
	}
	

	public Date getCheckout() {
		return checkout;
	}
	
	
	public long duration() {
		long diff = checkout.getTime() - checkin.getTime();
		
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public void updateDates(Date checkIn, Date CheckOut ) {
		this.checkin = checkIn;
		this.checkout = CheckOut;
	}
	
	
	
	@Override
	public String toString() {
		return "Reservation [roomNumber= " + roomNumber + ", checkin= " + sdf.format(checkin) + ", checkout= " + sdf.format(checkout)+ " ," + duration() + " Nights]";
	}
	
	

}
