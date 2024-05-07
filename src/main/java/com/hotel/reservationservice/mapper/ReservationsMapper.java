package com.hotel.reservationservice.mapper;

import com.hotel.reservationservice.dto.Customer;
import com.hotel.reservationservice.dto.Hotel;
import com.hotel.reservationservice.dto.Reservationdto;
import com.hotel.reservationservice.dto.Room;
import com.hotel.reservationservice.entity.Reservation;

public class ReservationsMapper {

    public static Reservationdto dtoMapper(Reservation reservation){
        //Object initilisation
        Reservationdto reservationdto = new Reservationdto();
        Customer customer = new Customer();
        Room room = new Room();
        Hotel hotel = new Hotel();
        //Setting values for customer
        customer.setCustomerId(reservation.getCustomer().getCustomerId());
        customer.setFirstName(reservation.getCustomer().getFirstName());
        customer.setEmail(reservation.getCustomer().getEmail());
        //Setting values hotel
        hotel.setName(reservation.getRoom().getHotel().getName());
        hotel.setLocation(reservation.getRoom().getHotel().getLocation());
        //room values
        room.setHotel(hotel);
        room.setRoomNumber(reservation.getRoom().getRoomNumber());
        room.setRoomType(reservation.getRoom().getRoomType());
        //reservation
        reservationdto.setId(reservation.getId());
        reservationdto.setCustomer(customer);
        reservationdto.setRoom(room);
        reservationdto.setReservationDate(reservation.getReservationDate());
        reservationdto.setCheckInDate(reservation.getCheckInDate());
        reservationdto.setCheckOutDate(reservation.getCheckOutDate());
        reservationdto.setTotalPrice(reservation.getTotalPrice());
        reservationdto.setStatus(reservation.getStatus());
        return reservationdto;

    }
}
