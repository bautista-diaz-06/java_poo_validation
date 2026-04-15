package zoo.tarea.animales;

import zoo.tarea.animales.caninos.Lobo;
import zoo.tarea.animales.caninos.Perro;
import zoo.tarea.animales.felinos.Guepardo;
import zoo.tarea.animales.felinos.Leon;
import zoo.tarea.animales.felinos.Tigre;
import zoo.tarea.animales.mamiferos.Mamifero;

public class Main {
    public static void main(String[] args) {
        Mamifero perro = new Perro("Mundo natural", 1.5f, 1.7f, 40.0f, "Perro", "Marrón", 1.0f, 1);

        System.out.println(((Perro) perro).fuerzaMordida);

        Mamifero lobo = new Lobo("Montaña", 1.5f, 2.0f, 180f, "Lobo de montaña", "Gris", 1.5f, 3, "Lobo de montaña");

        Mamifero leon =  new Leon(
                "Sabana africana",
                1.2f,
                2.5f,
                190f,
                "Panthera leo",
                5.0f,      // garras
                80,        // velocidad
                10,        // manada
                110.0f     // rugido
        );

        Mamifero guepardo = new Guepardo(
                "Sabana",
                0.9f,
                1.5f,
                70f,
                "Acinonyx jubatus",
                4.0f,
                110
        );

        Mamifero tigre = new Tigre("Selva", 1.2f, 1.75f, 85f, "Tigre", 5.0f, 50, "Tigre con rayas");

        //inicializamos un array que sea de tipo Mamifero, es decir la variable animales tendrá los valores de mamifero
        Mamifero[] animales = new Mamifero[5];
        animales[0] = perro;
        animales[1] = lobo;
        animales[2] = leon;
        animales[3] = guepardo;
        animales[4] = tigre;

        //animal tiene el tipo de dato de Mamifero, y también los datos que ahora contiene el array de animales,
        //esto es para poder acceder a los metodos
        for(Mamifero animal: animales){
            System.out.println(animal.comer());
            System.out.println(animal.comunicarse());
            System.out.println(animal.dormir());
            System.out.println(animal.correr());
        }
    }
}
