package verifica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientCLI {
    PrintWriter out;
    BufferedReader in;
    Socket s;
    boolean quit = false;
    int pile, fiammiferiRimasti, tries, maxPerMove;
    public ClientCLI(Socket s){
        this.s = s;
    }
    public void interazioneClient() throws IOException{
        in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        out = new PrintWriter(s.getOutputStream(), true);
        while(!quit){

        }
    }
    public void stampaFiammiferi(){

    }
    public void richiestaInfo() throws IOException{
        String StringPile = in.readLine();

    }
}
