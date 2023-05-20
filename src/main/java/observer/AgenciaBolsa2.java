package observer;

public class AgenciaBolsa2 extends Observador{

    public AgenciaBolsa2(AgenteBolsa sujeto){
        this.sujeto = sujeto;
        this.sujeto.agregar(this);
    }
    @Override
    public void actualizar() {
        System.out.println("Atencion!!! el valor en bolsa-2 ha " + sujeto.getEstado());
    }
}
