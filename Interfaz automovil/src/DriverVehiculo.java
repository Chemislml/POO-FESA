
    //PEREZ MOLINA JOSE MANUEL 2208//
public class DriverVehiculo {
    public static void main(String[] args) {
        Camion camion = new Camion("Diesel", 3);

        System.out.println(camion);

        System.out.println(camion.encender());
        camion.avanzar();
        camion.frenar();
        System.out.println(camion.apagar());
        System.out.println("-----------------------------------");
        Motocicleta moto = new Motocicleta(150, "YAMAHA");
        System.out.println(moto);
        System.out.println(moto.encender());
        moto.avanzar();
        moto.hacerCaballito();
        moto.frenar();
        System.out.println(moto.apagar());
    }
}
