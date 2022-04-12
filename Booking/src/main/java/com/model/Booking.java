package com.model;

import javax.persistence.*;
@Entity
public class Booking {
	@Id
	private String seatcolour;
	private String seat;
	public String getSeatcolour() {
		return seatcolour;
	}
	public void setSeatcolour(String seatcolour) {
		this.seatcolour = seatcolour;
	}
	public String getSeat() {
		return seat;
	}
	public void setSeat(String seat) {
		this.seat = seat;
	}
	@Override
	public String toString() {
		return "Booking [seatcolour=" + seatcolour + ", seat=" + seat + "]";
	}
	public Booking(String seatcolour, String seat) {
		super();
		this.seatcolour = seatcolour;
		this.seat = seat;
	}
	
}
