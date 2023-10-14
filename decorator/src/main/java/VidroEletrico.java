public class VidroEletrico extends CarroDecorator {
    public VidroEletrico(Carro carro) {
        super(carro);
    }

    public String getNomeEquipamento() {
        return "Vidro Elétrico";
    }
}
