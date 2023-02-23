// Screen Manager class for Libgdx
package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class ScreenManager {
	private static ScreenManager instance;
	private SpriteBatch batch;
	private Screen currentScreen;
	
    // Static constructor allows for returning of instance
	public static ScreenManager instance() {
		if (instance == null)
			instance = new ScreenManager();
		return instance;
	}
	
	private ScreenManager() {
		batch = new SpriteBatch();
	}
	
	public void show(Screen screen) {
		if (currentScreen != null)
			currentScreen.hide();
		
		currentScreen = screen;
		currentScreen.show();
	}
	
	public void render() {
		if (currentScreen != null) {
			Gdx.gl.glClearColor(0, 0, 0, 1);
			Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
			
			currentScreen.render(Gdx.graphics.getDeltaTime());
		}
	}
	
	public SpriteBatch batch() {
		return batch;
	}
	
	public void resize(int width, int height) {
		if (currentScreen != null)
			currentScreen.resize(width, height);
	}
	
	public void pause() {
		if (currentScreen != null)
			currentScreen.pause();
	}
	
	public void resume() {
		if (currentScreen != null)
			currentScreen.resume();
	}
	
	public void dispose() {
		if (currentScreen != null)
			currentScreen.hide();
	}
}







