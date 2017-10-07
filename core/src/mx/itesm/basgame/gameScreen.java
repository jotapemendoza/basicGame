package mx.itesm.basgame;

import com.badlogic.gdx.scenes.scene2d.Stage;

/**
 * Created by josepablo on 10/7/17.
 */

class gameScreen extends mainScreen {

    private final Game game;
    private Stage gameScene;

    public gameScreen(Game game) {
        this.game = game;
    }

    @Override
    public void show() {
        createGameScene();
        loadTextures();

    }

    private void loadTextures() {
        /* Aquí cargas texturas

        Ejemplo:
        bgMenu = new Texture("aSBg.png"); <--- El string "aSBg.png" es el nombre de la imagen a cargar que se
                                               encuentra dentro de la carpeta del proyecto android/assets.

         */

    }

    private void createGameScene() {
        gameScene = new Stage(vista);

     /*
        //Ejemplo de cómo añadir un asset a tu escena

        //Imagén estática:

    // A TextureRegion le das cómo param un Texture, en este caso, bgMenu, que se declaró en loadTexures()

        TextureRegionDrawable trdBg =  new
                TextureRegionDrawable(new TextureRegion(bgMenu));

    //Aquí creas la imagen, dándole cómo parámetro el TextureRegionDrawable que creaste arriba

        Image bg = new Image(trdBg);

    // Con .setPosition(x,y) defines la posición de tu objeto

        bg.setPosition(0,0);

    // Lo añades a la escena
        gameScene.addActor(bg);

    */

    }

    @Override
    public void render(float delta) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }
}
