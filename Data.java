public class Data implements MinhaData{

    private int dia, mes, ano;

    @Override
    public int getDia() {
        return this.dia;
    }

    @Override
    public void setDia(int dia) {
         dia <= 31;    
    } 

    @Override
    public int getMes() {
        return this.mes;
    }

    @Override
    public void setMes(int mes) {
        mes <= 12;    
    } 

    @Override
    public int getAno() {
        return this.ano;
    }

    @Override
    public void setAno(int ano) {
        this.ano = ano;        
    } 

    
    @Override
    public String toString() {
        String montaHora; 
        /* Utilizei o operador ternario para nao ter que ficar fazendo if else */
        montaHora = (hora < 10) ? "0" + String.valueOf(hora) + ":": String.valueOf(hora) + ":";
        montaHora += (minuto < 10) ? "0" + String.valueOf(minuto) + ":": String.valueOf(minuto) + ":";
        montaHora += (segundo < 10) ? "0" + String.valueOf(segundo): String.valueOf(segundo);
        return (montaHora);
    }

}