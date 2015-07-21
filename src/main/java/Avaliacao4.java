

import java.io.IOException;
import java.util.Date;
import utfpr.ct.dainf.if62c.avaliacao.Agenda;
import utfpr.ct.dainf.if62c.avaliacao.Compromisso;

/**
 * IF62C Fundamentos de Programação 2
 * Avaliação parcial.
 * @author 
 */
public class Avaliacao4 {
 
    public static void main(String[] args) throws IOException {
        Agenda agenda = new Agenda("Minha Agenda");
        Date data1 = new Date(System.currentTimeMillis() + 20000);
        Compromisso c1 = new Compromisso(data1, "Reuniao 1");
        agenda.novoCompromisso(c1);
        agenda.novoAviso(c1, 11);
        agenda.novoAviso(c1, 9);
        agenda.novoAviso(c1, 18, 2);

        Date data2 = new Date(System.currentTimeMillis() + 15000);
        Compromisso c2 = new Compromisso(data2, "Prova 2");
        agenda.novoCompromisso(c2);
        agenda.novoAviso(c2, 11);
        agenda.novoAviso(c2, 7);
        agenda.novoAviso(c2, 6, 1);
     
        Date data3 = new Date(System.currentTimeMillis() + 101000);
        Compromisso c3 = new Compromisso(data3, "Festa 3");
        agenda.novoCompromisso(c3);
        agenda.novoAviso(c3,100);
        agenda.novoAviso(c3,89);
        agenda.novoAviso(c3,60);
        agenda.novoAviso(c3,45,5);
        
        System.out.println("Pressione Enter para terminar...");
        System.in.read();
        agenda.destroi();
    }
 
}