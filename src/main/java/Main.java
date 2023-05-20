import observer.AgenciaBolsa1;
import observer.AgenciaBolsa2;
import observer.AgenciaBolsa3;
import observer.AgenteBolsa;

public class Main {
    public static void main(String[] args) {

        AgenteBolsa agente = new AgenteBolsa();
        new AgenciaBolsa1(agente);
        new AgenciaBolsa2(agente);
        new AgenciaBolsa3(agente);

        System.out.println("La bolsa ha subido!!! ");
        agente.setEstado("subido");
        System.out.println("");
        System.out.println("La bolsa ha bajado!!! ");
        agente.setEstado("bajado");

    }
}
