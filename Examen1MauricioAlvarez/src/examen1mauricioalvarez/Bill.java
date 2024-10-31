package examen1mauricioalvarez;

public class Bill {

    private String nameClient;
    private String idClient;
    private String codeBill; 
    private String amountBill;
    private String monthNumber;
    private int electronicProduct;
    private int vehicleProduct;
    private int buildingProduct;
    private int points;
    private int bonus;


    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public String getCodeBill() {
        return codeBill;
    }

    public void setCodeBill(String codeBill) {
        this.codeBill = codeBill;
    }

    public String getAmountBill() {
        return amountBill;
    }

    public void setAmountBill(String amountBill) {
        this.amountBill = amountBill;
    }

    public int getElectronicProduct() {
        return electronicProduct;
    }

    public void setElectronicProduct(int electronicProduct) {
        this.electronicProduct = electronicProduct;
    }

    public int getVehicleProduct() {
        return vehicleProduct;
    }

    public void setVehicleProduct(int vehicleProduct) {
        this.vehicleProduct = vehicleProduct;
    }

    public int getBuildingProduct() {
        return buildingProduct;
    }

    public void setBuildingProduct(int buildingProduct) {
        this.buildingProduct = buildingProduct;
    }

    public String getMonthNumber() {
        return monthNumber;
    }
    
    
    
    
    
    

    public void setMonthNumber(String monthNumber) {
        int numeroMes = Integer.parseInt(monthNumber);
        switch (numeroMes) {
            case 1:
                this.monthNumber = "Enero";
                break;
            case 2:
                this.monthNumber = "Febrero";
                break;
            case 3:
                this.monthNumber = "Marzo";
                break;
            case 4:
                this.monthNumber = "Abril";
                break;
            case 5:
                this.monthNumber = "Mayo";
                break;
            case 6:
                this.monthNumber = "Junio";
                break;
            case 7:
                this.monthNumber = "Julio";
                break;
            case 8:
                this.monthNumber = "Agosto";
                break;
            case 9:
                this.monthNumber = "Setiembre";
                break;
            case 10:
                this.monthNumber = "Octubre";
                break;
            case 11:
                this.monthNumber = "Noviembre";
                break;
            case 12:
                this.monthNumber = "Diciembre";
                break;
            default:
                this.monthNumber = "Mes no valido";
                break;

        }
    }

}
