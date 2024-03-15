public class Aluno extends Pessoa{
    private int mat;
    public Aluno(String nome, int mat){
        super(nome);
        this.mat = mat;
    }
    public Aluno(){
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }
}
