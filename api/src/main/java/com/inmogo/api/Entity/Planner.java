package com.inmogo.api.Entity;

public class Planner {
    //Attributes of Planner
    private int idPlanner;
    private int idUserT;
    private int idListing;
    private boolean[][] ArrayPlanner;

    //Constructor Planner
    public Planner(int idPlanner, int idUserT, int idListing, boolean[][] arrayPlanner) {
        this.idPlanner = idPlanner;
        this.idUserT = idUserT;
        this.idListing = idListing;
        this.ArrayPlanner = arrayPlanner;
    }

    //getters Planner

    //get id of planner
    public int getIdPlanner() {return idPlanner;}
    //get id associeted to UserTemplate
    public int getIdUserT() {return idUserT;}
    //get id associeted to Listing
    public int getIdListing() {return idListing;}
    //get the appointment date of the User
    public boolean[][] getArrayPlanner() {return ArrayPlanner;}

    //setters Planner
    //change Id of Planner
    public void setIdPlanner(int idPlanner) {this.idPlanner = idPlanner;}
    //change Id of UserT
    public void setIdUserT(int idUserT) {this.idUserT = idUserT;}
    //change Id of Listing
    public void setIdListing(int idListing) {this.idListing = idListing;}
    //change the planner of UserT
    public void setArrayPlanner(boolean[][] arrayPlanner) {this.ArrayPlanner = arrayPlanner;}
}
