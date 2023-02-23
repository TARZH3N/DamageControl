//package com.mygdx.game;
//
//// Lifecycle manager for the game. Lifecycle manager controls all other managers.
//class LifecycleManager {
//    private static LifecycleManager instance; // Singleton
//    private EntityManager entityManager;
//    private InputManager inputManager;
//    private RenderManager renderManager;
//    private PlayerManager playerManager;
//
//    private boolean paused; // Is the game paused?
//    private boolean gameOver; // Is the game over?
//    private boolean gameWon; // Did the player win the game?
//
//    private SoundManager soundManager;
//    private UIManager uiManager;
//    //private MapManager mapManager;
//
//    // Constructor
//    private LifecycleManager() {
//        entityManager = new EntityManager();
//        inputManager = new InputManager();
//
//        renderManager = new RenderManager();
//        playerManager = new PlayerManager();
//        soundManager = new SoundManager();
//        uiManager = new UIManager();
//        mapManager = new MapManager();
//        paused = false;
//        gameOver = false;
//        gameWon = false;
//    }
//
//    // Singleton
//    public static LifecycleManager instance() {
//        if (instance == null)
//            instance = new LifecycleManager();
//        return instance;
//    }
//
//    // Update the game
//    public void update(float delta) {
//        if (!paused && !gameOver && !gameWon) {
//            entityManager.update(delta);
//            inputManager.update(delta);
//            mapManager.update(delta);
//            playerManager.update(delta);
//            soundManager.update(delta);
//            uiManager.update(delta);
//        }
//    }
//
//    // Render the game
//    public void render() {
//        renderManager.render();
//    }
//
//    // Dispose of the game
//    public void dispose() {
//        entityManager.dispose();
//        inputManager.dispose();
//        mapManager.dispose();
//        renderManager.dispose();
//        playerManager.dispose();
//        soundManager.dispose();
//        uiManager.dispose();
//    }
//
//    // Getters and setters
//    public EntityManager getEntityManager() {
//        return entityManager;
//    }
//
//    public InputManager getInputManager() {
//        return inputManager;
//    }
//
//    public MapManager getMapManager() {
//        return mapManager;
//    }
//
//    public RenderManager getRenderManager() {
//        return renderManager;
//    }
//}