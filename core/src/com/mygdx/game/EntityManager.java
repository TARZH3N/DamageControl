// Entity Manager class in libgdx 
package com.mygdx.game;

import java.util.ArrayList;
import java.util.List;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class EntityManager {
	private static EntityManager instance;
	private List<Entity> entities;
	
	public static EntityManager instance() {
		if (instance == null)
			instance = new EntityManager();
		return instance;
	}
	
	private EntityManager() {
		entities = new ArrayList<Entity>();
	}
	
	public void add(Entity entity) {
		entities.add(entity);
	}
	
	public void render(SpriteBatch batch) {
		for (Entity entity : entities)
			entity.render(batch);
	}
}