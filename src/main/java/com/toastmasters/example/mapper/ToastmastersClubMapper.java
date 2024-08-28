package com.toastmasters.example.mapper;

import com.toastmasters.example.entity.ToastmastersClub;
import com.toastmasters.example.request.ToastmastersClubRequest;
import com.toastmasters.example.response.ToastmastersClubResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ToastmastersClubMapper {
    ToastmastersClubMapper INSTANCE = Mappers.getMapper(ToastmastersClubMapper.class);

    ToastmastersClub toastmastersClubRequestToToastmastersClubEntity(ToastmastersClubRequest toastmastersClubRequest);

    ToastmastersClubResponse toastmastersClubEntityToToastmastersClubResponse(ToastmastersClub toastmastersClub);

    List<ToastmastersClubResponse> toastmastersClubEntityListToToastmastersClubResponseList(List<ToastmastersClub> toastmastersClubs);
}
