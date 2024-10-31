package examen1mauricioalvarez;

import javax.swing.JOptionPane;

public class Examen1MauricioAlvarez {

    public static void main(String[] args) {
        Agent agent1 = new Agent();
        Bill bill1 = new Bill();

        //Pedir datos del Agente
        agent1.setName(JOptionPane.showInputDialog("Cual es el nombre del Agente? "));
        agent1.setId(JOptionPane.showInputDialog("Cual es la identificacion del Agente? "));
        agent1.setBranch(JOptionPane.showInputDialog("Cual es la sucursal a la que pertenece el Agente? "));
        agent1.setCode(JOptionPane.showInputDialog("Cual es el codigo del Agente? "));

        //Pedir Vehiculo
        int vehicle = 0;
        vehicle = Integer.parseInt(JOptionPane.showInputDialog("Usted tiene vehiculo propio?" + "\n1.Si" + "\n2.No"));
        if (vehicle == 1 || vehicle == 2) {
            if (vehicle == 1) {
                agent1.setVehicle(true);
            }
        }
        JOptionPane.showMessageDialog(null, agent1.MostrarInformacion());

        //Pedir Facturas
        boolean ciclo = false;
        int countadorFacturas = 0;
        String continuar = "";
        while (!ciclo) {
            bill1.setNameClient(JOptionPane.showInputDialog("Cual es el nombre del Cliente"));
            bill1.setIdClient(JOptionPane.showInputDialog("Cual es la identificacion del cliente"));
            bill1.setCodeBill(JOptionPane.showInputDialog("Cual es el codigo de la factura"));
            bill1.setAmountBill(JOptionPane.showInputDialog("Cual es el monto a cobrar"));

            //Productos 
            bill1.setElectronicProduct(Integer.parseInt(JOptionPane.showInputDialog("Cuantos productos electricos contiene la factura")));
            bill1.setBuildingProduct(Integer.parseInt(JOptionPane.showInputDialog("Cuantos productos de construccion contiene la factura")));
            bill1.setVehicleProduct(Integer.parseInt(JOptionPane.showInputDialog("Cuantos productos vehiculares contiene la factura")));

            continuar = JOptionPane.showInputDialog("Desea agregar otra factura?");
            if (continuar.toUpperCase().equals("NO")) {
                ciclo = true;
            }
            //Mes
            bill1.setMonthNumber(JOptionPane.showInputDialog("Digite en numero el mes"));
            countadorFacturas = +1;
        }

        //Calcular Bonus
        int factura = Integer.parseInt(bill1.getAmountBill());
        int bonus = 0;
        int puntaje = 0;
        int cantidadElectrica = bill1.getElectronicProduct();
        int cantidadContruccion = bill1.getBuildingProduct();
        int cantidadVehiculo = bill1.getVehicleProduct();
        //Bonus Extra
        boolean bonusExtra = false;

        //Bono 10%
        if (cantidadElectrica > 0 && cantidadContruccion > 0 && cantidadVehiculo > 0) {
            bonus = (factura * 10) / 100;
            puntaje = +3;
        }

        //No agregar mayor a 50.000
        if (bonus < 50000) {

            //Bonus Electrico
            if (cantidadElectrica >= 3) {
                bonus += (factura * 4) / 100;
                puntaje = +1;
            }
            if (cantidadElectrica > 0 && cantidadElectrica < 3) {
                bonus += (factura * 4) / 100;
                puntaje = +1;
            }

            //Bonus Automovil
            if (cantidadVehiculo >= 4) {
                bonus += (factura * 4) / 100;
                puntaje = +1;
            }
            if (cantidadVehiculo > 0 && cantidadVehiculo < 4) {
                bonus += (factura * 4) / 100;
                puntaje = +1;
            }

            //Bonus Contruccion
            if (cantidadContruccion > 0) {
                bonus += (factura * 8) / 100;
                puntaje = +2;
            }
        }

        //Factura Mayor a 50000
        if (factura > 50000) {
            bonus += (factura * 5) / 100;
            puntaje = +1;
        }

        //Monto mayor a 300.000 o mas de 3 facturas
        if (factura >= 300000 || countadorFacturas > 3) {
            bonus += 20000;
            bonusExtra = true;
        }

        //Mensaje bonus Extre
        String mensajeBonus = "";
        if (bonusExtra == true) {
            mensajeBonus = "Ha logrado el objetivo del bonus extra";
        } else {
            mensajeBonus = "No ha logrado el bonus extra";
        }

        //Mensaje vehiculo propio
        JOptionPane.showMessageDialog(null, "El agente vendedor: " + agent1.getName() + " Codigo: " + agent1.getCode() + " En el mes de " + bill1.getMonthNumber()
                + "\n" + "Vendio un total de: " + factura
                + "\n" + "Obtuvo Comisiones totales de: " + bonus
                + "\n" + mensajeBonus
                + "\n" + agent1.mostrarVehiculo()
                + "\n" + "Tiene un puntaje de " + puntaje
                + "\n" + "La sucursal el " + agent1.getBranch());
    }

}
