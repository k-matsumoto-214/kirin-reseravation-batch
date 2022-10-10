package com.kirin.reservation.repository.impl;

import java.time.LocalDate;

import org.springframework.stereotype.Repository;

import com.kirin.reservation.model.ReservationDate;
import com.kirin.reservation.model.ReservationTime;
import com.kirin.reservation.repository.ReservationDateRepository;
import com.kirin.reservation.repository.mapper.ReservationDateMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class ReservationDateRepositoryImpl implements ReservationDateRepository {

  private final ReservationDateMapper mapper;

  @Override
  public ReservationDate findByReservationDate(String targetName, LocalDate reservationDate,
      ReservationTime reservationTime) {
    return ReservationDate.from(mapper.findByReservationDate(targetName, reservationDate, reservationTime));

  }
}
