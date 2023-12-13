package switchcase;

public class Day {
    public void whichDay( Week day){

        switch(day) {
            case MON:
                System.out.println("This is the 1th day of the week");
                break;
            case TUE:
                System.out.println("This is the 2th day of the week");
                break;
            case WED:
                System.out.println("This is the 3th day of the week");
                break;
            case THU:
                System.out.println("This is the 4th day of the week");
                break;
            case FRI:
                System.out.println("This is the 5th day of the week");
                break;
            case SAT:
                System.out.println("This is the 6th day of the week");
                break;
            case SUN:
                System.out.println("This is the 7th day of the week");
                break;
            default:
                System.out.println(" wrong day");
        }


    }


}
