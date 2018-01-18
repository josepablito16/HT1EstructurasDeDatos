
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jose
 */
public class Radio implements douglas
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
    
    public Radio(){
        tipo="fm";
        maxfm=(float)(107.9);
        minfm=(float)(89.7);
        maxam=(float)(1610);
        minam=(float)(530);
        encendido=true;
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
    public boolean onOff() 
    {
       if (encendido==true){
           encendido=false;
       }else{
           encendido=true;
       }
        //jose
        return encendido;
        
    }

    @Override
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
    public float siguiente() 
    {
        if (tipo.equals("am")){
            if (estacionAM!=maxam){
            estacionAM+=10;
            return estacionAM;
            }else{
            estacionAM=530;
            return estacionAM;
            }
        }
        else{
            if (estacionFM<maxfm){
            estacionFM+=(float)(0.20)*1.0;
            DecimalFormat numberFormat = new DecimalFormat("#.00");
            estacionFM=Float.parseFloat(numberFormat.format(estacionFM));
            return estacionFM;
            }else{
            estacionFM=(float)87.9;
            
            return estacionFM;
            }
        }
    }

    @Override
    public float anterior() 
    {
        if (tipo.equals("am")){
            if (estacionAM!=minam){
            estacionAM-=10;
            return estacionAM;
            }else{
            estacionAM=1610;
            return estacionAM;
            }
        }
        else{
            if (estacionFM>minfm){
            estacionFM-=0.20*1.0;
            DecimalFormat numberFormat = new DecimalFormat("#.00");
            estacionFM=Float.parseFloat(numberFormat.format(estacionFM));
            return estacionFM;
            }else{
            estacionFM=(float)107.9;
            return estacionFM;
            }
        }
    }

    @Override
    public void guardar (int b) {
        if (tipo.equals("am")){
            listaAM[b]=estacionAM;
        }
        else{
            listaFM[b]=estacionFM;
        }
    }

    @Override
    public float seleccionarFav(int b) 
    {
        if (tipo.equals("am")){
            return listaAM[b];
        }
        else{
            return listaFM[b];
        }
    }
    
}
