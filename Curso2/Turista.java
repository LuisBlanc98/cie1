package Curso2;

public class Turista extends SuperTurista{

   private Maleta maleta1;
   private Maleta maleta2;

   public Maleta getMaleta1() {
      return maleta1;
   }

   public void setMaleta1(Maleta maleta1) {
      this.maleta1 = maleta1;
   }

   public Maleta getMaleta2() {
      return maleta2;
   }

   public void setMaleta2(Maleta maleta2) {
      this.maleta2 = maleta2;
   }

   public Turista(String nombre) {
      super();
      this.setNombre(nombre);
   }
   
   public double pesoTotal() {
      double pesoTotal=0;
      if (maleta1 !=null)
         pesoTotal= pesoTotal+maleta1.getPeso();
      if (maleta2 !=null)
         pesoTotal= pesoTotal+maleta2.getPeso();
         return pesoTotal;
   }

   public double pesoTotal(String tipoCarcasa) {
      double pesoTotal= pesoTotal();
      
      if(tipoCarcasa.equals("ligera")) {
         pesoTotal=pesoTotal+2;
      } else {
         pesoTotal= pesoTotal+4;
      }
      return pesoTotal;
   }

      //return (maleta1.getPeso()+maleta2.getPeso());

   public double pesoTotal(double sobrePeso) {
      
      return pesoTotal()+sobrePeso;
   }

}








