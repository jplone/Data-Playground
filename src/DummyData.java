public class DummyData {

    /*
     rivate String landmarkId,
            name,
            typeId,
            latitude,
            longitude,
            altitude,
            description;
     */

    Landmark one = new Landmark("01","CSULA", "00", "34.06680967214463","-118.16812992095947","150m","California State University Los Angeles");
    Landmark two = new Landmark("02","Academy Hillside","01","34.05118381952201","-118.17059755325317", "144","Neighboring Hillside to Cal State Los Angeles");
    Landmark three = new Landmark("03", "Mt. Washington", "02", "34.0985857913479","-118.2","173 m","Neighboring Mountain to Cal State LOs Angeles");

    private Landmark[] landmarks = {one,two,three};

    Landmark[] getData(){
        return this.landmarks;
    }

    public static void main(String []args){
        DummyData data = new DummyData();

        for(int i =0 ; i < data.getData().length; i ++){
            //System.out.println("Name of Item: " + data.landmarks[i].getName());
            System.out.print(data.landmarks[i].getLandId()+ " ");
            System.out.print(data.landmarks[i].getName()+ " ");
            System.out.print(data.landmarks[i].getTypeId()+ " ");
            System.out.print(data.landmarks[i].getLatitudeS()+ " ");
            System.out.print(data.landmarks[i].getLongitudeS()+ " ");
            System.out.print(data.landmarks[i].getAltitudeS()+ " ");
            System.out.print(data.landmarks[i].getDescription()+ " ");
            System.out.println();
        }
    }
}


