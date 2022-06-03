package com.co.sofkau.db;

import com.co.sofkau.utilities.Player;
import java.io.*;
import java.util.ArrayList;

public class DaoPlayer extends DAO{

    public File txtPlayers = new File("players.txt");
    private ArrayList<Player> playerArrayList;

    public DaoPlayer(){
        super();
        playerArrayList = new ArrayList<>();
    }

    public File getTxtPlayers() {
        return txtPlayers;
    }

    public void setTxtPlayers(File txtPlayers) {
        this.txtPlayers = txtPlayers;
    }

    public ArrayList<Player> getPlayers(){


        try {
            //lectura de datos
            BufferedReader scan = new BufferedReader(new FileReader(txtPlayers.getName()));
            String s;
            String s2 = "";
            String NombreP;
            Integer score;

            int unidades;
            while ((s = scan.readLine()) != null) {
                s2 += s + "\n";
                String[] line = s.split("-");
                NombreP = line[0];
                score = Integer.valueOf(line[1]);

                Player player = new Player() ;
                playerArrayList.add(player);
            }
            scan.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

        return this.playerArrayList;
    }
    
    public void savePlayers(File file, ArrayList<Player> players) {

        PrintWriter output = null;
        try {
            // escritura de datos
            output = new PrintWriter(new BufferedWriter(new FileWriter(file.getName())));

            for (int i = 0; i < players.size(); i++) {
                output.println(players.get(i).getName() + "-" + players.get(i).getScore());
            }
            output.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /*
    public ArrayList<Player> sortMinFirst(){

        ArrayList<Player> copyPlayers = new ArrayList<>();
        copyPlayers.addAll(this.playerArrayList);
        copyPlayers.sort();
        return copyPlayers;
    }*/
}
