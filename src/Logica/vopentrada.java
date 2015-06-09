package Logica;

/**
 *
 * @author HENRY
 */
public class vopentrada extends voperacion {
    private int idProveedor;
    private String Documento;

    public vopentrada() {
    }

    public vopentrada(int idProveedor, String Documento) {
        this.idProveedor = idProveedor;
        this.Documento = Documento;
    }
    
    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }
    
}
