package domain.atuendo;
import java.util.List;



public class Atuendo {

 List<Prenda> prendas = new List<>();

    void cargarPrenda(Prenda ... unasPrendas){
        prendas.addAll(unasPrendas);
    }
}

