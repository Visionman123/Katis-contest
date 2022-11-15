package Frankfurt.Katis.Week4;

import java.util.*;

public class whatdoesthefoxsay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String[] say = sc.nextLine().split(" ");
            ArrayList<String> notfox = new ArrayList<String>();

            while (true) {
                String animalsound = sc.nextLine();

                if (animalsound.equals("what does the fox say?")) 
                    break;

            
                notfox.add(animalsound.split(" ")[2]);
            }

            for (int j = 0; j < say.length; j++)
                if (!notfox.contains(say[j]))
                    System.out.print(say[j] + " ");
        }

        sc.close();
    }
}

// run time error
// public class whatdoesthefoxsay {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         sc.nextLine();
//         ArrayList<String> fox = new ArrayList<String>();
//         ArrayList<String> notfox = new ArrayList<String>();

//         for (int i = 0; i < n; i++) {
//             String[] say = sc.nextLine().split(" ");
//             for (int j = 0; j < say.length; j++) {
//                 fox.add(say[j + (i * say.length)]);
//             }

//         }

//         String animalsound = "";

//         while (true) {

//             if (animalsound.equals("what does the fox say?")) {
//                 break;

//             } else {
//                 animalsound = sc.nextLine();
//                 notfox.add(animalsound.split(" ")[2]);
//             }
//         }

//         fox.removeAll(notfox);
        
//         for (int i = 0; i < fox.size(); i++) {
//             System.out.println(fox.get(i));
//         }

//         sc.close();
//     }
// }
