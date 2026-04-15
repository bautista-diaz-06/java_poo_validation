package zoo.tarea.animales.felinos;

public class Guepardo extends Felino {


    public Guepardo(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, Float tamanoGarras, Integer velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
    }

    @Override
    public String comer() {
        return "El guepardo corre a una velocidad de " + velocidad + " km/h para cazar";
    }

    @Override
    public String dormir() {
        return "El guepardo duerme en " + habitat;
    }

    @Override
    public String correr() {
        return "El guepardo corre a una velocidad de " + velocidad +  " km/h";
    }

    @Override
    public String comunicarse() {
        return "El guepardo realiza sonidos con sus garras de tamaño " + tamanoGarras + " para poder comunicarse";
    }
}
