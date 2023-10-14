public abstract class CarroDecorator implements Carro{
    private Carro carro;

    public CarroDecorator(Carro carro) {
        this.carro = carro;
    }

    public abstract String getNomeEquipamento();

    public String getEquipamentos() {
        return this.carro.getEquipamentos() + this.getNomeEquipamento() + "\n";
    }
}
