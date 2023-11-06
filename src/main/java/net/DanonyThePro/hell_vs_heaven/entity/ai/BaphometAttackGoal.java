package net.DanonyThePro.hell_vs_heaven.entity.ai;

import net.DanonyThePro.hell_vs_heaven.entity.custom.BaphometEntity;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;

public class BaphometAttackGoal extends MeleeAttackGoal {
    private final BaphometEntity entity;
    private int attackDelay = 10;
    private int tickUntilNextAttack = 10;
    private boolean shouldCountUntilNextAttack = false;
    public BaphometAttackGoal(PathfinderMob mob, double p_25553_, boolean p_25554_) {
        super(mob, p_25553_, p_25554_);
        entity = ((BaphometEntity) mob);
    }

    @Override
    public void start() {
        super.start();
        attackDelay = 10;
        tickUntilNextAttack = 10;
    }

    @Override
    protected void checkAndPerformAttack(LivingEntity pEnemy, double pDistToEnemySqr) {
        if (isEnemyWithinAttackDistance(pEnemy, pDistToEnemySqr)) {
            shouldCountUntilNextAttack = true;

            if(isTimeToStartAttackAnimation()) {
                entity.setAttacking(true);
            }

            if(isTimeToAttack()) {
                this.mob.getLookControl().setLookAt(pEnemy.getX(), pEnemy.getEyeY(), pEnemy.getZ());
                performAttack(pEnemy);
            }
        } else {
            resetAttackCooldown();
            shouldCountUntilNextAttack = false;
            entity.setAttacking(false);
            entity.attackAnimationTimeout = 0;
        }
    }

    private boolean isEnemyWithinAttackDistance(LivingEntity pEnemy, double pDistToEnemySqr) {
        return pDistToEnemySqr <= this.getAttackReachSqr(pEnemy);
    }

    protected void resetAttackCooldown() {
        this.tickUntilNextAttack = this.adjustedTickDelay(attackDelay * 2);
    }

    protected boolean isTimeToAttack() {
        return this.tickUntilNextAttack <= 0;
    }

    protected boolean isTimeToStartAttackAnimation() {
        return this.tickUntilNextAttack <= attackDelay;
    }

    protected int getTicksUntilNextAttack() {
        return this.tickUntilNextAttack;
    }


    protected void performAttack(LivingEntity pEnemy) {
        this.resetAttackCooldown();
        this.mob.swing(InteractionHand.MAIN_HAND);
        this.mob.doHurtTarget(pEnemy);
    }
    @Override
    public void tick() {
        super.tick();
        if (shouldCountUntilNextAttack) {
            this.tickUntilNextAttack = Math.max(this.tickUntilNextAttack - 1, 0);
        }
    }

    @Override
    public void stop() {
        entity.setAttacking(false);
        super.stop();
    }
}
