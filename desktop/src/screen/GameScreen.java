package screen;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.desktop.Pokemon;
import com.mygdx.game.desktop.Settings;
import controller.PlayerController;
import model.Player;

public class GameScreen extends AbstractScreen {

    private PlayerController controller;

    private Player player;

    private SpriteBatch batch;

    private Texture standingSouth;

    public GameScreen(Pokemon app){
        super(app);

        standingSouth = new Texture("facing_south.png");

        batch = new SpriteBatch();

        player = new Player(0,0);

        controller = new PlayerController(player);
    }

    @Override
    public void show() {

        Gdx.input.setInputProcessor(controller);

    }

    @Override
    public void render(float delta) {

        batch.begin();
        batch.draw(standingSouth, player.getX()* Settings.SCALED_TILE_SIZE, player.getY()*Settings.SCALED_TILE_SIZE, Settings.SCALED_TILE_SIZE,Settings.SCALED_TILE_SIZE);
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
