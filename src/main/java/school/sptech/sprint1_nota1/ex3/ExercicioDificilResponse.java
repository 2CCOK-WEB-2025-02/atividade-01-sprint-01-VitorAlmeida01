package school.sptech.sprint1_nota1.ex3;

public class ExercicioDificilResponse {

    int enesimoTermo = 0;
    int soma = 0;

    public ExercicioDificilResponse() {
    }

    public ExercicioDificilResponse(int enesimoTermo, int soma) {
        this.enesimoTermo = enesimoTermo;
        this.soma = soma;
    }

    public int getEnesimoTermo() {
        return enesimoTermo;
    }

    public void setEnesimoTermo(int enesimoTermo) {
        this.enesimoTermo = enesimoTermo;
    }

    public int getSoma() {
        return soma;
    }

    public void setSoma(int soma) {
        this.soma = soma;
    }
}
