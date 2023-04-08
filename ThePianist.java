package FINALEXAMSPREP;

import com.sun.source.tree.LiteralTree;

import java.util.*;

public class ThePianist {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> music=new LinkedHashMap<>();
        for(int i=0;i<n;i++)
        {
            String[] pieces=scanner.nextLine().split("\\|");
            String piece=pieces[0];
            String composer=pieces[1];
            String key=pieces[2];
            List<String> ck=new ArrayList<>();
            ck.add(composer);
            ck.add(key);
            music.put(piece,ck);
        }
        String input=scanner.nextLine();
        while (!input.equals("Stop"))
        {
            String[] parts=input.split("\\|");
            String command=parts[0];
            String piece=parts[1];
            switch (command)
            {
                case "Add":
                    String composer=parts[2];
                    String key=parts[3];
                    if(!music.containsKey(piece))
                    {
                        List<String> new1=new ArrayList<>();
                        new1.add(composer);
                        new1.add(key);
                        music.put(piece,new1);
                        System.out.printf("%s by %s in %s added to the collection!%n",piece,composer,key);
                    }else{
                        System.out.println(piece+" is already in the collection!");
                    }
                    break;
                case "Remove":
                    if(music.containsKey(piece))
                    {
                        music.remove(piece);
                        System.out.printf("Successfully removed %s!%n",piece);
                    }else{
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n",piece);
                    }
                    break;
                case "ChangeKey":
                    String newKey=parts[2];
                    if(music.containsKey(piece))
                    {
                        String old=music.get(piece).get(1);
                        String composerr=music.get(piece).get(0);

                        List<String> cn=new ArrayList<>();
                        cn.add(composerr);
                        cn.add(newKey);

                        music.replace(piece,music.get(piece),cn);
                        System.out.printf("Changed the key of %s to %s!%n",piece,newKey);
                    }else{
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n",piece);
                    }
                    break;
            }
            input= scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : music.entrySet()) {
            System.out.printf("%s -> Composer: %s, Key: %s%n",entry.getKey(),entry.getValue().get(0),entry.getValue().get(1));
        }

    }
}
