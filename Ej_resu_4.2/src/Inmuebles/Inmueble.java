package Inmuebles;

public class Inmueble {
    protected int identificadorInmoviliario;
    protected int area;
    protected String direccion;
    protected double precioDeVenta;

    public Inmueble(int identificadorInmoviliario, int area, String direccion) {
        this.identificadorInmoviliario = identificadorInmoviliario;
        this.area = area;
        this.direccion = direccion;
    }
    double calcularPrecioVenta(double valorArea) {
        precioDeVenta = area * valorArea;
        return precioDeVenta;
    }
    void imprimir (){
        System.out.println("Identificador Inmoviliario="+identificadorInmoviliario);
        System.out.println("Area ="+area);
        System.out.println("Direccion: "+direccion);
        System.out.println("Precio de Venta= $"+precioDeVenta);
    }
}

class InmuebleVivienda extends Inmueble{
    protected int numeroHabitaciones;
    protected int numeroBaños;

    public InmuebleVivienda(int identificadorInmoviliario, int area, String direccion,
                            int numeroHabitaciones, int numeroBaños) {
        super(identificadorInmoviliario, area, String.valueOf(direccion));
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBaños = numeroBaños;
    }

    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Numero de habitaciones ="+numeroHabitaciones);
        System.out.println("Numero de baños= "+numeroBaños);
    }
}

class Casa extends InmuebleVivienda{
    protected int numeroPisos;

    public Casa(int identificadorInmoviliario, int area, String direccion,
                int numeroHabitaciones, int numeroBaños, int numeroPisos) {
        super(identificadorInmoviliario, area, direccion, numeroHabitaciones, numeroBaños);
        this.numeroPisos = numeroPisos;
    }

    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Numero de pisos ="+numeroPisos);
    }
}

class Apartamento  extends InmuebleVivienda{
    public Apartamento(int identificadorInmoviliario, int area,
                       String direccion, int numeroHabitaciones, int numeroBaños) {
        super(identificadorInmoviliario, area, direccion, numeroHabitaciones, numeroBaños);
    }

    @Override
    void imprimir() {
        super.imprimir();
    }
}

class CasaRural extends Casa {
    protected static double valorArea = 1500000;
    protected int distanciaCabera;
    protected int altitud;

    public CasaRural(int identificadorInmoviliario, int area, String direccion,
                     int numeroHabitaciones, int numeroBaños, int numeroPisos, int distanciaCabera, int altitud) {
        super(identificadorInmoviliario, area, direccion, numeroHabitaciones, numeroBaños, numeroPisos);
        this.distanciaCabera = distanciaCabera;
        this.altitud = altitud;
    }

    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Valor de la cabecera municipal ="+numeroHabitaciones+"Km");
        System.out.println("Altitud sobre el nivel del mar ="+ altitud+"mts");
        System.out.println();
    }
}


class CasaUrbana extends Casa{
    public CasaUrbana(int identificadorInmoviliario, int area, String direccion,
                      int numeroHabitaciones, int numeroBaños, int numeroPisos) {
        super(identificadorInmoviliario, area, direccion, numeroHabitaciones, numeroBaños, numeroPisos);
    }

    @Override
    void imprimir() {
        super.imprimir();
    }
}

class ApartamentoFamiliar extends Apartamento{
    protected static double valorArea=2000000;
    protected int valorAdministracion;

    public ApartamentoFamiliar(int identificadorInmoviliario, int area, String direccion,
                               int numeroHabitaciones, int numeroBaños, int valorAdministracion) {
        super(identificadorInmoviliario, area, direccion, numeroHabitaciones, numeroBaños);
        this.valorAdministracion = valorAdministracion;
    }

    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Valor Administracion =$"+valorAdministracion);
        System.out.println();
    }

}


class ApartaEstudio extends Apartamento{
    protected static double valorArea=1500000;

    public ApartaEstudio(int identificadorInmoviliario, int area,
                         String direccion, int numeroHabitaciones, int numeroBaños) {
        super(identificadorInmoviliario, area, direccion, numeroHabitaciones, numeroBaños);
    }

    @Override
    void imprimir() {
        super.imprimir();
    }
}

class CasaConjuntoCerrado extends CasaUrbana{
    protected static double valorArea=2500000;
    protected int valorAdministracion;
    protected boolean tienePiscina;
    protected boolean tieneCanchasDeportivas;

    public CasaConjuntoCerrado(int identificadorInmoviliario, int area, String direccion, int numeroHabitaciones,
                               int numeroBaños, int numeroPisos, int valorAdministracion, boolean tienePiscina,
                               boolean tieneCanchasDeportivas) {
        super(identificadorInmoviliario, area, direccion, numeroHabitaciones, numeroBaños, numeroPisos);
        this.valorAdministracion = valorAdministracion;
        this.tienePiscina = tienePiscina;
        this.tieneCanchasDeportivas = tieneCanchasDeportivas;
    }

    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Valor Administracion = "+valorAdministracion);
        System.out.println("Tiene Piscina "+tienePiscina);
        System.out.println("Tiene Campos deportivos "+tieneCanchasDeportivas);
    }
}

class CasaIndependiente extends CasaUrbana{
    protected static double valorArea=3000000;

    public CasaIndependiente(int identificadorInmoviliario, int area, String direccion, int numeroHabitaciones,
                             int numeroBaños, int numeroPisos) {
        super(identificadorInmoviliario, area, direccion, numeroHabitaciones, numeroBaños, numeroPisos);
    }

    @Override
    void imprimir() {
        super.imprimir();
    }
}

class Local extends Inmueble{
    enum tipo {Interno,Calle}
    protected tipo tipoLocal;

    public Local(int identificadorInmoviliario, int area, String direccion, tipo tipoLocal) {
        super(identificadorInmoviliario, area, direccion);
        this.tipoLocal = tipoLocal;
    }

    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Tipo Local "+tipoLocal);
    }
}

class LocalComercial extends Local{
    protected static double valorArea= 3000000;
    protected String centroComercial;

    public LocalComercial(int identificadorInmoviliario, int area, String direccion,
                          tipo tipoLocal, String centroComercial) {
        super(identificadorInmoviliario, area, direccion, tipoLocal);
        this.centroComercial = centroComercial;
    }

    @Override
    void imprimir() {
        super.imprimir();
    }
}


class Oficina extends Local{
    public static double valorArea=3500000;
    protected boolean esGobierno;

    public Oficina(int identificadorInmoviliario, int area, String direccion,
                   tipo tipoLocal, boolean esGobierno) {
        super(identificadorInmoviliario, area, direccion, tipoLocal);
        this.esGobierno = esGobierno;
    }

    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Es oficina Gubernamental "+esGobierno);
        System.out.println();
    }
}
class Prueba {
    public static void main(String[] args) {
        ApartamentoFamiliar apartamento1=new ApartamentoFamiliar(103067,120,
                "Avenida Santander 45-45",3,2,200000);
        System.out.println("Datos Apartamento");
        apartamento1.calcularPrecioVenta(apartamento1.valorArea);
        apartamento1.imprimir();
    }

}


