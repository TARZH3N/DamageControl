//This player object extends Entity and adds a few more methods to it. It also has a constructor that calls the super constructor.
package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;

public class Player extends Entity {
	private int hp;
	
	public Player(Texture texture, float x, float y) {
		super(texture, x, y);
		hp = 100;
	}
	
	public void damage(int amount) {
		hp -= amount;
	}
	
	public int getHp() {
		return hp;
	}
}

// package com.mygdx.game;

// import com.badlogic.gdx.ApplicationAdapter;
// import com.badlogic.gdx.Gdx;
// import com.badlogic.gdx.graphics.GL20;
// import com.badlogic.gdx.graphics.Texture;
// import com.badlogic.gdx.graphics.g2d.SpriteBatch;

// public class Main extends ApplicationAdapter {
// 	private SpriteBatch batch;
// 	private Texture playerTexture;
// 	private Player player;
	
// 	@Override
// 	public void create () {
// 		batch = new SpriteBatch();
// 		playerTexture = new Texture("badlogic.jpg");
// 		player = new Player(playerTexture, 100, 100);
// 		EntityManager.instance().add(player);
// 	}

// 	@Override
// 	public void render () {
// 		Gdx.gl.glClearColor(1, 0, 0, 1);
// 		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
// 		EntityManager.instance().render(batch);
// 	}
	
// 	@Override
// 	public void dispose () {
// 		batch.dispose();
// 		playerTexture.dispose();
// 	}
// }

// Compare this snippet from core\src\com\mygdx\game\Main.java:
// package com.mygdx.game;

// import com.badlogic.gdx.graphics.Texture;
// import com.badlogic.gdx.graphics.g2d.SpriteBatch;

// public class Main {
// 	public static void main(String[] args) {
// 		SpriteBatch batch = new SpriteBatch();
// 		Texture texture = new Texture("badlogic.jpg");
