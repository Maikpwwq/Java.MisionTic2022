/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n1_simuladorBancario
 * Autor: Equipo Cupi2 2017
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 */
package uniandes.cupi2.simuladorBancario.mundo;

/**
 * Clase que representa la cuenta de ahorro de un cliente.
 */
public class CuentaAhorros
{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Saldo actual de la cuenta de ahorro.
     */
    private double saldo;

    /**
     * Interés mensual que paga la cuenta de ahorro.
     */
    private double interesMensual;
    
    /**
     * Intereses acomulados de la cuenta de ahorro.
     */
    private double interesesGenerados;

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Inicializa la cuenta de ahorro con el interés mensual que paga el banco. <br>
     * <b>post: </b> Se inicializó el saldo en 0 y el interés mensual en 0.006.
     */
    public CuentaAhorros( )
    {
        saldo = 0;
        interesMensual = 0.006;
        interesesGenerados = 0;
    }

    /**
     * Retorna el saldo del cliente. <br>
     * @return Saldo de la cuenta de ahorros.
     */
    public double darSaldo( )
    {
        return saldo;
    }

    /**
     * Retorna el interés mensual. <br>
     * @return Interés mensual de la cuenta de ahorros.
     */
    public double darInteresMensual( )
    {
        return interesMensual;
    }

    /**
     * Retorna el interés sobre la inversion. <br>
     * @return Interés mensual de la cuenta de ahorros.
     */
    public double darInteresesGenerados( )
    {
        return interesesGenerados;
    }
    
    /**
     * Consigna un monto de dinero en la cuenta del cliente. <br>
     * <b>post: </b> El saldo se incrementó en el monto de dinero ingresado. <br>
     * @param pMonto Monto de dinero a consignar en la cuenta. pMonto > 0.
     */
    public void consignarMonto( double pMonto )
    {
        saldo = saldo + pMonto;
    }

    /**
     * Retira un monto de dinero de la cuenta de ahorros. <br>
     * <b>post: </b> El saldo se redujo en el valor dado.
     * @param pMonto Monto de dinero a retirar de la cuenta de ahorros. pMonto > 0.
     */
    public void retirarMonto( double pMonto )
    {
        saldo = saldo - pMonto;
    }

    /**
     * Actualiza el saldo de la cuneta de ahorros sumándole los intereses (ha pasado un mes). <br>
     * <b>post: </b> El saldo actual se actualizó aplicando el porcentaje de interés mensual respectivo.
     */
    public void actualizarSaldoPorPasoMes( )
    {
        saldo = saldo + ( saldo * interesMensual );
    }
    
    /**
     * Actualiza el interes de la cuneta de ahorros sumándole los intereses (ha pasado un mes). <br>
     * <b>post: </b> El interes actual se actualizó aplicando el porcentaje de interés mensual respectivo.
     */
    public void actualizarInteresPorPasoMes( )
    {
        interesesGenerados = interesesGenerados + ( saldo * interesMensual );
    }
    
    /**
     * Retorna los atributos a su valor por defecto.
     * @return Inicializacion de valores.
     */
    public void restablecer() {
    	interesesGenerados = 0;
        interesMensual = 0.006;
        saldo = 0;
    }
}