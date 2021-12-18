package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();


		config.title = "Pokemon Game";
		config.height = 400;
		config.width = 600;
		config. vSyncEnabled = true;

		new LwjglApplication(new Pokemon(), config);
	}
}
