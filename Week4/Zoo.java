package Frankfurt.Katis.Week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Zoo {
    
    public static void main (String []args) {
        
        Scanner sc= new Scanner (System.in);
        
        int n=Integer.valueOf(sc.nextLine());
        
    
        
        int listnumber=1;
        while (n!=0) {
            
            
            HashMap<String,Integer> animalsMap=new HashMap<>(); 
            List <String> animals= new ArrayList<>();
            
            for (int counter=0;counter<n;counter++) {
                
                String animal=sc.nextLine();
                String[] parts=animal.trim().split(" ");            //usuwa spacje ktore sa poza koncami 
                
                String animalType=parts[parts.length-1].toLowerCase();  //ostatnia czesc
                if(animalsMap.containsKey(animalType)) {                //sprawdzamy czy klucz juz jest w mapie
                    int value= animalsMap.get(animalType);              //pobranie wartosi aktualnej
                    animalsMap.put(animalType, value+1);                //zwiekszenie wartosci o 1
                    
                }else {                                                 // nie ma danego zwierzecia w mapie
                    animalsMap.put(animalType, 1);                      //Ustawienie wartosci na 1
                    animals.add(animalType);
                
                }

            }
            
            Collections.sort(animals);                                  //sortuje liste 
            System.out.println("List "+ listnumber+":");
            for (int counter=0;counter<animals.size();counter++) {
                System.out.println(animals.get(counter)+" | "+ animalsMap.get(animals.get(counter)));
            }
            listnumber++;
            n=Integer.valueOf(sc.nextLine());

        }
    
        
        sc.close();
        
    }

}
