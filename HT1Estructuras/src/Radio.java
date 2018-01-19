import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
/**
 *
 * @author Luis Delgado
 * @author Jose Cifuentes
 * @version 18.01.2018
 * 
 */
public class Radio implements iradio
{
    private boolean encendido;
    private String tipo;
    private float estacionAM;
    private float estacionFM;
    private float[] listaAM;
    private float[] listaFM;
    private float maxfm;
    private float minfm;
    private float maxam;
    private float minam;
    
    
    
    /**
     * Este es el constructor el cual inicializa las variables necesarias
     */
    public Radio(){
        tipo="fm";
        maxfm=(float)(107.9);
        minfm=(float)(87.9);
        maxam=(float)(1610);
        minam=(float)(530);
        encendido=false;
        estacionAM= 530;
        estacionFM= (float)87.9;
        listaAM=new float[12];
        listaFM=new float[12];
        for (int i=0;i<12;i++){
            listaAM[i]=0;
            listaFM[i]=0;
        }
        
    }
 
    
    @Override
    /**
     * Metodo para saber si el radio esta encendido o apagado
     * @return encendido regresa si esta encendido o apagado el radio 
     */
    public void onOff() 
    {
        
       if (encendido==true){
           encendido=false;
       }else{
           encendido=true;
       }
        //jose
    }

    @Override
    /**
     * matodo que cambia de am a fm y de fm a am
     * @return estacionAM regresa la ultima estacion am
     * @return estacionFM regresa la ultima estacion fm
     */
    public float Switch() 
    {
        if (tipo.equals("am")){
            tipo="fm";
            return estacionFM;
        }else{
            tipo="am";
            return estacionAM;
        }
    }

    @Override
    /**
     * metodo que regresa la siguiente estacion dependiendo si es am o fm
     * @return estacionAm regresa la estacion que corresponda
     * @return estacionFm regresa la estacion que corresponda
     */
    public float siguiente(float a) 
    {
        if (tipo.equals("am")){
            if (a!=maxam){
            a+=10;
            estacionAM=a;
            return a;
            }else{
            a=530;
            estacionAM=a;
            return a;
            }
        }
        else{
            if (a<maxfm){
            a+=(float)(0.20)*1.0;
            DecimalFormat numberFormat = new DecimalFormat("#.00");
            a=Float.parseFloat(numberFormat.format(a));
            estacionFM=a;
            return a;
            }else{
            a=(float)87.9;
            estacionFM=a;
            return a;
            }
        }
    }

    @Override
    /**
     * metodo que regresa la estacion anterior dependiendo se es am o fm
     * @return estacion Am regresa la estacion anterior
     * @return estacion fm regresa la estacion anterior     
     */
    public float anterior(float a) 
    {
        if (tipo.equals("am")){
            if (a!=minam){
            a-=10;
            estacionAM=a;
            return a;
            }else{
            a=1610;
            estacionAM=a;
            return a;
            }
        }
        else{
            if (a>minfm){
            a-=0.20*1.0;
            DecimalFormat numberFormat = new DecimalFormat("#.00");
            a=Float.parseFloat(numberFormat.format(a));
            estacionFM=a;
            return a;
            }else{
            a=(float)107.9;
            estacionFM=a;
            return a;
            }
        }
    }

    @Override
    /**
     * metodo para guardar una estacion en favoritos
     * @param e En numero de estacion que se deasea guardan en la posicion
     * @param b posicion del boton para ser guardado 
     */
    public void guardar (float e,int b) {
        if (tipo.equals("am")){
            listaAM[b]=e;
        }
        else{
            listaFM[b]=e;
        }
    }

    @Override
    /**
     * metodo para saber que estacion esta guardada en favoritos
     * @param b posicion del boton en la que se desea saber que estacion esta guardada
     * @return lista[x] regresa la estacion que esta guardada en ese boton
     */
    public float seleccionarFav(int b) 
    {
        if (tipo.equals("am")){
            return listaAM[b];
        }
        else{
            DecimalFormat numberFormat = new DecimalFormat("#.00");
            return Float.parseFloat(numberFormat.format(listaFM[b]));
        }
    }
    
}
