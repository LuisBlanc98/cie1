package EjerciciosConExplicacion;

public class Factura {

        //Primero empezamos poniendo private int del numero y del importe, luego getters and setters, y luego constructors.
        private int numero;
        private int importe;
        public int getNumero() {
            return numero;
        }
        public void setNumero(int numero) {
            this.numero = numero;
        }
        public int getImporte() {
            return importe;
        }

        public double calcularConIVA()
        {return importe*1.21;
        }
        //el calcularConIVA se puede poner en cualquier sitio pero siempre antes del último corchete
        public void setImporte(int importe) {
            this.importe = importe;
        }
        public Factura(int numero, int importe) {
            this.numero = numero;
            this.importe = importe;
        }
            
        }
       
        
       