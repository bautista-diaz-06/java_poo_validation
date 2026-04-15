package zoo.tarea.animales.caninos;

public class Perro extends Canino {
    public Integer fuerzaMordida;

    public Perro(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, String color, Float tamanoColmillos, Integer fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    @Override
    public String comer() {
        return "El perro de color " + color + " está comiendo con sus colmillos de " + tamanoColmillos + "cm";
    }

    @Override
    public String dormir() {
        return "El perro con un peso de " + peso + "kg, se fue a dormir";
    }

    @Override
    public String correr() {
        return "El perro con una altura de " + altura + "m, empezó a correr en el habitat " + habitat;
    }

    @Override
    public String comunicarse() {
        return "El " + nombreCientifico + " está comunicandose con otros perros a traves de ladridos";
    }

    public Integer getFuerzaMordida() {
        return fuerzaMordida;
    }
}
