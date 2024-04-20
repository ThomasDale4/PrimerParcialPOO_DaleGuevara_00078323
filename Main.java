import Articulos.Articulo;
import Articulos.Laptop;
import Articulos.Telefono;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main{
    static ArrayList<Articulo> articulos = new ArrayList<>();
    public static void main(String[] args){
        System.out.println("Bienvenido a ElectroMart");
        Menu();
    }
    public static void Menu(){
        try {
            Scanner sc = new Scanner(System.in);
            int opcion;
            do {
                ImprimirMenu();
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        Agregar();
                        break;
                    case 2:
                        Modificar();
                        break;
                    case 3:
                        Mostrar();
                        break;
                }
            } while (opcion != 4);
        } catch (InputMismatchException e){
            System.out.println("Por favor introduzca un dato valido\n");
        }
    }
    public static void ImprimirMenu(){
        System.out.println("......:::::Menu:::::.....\n 1 Agregar articulo\n 2 Modificar articulo\n 3 Mostrar articulos\n 4 Salir\nOpcion");
    }
    public static void Agregar(){
        System.out.println("\n.....:::::Agregar:::::.....\n 1 Telefono movil\n 2 Laptop");
        Scanner sc = new Scanner(System.in);
        int opcion;
        opcion = sc.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Ingresa el nombre");
                String nombre = sc.nextLine();
                sc.nextLine();
                System.out.println("Ingresa el modelo");
                String modelo = sc.nextLine();
                Articulo articulo = new Articulo(nombre, modelo);
                System.out.println("Ingresa el numero de telefono");
                String numeroTelefono = sc.nextLine();
                System.out.println("Ingresa la cantidad de espacio en GB");
                int espacio = sc.nextInt();
                Telefono telefono = new Telefono(articulo, numeroTelefono, espacio);
                articulos.add(telefono);
                break;
            case 2:
                System.out.println("Ingresa el nombre");
                nombre = sc.nextLine();
                sc.nextLine();
                System.out.println("Ingresa el modelo");
                modelo = sc.nextLine();
                articulo = new Articulo(nombre, modelo);
                System.out.println("Ingresa la cantidad de nucleos");
                int cores = sc.nextInt();
                System.out.println("Ingresa el tamano de pantalla en pulgadas");
                int tamanoPantalla = sc.nextInt();
                Laptop laptop = new Laptop(articulo, cores, tamanoPantalla);
                articulos.add(laptop);
        }
    }
    public static void Modificar(){
        System.out.println("\n.....:::::Modificar:::::.....\n Introduce el nombre que quieres modificar");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        for(int i = 0; i < articulos.size(); i++){
            if(articulos.get(i).getNombre().equals(nombre)){
                System.out.println("Indroduce el nuevo nombre para el articulo:");
                String nuevoNombre = sc.nextLine();
                articulos.get(i).setNombre(nuevoNombre);
            }else{
                System.out.println("El articulo que buscas no existe");
            }
        }
    }
    public static void Mostrar(){
        System.out.println("\n.....:::::Mostrar:::::.....\n");
        for(int i = 0; i < articulos.size(); i++){
            System.out.println("Nombre: " + articulos.get(i).getNombre() + "\n");
            System.out.println("Modelo: " + articulos.get(i).getModelo() + "\n");
            System.out.println("Descripcion: " + articulos.get(i).getDescripcion() + "\n");
            System.out.println("Precio: " + articulos.get(i).getPrecio() + "\n");
        }
    }
}
