package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.model.Booking;

public class BookingDAOimpl implements BookingDao {

@Autowired
SessionFactory sessoinFactory;

@Override
public boolean seatAvalable(Booking b) {
	// TODO Auto-generated method stub
	Session session = sessoinFactory.openSession();
	session.getTransaction().begin();
	session.save(findSeat(0));
	session.flush();
	session.getTransaction().commit();
	return true;
	
}



@Override
public boolean seatCancelation(Booking b) {
	// TODO Auto-generated method stub
	Session session = sessoinFactory.openSession();
	session.getTransaction().begin();
	session.delete(findSeat(0));
	session.flush();
	session.getTransaction().commit();
	session.close();
	return true;

}



@Override
public void addSeat() {
	// TODO Auto-generated metho
	Session session = sessoinFactory.openSession();
	session.getTransaction().begin();
	session.update(findSeat(0));
	session.flush();
	session.getTransaction().commit();
	session.close();
	
}



@Override
public Booking findSeat(int id) {
	// TODO Auto-generated method stub
	Session session = sessoinFactory.openSession();
	Booking seat = session.find(Booking.class, id);
	return seat;
}



}
