package zoo.tarea.animales.felinos;

public class Leon extends Felino {
    public int numManada;
    public float potenciaRugidoDecibel;

    public Leon(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, Float tamanoGarras, Integer velocidad, int numManada, Float potenciaRugidoDecibel) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    @Override
    public String comer() {
        return "El leon se prepara para comer su caza junto a su manada de " + numManada + " felinos mas";
    }

    @Override
    public String dormir() {
        return "El leon duerme en " + habitat;
    }

    @Override
    public String correr() {
        return "El leon con una velocidad maxima de " + velocidad + " empieza a correr para cazar a su presa";
    }

    @Override
    public String comunicarse() {
        return "El leon con una potencia de rugido de " + potenciaRugidoDecibel + " se comunica con otros felinos";
    }
}
