import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    void deveRetornarGolComVidroEletrico() {
        Carro carro = new VidroEletrico(new Gol());

        assertEquals("Equipamentos:\nVidro Elétrico\n", carro.getEquipamentos());
    }

    @Test
    void deveRetornarGolComRodaLigaLeve() {
        Carro carro = new RodaLigaLeve(new Gol());

        assertEquals("Equipamentos:\nRodas de liga leve\n", carro.getEquipamentos());
    }

    @Test
    void deveRetornarGolComRodaLigaLeveEVidroEletrico() {
        Carro carro = new VidroEletrico(new RodaLigaLeve(new Gol()));

        assertEquals("Equipamentos:\nRodas de liga leve\nVidro Elétrico\n", carro.getEquipamentos());
    }

    @Test
    void deveRetornarGolSemEquipamento() {
        Carro carro = new Gol();

        assertEquals("Equipamentos:\n", carro.getEquipamentos());
    }

}