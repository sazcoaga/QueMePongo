package domain.atuendo;

public class Prenda {
    TipoPrenda tipo;
    Categoria categoria = tipo.getCategoria();
    String material;
    String colorPrincipal;
    String colorSecundario;

    Prenda(TipoPrenda tipo, String material, String colorPrincipal){
        this.tipo = tipo;
        this.material = material;
        this.colorPrincipal = colorPrincipal;
    }
    void setColorSecundario(String unColor){

        this.colorSecundario = unColor;

    }


}



