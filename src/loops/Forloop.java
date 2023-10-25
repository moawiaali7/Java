package loops;

public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<10; i++) {
			System.out.println(i+"");
		}
		
		for( int i=10; i>0;i--) {
			System.out.println(i);
			
		}
	for(int i=0; i<10;i++) {
			if(i%3==0) {
				System.out.println(i);
		}
			
		
		for( int a=0;a<10;a++) {
			if(a==6) {
				break;
			}
			System.out.println(a);
		}
		
			
		for (int b=0;b<20;b++) {
			if(b>10 && b<15) {
				continue;
			}
			System.out.println(b);
		}
		}
		
	}

}
