package com.dialaride.utilities;

public class Dijkstra {
    public void dij(int [][]graph,int n,int src){
        int []visited =new int[n];
        int []distance =new int[n];
        int inf=999,v=0;
        int i,j;
        for(i=0;i<n;i++){
            visited[i]=0;
        }
        distance=graph[src];
        visited[src]=1;
        distance[src]=0;
        for(i=0;i<n;i++){
            inf=999;
            for(j=0;j<n;j++){
                if(inf>distance[j]&&visited[j]!=1){
                    inf=distance[j];
                    v=j;
                }

            }
            visited[v]=1;
            for(j=0;j<n;j++){
                if(inf+graph[j][v] < distance[j]&& visited[j]!=1){
                    distance[j]=inf+graph[j][v];
                }
            }
        }
        for(i=0;i<n;i++){
            graph[src][i]=distance[i];
        }
    }
}
