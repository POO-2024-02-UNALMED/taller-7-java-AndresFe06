package comunicacion;
public class Libro extends Escrito {
        private String co_autor;
        private String editorial;
        private String edicion;
        private String interpretacion;
    
        public Libro(String origen, String titulo, String autor, int paginas, String coAutor, String editorial, String edicion,String interpretacion) {
            super(origen, titulo, autor, paginas);
            this.co_autor = coAutor;
            this.editorial = editorial;
            this.edicion = edicion;
            this.interpretacion = interpretacion;
        }
    
        @Override
        public int palabrasTotales(int palabrasPagina) {
            return getPaginas() * palabrasPagina * 2;
        }
        @Override
        public String interpretacion() {
            return this.interpretacion;
        }
        
	    public String getCo_autor() {
            return co_autor;
        }
    
        public void setCo_autor(String coAutor) {
            this.co_autor = coAutor;
        }
    
        public String getEditorial() {
            return editorial;
        }
    
        public void setEditorial(String editorial) {
            this.editorial = editorial;
        }
    
        public String getEdicion() {
            return edicion;
        }
    
        public void setEdicion(String edicion) {
            this.edicion = edicion;
        }
    
        public String toString() {
            return  this.getOrigen() + "\n" +
                    this.getTitulo() + "\n" +
                    this.getAutor() + "\n" +
                    this.getPaginas() + "\n" +
                    this.getCo_autor() + "\n" +
                    this.getEditorial() + "\n" +
                    this.getEdicion();}
    }

