package com.dialaride.controller;

import com.dialaride.utilities.*;
import java.io.IOException;
public class Driver {
    public static void main(String[] args)throws IOException{
        ReadInput ri =new ReadInput();
        ri.reading();
        SortRequest sr = new SortRequest();
        sr.sort(ri.getReq());
        Dijkstra di=new Dijkstra();
        for(int i=0;i<ri.getN();i++){
            di.dij(ri.getLocation(),ri.getN(),i);
        }

        Scheduling s =new Scheduling();
        s.schedule(ri.getCar(),ri.getReq(),ri.getLocation());
        OutputRevenue o =  new OutputRevenue();
        o.writeOutput(ri.getCar());


    }
}
