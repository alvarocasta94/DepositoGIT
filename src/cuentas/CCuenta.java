/**
 * La clase CCuenta representa una cuenta bancaria.
 * Tiene atributos como el nombre del titular de la cuenta, número de cuenta, saldo y tipo de interés.
 */
package cuentas;

public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor por defecto.
     */
    public CCuenta() {
    }

    /**
     * Constructor con parámetros.
     *
     * @param nom el nombre del titular de la cuenta.
     * @param cue el número de cuenta.
     * @param sal el saldo actual de la cuenta.
     * @param tipo el tipo de interés de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInterés = tipo;
    }

    /**
     * Asigna el nombre del titular de la cuenta.
     *
     * @param nom el nombre del titular de la cuenta.
     */
    public void asignarNombre(String nom) {
        setNombre(nom);
    }

    /**
     * Obtiene el nombre del titular de la cuenta.
     *
     * @return el nombre del titular de la cuenta.
     */
    public String obtenerNombre() {
        return getNombre();
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     *
     * @return el saldo actual de la cuenta.
     */
    public double estado() {
        return getSaldo();
    }

    /**
     * Ingresa una cantidad de dinero en la cuenta.
     *
     * @param cantidad la cantidad de dinero a ingresar en la cuenta.
     * @throws Exception si la cantidad a ingresar es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Retira una cantidad de dinero de la cuenta.
     *
     * @param cantidad la cantidad de dinero a retirar de la cuenta.
     * @throws Exception si la cantidad a retirar es negativa o si no hay
     * suficiente saldo en la cuenta.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Obtiene el número de cuenta.
     *
     * @return el número de cuenta.
     */
    public String obtenerCuenta() {
        return getCuenta();
    }

    /**
     * Obtiene el nombre del titular de la cuenta.
     *
     * @return el nombre del titular de la cuenta.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asigna el nombre del titular de la cuenta.
     *
     * @param nombre el nombre del titular de la cuenta.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el tipo de interés de la cuenta.
     *
     * @return El tipo de interés de la cuenta.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece el tipo de interés de la cuenta.
     *
     * @param tipoInterés El nuevo tipo de interés de la cuenta.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Obtiene el número de cuenta de la cuenta bancaria.
     *
     * @return El número de cuenta de la cuenta bancaria.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de cuenta de la cuenta bancaria.
     *
     * @param cuenta El nuevo número de cuenta de la cuenta bancaria.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el saldo actual de la cuenta bancaria.
     *
     * @return El saldo actual de la cuenta bancaria.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo actual de la cuenta bancaria.
     *
     * @param saldo El nuevo saldo de la cuenta bancaria.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
