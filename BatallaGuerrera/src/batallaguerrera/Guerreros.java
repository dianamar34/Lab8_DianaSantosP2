
package batallaguerrera;


public class Guerreros {
    protected String nombre;
    protected String nickname;
    protected String powerAttack;
    protected String powerDefense;
    protected String salud;
    protected int puntos;

    public Guerreros() {
    }

    public Guerreros(String nombre, String nickname, String powerAttack, String powerDefense, String salud, int puntos) {
        this.nombre = nombre;
        this.nickname = nickname;
        this.powerAttack = powerAttack;
        this.powerDefense = powerDefense;
        this.salud = salud;
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPowerAttack() {
        return powerAttack;
    }

    public void setPowerAttack(String powerAttack) {
        this.powerAttack = powerAttack;
    }

    public String getPowerDefense() {
        return powerDefense;
    }

    public void setPowerDefense(String powerDefense) {
        this.powerDefense = powerDefense;
    }

    public String getSalud() {
        return salud;
    }

    public void setSalud(String salud) {
        this.salud = salud;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
