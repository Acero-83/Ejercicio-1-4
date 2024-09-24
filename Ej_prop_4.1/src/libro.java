public class libro {
    protected String nombre;
    protected String autor;
    protected float precio;

    public libro(String nombre, String autor) {
        this.nombre = nombre;
        this.autor = autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public void imprimir (){
        System.out.println("El titulo del libro es: "+nombre);
        System.out.println("El autor del libro es: "+autor);
        System.out.println("El precio del libro es: "+getPrecio());
    }
}


class LibrodeTexto extends libro{
    private String curso;

    public LibrodeTexto(String nombre, String autor, String curso) {
        super(nombre, autor);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("El curso del libro es: "+curso);
    }
}


class LibrodeTextoUNC extends LibrodeTexto{
    private String facultad;

    public LibrodeTextoUNC(String nombre, String autor, String curso, String facultad) {
        super(nombre, autor, curso);
        this.facultad = facultad;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Facultad publicada");
    }
}

class Novela extends libro{

    enum tipo {Historica,Romantica,Policiaca,realista,CienciaFiccion,aventuras}
    tipo genero;

    public Novela(String nombre, String autor, tipo genero) {
        super(nombre, autor);
        this.genero = genero;
    }

    public tipo getGenero() {
        return genero;
    }

    public void setGenero(tipo genero) {
        this.genero = genero;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("El genero es: "+genero);
    }
}


class Main {
    public static void main(String[] args) {
        libro libro1=new LibrodeTextoUNC("Matematicas","Juan M","Calculo","Ingenieria");
        libro1.setPrecio(10000);
        libro1.imprimir();
        System.out.println();
        libro libro2=new Novela("Madame Bovary","Flauvert", Novela.tipo.Romantica);
        libro2.setPrecio(30000);
        libro2.imprimir();
    }
}

