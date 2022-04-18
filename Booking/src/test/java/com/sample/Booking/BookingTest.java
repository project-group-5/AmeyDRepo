package com.sample.Booking;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.dao.BookingService;
import com.model.Booking;

public class BookingTest {
	@Autowired

BookingService service;
@Test
	void addtest(){
	Booking b = new Booking();
	b.setSeat("0");
	b.setSeat("2");
	service.addSeat();
	Booking b1 = service.findSeat(2);
	Assert.assertEquals(2,b1.getSeat());
	}
@Test
void delete(){
	Booking b = new Booking();
	b.setSeat("0");
	b.setSeat("2");
	service.addSeat();
	Booking b1 = service.findSeat(2);
	Assert.assertEquals(2,b1.getSeat());
	}
@Test
void update(){
	Booking b = new Booking();
	b.setSeat("0");
	b.setSeat("2");
	service.addSeat();
	Booking b1 = service.findSeat(2);
	Assert.assertEquals(2,b1.getSeat());
	}

@Test
void findAllBooking(){
	Booking b = new Booking();
	b.setSeat("0");
	b.setSeat("2");
	service.addSeat();
	Booking b1 = service.findSeat(2);
	b1.setSeatcolour("grey");
	Assert.assertEquals(2,b1.getSeat());
	}
@Test
void findBooking(){
	Booking b = new Booking();
	b.setSeat("0");
	b.setSeat("2");
	b.setSeatcolour("green");
	service.addSeat();
	Booking b1 = service.findSeat(2);
	Assert.assertEquals(2,b1.getSeat());
	}


}
