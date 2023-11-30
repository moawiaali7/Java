package inheritance.opps.concepts;

public class TestFamily {
    public static void main(String[] args) {
         Father father= new Father();
         father.David();
         father.Thomas();
         father.Christina();


         Son son =new Son();
         son.David();
         son.Thomas();
         son.Christina();


         Mother mother=new Mother();
         mother.David();
         mother.Thomas();
         mother.Christina();


         GrandMother grandMother=new GrandMother();
         grandMother.Christina();



    }
}
