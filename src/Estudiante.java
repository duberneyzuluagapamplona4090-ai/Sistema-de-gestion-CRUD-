public class Estudiante{

    private  int id;
    private  String nombre;
    private String email;
    private String carrera;

    public  Estudiante(){}

    public  Estudiante(int id, String nombre, String email, String carrera){

        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.carrera = carrera;

    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante [id=" + id + ", nombre=" + nombre + ", email=" + email + ", carrera=" + carrera + "]";
    }

    
    

}