package kbpakar;
import java.util.*;

public class KBPakar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedList gejala = new LinkedList<>();
        String gejala1[] = new String[] {"Muntah", "Diare", "Lumpuh", "Pingsan", "Sulit bernafas",
        "Batuk", "Demam", "Mulut kuning", "Berat turun", "Kotoran kelabu", "Bulu rontok", "Kurang makan",
        "Gemetar", "Lidah menjulur", "Lemas"};
        String penyakit[] = new String[] {"Addison", "Distemper", "Leptospirosis", "Parvovirus", "Demodicosis",
        "Scabies", "Eclampsia"};
        
        int l = 0;
        while(l < gejala1.length){
            System.out.print("Apakah bergejala " +gejala1[l] +"?(y/n) ");
            String yn = in.next();
            if (yn.equalsIgnoreCase("stop")) {
                break;
            }
            else if (yn.equalsIgnoreCase("y") || yn.equalsIgnoreCase("n")) {
                if (yn.equalsIgnoreCase("y")) {
                    gejala.add(gejala1[l]);
                    l++;
                }
                else l++;
            }
            else System.out.println("Input invalid");
        }
        
        System.out.println(gejala);
        
        if (gejala.contains("Muntah") && gejala.contains("Diare")
                && gejala.contains("Lumpuh") && gejala.contains("Pingsan")
                && gejala.contains("Berat turun")) {
            System.out.println("Penyakit: Addison");
        }
        else if(gejala.contains("Muntah") && gejala.contains("Sulit bernafas")
                && gejala.contains("Batuk") && gejala.contains("Berat turun")){
            System.out.println("Penyakit: Distemper");
        }
        else if (gejala.contains("Muntah") && gejala.contains("Demam")
                && gejala.contains("Mulut kuning") && gejala.contains("Lemas")) {
            System.out.println("Penyakit: Leptospirosis");
        }
        else if (gejala.contains("Muntah") && gejala.contains("Kotoran kelabu")
                && gejala.contains("Kurang makan")) {
            System.out.println("Penyakit: Parvovirus");
        }
        else if (gejala.contains("Bulu rontok") && gejala.contains("Kurang makan")
                && gejala.contains("Gemetar")) {
            System.out.println("Penyakit: Scabies");
        }
        else if (gejala.contains("Berat turun") && gejala.contains("Gemetar")
                && gejala.contains("Lidah menjulur") && gejala.contains("Lemas")) {
            System.out.println("Penyakit: Eclampsia");
        }
        else if (gejala.contains("Kurang makan") && gejala.contains("Gemetar")) {
            System.out.println("Penyakit: Demodicosis");
        }
        else System.out.println("Penyakit belum dapat ditentukan :(");
    }
    
}
