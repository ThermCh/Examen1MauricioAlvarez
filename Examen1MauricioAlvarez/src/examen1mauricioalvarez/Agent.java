package examen1mauricioalvarez;

public class Agent {

    private String name;
    private String id;
    private String code;
    private String branch;
    private boolean vehicle;

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {

        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBranch() {

        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public boolean isVehicle() {
        vehicle = false;
        return vehicle;
    }

    public void setVehicle(boolean vehicle) {
        this.vehicle = vehicle;
    }

    public String mostrarVehiculo() {
        String mensaje = "";
        boolean vehiculo = this.vehicle;

        if (vehiculo = false) {
            mensaje = "El condutor no tiene vehiculo";
        } else {
            mensaje = "El condutor tiene vehiculo";
        }
        return mensaje;

    }

    public String MostrarInformacion() {
        String mensaje = "";
        if (this.vehicle == false) {
            mensaje = (getName() + "\n" + getId() + "\n" + getBranch() + "\n" + getCode() + "\n" + "No tiene vehiculo propio");

        } else {
            mensaje = (getName() + "\n" + getId() + "\n" + getBranch() + "\n" + getCode() + "\n" + "Si tiene vehiculo");
        }
        return mensaje;
    }

}
