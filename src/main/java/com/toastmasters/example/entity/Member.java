package com.toastmasters.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="member")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long memberId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "gender")
    private String gender;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name= "profession")
    private String profession;

    @Column(name = "email")
    private String email;

    @Column(name = "contact")
    private String contact;

    @Column(name = "address")
    private String address;

    @Builder.Default
    @Column(name = "is_active")
    private boolean isActive = Boolean.TRUE;

//    @ManyToOne
//    @JoinColumn(name = "club_id", referencedColumnName = "club_id")
//    private ToastmastersClub toastmastersClub;

//    @ManyToMany(mappedBy = "members")
//    private Set<Role> roles = new HashSet<>();

//    @ManyToMany(mappedBy = "members")
//    private Set<Meeting> meetings = new HashSet<>();
}
