package ma.fstt.cdr.entity;

import ma.fstt.cdr.camera.OrthoCamera;
import ma.fstt.cdr.game.CRGame;
import ma.fstt.cdr.game.TextureManager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.math.Vector2;

public class Player extends Entity {

	private final EntityManager entityManager;
	private final OrthoCamera camera;
	private long lastFire;
	private static int sense=1;
	
	public Player(Vector2 pos, Vector2 direction, EntityManager entityManager, OrthoCamera camera) {
		super(TextureManager.PLAYER, pos, direction);
		this.entityManager = entityManager;
		this.camera = camera;
	}

	@Override
	public void update() {
		pos.add(direction);
		if(sense==1) setDirection(300, 0);
		if(sense==-1) setDirection(-300, 0);
		if(this.pos.x>=CRGame.WIDTH) sense=-1;
		if(this.pos.x<=0) sense=1;
		/*
		int dir = 0;
		if (Gdx.input.isTouched()) {
			Vector2 touch = camera.unprojectCoordinates(Gdx.input.getX(), Gdx.input.getY());
			if (touch.x > CRGame.WIDTH / 2)
				dir = 2;
			else
				dir = 1;
		}
		
		if (Gdx.input.isKeyPressed(Keys.A) || dir == 1) //left
			setDirection(-300, 0);
		else if (Gdx.input.isKeyPressed(Keys.D) || dir == 2) //right
			setDirection(300, 0);
		else 
			setDirection(0, 0);
		
		//if (Gdx.input.isKeyPressed(Keys.SPACE)) {
			if (System.currentTimeMillis() - lastFire >= 350) {
				entityManager.addEntity(new Missile(pos.cpy().add(25, TextureManager.PLAYER.getHeight())));
				lastFire = System.currentTimeMillis();
			}
		//}
		 * 
		 */
	}

}
