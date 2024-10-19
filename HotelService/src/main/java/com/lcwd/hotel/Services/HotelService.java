package com.lcwd.hotel.Services;

import com.lcwd.hotel.Entities.Hotel;

import java.util.List;


public interface HotelService {
    Hotel create(Hotel hotel);

    List<Hotel> getAll();

    Hotel get(String id);


}
