package intermediate;

import static constant.Constants.__;
import static org.junit.Assert.*;
import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class AboutDates {
	
	private Date date = new Date(100010001000L);
	
	@Test
	public void dateToString() {
		assertEquals(date.toString(), __);
	}
	
	@Test
	public void changingDateValue() {
		int oneHourInMiliseconds = 3600000;
		date.setTime(date.getTime() + oneHourInMiliseconds);
		assertEquals(date.toString(), __);
	}
	
	@Test
	public void usingCalendarToChangeDates() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, 1);
		assertEquals(cal.getTime().toString(), __);
	}

	@Test
	public void usingRollToChangeDatesDoesntWrapOtherFields() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.roll(Calendar.MONTH, 12);
		assertEquals(cal.getTime().toString(), __);
	}
	
	@Test
	public void usingDateFormatToFormatDate() {
		String formattedDate = DateFormat.getDateInstance().format(date);
		assertEquals(formattedDate, __);
	}
	
	@Test
	public void usingDateFormatToFormatDateShort() {
		String formattedDate = DateFormat.getDateInstance(DateFormat.SHORT).format(date);
		assertEquals(formattedDate, __);
	}
	
	@Test
	public void usingDateFormatToFormatDateFull() {
		String formattedDate = DateFormat.getDateInstance(DateFormat.FULL).format(date);
		// There is also DateFormat.MEDIUM and DateFormat.LONG... you get the idea ;-)
		assertEquals(formattedDate, __);
	}
	
	@Test
	public void usingDateFormatToParseDates() throws ParseException {
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		Date date2 = dateFormat.parse("01-01-2000");
		assertEquals(date2.toString(), __);
		// What happened to the time? What do you need to change to keep the time as well?
	}
}
