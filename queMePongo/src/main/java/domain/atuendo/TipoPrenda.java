package domain.atuendo;

public class TipoPrenda {
    Categoria categoria;

    TipoPrenda(Categoria categoria){
        this.categoria = categoria;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}
