package com.toastmasters.example.service;

import java.util.List;

import com.toastmasters.example.request.ToastmastersClubRequest;
import com.toastmasters.example.response.ToastmastersClubResponse;

public interface ToastmastersClubService {

    List<ToastmastersClubResponse> getAllClubs();

    ToastmastersClubResponse getClubById(Long id);

    ToastmastersClubResponse createClub(ToastmastersClubRequest club);

    ToastmastersClubResponse updateClub(Long id, ToastmastersClubRequest club);

    void deleteClub(Long id);
    
}
