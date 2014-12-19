package ma.fstt.cdr.entity;

import ma.fstt.cdr.game.CRGame;
import ma.fstt.cdr.game.TextureManager;

import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;

public class Enemy extends Entity {

	public Enemy(Vector2 pos, Vector2 direction) {
		super(TextureManager.ENEMY, pos, direction);
	}

	@Override
	public void update() {
		pos.add(direction);
		
		if (pos.y <= -TextureManager.ENEMY.getHeight()) {
			float x = MathUtils.random(0, CRGame.WIDTH - TextureManager.ENEMY.getWidth());
			pos.set(x, CRGame.HEIGHT);
		}
	}
	
}
