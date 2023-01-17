public class Ejercicio_metodo_set_y_get {
    public static void main(String[] args) {
        Persona persona1= new Persona();
        persona1.setNombre("María");
        persona1.setEdad(18);
        persona1.setNumerotelefonico("+16 3 3546 4535");


        System.out.println("MI NOMBRE ES: " + persona1.getNombre()+ "; "+ "MI EDAD ES: "
                + persona1.getEdad()+"; "+ " MI TELEFONO ES: "+persona1.getNumerotelefonico());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private String numerotelefonico;


    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }

    public void setNumerotelefonico( String numerotelefonico) {
        this.numerotelefonico = numerotelefonico;
    }

    public String getNumerotelefonico() {
        return numerotelefonico;
    }

}
