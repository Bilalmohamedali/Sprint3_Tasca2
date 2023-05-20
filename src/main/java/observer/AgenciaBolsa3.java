package observer;

public class AgenciaBolsa3 extends Observador{

    public AgenciaBolsa3(AgenteBolsa sujeto){
        this.sujeto = sujeto;
        this.sujeto.agregar(this);
    }
    @Override
    public void actualizar() {
        System.out.println("Atencion!!! el valor en bolsa-3 ha " + sujeto.getEstado());

    }
}
