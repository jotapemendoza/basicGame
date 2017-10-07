package mx.itesm.basgame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

/**
 * El menú principal del game.
 */

class menuScreen extends mainScreen
{
    private Game game;

    // Contenedor de los botones
    private Stage menuScene;

    // Texturas de los botones

    private Texture playButton;
    private Texture bgMenu;

    public menuScreen(Game game) {
        this.game = game;
    }

    @Override
    public void show() {
        loadTextures();   // Carga imágenes
        createMenuScene();  // Crea la escena
        Gdx.input.setInputProcessor(menuScene);
    }

    private void createMenuScene() {

        menuScene = new Stage(vista);

        TextureRegionDrawable trdBg =  new
                TextureRegionDrawable(new TextureRegion(bgMenu));
        Image bg = new Image(trdBg);
        bg.setPosition(0,0);
        menuScene.addActor(bg);

        // Botón
        TextureRegionDrawable trdPlay = new
                TextureRegionDrawable(new TextureRegion(playButton));
        ImageButton btnPlay = new ImageButton(trdPlay);
        btnPlay.setPosition(376,681);
        menuScene.addActor(btnPlay);

        //Listener botón
        btnPlay.addListener( new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                super.clicked(event, x, y);
                game.setScreen(new gameScreen(game));
            }
        } );


    }


    private void loadTextures() {

        bgMenu = new Texture("menuBg.png");
        playButton = new Texture("playButton.png");

    }


    @Override
    public void render(float delta) {
        clearScreen(1,1,1);
        batch.setProjectionMatrix(camara.combined);
        menuScene.draw();

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    // Liberar los recursos asignados
    @Override
    public void dispose() {

    }
}
