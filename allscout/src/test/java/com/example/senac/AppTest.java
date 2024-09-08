package com.example.senac;

import com.example.senac.Model.Atletas;
import com.example.senac.Controller.AtletasController;
import com.example.senac.salvar.AtletaException;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void testaAGravacaoDeUmAtletaJaCadastrado() {
        AtletasController controller = new AtletasController();
        Atletas atleta = new Atletas("PABLO VEGETTI", "1988-10-15", "VASCO DA GAMA", "ATACANTE", "DIREITA", "ARGENTINA", 99, 187);

        try {
            controller.criarAtleta(atleta.getNome(), atleta.getDataNasc(), atleta.getClubeAtual(), atleta.getPernaDominante(), atleta.getPosicao(), atleta.getNacionalidade(), atleta.getNumeroCamisa(), atleta.getAlturaCm());
        } catch (AtletaException e) {
            e.printStackTrace();
        }

        assertThrows(AtletaException.class, () -> {
            controller.criarAtleta(atleta.getNome(), atleta.getDataNasc(), atleta.getClubeAtual(), atleta.getPernaDominante(), atleta.getPosicao(), atleta.getNacionalidade(), atleta.getNumeroCamisa(), atleta.getAlturaCm());
        });

        controller.close();
    }
}