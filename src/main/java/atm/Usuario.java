package atm;

public class Usuario {
    protected String nombre;
    protected String password;
    protected Integer id;


    public Usuario(Integer id, String nombre, String password) {
        this.id = id;
        this.nombre = nombre;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String cambiarPassword(String password) {
        return password; //Hacer desarrollo
    }
}
