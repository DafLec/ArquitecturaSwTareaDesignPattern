public class RFC {
    private String dirFiscal;
    private String razonSocial;

    public RFC(String dirFiscal, String razonSocial){
        this.dirFiscal = dirFiscal;
        this.razonSocial = razonSocial;
    }

    public String getDirFiscal(){
        return dirFiscal;
    }
}