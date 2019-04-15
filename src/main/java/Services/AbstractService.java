package Services;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class AbstractService {

    public static Date convertStringToDate(String dateString) {
        try {
            return new SimpleDateFormat("yyyy-MM-DD HH:mm:ss").parse(dateString);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

}
