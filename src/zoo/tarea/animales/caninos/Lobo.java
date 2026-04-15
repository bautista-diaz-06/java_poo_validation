package zoo.tarea.animales.caninos;

public class Lobo extends Canino {
    public int numCarnada;
    public String especieLobo;

    public Lobo(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, String color, Float tamanoColmillos, int numCarnada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.numCarnada = numCarnada;
        this.especieLobo = especieLobo;
    }

    @Override
    public String comer() {
        return "El lobo con " + numCarnada + " carnadas, come en manada";
    }

    @Override
    public String dormir() {
        return "El lobo de un peso de " + peso + " kg, y de " + largo + "cm de largo, duerme en " + habitat;
    }

    @Override
    public String correr() {
        return "El lobo corre junto a su manada para poder encontrar carnadas";
    }

    @Override
    public String comunicarse() {
        return "El lobo " + especieLobo + "se comunica con aullidos para su manada";
    }
}
