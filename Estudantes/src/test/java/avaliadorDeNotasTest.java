import static org.junit.jupiter.api.Assertions.*;

import org.example.avaliadorDeNotas;
import org.example.estudante;
import org.junit.jupiter.api.Test;

public class avaliadorDeNotasTest {

    @Test
    public void testClassificacaoExcelente() {
        estudante aluno = new estudante("Maria", 95);
        avaliadorDeNotas avaliador = new avaliadorDeNotas();
        String resultado = avaliador.avaliarDesempenho(aluno);
        assertTrue(resultado.contains("Classificação: Excelente"));
    }

    @Test
    public void testClassificacaoBom() {
        estudante aluno = new estudante("Carlos", 80);
        avaliadorDeNotas avaliador = new avaliadorDeNotas();
        String resultado = avaliador.avaliarDesempenho(aluno);
        assertTrue(resultado.contains("Classificação: Bom"));
    }

    @Test
    public void testClassificacaoRegular() {
        estudante aluno = new estudante("Fernanda", 60);
        avaliadorDeNotas avaliador = new avaliadorDeNotas();
        String resultado = avaliador.avaliarDesempenho(aluno);
        assertTrue(resultado.contains("Classificação: Regular"));
    }

    @Test
    public void testClassificacaoInsuficiente() {
        estudante aluno = new estudante("Pedro", 40);
        avaliadorDeNotas avaliador = new avaliadorDeNotas();
        String resultado = avaliador.avaliarDesempenho(aluno);
        assertTrue(resultado.contains("Classificação: Insuficiente"));
    }

    @Test
    public void testClassificacaoReprovado() {
        estudante aluno = new estudante("Lucia", 20);
        avaliadorDeNotas avaliador = new avaliadorDeNotas();
        String resultado = avaliador.avaliarDesempenho(aluno);
        assertTrue(resultado.contains("Classificação: Reprovado"));
    }
}
