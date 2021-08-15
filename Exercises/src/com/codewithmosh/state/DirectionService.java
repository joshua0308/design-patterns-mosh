package com.codewithmosh.state;

public class DirectionService {
    private TravelMode travelModeService;

    public DirectionService(TravelMode travelModeService) {
        this.travelModeService = travelModeService;
    }

    public Object getEta() {
        return travelModeService.getEta();
    }

    public Object getDirection() {
        return travelModeService.getDirection();
    }

    public TravelMode getTravelModeService() {
        return travelModeService;
    }

    public void setTravelModeService(TravelMode travelModeService) {
        this.travelModeService = travelModeService;
    }
}
