package entities;

public class Professor extends Pessoa{
    double cargaHoraria;

    public Professor(String nome, int idade, double cargaHoraria) {
        super(nome, idade);
        this.cargaHoraria = cargaHoraria;
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String apresenta(){
        return "Professor: "+this.nome+" | Idade: "+this.idade+" | Carga Horaria: "+this.cargaHoraria;
    }
}