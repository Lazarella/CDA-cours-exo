package org.example.poo.heritage;

public class House{

    protected int surface;

    protected Door door;

    protected final String NAME = "une Maison";



    public House(int surface, Door door) {
        this.surface = surface;
        this.door = door;
    }

    public House() {

    }

    public int getSurface() {
        return surface;
    }

    public void setSurface(int surface) {
        this.surface = surface;
    }

    public void display (){
        System.out.println("Je suis "+NAME+", ma surface est de " + surface+" m² !");
        door.display();
    }

    public Door getDoor(){
        return this.door;
    }
}
