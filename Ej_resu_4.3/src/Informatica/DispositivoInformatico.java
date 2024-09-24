package Informatica;

public class DispositivoInformatico {
    String marca= "Acer";
    DispositivoInformatico (){
        System.out.println("Marca ="+marca);
    }
}
class Tableta extends DispositivoInformatico {
    Tableta (String marca){
        System.out.println("Marca ="+marca);
    }
}
class Prueba {
    public static void main(String[] args) {
     Tableta tableta=new Tableta("Dell");
    }
}

