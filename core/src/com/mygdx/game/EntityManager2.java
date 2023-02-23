//package com.mygdx.game;
//
//import com.badlogic.gdx.Gdx;
//import com.badlogic.gdx.graphics.GL20;
//import com.badlogic.gdx.graphics.g2d.SpriteBatch;
//import com.badlogic.gdx.math.Vector2;
//import com.badlogic.gdx.utils.Array;
//
//public class EntityManager2 {
//    private static EntityManager instance;
//    private SpriteBatch batch;
//    private Array<Entity> entities;
//
//    public static EntityManager instance() {
//        if (instance == null)
//            instance = new EntityManager();
//        return instance;
//    }
//
//    private EntityManager() {
//        batch = new SpriteBatch();
//        entities = new Array<Entity>();
//    }
//
//    public void add(Entity entity) {
//        entities.add(entity);
//    }
//
//    public void remove(Entity entity) {
//        entities.removeValue(entity, true);
//    }
//
//    public void render() {
//        batch.begin();
//        for (Entity entity : entities) {
//            entity.render(batch);
//        }
//        batch.end();
//    }
//
//    public void update(float delta) {
//        for (int i = 0; i < entities.size; i++) {
//            Entity entity = entities.get(i);
//            entity.update(delta);
//            if (entity.isDead()) {
//                entities.removeIndex(i);
//                i--;
//            }
//        }
//    }
//
//    public void clear() {
//        entities.clear();
//    }
//
//    public void debugRender() {
//        for (Entity entity : entities) {
//            entity.debugRender();
//        }
//    }
//
//    public void resize(int width, int height) {
//        for (Entity entity : entities) {
//            entity.resize(width, height);
//        }
//    }
//
//    public void pause() {
//        for (Entity entity : entities) {
//            entity.pause();
//        }
//    }
//
//    public void resume() {
//        for (Entity entity : entities) {
//            entity.resume();
//        }
//    }
//
//    public Entity getEntityAt(Vector2 position) {
//        for (Entity entity : entities) {
//            if (entity.contains(position))
//                return entity;
//        }
//        return null;
//    }
//
//    public Array<Entity> getEntities() {
//        return entities;
//    }
//}