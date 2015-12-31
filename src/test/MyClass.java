package test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Objects;
import java.util.TimeZone;
import java.util.function.Predicate;

public class MyClass {

	public static void main(String args[]) {
		Test t1 = new Test();
		Test t2 = new Test();

		if (t1 == t2) {
			System.out.println("true");
		} else if (t1.equals(t2)) {
			System.out.println("equals");
		} else {
			System.out.println("false");
			System.out.println(t1);
			System.out.println(t2);
		}
		System.out.println(Calendar.getInstance().getTime());
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
		System.out.println(sdf.format(Calendar.getInstance().getTime()));
	}
}