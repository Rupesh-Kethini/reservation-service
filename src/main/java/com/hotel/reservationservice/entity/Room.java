package com.hotel.reservationservice.entity;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;

@Getter
@Setter
@Entity //dummy entity in this service
@Table(name = "room")
@ToString
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;

    @Column(name = "room_number", length = 50)
    private String roomNumber;

    @Column(name = "room_type", length = 100)
    private String roomType;

    @Column(name="price", nullable = false)
    private double price;

}