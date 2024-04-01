package database;

public class GeneredId { private static Long personId = 0L;
    private static Long carId = 0L;
    private static Long socialMediaId = 0L;
    public static long getPersonId(){
        return ++personId;
    }
    public static long getCarId(){
        return ++carId;
    }
    public static long getMediaId(){
        return ++socialMediaId;
    }

}
