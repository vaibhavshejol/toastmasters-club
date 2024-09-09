package com.toastmasters.example.mapper;

import com.toastmasters.example.entity.ToastmastersClub;
import com.toastmasters.example.request.ToastmastersClubRequest;
import com.toastmasters.example.response.ToastmastersClubResponse;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-09T09:49:31+0530",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.8.jar, environment: Java 21.0.3 (Microsoft)"
)
public class ToastmastersClubMapperImpl implements ToastmastersClubMapper {

    @Override
    public ToastmastersClub toastmastersClubRequestToToastmastersClubEntity(ToastmastersClubRequest toastmastersClubRequest) {
        if ( toastmastersClubRequest == null ) {
            return null;
        }

        ToastmastersClub toastmastersClub = new ToastmastersClub();

        toastmastersClub.setClubName( toastmastersClubRequest.getClubName() );
        toastmastersClub.setClubLocation( toastmastersClubRequest.getClubLocation() );
        toastmastersClub.setClubContact( toastmastersClubRequest.getClubContact() );

        return toastmastersClub;
    }

    @Override
    public ToastmastersClubResponse toastmastersClubEntityToToastmastersClubResponse(ToastmastersClub toastmastersClub) {
        if ( toastmastersClub == null ) {
            return null;
        }

        ToastmastersClubResponse toastmastersClubResponse = new ToastmastersClubResponse();

        toastmastersClubResponse.setClubId( toastmastersClub.getClubId() );
        toastmastersClubResponse.setClubName( toastmastersClub.getClubName() );
        toastmastersClubResponse.setClubLocation( toastmastersClub.getClubLocation() );
        toastmastersClubResponse.setClubContact( toastmastersClub.getClubContact() );

        return toastmastersClubResponse;
    }

    @Override
    public List<ToastmastersClubResponse> toastmastersClubEntityListToToastmastersClubResponseList(List<ToastmastersClub> toastmastersClubs) {
        if ( toastmastersClubs == null ) {
            return null;
        }

        List<ToastmastersClubResponse> list = new ArrayList<ToastmastersClubResponse>( toastmastersClubs.size() );
        for ( ToastmastersClub toastmastersClub : toastmastersClubs ) {
            list.add( toastmastersClubEntityToToastmastersClubResponse( toastmastersClub ) );
        }

        return list;
    }
}
