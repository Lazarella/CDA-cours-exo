package org.example.strategy;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Destination {

    private String destination;

    public void navigate(NavigationStrategy navigateStrategy){
        if(navigateStrategy.navigate(destination)){
            System.out.println("En voiture Simone!");
        }else{
            System.out.println("Elle est bonne... et même trop bonne pour toi");
        }

    }

}
