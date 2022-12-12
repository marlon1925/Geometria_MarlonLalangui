import java.util.Scanner;
public class geometria {

    double areaCir, areaCuadra, areaRombo;
    double altura, base, D, d, radio;

    double diametro;
    private double PI;
    Scanner sc = new Scanner(System.in);
    public geometria() {
        areaCir = 0;
        altura = 0;
        base = 0;
        areaCuadra = 0;
        areaRombo = 0;
        D = 0;
        d = 0;
        PI = 3.1416;
        diametro = 0;
    }
    public int menu(){
        int op=0;
        do {
            System.out.println(" ======== FIGURAS ========");
            System.out.println("| 1. Circulo             |");
            System.out.println("| 2. Cuadrado            |");
            System.out.println("| 0. Rombo               |");
            System.out.println("| 0. Triangulo           |");
            System.out.println("| 0. Salir               |");
            System.out.println(" =========================");
            System.out.print("Opcion: ");
            op = sc.nextInt();
        }while(op < 0 || op > 3);

        return op;
    }
    double areaCircu() {
        areaCir = PI * (radio*radio);
        return areaCir;
    }
    double perimetroCircu(){
        return PI * diametro;
    }

    public double getAreaCir() {
        return areaCir;
    }

    public void setAreaCir(double areaCir) {
        this.areaCir = areaCir;
    }

    public double getAreaCuadra() {
        return areaCuadra;
    }

    public void setAreaCuadra(double areaCuadra) {
        this.areaCuadra = areaCuadra;
    }

    public double getAreaRombo() {
        return areaRombo;
    }

    public void setAreaRombo(double areaRombo) {
        this.areaRombo = areaRombo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getD() {
        return D;
    }

    public void setD(double d) {
        D = d;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }


    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
}