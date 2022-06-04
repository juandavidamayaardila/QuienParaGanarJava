package com.co.sofkau.db;

import com.co.sofkau.utilities.Player;
import java.io.*;
import java.util.ArrayList;

/**
 * Clase Para gestionar el DAO de los Players
 * @author Piter Velasquez
 * @version 03/06/2022
 */
public class DaoPlayer {

    private File txtPlayers = new File("players.txt");
    private ArrayList<Player> playerArrayList;

    public DaoPlayer(){
        super();
        playerArrayList = new ArrayList<>();
    }

    public File getTxtPlayers() {
        return txtPlayers;
    }

    /**
     * Método para cambiar el archivo donde se guardan los Players
     * @param txtPlayers Parametro tipo File
     */
    public void setTxtPlayers(File txtPlayers) {
        this.txtPlayers = txtPlayers;
    }

    /**
     * Método para devolver lista con los jugadores
     * @return ArrayList<Player>
     */
    public ArrayList<Player> getPlayers(){

        try {
            //lectura de datos
            if (Boolean.FALSE.equals(txtPlayers.exists())){
                createFile();
            }
            BufferedReader scan = new BufferedReader(new FileReader(txtPlayers.getName()));
            String s;
            String s2 = null;
            String nombreP;
            Integer score;


            while ((s = scan.readLine()) != null) {
                s2 += s + "\n";
                String[] line = s.split("-");
                nombreP = line[0];
                score = Integer.valueOf(line[1]);

                Player player = new Player();
                player.setName(nombreP);
                player.setScore(score);
                playerArrayList.add(player);
            }
            scan.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

        return this.playerArrayList;
    }

    /**
     * Método que crea el archivo players.txt
     */
    private void createFile(){
        try {
            FileWriter file = new FileWriter("players.txt");
            file.close();
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }

    /**
     * Método para guardar las partidas de los Players
     * @param file archivo donde se guardaran los datos
     * @param players lista de los Players
     */
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

}
