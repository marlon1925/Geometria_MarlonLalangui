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
                    geo.areaCircu();
                    System.out.println("PERIMETRO DEL CIRCULO");
                    geo.perimetroCircu();
                    System.out.println("VOLUMEN DEL CIRCULO");
                    geo.volumenCirculo();
                    break;
            }
        }while(op != 0);

    }


}
