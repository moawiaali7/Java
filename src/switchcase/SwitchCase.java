package switchcase;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String day="Sat";
		
//		if(day=="Sat") {
//			System.out.println("This is the 1th day of the week");
//		}else if(day=="Sun") {
//			System.out.println("This is the 2th day of the week");
//		}else if(day=="Mon") {
//			System.out.println("This is the 3th day of the week");
//		}else if(day=="Tus") {
//			System.out.println("This is the 4th day of the week");
//		}else if(day=="Wed") {
//			System.out.println("This is the 5th day of the week");
//		}else if(day=="THu") {
//			System.out.println("This is the 6th day of the week");
//		}else if(day=="Fri") {
//			System.out.println("This is the 7th day of the week");
//		}
		
		switch(day) {
		case "Sat":
			System.out.println("This is the 1th day of the week");
			break;
		case "Sun":
			System.out.println("This is the 2th day of the week");
			break;
		case "Mon":
			System.out.println("This is the 3th day of the week");
			break;
		case "Tus":
			System.out.println("This is the 4th day of the week");
			break;
		case "Wed":
			System.out.println("This is the 5th day of the week");
			break;
		case "THu":
			System.out.println("This is the 6th day of the week");
			break;
		case "Fri":
			System.out.println("This is the 7th day of the week");
		}

	}

}
