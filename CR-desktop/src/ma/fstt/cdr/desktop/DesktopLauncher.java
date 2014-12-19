package ma.fstt.cdr.desktop;

import ma.fstt.cdr.game.CRGame;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title="Code de la route";
		config.height=CRGame.HEIGHT;
		config.width=CRGame.WIDTH;
		new LwjglApplication(new CRGame(), config);
	}
}
