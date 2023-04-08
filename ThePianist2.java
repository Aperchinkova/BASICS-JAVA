package ExamPreparation;

import java.util.*;

public class ThePianist2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int countOFPieces=Integer.parseInt(scanner.nextLine());
        Map<String,List<String>> collection=new LinkedHashMap<>();
        for(int i=1;i<=countOFPieces;i++)
        {
            String[] pieces= scanner.nextLine().split("\\|");
            String piece=pieces[0];
            String composer=pieces[1];
            String tone=pieces[2];
            List<String> music=new ArrayList<>();
            music.add(composer);
            music.add(tone);
            collection.put(piece,music);
        }
        String command= scanner.nextLine();
        while(!command.equals("Stop"))
        {
            if(command.contains("Add"))
            {
                //Add|{piece}|{composer}|{key}
                String piece=command.split("\\|")[1];
                String composer=command.split("\\|")[2];
                String key=command.split("\\|")[3];

                if(collection.containsKey(piece))
                {
                    System.out.println(piece + " is already in the collection!");
                }else{
                    List<String> info=new ArrayList<>();
                    info.add(composer);
                    info.add(key);
                    collection.put(piece,info);
                    System.out.printf("%s by %s in %s added to the collection!%n",piece,composer,key);
                }
            }else if(command.contains("Remove"))
            {
                //Remove|{piece}
                String piece=command.split("\\|")[1];
                if(collection.containsKey(piece))
                {
                    collection.remove(piece);
                    System.out.printf("Successfully removed %s!%n",piece);
                }else{
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n",piece);
                }
            }else if(command.contains("ChangeKey"))
            {
                //ChangeKey|{piece}|{new key}
                String piece=command.split("\\|")[1];
                String newKey=command.split("\\|")[2];
                if(!collection.containsKey(piece))
                {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n",piece);
                }else{
                    List<String> currentInfo=collection.get(piece);
                    currentInfo.remove(1);
                    currentInfo.add(newKey);
                    collection.put(piece,currentInfo);
                    System.out.printf("Change the key of %s to %s!%n",piece,newKey);

                }
            }

            command= scanner.nextLine();
        }
        collection.entrySet()
                .forEach(entry-> System.out.printf("%s -> Composer: %s, Key: %s%n",entry.getKey(),entry.getValue().get(0),entry.getValue().get(1)));

    }
}
