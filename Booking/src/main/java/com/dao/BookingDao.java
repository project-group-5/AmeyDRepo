package com.dao;

import org.springframework.stereotype.Repository;

import com.model.Booking;

@Repository
public interface BookingDao {
	public boolean seatAvalable(Booking b);
	public boolean seatCancelation(Booking b);
	public void addSeat();
	public Booking findSeat(int id);
	
	
}
