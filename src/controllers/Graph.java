package controllers;

import java.util.HashSet;
import java.util.Set;

import models.Node;

public class Graph {
    private Set<Node> nodes;

    public Graph() {
        nodes=new HashSet<>();
    }
    //Anadir un nodo
    public Node addNode(int value){
        Node newNode=new Node(value);
        nodes.add(newNode);
        return newNode;

    }
   //Anadir arista
    public void addEdge(Node src, Node dest){
        src.addNeighbor(dest);
        dest.addNeighbor(src);

    }
    //Imprimir grafo
    //
    public void printGraphic(){
        for (Node node : nodes) {
            System.out.println("Nodo: "+node.getValue());
            for (Node neighbor : node.getNeighbors()) {
                System.out.println("Vecino: "+neighbor.getValue());
            }
            System.out.println();
        }
    }
    public void getDFS(Node startNode){
        

    }
    private void getDFSUtil(Node node, boolean[] visited){


    }
    public void getBFS(Node startNode){


    }
    public int[][] getAdjacencyMatrix(){

        return null;
    }
    public void printAdjacencyMatrix(){


    }

    

}