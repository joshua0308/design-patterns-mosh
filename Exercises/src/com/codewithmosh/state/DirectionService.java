package com.codewithmosh.state;

public class DirectionService {
//    private TravelMode travelMode;
    private TravelModeService travelModeService;

    public Object getEta() {
        return travelModeService.getEta();

//        else if (travelMode == TravelMode.TRANSIT) {
//            System.out.println("Calculating ETA (transit)");
//            return 3;
//        }
//        else {
//            System.out.println("Calculating ETA (walking)");
//            return 4;
//        }
    }

    public Object getDirection() {
        return travelModeService.getDirection();

//        else if (travelMode == TravelMode.TRANSIT) {
//            System.out.println("Calculating Direction (transit)");
//            return 3;
//        }
//        else {
//            System.out.println("Calculating Direction (walking)");
//            return 4;
//        }
    }

    public TravelModeService getTravelModeService() {
        return travelModeService;
    }

    public void setTravelModeService(TravelModeService travelModeService) {
        this.travelModeService = travelModeService;
    }
}
