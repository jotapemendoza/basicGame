package mx.itesm.basgame;

import com.badlogic.gdx.Gdx;


class loadingScreen extends mainScreen
{
    private Game game;
    private float time;


    public loadingScreen(Game game) {
        this.game = game;
    }


    @Override
    public void show() {
        time = 0;
    }

    @Override
    public void render(float delta) {
        clearScreen(1, 1, 1);
        batch.setProjectionMatrix(camara.combined);
        batch.begin();
        batch.end();

        time += Gdx.graphics.getDeltaTime();
        if (time >=1) {
            game.setScreen(new menuScreen(game));
        }
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
