package com.example;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        Socket s = new Socket("localhost", 3000);
        PrintWriter pr = new PrintWriter(s.getOutputStream());

        System.out.print("caiooo");
        
        InputStreamReader RicercaMessagioPeso = new InputStreamReader(s.getOutputStream());
        
        BufferedReader MessagioServerPesoLetto = new BufferedReader(RicercaMessagioPeso);

        String MessagioPeso = MessagioServerPesoLetto.readLine();
        System.out.println("Server: " + MessagioPeso);



        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

        String stringaUtente = tastiera.readLine();
        
        pr.println(stringaUtente);
    

        
       
        s.close();
    }
}
