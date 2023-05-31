public class Retangulo {
    private double comprimento;
    private double largura;

    public double getComprimento(){
        return comprimento;
    }
    public void setComprimento(double comprimento){
        this.comprimento = comprimento;
    }
    public double getLargura(){
        return largura;
    }
    public void setLargura(double largura){
        this.largura = largura;
    }

    public void mudarValorMedidas(double novoValorComrpimento, double novoValorLargura){
        comprimento = novoValorComrpimento;  
        largura = novoValorLargura; 
    }
    
    public double valorComrpimento(){
        return comprimento;
    }
    public double valorLargura(){
        return largura;
    }
    public double calcularArea(){
        double area = comprimento * largura;
        return area;
    }
    public double calcularPerimetro(){
        double perimetro = 2*(comprimento + largura);
        return perimetro;
    }
   
    
    
}
