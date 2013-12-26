/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testebema;

import bemajava.BemaInteger;
import bemajava.Bematech;
import javax.swing.JFrame;
import org.testng.annotations.Test;

/**
 *
 * @author base
 */
public class Testa {
    
    
    static {
    try {
    	System.load("C:\\Windows\\System32\\BemaFI32.dll");
    } catch (UnsatisfiedLinkError e) {
      System.err.println("Native code library failed to load.\n" + e);
      System.exit(1);
    }
  }
    
    
    @Test
    public void teste(){
        
        //MySharedLibrary lib = (MySharedLibrary) Native.loadLibrary("mp2032", MySharedLibrary.class);  
  
         //System.out.println("Caminho da DLL: "+lib.toString()); 
        
        int iRetorno;
        BemaInteger ACK, ST1, ST2, ST3;
        ACK = new BemaInteger();
        ST1 = new BemaInteger();
        ST2 = new BemaInteger();
        ST3 = new BemaInteger();

        // Habilitando o retorno estendido da impressora MFD
        iRetorno = Bematech.HabilitaDesabilitaRetornoEstendidoMFD( "1" );

        // Emitindo uma Leitura X
        iRetorno = Bematech.LeituraX();
        System.out.println( "Retorno: " + iRetorno );

        // Pegando o retorno da impressora MFD
        iRetorno = Bematech.RetornoImpressoraMFD( ACK, ST1, ST2, ST3 );
        String retorno = "ACK: " + ACK.number;
        retorno += "\nST1: " + ST1.number;
        retorno += "\nST2: " + ST2.number;
        retorno += "\nST3: " + ST3.number;
        System.out.println( "Retorno Impressora MFD: \n" + retorno );
    }
    
}
