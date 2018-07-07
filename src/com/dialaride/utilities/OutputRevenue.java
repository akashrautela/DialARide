package com.dialaride.utilities;
import com.dialaride.utilities.*;
public class OutputRevenue {
    public void writeOutput(Car car[]){
        int i,totalRevenue=0;
        for(i=0;i<car.length;i++){
            totalRevenue +=car[i].getRevaneu();
        }
        System.out.println(" Total reveneu : "+totalRevenue);
    }
}
