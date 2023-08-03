import java.text.SimpleDateFormat;
import java.util.Date;

class Main {
public static void main(String[]
 args) {
Date customTime = new Date();
customTime.setHours(15);
customTime.setMinutes(13);

SimpleDateFormat sdf = new SimpleDateFormat("hh:mm a");
String formattedTime = sdf.format(customTime);
System.out.println("Customtime:" + formattedTime);
}
}