package observer;

import java.util.ArrayList;
import java.util.List;

public class AgenteBolsa {

    private List<Observador> observadores = new ArrayList<>();
    private String estado;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
        notificarObservadores();
    }

    private void notificarObservadores() {
        observadores.forEach(x -> x.actualizar());
    }

    public void agregar(Observador observador){
        observadores.add(observador);
    }
}
