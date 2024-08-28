package com.toastmasters.example.controller;

import java.util.List;
import java.util.Optional;

import com.toastmasters.example.request.ToastmastersClubRequest;
import com.toastmasters.example.response.ToastmastersClubResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.toastmasters.example.entity.ToastmastersClub;
import com.toastmasters.example.service.ToastmastersClubService;

@RestController
@RequestMapping("/api/toastmasters-club")
@CrossOrigin(origins = "http://localhost:3000")
public class ToastmastersClubController {
    
    @Autowired
    private ToastmastersClubService clubService;

    @PostMapping
    public ResponseEntity<ToastmastersClubResponse> createClub(@RequestBody ToastmastersClubRequest toastmastersClubRequest) {
        ToastmastersClubResponse toastmastersClubResponse = clubService.createClub(toastmastersClubRequest);
        return ResponseEntity.ok(toastmastersClubResponse);
    }

    @GetMapping
    public ResponseEntity<List<ToastmastersClubResponse>> getAllClubs() {
        List<ToastmastersClubResponse> clubs = clubService.getAllClubs();
        return ResponseEntity.ok(clubs);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ToastmastersClubResponse> getClubById(@PathVariable Long id) {
        ToastmastersClubResponse club = clubService.getClubById(id);
        return ResponseEntity.ok(club);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ToastmastersClubResponse> updateClub(@PathVariable Long id, @RequestBody ToastmastersClubRequest club) {
        ToastmastersClubResponse updatedClub = clubService.updateClub(id, club);
        return ResponseEntity.ok(updatedClub);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteClub(@PathVariable Long id) {
        clubService.deleteClub(id);
        return ResponseEntity.ok("Toastmasters-Club deleted with give Id : "+id);
    }
}
