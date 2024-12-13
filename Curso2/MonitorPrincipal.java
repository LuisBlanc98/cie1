package Curso2;

public class MonitorPrincipal {

public static void main(String[] args) {
    
    Monitor m1= new Monitor("lg",200);
    System.out.println(m1.getMarca());
    System.out.println(m1.getPrecio());

    CPU cpu1= new CPU("ibm","intel",500);
    System.out.println(cpu1.getMarca());
    System.out.println(cpu1.getProcesador());  
    System.out.println(cpu1.getPrecio());
    
}    

}
