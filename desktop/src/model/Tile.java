package model;

public class Tile {

private TERRAIN terrain;
private Actor actor;

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }

    public Tile(TERRAIN terrain){
    this.terrain = terrain;
}

public TERRAIN getTerrain(){
    return terrain;
}
}
