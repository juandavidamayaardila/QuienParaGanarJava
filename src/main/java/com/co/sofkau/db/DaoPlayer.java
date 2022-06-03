package com.co.sofkau.db;

import com.co.sofkau.utilities.Player;
import java.io.*;
import java.util.ArrayList;

public class DaoPlayer extends DAO{

    private ArrayList<Player> playerArrayList;

    public DaoPlayer() {
        super();
        this.playerArrayList = new ArrayList<>();
    }

    public ArrayList<Player> getPlayers(File file){


        try {
            //lectura de datos
            BufferedReader scan = new BufferedReader(new FileReader(file.getName()));
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

                Player player = new Player(NombreP, score) ;
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

    public ArrayList<Player> sortMinFirst(){

        ArrayList<Player> copyPlayers = new ArrayList<>();
        copyPlayers.addAll(this.playerArrayList);
        copyPlayers.sort();
        return copyPlayers;
    }
}
