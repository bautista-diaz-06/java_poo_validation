package zoo.tarea.animales.felinos;

public class Tigre extends Felino {

    public String especieTigre;

    public Tigre(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, Float tamanoGarras, Integer velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    @Override
    public String comer() {
        return "El tigre caza en solitario con sus garras de " + tamanoGarras + "cm";
    }

    @Override
    public String dormir() {
        return "El tigre " + especieTigre + " duerme en " + habitat;
    }

    @Override
    public String correr() {
        return "El tigre de " + altura + "m, corre a una velocidad de " + velocidad + " km/h";
    }

    @Override
    public String comunicarse() {
        return "El tigre con sus garras se comunica";
    }
}
