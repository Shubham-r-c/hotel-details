package com.lcwd.rating.RatingService.Entities;

import com.lcwd.hotel.Entities.Hotel;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name= "Micro_ratings")
@Entity
public class Rating {
    @Id
    private String ratingId;
    @PrePersist
    public void prePersist() {
        if (this.ratingId == null) {
            this.ratingId = UUID.randomUUID().toString();
        }
    }
    private String userId;
    private String hotelId;
    private int rating;
    private String feedback;
    @Transient
    private Hotel hotel;


}

