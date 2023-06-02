public class Contas {


    private int valor2 = 0;
    private int valor1 = 0;

    public Contas(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public Contas(){

    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int soma(int valor1, int valor2){
        return valor1 + valor2;
    }

    public int subtract(int valor1, int valor2){
        return valor1 - valor2;
    }

    public int multi(int valor1, int valor2){
        return valor1 * valor2;
    }

    public double divide(int valor1, int valor2){
        if(valor2 != 0) {
            return (double) valor1 / valor2;
        }
        else{
            throw new ArithmeticException("Cannot divide by zero");
        }
    }

}
