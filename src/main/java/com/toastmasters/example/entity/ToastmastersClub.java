package com.toastmasters.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "toastmasters_club")
public class ToastmastersClub {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "club_id")
    Long clubId;

    @Column(name = "club_name")
    String clubName;

    @Column(name = "club_location")
    String clubLocation;

    @Column(name = "club_contact")
    String clubContact;
}
