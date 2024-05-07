package com.hotel.reservationservice.controller;

import com.hotel.reservationservice.dto.Reservationdto;
import com.hotel.reservationservice.entity.Reservation;
import com.hotel.reservationservice.service.ReservationService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class ReservationController {

    private ReservationService reservationService;

    @GetMapping("/{customerId}")
    public ResponseEntity<List<Reservationdto>> getAllReservationsByCustomer(@PathVariable long customerId) {
        List<Reservationdto> reservations = reservationService.getAllReservationsByCustomer(customerId);
        return new ResponseEntity<>(reservations, HttpStatus.OK);
    }

    @GetMapping("/{customerId}/{id}")
    public ResponseEntity<Reservationdto> getReservationById(@PathVariable("id") Long id) {
        Reservationdto reservation = reservationService.getReservationById(id);
        if (reservation != null) {
            return new ResponseEntity<>(reservation, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping()
    public ResponseEntity<String> createReservation(@RequestBody Reservation reservation) {
        String createdReservation = reservationService.createReservation(reservation);
        return new ResponseEntity<>(createdReservation, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Reservationdto> updateReservation(@PathVariable("id") Long id, @RequestBody Reservation reservation) {
        Reservationdto updatedReservation = reservationService.updateReservation(id, reservation);
        if (updatedReservation != null) {
            return new ResponseEntity<>(updatedReservation, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteReservation(@PathVariable("id") Long id) {
        boolean deleted = reservationService.deleteReservation(id);
        if (deleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
