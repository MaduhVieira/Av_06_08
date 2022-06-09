/*Criar uma interface MinhaData com métodos getDia(), getMes(), getAno(), setDia(int dia), setMes(int mes),
 setAno(int ano) e mostrarData(). Criar uma classe Data (incluir os atributos dia, mes e ano todos do tipo int)
implementada pela interface. Os métodos setDia e setMes devem fazer a validação do valor (dia <=31, mês<=12).
O método mostrarData deve retornar uma String expressando a data no formato longo (por exemplo: dia=11, mês=11 
e ano=2016 deve retornar “11 de novembro de 2016”. Criar uma classe UsaData (com o método main) que cria um objeto
da classe Data, seta dia, mês e ano e exibe a data. */

interface MinhaData {
    public int getDia();
    public int getMes();
    public int getAno();
    public void setDia(int dia);
    public void setMes(int mes);
    public void setAno(int ano);
    public String mostrarData();
}
