package org.example;

public class avaliadorDeNotas {

    public String avaliarDesempenho(estudante aluno) {
        double nota = aluno.getNotaFinal();
        String classificacao = "";

        if (nota >= 90) {
            classificacao = "Excelente! O aluno está aprovado!";
        } else if (nota >= 75) {
            classificacao = "Bom! O aluno está acima da média e aprovado!";
        } else if (nota >= 50) {
            classificacao = "Regular! O aluno está na média, portanto aprovado.";
        } else if (nota >= 30) {
            classificacao = "Insuficiente! O aluno infelizmente não aprovou, mas fará uma recuperação.";
        } else {
            classificacao = "Reprovado. O aluno reprovou.";
        }

        return "Aluno: " + aluno.getNome() + "\nClassificação: " + classificacao;
    }
}
