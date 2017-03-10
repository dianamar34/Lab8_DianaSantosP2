package batallaguerrera;

public class Alumnos extends Guerreros {

    private int cuenta;
    private String carrera;
    private int edad;

    public Alumnos() {
        super();
    }

    public Alumnos(int cuenta, String carrera, int edad, String nombre, String nickname, String powerAttack, String powerDefense, String salud, int puntos) {
        super(nombre, nickname, powerAttack, powerDefense, salud, puntos);
        this.cuenta = cuenta;
        this.carrera = carrera;
        this.edad = edad;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    
}
