package com.toastmasters.example.service.impl;

import java.util.List;

import com.toastmasters.example.mapper.ToastmastersClubMapper;
import com.toastmasters.example.request.ToastmastersClubRequest;
import com.toastmasters.example.response.ToastmastersClubResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toastmasters.example.entity.ToastmastersClub;
import com.toastmasters.example.repository.ToastmastersClubRepository;
import com.toastmasters.example.service.ToastmastersClubService;

@Service
public class ToastmastersServiceImpl implements ToastmastersClubService {
    
    @Autowired
    private ToastmastersClubRepository clubRepository;

    public List<ToastmastersClubResponse> getAllClubs() {
        List<ToastmastersClub> toastmastersClubs = clubRepository.findAll();
        return ToastmastersClubMapper.INSTANCE.toastmastersClubEntityListToToastmastersClubResponseList(toastmastersClubs);
    }

    public ToastmastersClubResponse getClubById(Long id) {
        ToastmastersClub toastmastersClub = clubRepository.findById(id).get();
        return ToastmastersClubMapper.INSTANCE.toastmastersClubEntityToToastmastersClubResponse(toastmastersClub);
    }

    public ToastmastersClubResponse createClub(ToastmastersClubRequest toastmastersClubRequest) {
        ToastmastersClub toastmastersClub = ToastmastersClubMapper.INSTANCE.toastmastersClubRequestToToastmastersClubEntity(toastmastersClubRequest);

        ToastmastersClub createdToastmastersClub = clubRepository.save(toastmastersClub);

        return ToastmastersClubMapper.INSTANCE.toastmastersClubEntityToToastmastersClubResponse(createdToastmastersClub);
    }

    public ToastmastersClubResponse updateClub(Long id, ToastmastersClubRequest club) {
        if (!clubRepository.existsById(id)) {
            return null;
        }
        ToastmastersClub toastmastersClub = ToastmastersClubMapper.INSTANCE.toastmastersClubRequestToToastmastersClubEntity(club);
        toastmastersClub.setClubId(id);
        return ToastmastersClubMapper.INSTANCE.toastmastersClubEntityToToastmastersClubResponse(clubRepository.save(toastmastersClub));
    }

    public void deleteClub(Long id) {
        clubRepository.deleteById(id);
    }
}
