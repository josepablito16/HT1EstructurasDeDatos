
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
 
    
    @Override
    public void onOff(boolean e) 
    {
       
        //jose
        
    }

    @Override
    public void Switch(boolean e) 
    {
               
        
        //jose
    }

    @Override
    public float siguiente(float a) 
    {
       
        if (a%10==0) 
        {
            //es AM
            
                if (a==1610) 
                {
                    a=530;
                    System.out.println("530");
                    return a;
                    
                }
                else
                {
                    a+=10;
                }               
                
            
            
            
        }
        else
        {
            //es FM
            
                if (a>107.9) 
                {
                    a=(float) 87.9;
                    
                    return (float) 87.9;
                    
                }
                else
                {
                    a+=0.2;
                    
                    BigDecimal bd = new BigDecimal(a);
                    bd = bd.setScale(2, RoundingMode.HALF_UP);
                    a=(float) bd.doubleValue();
                }
                
                
            
            
            
        }
          
        
        
        //jose
        return a;
    }

    @Override
    public float anterior(float a) 
    {
        return 20;
    }

    @Override
    public void guardar(float e, int b) 
    {
    }

    @Override
    public float seleccionarFav(int b) 
    {
        return 20;
    }
    
}
