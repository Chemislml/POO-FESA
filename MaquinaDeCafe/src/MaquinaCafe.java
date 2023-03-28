    //JOSE MANUEL PEREZ MOLINA 2208//

public class MaquinaCafe {
    private int agua;   //5000ml
    private int cafe;      //1000g
    private int crema;     //1500ml
    private Vasos vasos;     // 50u, 200ml

    public MaquinaCafe() {
    }

    public MaquinaCafe(int agua, int cafe, int crema, Vasos vasos) {
        this.agua = agua;
        this.cafe = cafe;
        this.crema = crema;
        this.vasos = vasos;
    }

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        if (agua <= 5000 && agua > 0){
            this.agua = agua;
        }
        else {
            System.out.println("La capacidad del deposito no es valido");
        }
    }

    public int getCafe() {
        return cafe;
    }

    public void setCafe(int cafe) {
        if (cafe <= 1000 && cafe > 0) {
            this.cafe = cafe;
        }
        else {
            System.out.println("La capacidad del deposito no es valido");
        }
    }

    public int getCrema() {
        return crema;
    }

    public void setCrema(int crema) {
        if (crema <= 1500 && crema > 0) {
            this.crema = crema;
        }
        else {
            System.out.println("La capacidad del deposito no es valido");
        }
    }

    public Vasos getVasos() {
        return vasos;
    }

    public void setVasos(Vasos vasos) {
        this.vasos = vasos;
    }

    @Override
    public String toString() {
        return "MaquinaCafe{" +
                "agua=" + agua +
                ", cafe=" + cafe +
                ", crema=" + crema +
                ", recipiente=" + vasos +
                '}';
    }
    public void americano(){
        if (getAgua()>=180 && getCafe()>=15 && getVasos().getUnidades()>=1){
            setAgua(getAgua()-180);
            setCafe(getCafe()-15);
            getVasos().setUnidades(getVasos().getUnidades() - 1);
            System.out.println("Cafe americano servido");

            if (getAgua()>=180 && getCafe()>=20 &&getCrema()>=70 && getVasos().getUnidades()>=1){
                System.out.println("Puede seguir sirviendo vasos de cafe");
            }
            else {
                System.out.println("Ya no puede servir más vasos de cafe");
            }
        }
        else {
            System.out.println("No hay suficientes recursos!!");
        }
    }

    public void expreso (){
        if (getAgua()>=120 && getCafe()>=20 && getVasos().getUnidades()>=1){
            setAgua(getAgua()-120);
            setCafe(getCafe()-20);
            getVasos().setUnidades(getVasos().getUnidades() - 1);
            System.out.println("Cafe expreso servido");

            if (getAgua()>=180 && getCafe()>=20 &&getCrema()>=70 && getVasos().getUnidades()>=1){
                System.out.println("Puede seguir sirviendo más vasos de cafe");
            }
            else {
                System.out.println("Ya no puede servir más vasos de cafe");
            }
        }
        else {
            System.out.println("No hay suficientes recursos!!");
        }
    }

    public void capuchino (){
        if (getAgua()>=100 && getCafe()>=14 && getCrema()>=70 && getVasos().getUnidades()>=1){
            setAgua(getAgua()-100);
            setCafe(getCafe()-14);
            setCrema(getCrema()-70);
            getVasos().setUnidades(getVasos().getUnidades() - 1);
            System.out.println("Cafe capuchino servido");

            if (getAgua()>=180 && getCafe()>=20 &&getCrema()>=70 && getVasos().getUnidades()>=1){
                System.out.println("Puede seguir sirviendo vasos de cafe");
            }
            else {
                System.out.println("Ya no puede servir más vasos de cafe");
            }
        }
        else {
            System.out.println("No hay suficientes recursos!!");
        }
    }
    public void revisar(){
        System.out.println("La maquina tiene actualmente:");
        System.out.println("Agua: " + getAgua() + "ml");
        System.out.println("Cafe: " + getCafe() + "g");
        System.out.println("Crema: " + getCrema() + "ml");
        System.out.println("vasos: " + getVasos().getUnidades() + "u");
    }
}
