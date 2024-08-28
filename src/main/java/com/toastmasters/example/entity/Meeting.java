package com.toastmasters.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "meeting")
public class Meeting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "meeting_id")
    private Long meetingId;

    @Column(name = "meeting_title")
    private String meetingTitle;

    @Column(name = "meeting_description")
    private String meetingDescription;

    @Column(name = "meeting_date")
    private LocalDate meetingDate;

    @Column(name = "meeting_start_time")
    private LocalTime meetingStartTime;

    @Column(name = "meeting_end_time")
    private LocalTime meetingEndTime;

//    @ManyToMany
//    @JoinTable(
//            name = "meeting_member_join",
//            joinColumns = @JoinColumn(name = "meeting_id"),
//            inverseJoinColumns = @JoinColumn(name = "member_id")
//    )
//    private Set<Member> members = new HashSet<>();
}
