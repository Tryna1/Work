package Work5;
import java.util.GregorianCalendar;

public class _9_5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		int m =  gregorianCalendar.get(GregorianCalendar.MONTH);
		m += 1;
		System.out.println(gregorianCalendar.get(GregorianCalendar.YEAR) + "�?" + m + 
				"�?" + gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH) + "�?");
		gregorianCalendar.setTimeInMillis(1234567898765L);
		m =  gregorianCalendar.get(GregorianCalendar.MONTH);
		m += 1;
		System.out.println(gregorianCalendar.get(GregorianCalendar.YEAR) + "�?" + m + 
				"�?" + gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH) + "�?");
	}

}
