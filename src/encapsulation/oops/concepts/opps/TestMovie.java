package encapsulation.oops.concepts.opps;

public class TestMovie {
    public static void main(String[] args) {
         Movie movie= new Movie();
         movie.setTitle("DG");
         System.out.println(movie.getTitle());

         movie.setRate("d");
         System.out.println(movie.getRate());
    }
}
