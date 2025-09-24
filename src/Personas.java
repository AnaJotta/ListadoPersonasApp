public class Personas {
    private int id;
    private String name;
    private String telefono;
    private String email;
    private static int numeroPersonas= 0;

    //Constructor vacío


    public Personas() {
        this.id = ++Personas.numeroPersonas;
    }
    //Constructor con argumentos (esto sería una sobrecarga de constructores porque hemos añadido más de uno)

    public Personas(String name, String telefono, String email) {
        this(); //se llama al constructor vacío
        this.name = name;
        this.telefono = telefono;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Personas{" +
                "id=" + id +
                ", nombre='" + name + '\'' +
                ", teléfono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                '}' + super.toString(); // te da la direccion de memoria del id
    }

    }

