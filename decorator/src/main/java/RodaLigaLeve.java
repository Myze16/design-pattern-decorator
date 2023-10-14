public class RodaLigaLeve extends CarroDecorator {
    public RodaLigaLeve(Carro carro) {
        super(carro);
    }
    public String getNomeEquipamento() {
        return "Rodas de liga leve";
    }
}