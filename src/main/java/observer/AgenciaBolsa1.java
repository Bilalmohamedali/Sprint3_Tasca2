package observer;

public class AgenciaBolsa1 extends Observador{
    public AgenciaBolsa1(AgenteBolsa sujeto){
        this.sujeto = sujeto;
        this.sujeto.agregar(this);
    }
    @Override
    public void actualizar() {
        System.out.println("Atencion!!! el valor en bolsa-1 ha " + sujeto.getEstado());
    }
}
