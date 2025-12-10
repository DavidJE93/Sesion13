package sesion13;
/**
 * Clase Persona
 */
public class Persona {
    private String nombre;
    private String apellidos;
    private String email;
    private int edad;

    /**
     * Getter de nombre
     * @return el nombre de la persona
     */
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * 
     * @param nombre el nombre de la persona
     * @param apellidos los apellidos de la persona
     * @param email el email de la persona
     * @param edad la edad de la persona
     */
    public Persona(String nombre, String apellidos, String email, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.edad = edad;
    }
    
    public static Persona factory(String cadena){
        if(cadena==null){
            throw new IllegalArgumentException("No son validos los argumentos");
        }
        String[] partes = cadena.split(",");
        if(partes.length!=4){
           throw new IllegalArgumentException("No son validos los argumentos");
        }

        try{
            int edad = Integer.parseInt(partes[3]);
            return new Persona(partes[0], partes[1], partes[2], edad);
        }catch(Exception e){
            throw new IllegalArgumentException("No son validos los argumentos");
        }        
    }
}
