package Tarea2;

import java.util.ArrayList;
import java.util.Scanner;

class vehiculoDatos {

    String Placa;
    String Marca;
    String Modelo;
    int anio;
    String Color;
    int Precio;

    vehiculoDatos(String P, String M, String Mo, int An, String C, int Pr) {
        Placa = P;
        Marca = M;
        Modelo = Mo;
        anio = An;
        Color = C;
        Precio = Pr;
        ;
    }

    void RegistrarVehiculo() {
        Scanner Escaneo = new Scanner(System.in);

        System.out.println("Ingrese la placa del Vehiculo");
        Placa = Escaneo.nextLine();

        System.out.println("Ingrese Marcar:");
        Marca = Escaneo.nextLine();

        System.out.println("Ingrese el Modelo:");
        Modelo = Escaneo.nextLine();

        System.out.println("Ingrese el Anio:");
        anio = Escaneo.nextInt();

        System.out.println("Ingrese el precio $:");
        Precio = Escaneo.nextInt();
        Escaneo.nextLine();

        System.out.println("Ingrese el Color:");
        Color = Escaneo.nextLine();

    }

    void MostrarVehiculo() {

        System.out.println("Placa:" + Placa);
        System.out.println("Marca:" + Marca);
        System.out.println("Modelo:" + Modelo);
        System.out.println("Anio:" + anio);
        System.out.println("Color:" + Color);
        System.out.println("Precio" + Precio + "$");

    }

    void BuscarVehiculoPorPlaca() {
        Scanner Escaneo = new Scanner(System.in);
        String Buscar;

        System.out.println("Ingresa el numero de Placa");
        Buscar = Escaneo.nextLine();
        ArrayList<vehiculoDatos> Pl = new ArrayList<>();
        Pl.add(new vehiculoDatos(Placa, Marca, Modelo, anio, Color, Precio));

        for (int i = 0; i < Pl.size(); i++) {

            if (Pl.get(i).Placa.equals(Buscar)) {

                System.out.println("Placa:" + Pl.get(i).Placa);
                System.out.println("Marca:" + Pl.get(i).Marca);
                System.out.println("Modelo:" + Pl.get(i).Modelo);
                System.out.println("Anio:" + Pl.get(i).anio);
                System.out.println("Color:" + Pl.get(i).Color);
                System.out.println("Precio:" + Pl.get(i).Precio + "$");

            } else {

                System.out.println("Placa no encontrado");
            }
        }

    }

    void BuscaVehiculoMarca() {

        Scanner Escaneo = new Scanner(System.in);
        System.out.println("Ingrese la Marca:");
        String Buscardor = Escaneo.nextLine();
        ArrayList<vehiculoDatos> Mar = new ArrayList<>();
        Mar.add(new vehiculoDatos(Placa, Marca, Modelo, anio, Color, Precio));
        for (int i = 0; i < Mar.size(); i++) {

            if (Mar.get(i).Marca.equals(Buscardor)) {
                System.out.println("Placa:" + Mar.get(i).Placa);
                System.out.println("Marca:" + Mar.get(i).Marca);
                System.out.println("Modelo:" + Mar.get(i).Modelo);
                System.out.println("Anio:" + Mar.get(i).anio);
                System.out.println("Color:" + Mar.get(i).Color);
                System.out.println("Precio:" + Mar.get(i).Precio + "$");

            } else {

                System.out.println("Marca no encontrado");
            }

        }

    }

}

public class Vehiculo {

    public static void main(String[] args) {

        Scanner Escaneo = new Scanner(System.in);
        int Opcion;
        vehiculoDatos p1 = new vehiculoDatos("", "", "", 0, "", 0);
        do {
            System.out.println("====================================");
            System.out.println("      REGISTRO DE VEHICULOS");
            System.out.println("====================================");
            System.out.println("");
            System.out.println("1. Registrar vehículo");
            System.out.println("2. Mostrar vehículos");
            System.out.println("3. Buscar vehículo por placa");
            System.out.println("4. Mostrar vehículos por marca");
            System.out.println("5. Salir");
            Opcion = Escaneo.nextInt();

            switch (Opcion) {
                case 1:
                    p1.RegistrarVehiculo();

                    break;
                case 2:
                    p1.MostrarVehiculo();

                    break;
                case 3:
                    p1.BuscarVehiculoPorPlaca();
                    break;
                case 4:
                    p1.BuscaVehiculoMarca();

                    break;

                default:
                    System.out.println("Opcion Incorrecto");
                    break;
            }
        } while (Opcion != 5);

    }

}
