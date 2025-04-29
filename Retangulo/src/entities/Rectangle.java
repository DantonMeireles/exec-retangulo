package entities;

public class Rectangle {
    public double widht;
    public double height;

    //funcoes
    public double area(){
        return this.height * this.widht;
    }

    public double perimetro(){
        return 2 * (this.widht + this.height);
    }

    public double diagonal(){
        return Math.sqrt((this.height * this.height) + (this.widht * this.widht)); // math.sqrt retorna a raiz quadrada
    }
    // eu tinha feito as funcoes com parametros, porem na hora de chamar elas, eu teria que colocar os parametros no codigo, porem eles ja estavam salvos nas variaveis, entao refiz para ocupar menos codigo
}
