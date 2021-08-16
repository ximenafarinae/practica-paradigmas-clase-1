package atm;

import java.util.List;

public class Usuario {

    private String nombre;
    private String password;
    private Integer id;
    private List<Cuenta> cuentas;


    public Usuario(Integer id, String nombre, String password, List<Cuenta> cuentas) {
        this.id = id;
        this.nombre = nombre;
        this.password = password;
        this.cuentas = cuentas;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
