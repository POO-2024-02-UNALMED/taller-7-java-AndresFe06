package comunicacion;

public class Fabula extends Escrito{
    String ensenanzas; 
    String interpretacion;


    public Fabula(String origen, String titulo, String autor, int paginas, String enseñanzas, String interpretacion){
        super(origen, titulo, autor, paginas);
        this.ensenanzas = enseñanzas;
        this.interpretacion = interpretacion;
    }

    @Override
    public int palabrasTotales(int palabrasPagina){
        return getPaginas() * palabrasPagina * 1;
    }
    @Override
    public String  interpretacion(){
        return this.interpretacion;
    }   
    @Override
    public String toString(){
        return  this.getOrigen() + "\n" +
                this.getTitulo() + "\n" +
                this.getAutor() + "\n" +
                this.getPaginas() + "\n" +
                this.ensenanzas;
    }
    public String getEnsenanza() {
        return ensenanzas;
    }
    public void setEnsenanza(String enseñanzas) {
        this.ensenanzas = enseñanzas;
    }
    public String getInterpretacion() {
        return interpretacion;
    }
    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
}
    

