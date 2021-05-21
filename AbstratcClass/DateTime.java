import java.time.*;

class DateTime{
	public static void main(String args[]){
		LocalDate today = LocalDate.now();
		LocalDate dob = LocalDate.of(2021, 05, 07);
		if(dob.equals(today))
			System.out.println("birthday");

	}
}
