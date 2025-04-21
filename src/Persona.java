import java.util.ArrayList;
import java.util.List;
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String documento;
    private List<Perro> perrosAdoptados;

    public Persona(String nombre, String apellido, int edad, String documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perrosAdoptados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public List<Perro> getPerrosAdoptados() {
        return perrosAdoptados;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", documento='" + documento + '\'' +
                ", perrosAdoptados=" + perrosAdoptados +
                '}';
    }

    public void adoptarPerro(Perro perro) {
        if (perrosAdoptados.size() < 3) {
            perrosAdoptados.add(perro);

            System.out.println("El perro  fue adoptado");
        } else {
            System.out.println("No se puede adoptar mas de 3 perros");
        }
    }

    public Perro perroMasGrande() {
        if (perrosAdoptados.isEmpty()) {
            return null;
        }
        Perro perroMasGrande = perrosAdoptados.get(0);
        for(Perro perro : perrosAdoptados){
            if(perro.getEdad() > perroMasGrande.getEdad()){
                perroMasGrande = perro;
            }
        }
        return perroMasGrande;
    }
}
