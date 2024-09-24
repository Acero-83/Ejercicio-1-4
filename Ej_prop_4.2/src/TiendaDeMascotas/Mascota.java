package TiendaDeMascotas;

public class Mascota {
    String nombre;
    int edad;
    String color;

    public Mascota(String nombre, int edad, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
    }
    void imprimir (){
        System.out.println("Nombre "+nombre);
        System.out.println("Edad "+edad);
        System.out.println("Color "+color);
    }
}

class Perro extends Mascota{
    protected double peso;
    boolean muerde;

    public Perro(String nombre, int edad, String color, double peso,boolean muerde) {
        super(nombre, edad, color);
        this.peso = peso;
        this.muerde=muerde;
    }
    static void sonido (){
        System.out.println("Los perros ladran");
    }

    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Peso "+peso);
        System.out.println("Muerde: "+muerde);
        sonido();
    }
}

class PerroPequeño extends Perro{
    enum tipo { caniche, yorkshire, terrier, schnauzer, chihuahua}
    tipo raza;

    public PerroPequeño(String nombre, int edad, String color, double peso,boolean muerde, tipo raza) {
        super(nombre, edad, color, peso,muerde);
        this.raza = raza;
    }

    @Override
    void imprimir() {
        super.imprimir();
    }
}


class PerroMediano extends Perro {
    enum tipo {collie, dálmata, bulldog, galgo, sabueso}
    tipo raza;

    public PerroMediano(String nombre, int edad, String color, double peso, boolean muerde, tipo raza) {
        super(nombre, edad, color, peso, muerde);
        this.raza = raza;
    }

    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Raza"+raza);
    }
}


class PerroGrande extends Perro {
    enum tipo {pastorAlemán, doberman,rotweiller};
    tipo raza;

    public PerroGrande(String nombre, int edad, String color, double peso, boolean muerde, tipo raza) {
        super(nombre, edad, color, peso, muerde);
        this.raza = raza;
    }

    @Override
    void imprimir() {
        super.imprimir();
        System.out.println ("Raza "+raza);
    }
}

class Gato extends Mascota{
    protected double alturaSalto;
    protected double longitudSalto;

    public Gato(String nombre, int edad, String color, double alturaSalto, double longitudSalto) {
        super(nombre, edad, color);
        this.alturaSalto = alturaSalto;
        this.longitudSalto = longitudSalto;
    }
    static void sonido (){
        System.out.println("Los gatos maullan y ronronean");
    }

    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Altura de salto"+alturaSalto);
        System.out.println("Longitud de salto"+longitudSalto);
        sonido();
    }
}

class GatoSinPelo extends Gato{
    enum tipo { esfinge, elfo, donskoy}
    tipo raza;

    public GatoSinPelo(String nombre, int edad, String color, double alturaSalto,
                       double longitudSalto, tipo raza) {
        super(nombre, edad, color, alturaSalto, longitudSalto);
        this.raza = raza;
    }

    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Raza"+raza);
    }
}

class GatoPeloCorto extends Gato{
    enum tipo {azulRuso, británico, manx, devonRex}
    tipo raza;

    public GatoPeloCorto(String nombre, int edad, String color,
                         double alturaSalto, double longitudSalto, tipo raza) {
        super(nombre, edad, color, alturaSalto, longitudSalto);
        this.raza = raza;
    }
    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Altura de salto  "+alturaSalto);
        System.out.println("Longitud de salto  "+longitudSalto);

    }
}

class GatosPeloLargo extends Gato {
    enum tipo {angora, himalayo,balinés, somalí}
    tipo raza;

    public GatosPeloLargo(String nombre, int edad, String color, double alturaSalto,
                          double longitudSalto, tipo raza) {
        super(nombre, edad, color, alturaSalto, longitudSalto);
        this.raza = raza;
    }
    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Raza"+raza);
    }
}

class Prueba {
    public static void main(String[] args) {
        Perro perro1 = new PerroGrande("Beba", 1, "Negro,Amarillo y blanco",
                12, false, PerroGrande.tipo.pastorAlemán);

        Gato gato1 = new GatoPeloCorto("Sr.Gato", 7, "Negro", 4, 5,
                GatoPeloCorto.tipo.manx);
        perro1.imprimir();
        gato1.imprimir();
    }
}

