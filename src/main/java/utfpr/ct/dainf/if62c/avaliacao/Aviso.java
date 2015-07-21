package utfpr.ct.dainf.if62c.avaliacao;

import java.util.Date;
import java.util.TimerTask;

/**
 * IF62C Fundamentos de Programação 2
 * Avaliação parcial.
 * @author 
 */
public class Aviso extends TimerTask {
    
    protected final Compromisso compromisso;
    
    public Aviso(Compromisso compromisso) {
        this.compromisso = compromisso;
    }
    
    @Override
    public void run() {
        Date date = new Date();
        int seconds = (int)(compromisso.getData().getTime() - System.currentTimeMillis())/1000;
        System.out.println(compromisso.getDescricao() + " começa em " + seconds + "s");
    }
        
}
