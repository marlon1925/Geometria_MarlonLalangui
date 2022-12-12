public class main {
    public static void main(String[] args) {

        geometria geo = new geometria();

        double aux = 0;
        int op = 0;
        do {
            op = geo.menu();

            switch (op) {
                case 1:
                    System.out.println("AREA DEL CIRCULO");
                    System.out.println("Ingrese el radio del circulo");
                    geo.radio = geo.sc.nextDouble();
                    geo.setRadio(geo.radio);
                    geo.areaCircu();
                    System.out.println("La area del circulo es: " + geo.areaCir + "\n");
                    System.out.println("PERIMETRO DEL CIRCULO");
                    System.out.print("Ingrese el diametro: ");
                    geo.setDiametro(geo.diametro = geo.sc.nextDouble());
                    System.out.println("Resultado: " + geo.perimetroCircu());
                    break;
            }
        }while(op != 0);

    }


}
