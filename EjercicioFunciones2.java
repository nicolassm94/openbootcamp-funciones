public class EjercicioFunciones2 {

    public static void main(String[] args) {

        Carro miCarro = new Carro();
        miCarro.AgregarPuerta();
        System.out.println(miCarro.puertas);
    }

    public static int sum(int a, int b) {
        return a+b;
    }

}

class Carro {
    public int puertas = 4;

    public void AgregarPuerta() {
        this.puertas++;
    }

}