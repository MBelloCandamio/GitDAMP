package Cuentas;


public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    /**     
     Constructor vacío
     */
    public CCuenta()
    {
    }
    /** 
     * Constructor 
     * @param nom
     * @param cue
     * @param sal
     * @param tipo 
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    /**
     * Método para devolver el saldo
     * @return saldo
     */
    public double estado()
    {
        return saldo;
    }
    /**
     * Método para ingresar una cantidad (double) en la cuenta
     * @param cantidad
     * @throws Exception 
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    /**
     * Método para retirar una cantidad (double) de la cuenta
     * @param cantidad
     * @throws Exception 
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
    /**
     * Método para encapsular las operaciones del ejercicio
     * @param cuenta
     * @param cantidad 
     */
    public static void operativa_cuenta(CCuenta cuenta, float cantidad){
        try {
            cuenta.retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta.ingresar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
    /**
     * Devuelve el nombre
     * @return 
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Modifica el nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Devuelve la cuenta
     * @return 
     */
    public String getCuenta() {
        return cuenta;
    }
    /**
     * Modifica la cuenta
     * @param cuenta 
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    /**
     * Devuelve el saldo
     * @return 
     */
    public double getSaldo() {
        return saldo;
    }
    /**
     * Modifica el saldo
     * @param saldo 
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    /**
     * Devuelve el tipo de interés
     * @return 
     */
    public double getTipoInterés() {
        return tipoInterés;
    }
    /**
     * Modifica el tipo de interés
     * @param tipoInterés 
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    
    
}
