package biblioteca;

public abstract class UsuarioMaster {
    private static String senhaMaster = "123";
    
    public void setSenhaMaster(String senhaMaster) {
        UsuarioMaster.senhaMaster = senhaMaster;
    }
    
    public static String getSenhaMaster() {
        return senhaMaster;
    }
}
