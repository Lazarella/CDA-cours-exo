package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name ="reservation")
public class ReservationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reservation", nullable = false)
    private Long id_reservation;

    @ManyToOne
    @JoinColumn(name = "room_id_room")
    private RoomEntity room;
    @ManyToOne
    @JoinColumn(name = "person_id_person")
    private PersonEntity person;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
}
