package com.example.parking.service;

import com.example.parking.dto.ParkinglotDto;
import com.example.parking.parkinglot.converter.ParkinglotConverter;
import com.example.parking.repository.ParkingLotRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ParkingLotService {

    private final ParkingLotRepository parkingLotRepository;
    private final ParkinglotConverter parkinglotConverter;


    public List<ParkinglotDto> getNearByParkinglots(double latitude, double longitude) {
        var nearestParkingLots = parkingLotRepository.findNearestParkingLots(latitude, longitude);
        return nearestParkingLots.stream()
                .map(parkinglotConverter::toDto)
                .collect(Collectors.toList());
    }
}