package encapsulation.oops.concepts.opps;

public class Movie {

     private String Title;
     private String Rate;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getRate() {
        return Rate;
    }

    public void setRate(String rate) {
        if (rate.equals("A") || rate.equals("B") || rate.equals("C")){
            Rate = rate;
        }else {
            Rate="Non";
        }

    }
}
