package Profesores;
public class Profesor {
    protected void imprimir (){
        System.out.println("Es un profesor");
    }

}

class ProfesorTitular extends Profesor {
    protected void imprimir (){
        System.out.println("Es profesor titular");
    }
}

class Prueba {
    public static void main(String[] args) {
        Profesor profesor1= new ProfesorTitular();
        profesor1.imprimir();
        Profesor profesor2=(Profesor) profesor1;
    }
}
