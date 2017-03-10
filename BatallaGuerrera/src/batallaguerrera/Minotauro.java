
package batallaguerrera;


public class Minotauro extends Guerreros{

    public Minotauro() {
        super();
    }

    public Minotauro(String nombre, String nickname, String powerAttack, String powerDefense, String salud, int puntos) {
        super(nombre, nickname, powerAttack, powerDefense, salud, puntos);
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
    
    
}
