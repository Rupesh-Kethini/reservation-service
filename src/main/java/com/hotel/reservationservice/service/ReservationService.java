package com.hotel.reservationservice.service;

import com.hotel.reservationservice.dto.Reservationdto;
import com.hotel.reservationservice.entity.Reservation;
import com.hotel.reservationservice.mapper.ReservationsMapper;
import com.hotel.reservationservice.repository.ReservationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationService {

    private ReservationRepository reservationRepository;

    public List<Reservationdto> getAllReservationsByCustomer(long customerId) {
        List<Reservation> byCustomerCustomerId = reservationRepository.findByCustomerCustomerId(customerId);
        return byCustomerCustomerId.stream().map(ReservationsMapper::dtoMapper).toList();
    }

    public Reservationdto getReservationById(Long id) {
        return ReservationsMapper.dtoMapper(reservationRepository.findById(id).orElseThrow());
    }
     @Transactional
    public String createReservation(Reservation reservation) {
        //return ReservationsMapper.dtoMapper(reservationRepository.save(reservation));
         reservationRepository.save(reservation);
         return "Reservation completed for selected dates";
    }
    @Transactional
    public Reservationdto updateReservation(Long id, Reservation reservation) {
        return ReservationsMapper.dtoMapper(reservationRepository.save(reservation));
    }
    @Transactional
    public boolean deleteReservation(Long id) {
        reservationRepository.deleteById(id);
        return  reservationRepository.findById(id).isPresent();
    }
}
