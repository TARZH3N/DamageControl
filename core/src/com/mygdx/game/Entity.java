package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Entity {
	private Texture texture;
	private float x, y;
	
	public Entity(Texture texture, float x, float y) {
		this.texture = texture;
		this.x = x;
		this.y = y;
	}
	
	public void render(SpriteBatch batch) {
		batch.draw(texture, x, y);
	}
}