

public class Landmark {
    private String landmarkId,
            name,
            typeId,
            latitude,
            longitude,
            altitude,
            description;

    //No args
    Landmark() {

    }

    //Different Data types. Uses wrapper to convert.
    Landmark(int landmarkId, String name, int typeId, float latitude, float longitude, float altitude, String description) {
        this.landmarkId = Integer.toString(landmarkId);
        this.name = name;
        this.typeId = Integer.toString(typeId);
        this.latitude = Float.toString(latitude);
        this.longitude = Float.toString(longitude);
        this.altitude = Float.toString(altitude);
        this.description = description;
    }

    //All String constructor.
    Landmark(String landmarkId, String name, String typeId, String latitude, String longitude, String altitude, String description) {
        this.landmarkId = landmarkId;
        this.name = name;
        this.typeId = typeId;
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
        this.description = description;
    }

    //Custom Calculation Methods
    public double getAltitudeD(){
        return Double.parseDouble(this.altitude);
    }

    public double getLatitudeD(){
        return Double.parseDouble(this.latitude);
    }

    public double getLongitudeD(){
        return Double.parseDouble(this.longitude);
    }

    public int getLandId(){
        return Integer.parseInt(this.landmarkId);
    }

    //Auto Gen. Getters and Setters
    public String getLandmarkIdS() {
        return landmarkId;
    }

    public void setLandmarkId(String landmarkId) {
        this.landmarkId = landmarkId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getLatitudeS() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitudeS() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getAltitudeS() {
        return altitude;
    }

    public void setAltitude(String altitude) {
        this.altitude = altitude;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
