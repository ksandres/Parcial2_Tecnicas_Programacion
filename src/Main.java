import java.util.Objects;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("Ingrese el articulo al que desea ver");
        System.out.println("Telefono");
        System.out.println("Laptop");
        System.out.println("Accesorio");
        String nombre = x.nextLine();

        System.out.println("ingrese precio estimado para su " + nombre);
        double precio = x.nextDouble();

        switch (nombre){
            case "Telefono":
                            System.out.println("Ingrese que marca quiere ver");
                System.out.println("Iphone");
                System.out.println("Samsung");
                System.out.println("Huawei");
                        String marca = x.nextLine();
                System.out.println("ingrese el almacenamiento del dispositivo");
                System.out.println("520GB");
                System.out.println("1TB");
                        String almacenamiento = x.nextLine();
                if (Objects.equals(marca, "Iphone")){
                    System.out.println("ingrese el procesador");
                    System.out.println("A15 Bionic y modelo Iphone 14");
                    System.out.println("A14 Bionic y modelo Iphone 13");
                    String procesador = x.nextLine();
                } else if (Objects.equals(marca,"Samsung")) {
                    System.out.println("ingrese el procesador");
                    System.out.println("MediaTek Helio G80 y modelo Samsung Galaxy A22");
                    System.out.println("MediaTek Helio G99 y modelo Samsung Galaxy A24");
                    String procesador = x.nextLine();
                } else {
                    System.out.println("ingrese el procesador");
                    System.out.println("Hisilicon Kirin 710F y modelo Huawei Y9 2018");
                    System.out.println("Kirin 710 Octa Core  y modelo  Huawei P30 Lite");
                    String procesador = x.nextLine();
                }




        }




    }
}