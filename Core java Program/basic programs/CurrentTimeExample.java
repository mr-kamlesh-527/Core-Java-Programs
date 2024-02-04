package classjbk;

import java.time.LocalTime;
import java.util.Date;
import java.text.SimpleDateFormat;

public class CurrentTimeExample {
//    public static void main(String[] args) {
//        // Get the current time
//        LocalTime currentTime = LocalTime.now();
//
//        // Print the current time
//        System.out.println("Current Time: " + currentTime);
//    }
	
	
	
	//it is used in older version of java like java 8
	public static void main(String[] args) {
        // Get the current time
        Date currentTime = new Date();

        // Format the current time using SimpleDateFormat
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        String formattedTime = dateFormat.format(currentTime);

        // Print the formatted current time
        System.out.println("Current Time: " + formattedTime);
    }
	
	
}

