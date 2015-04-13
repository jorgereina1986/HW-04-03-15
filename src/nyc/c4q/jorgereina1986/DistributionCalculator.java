package nyc.c4q.jorgereina1986;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileSystemNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Jorge Reina and Luke's help at the review session on 4/5/15.
 */
public class DistributionCalculator
{
    public static ArrayList<Double> calculate(File textFile) throws FileNotFoundException {

        ArrayList<Double> percentages = new ArrayList<Double>();

        int totalNumberOfLetters = 0;

        HashMap<Character,Integer> percentageTable = new HashMap<Character, Integer>();

        for(int i = 0; i < 26; i++){
            percentageTable.put((char)(i+97) , 0);
        }


        Scanner input = new Scanner(textFile);
        String word;
        while (input.hasNext()) {   //keep looking until there is no next file
            word = input.next();

            for(int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);

                if(Character.isLetter(c)) {
                    percentageTable.put(c,percentageTable.get(c)+1);
                    totalNumberOfLetters++;

                }
            }
        }

        for(int count: percentageTable.values()){
            double percentage = (count*100) / totalNumberOfLetters;
            percentages.add(percentage);
        }
        return percentages;
    }

    public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File("/Users/c4q-jorgereina/Desktop/accesscode/HW-04-03-15/src/nyc/c4q/jorgereina1986/textFile.txt");

        ArrayList<Double> list = calculate(file);


        System.out.println(list);


    }
}
