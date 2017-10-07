package mx.itesm.basgame;

// Estoy editando :) x2
public class Game extends com.badlogic.gdx.Game
{
	@Override
	public void create() {
		setScreen(new loadingScreen(this));  // Splash mainScreen
	}
}

