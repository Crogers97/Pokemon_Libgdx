package screen;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.desktop.Pokemon;
import com.mygdx.game.desktop.Settings;
import controller.PlayerController;
import model.Actor;
import model.TERRAIN;
import model.TileMap;

public class GameScreen extends AbstractScreen {

    private PlayerController controller;

    private Actor player;
    private TileMap map;

    private SpriteBatch batch;

    private Texture standingSouth;
    private Texture grass1;
    private Texture grass2;

    public GameScreen(Pokemon app){
        super(app);

        standingSouth = new Texture("facing_south.png");
        grass1 = new Texture("grass1.png");
        grass2 = new Texture("grass2.png");

        batch = new SpriteBatch();

        map = new TileMap(10,10);

        player = new Actor(map,0,0);

        controller = new PlayerController(player);
    }

    @Override
    public void show() {

        Gdx.input.setInputProcessor(controller);

    }

    @Override
    public void render(float delta) {

        batch.begin();

        for(int x = 0; x < map.getWidth(); x++){
            for(int y=0; y< map.getHeight(); y++) {

                Texture render;
                if(map.getTile(x,y).getTerrain() == TERRAIN.Grass_1){
                    render = grass1;

                }else{
                    render = grass2;
                }
                batch.draw(render,
                        x*Settings.SCALED_TILE_SIZE,
                        y*Settings.SCALED_TILE_SIZE,
                        Settings.SCALED_TILE_SIZE,
                        Settings.SCALED_TILE_SIZE);
            }

        }
        batch.draw(standingSouth,
                player.getX()* Settings.SCALED_TILE_SIZE,
                player.getY()*Settings.SCALED_TILE_SIZE,
                Settings.SCALED_TILE_SIZE,
                Settings.SCALED_TILE_SIZE);
        batch.end();

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
