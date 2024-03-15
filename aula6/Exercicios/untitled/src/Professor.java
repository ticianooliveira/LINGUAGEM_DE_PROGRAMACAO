public class Professor extends Pessoa{

    private  double salario;

    public double getSalario() {
        return salario;
    }

    public Professor(String nome, int idade, double salario ){
        super(nome, idade);
        this.salario=salario;
    }
}
