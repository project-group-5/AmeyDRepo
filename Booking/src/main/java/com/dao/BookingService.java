package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Booking;

@Service
public class BookingService {
	@Autowired
	BookingDao bookingDAOimpl;
	public boolean seatAvalable(Booking b) {
		return bookingDAOimpl.seatAvalable( b);
	}
	public boolean seatCancelation(Booking b) {
		
		return bookingDAOimpl.seatCancelation( b);
	}
	public void addSeat() {
		bookingDAOimpl.addSeat();
	}
	public Booking findSeat(int id) {
		return bookingDAOimpl.findSeat(id);
	}
	
	

}
