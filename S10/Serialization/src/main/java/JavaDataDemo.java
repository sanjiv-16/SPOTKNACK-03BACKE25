package main.java;

import java.io.*;
import java.util.Scanner;

class Player implements Serializable {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Player: " + name + " | Score: " + score;
    }
}

public class JavaDataDemo {
    public static void main(String[] args) throws IOException {
        String txtFile = "output/score.txt";
        String serFile = "output/player.txt";
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter Player Name: ");
//        String name = scanner.nextLine();
//        System.out.print("Enter Player Score: ");
//        int score = scanner.nextInt();
//        Player player = new Player(name, score);
//
//        // 2. FILE WRITING + BUFFERED STREAMS
//
////        try (BufferedWriter writer = new BufferedWriter(new FileWriter(txtFile))) {
////            writer.write("Last Session: " + player.name + " scored " + player.score);
////            System.out.println("\n[Text Write] Logged to " + txtFile);
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
//
//        // 3. SERIALIZATION (Writing an Object)
//       try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(serFile))) {
//            out.writeObject(player);
//            System.out.println("[Serialization] Player object saved to " + serFile);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        System.out.println("\n--- READING DATA BACK ---");

//        // 4. FILE READING + BUFFERED STREAMS (Reading Text)
//        try (BufferedReader reader = new BufferedReader(new FileReader(txtFile))) {
//            System.out.println("Text File Content: " + reader.readLine());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // 5. DESERIALIZATION (Reading an Object)
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(serFile))) {
            Object obj = in.readObject();
            Player savedPlayer = (Player) obj;
            System.out.println("Deserialized Object: " + savedPlayer);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}