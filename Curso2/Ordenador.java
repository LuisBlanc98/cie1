package Curso2;

public class Ordenador {


    
    public Ordenador(Monitor monitor, CPU cpu) {
        this.monitor = monitor;
        this.cpu = cpu;
    }
    Monitor monitor= new Monitor("samsung",200);
    CPU cpu;
    public Monitor getMonitor() {
        return monitor;
    }
    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
    public CPU getCpu() {
        return cpu;
    }
    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }
    public double precioTotal() {
        return monitor.getPrecio()+cpu.getPrecio();
}
}
