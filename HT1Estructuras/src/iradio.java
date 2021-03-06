/**
 *
 * @author Luis Delgado
 * @author Jose Cifuentes
 * @version 18.01.2018
 * 
 */

public interface iradio 
{
    /**
     * Metodo para cabiar de estado, y posteriormente saber si esta prendido
     * o apagado el radio
     */
    public void onOff();
    
    /**
     * metodo que cambia de am a fm y de fm a am
     * @return estacionAM regresa la ultima estacion am
     * @return estacionFM regresa la ultima estacion fm
     */
    public float Switch();
    
    /**
     * metodo que regresa la siguiente estacion dependiendo si es am o fm
     * @return estacionAm regresa la estacion que corresponda
     * @return estacionFm regresa la estacion que corresponda
     */
    public float siguiente(float a);
    
    /**
     * metodo que regresa la estacion anterior dependiendo se es am o fm
     * @return estacion Am regresa la estacion anterior
     * @return estacion fm regresa la estacion anterior     
     */
    public float anterior(float a);
    
    /**
     * metodo para guardar una estacion en favoritos
     * @param e En numero de estacion que se deasea guardan en la posicion
     * @param b posicion del boton para ser guardado 
     */
    public void guardar(float e,int b);
    
    /**
     * metodo para saber que estacion esta guardada en favoritos
     * @param b posicion del boton en la que se desea saber que estacion esta guardada
     * @return lista[x] regresa la estacion que esta guardada en ese boton
     */
    public float seleccionarFav(int b);
   
    
    
}
