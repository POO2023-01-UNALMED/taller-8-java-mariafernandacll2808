package futbol;

public abstract class Futbolista implements Comparable<Object>{
    private String nombre;
    private int edad;
    final private String posicion;

    protected Futbolista(String nombre, int edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }
    protected Futbolista(){
        this("Maradona", 30, "delantero");
    }

    @Override
    public String toString(){
        return "El futbolista " + nombre + " tiene " + edad + ", y juega de " + posicion;
    }

    public boolean equals(Futbolista f) {
		if (this == f){
			return true;
		}else {
			return false;
		}
	}

    public abstract boolean jugarConLasManos();

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return this.posicion;
    }


}
