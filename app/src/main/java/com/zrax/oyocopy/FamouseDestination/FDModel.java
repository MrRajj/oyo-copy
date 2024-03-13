package com.zrax.oyocopy.FamouseDestination;

public class FDModel {
    String LocationName;
    String LocationUrl;

    public FDModel(String locationName, String locationUrl) {
        LocationName = locationName;
        LocationUrl = locationUrl;
    }

    public String getLocationName() {
        return LocationName;
    }

    public void setLocationName(String locationName) {
        LocationName = locationName;
    }

    public String getLocationUrl() {
        return LocationUrl;
    }

    public void setLocationUrl(String locationUrl) {
        LocationUrl = locationUrl;
    }
}
