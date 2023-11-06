package net.DanonyThePro.hell_vs_heaven.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.DanonyThePro.hell_vs_heaven.entity.animations.ModAnimationDefinitions;
import net.DanonyThePro.hell_vs_heaven.entity.custom.BaphometEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class BaphometModel<T extends Entity> extends HierarchicalModel<T> {
	private final ModelPart baphomet;
	private final ModelPart skull;

	public BaphometModel(ModelPart root) {
		this.baphomet = root.getChild("baphomet");
		this.skull = baphomet.getChild("body").getChild("uper_body").getChild("head").getChild("skull");
	}
	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition baphomet = partdefinition.addOrReplaceChild("baphomet", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = baphomet.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(-21.0F, 0.0F, 0.0F));

		PartDefinition uper_body = body.addOrReplaceChild("uper_body", CubeListBuilder.create(), PartPose.offset(21.0F, -22.0F, 0.0F));

		PartDefinition L_hand = uper_body.addOrReplaceChild("L_hand", CubeListBuilder.create(), PartPose.offset(0.0F, -12.0F, 0.0F));

		PartDefinition uper_L_hand = L_hand.addOrReplaceChild("uper_L_hand", CubeListBuilder.create(), PartPose.offset(-17.0F, 34.0F, 0.0F));

		PartDefinition cube_r1 = uper_L_hand.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(102, 108).addBox(-10.0F, -0.9171F, -9.8395F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.5F, -29.3932F, -6.457F, 2.9671F, 0.0F, 3.1416F));

		PartDefinition cube_r2 = uper_L_hand.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(73, 90).addBox(-10.5F, -8.6068F, -9.543F, 5.0F, 7.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(91, 113).addBox(-11.5F, -7.6068F, -8.543F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.5F, -29.3932F, -6.457F, 3.1416F, 0.0F, 3.1416F));

		PartDefinition lower_L_hand = L_hand.addOrReplaceChild("lower_L_hand", CubeListBuilder.create(), PartPose.offset(-9.0F, 9.0F, 0.0F));

		PartDefinition cube_r3 = lower_L_hand.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(74, 76).addBox(-10.0F, 6.3521F, -0.6259F, 4.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.5F, -4.3932F, -6.457F, 2.0071F, 0.0F, 3.1416F));

		PartDefinition R_hand = uper_body.addOrReplaceChild("R_hand", CubeListBuilder.create(), PartPose.offset(8.0F, -12.0F, 0.0F));

		PartDefinition uper_R_hand = R_hand.addOrReplaceChild("uper_R_hand", CubeListBuilder.create(), PartPose.offset(-8.0F, 34.0F, 0.0F));

		PartDefinition cube_r4 = uper_R_hand.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(47, 110).addBox(7.0F, -0.9171F, -9.8395F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -29.3932F, -6.457F, 2.9671F, 0.0F, 3.1416F));

		PartDefinition cube_r5 = uper_R_hand.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(113, 66).addBox(11.5F, -7.6068F, -8.543F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(47, 97).addBox(6.5F, -8.6068F, -9.543F, 5.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -29.3932F, -6.457F, 3.1416F, 0.0F, 3.1416F));

		PartDefinition lower_R_hand = R_hand.addOrReplaceChild("lower_R_hand", CubeListBuilder.create(), PartPose.offset(1.0F, 9.0F, 0.0F));

		PartDefinition cube_r6 = lower_R_hand.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 114).addBox(7.0F, 6.3521F, -0.6259F, 4.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.5F, -4.3932F, -6.457F, 2.0071F, 0.0F, 3.1416F));

		PartDefinition chest = uper_body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offset(0.0F, 22.0F, 0.0F));

		PartDefinition cube_r7 = chest.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(65, 117).addBox(-3.0F, 0.3932F, -4.543F, 7.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(91, 75).addBox(-4.5F, -6.6068F, -3.543F, 10.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(47, 85).addBox(-4.0F, 0.3932F, -8.543F, 9.0F, 9.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(47, 70).addBox(-5.5F, -8.6068F, -9.543F, 12.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -29.3932F, -6.457F, 3.1416F, 0.0F, 3.1416F));

		PartDefinition head = uper_body.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, -19.0F, 1.0F));

		PartDefinition neck = head.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offset(-0.5F, 11.6068F, -7.457F));

		PartDefinition cube_r8 = neck.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(112, 79).addBox(-1.5F, -11.6068F, -8.543F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.1416F, 0.0F, 3.1416F));

		PartDefinition skull = head.addOrReplaceChild("skull", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition horns = skull.addOrReplaceChild("horns", CubeListBuilder.create(), PartPose.offset(0.0F, -4.0F, -1.0F));

		PartDefinition horn_R = horns.addOrReplaceChild("horn_R", CubeListBuilder.create(), PartPose.offset(0.0F, 43.0F, 0.0F));

		PartDefinition cube_r9 = horn_R.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(100, 83).addBox(2.5F, -26.2336F, -0.4099F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(107, 119).addBox(2.5F, -24.2336F, -2.4099F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(81, 103).addBox(2.5F, -21.2336F, -2.4099F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(116, 94).addBox(3.5F, -16.2336F, -3.4099F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(81, 117).addBox(3.5F, -19.2336F, -1.4099F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(117, 58).addBox(3.5F, -21.2336F, -4.4099F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(60, 110).addBox(3.5F, -19.2336F, -3.4099F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(113, 119).addBox(3.5F, -22.2336F, -3.4099F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -27.3932F, -6.457F, -2.8798F, 0.0F, -3.1416F));

		PartDefinition horn_L = horns.addOrReplaceChild("horn_L", CubeListBuilder.create(), PartPose.offset(-7.0F, 43.0F, 0.0F));

		PartDefinition cube_r10 = horn_L.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(69, 85).addBox(-2.5F, -26.2336F, -0.4099F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(73, 90).addBox(-2.5F, -24.2336F, -2.4099F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(47, 85).addBox(-2.5F, -21.2336F, -2.4099F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(99, 55).addBox(-3.5F, -16.2336F, -3.4099F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(69, 101).addBox(-3.5F, -19.2336F, -1.4099F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(47, 110).addBox(-3.5F, -21.2336F, -4.4099F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(103, 97).addBox(-4.5F, -19.2336F, -3.4099F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(26, 123).addBox(-3.5F, -22.2336F, -3.4099F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5F, -27.3932F, -6.457F, -2.8798F, 0.0F, -3.1416F));

		PartDefinition face = skull.addOrReplaceChild("face", CubeListBuilder.create(), PartPose.offset(0.0F, 40.0F, -1.0F));

		PartDefinition cube_r11 = face.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(47, 52).addBox(0.5F, -9.6068F, -2.543F, 0.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -28.3932F, -6.457F, 3.1416F, 0.0F, 3.1416F));

		PartDefinition cube_r12 = face.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(47, 52).addBox(-2.5F, -14.0813F, -12.4373F, 6.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -28.3932F, -6.457F, 2.7925F, 0.0F, 3.1416F));

		PartDefinition heartcleaver = uper_body.addOrReplaceChild("heartcleaver", CubeListBuilder.create(), PartPose.offset(0.0F, -12.0F, 0.0F));

		PartDefinition cube_r13 = heartcleaver.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 50).addBox(-7.5F, -5.7416F, 5.4515F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 72).addBox(-6.5F, -6.7416F, 5.4515F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(24, 67).addBox(-10.5F, -6.7416F, 5.4515F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(12, 67).addBox(-10.5F, -11.7416F, 5.4515F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(20, 47).addBox(-11.5F, -10.7416F, 5.4515F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 61).addBox(-12.5F, -8.7416F, 5.4515F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(18, 67).addBox(-6.5F, -11.7416F, 5.4515F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(14, 47).addBox(-5.5F, -10.7416F, 5.4515F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(6, 61).addBox(-4.5F, -8.7416F, 5.4515F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 56).addBox(-10.5F, -5.7416F, 5.4515F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(20, 56).addBox(-8.5F, 3.2584F, 5.4515F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(6, 67).addBox(-8.5F, -5.7416F, 5.4515F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(30, 56).addBox(-9.5F, -3.7416F, 5.4515F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(12, 41).addBox(-10.0F, -2.7416F, 5.4515F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(10, 56).addBox(-9.5F, 0.2584F, 5.4515F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(12, 44).addBox(-9.0F, 2.2584F, 5.4515F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(6, 18).addBox(-10.5F, -1.7416F, 5.4515F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 47).addBox(-10.0F, -0.7416F, 5.4515F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 18).addBox(-8.5F, 8.2584F, 5.4515F, 1.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 67).addBox(-7.5F, 15.2584F, 5.4515F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(24, 61).addBox(-6.5F, 14.2584F, 5.4515F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(18, 61).addBox(-10.5F, 14.2584F, 5.4515F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(12, 61).addBox(-9.5F, 15.2584F, 5.4515F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 4.6068F, -6.457F, 2.0071F, 0.0F, 3.1416F));

		PartDefinition lower_body = body.addOrReplaceChild("lower_body", CubeListBuilder.create(), PartPose.offset(21.0F, 0.0F, 0.0F));

		PartDefinition R_leg = lower_body.addOrReplaceChild("R_leg", CubeListBuilder.create(), PartPose.offset(0.0F, -17.0F, 0.0F));

		PartDefinition uper_R_leg = R_leg.addOrReplaceChild("uper_R_leg", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition cube_r14 = uper_R_leg.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(110, 0).addBox(2.5F, 9.7111F, -9.0799F, 4.5F, 10.0F, 4.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -11.3932F, -6.457F, -3.0543F, 0.0F, -3.1416F));

		PartDefinition lower_R_leg = R_leg.addOrReplaceChild("lower_R_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 7.0F, 0.0F));

		PartDefinition cube_r15 = lower_R_leg.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(100, 83).addBox(2.5F, 18.8516F, -5.9563F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -19.3932F, -6.457F, 3.0543F, 0.0F, 3.1416F));

		PartDefinition L_leg = lower_body.addOrReplaceChild("L_leg", CubeListBuilder.create(), PartPose.offset(0.0F, -17.0F, 0.0F));

		PartDefinition uper_L_leg = L_leg.addOrReplaceChild("uper_L_leg", CubeListBuilder.create(), PartPose.offset(-21.0F, 17.0F, 0.0F));

		PartDefinition cube_r16 = uper_L_leg.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, 9.7111F, -9.0799F, 4.5F, 10.0F, 4.5F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(20.5F, -29.3932F, -6.457F, -3.0543F, 0.0F, -3.1416F));

		PartDefinition lower_L_leg = L_leg.addOrReplaceChild("lower_L_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 7.0F, 0.0F));

		PartDefinition cube_r17 = lower_L_leg.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(101, 56).addBox(-5.5F, 18.8516F, -5.9563F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -19.3932F, -6.457F, 3.0543F, 0.0F, 3.1416F));

		PartDefinition pants = lower_body.addOrReplaceChild("pants", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r18 = pants.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(107, 97).addBox(-1.5F, 10.3932F, -8.543F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(71, 52).addBox(-5.0F, 8.3932F, -9.043F, 11.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -29.3932F, -6.457F, 3.1416F, 0.0F, 3.1416F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}


	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(netHeadYaw, headPitch);

		this.animateWalk(ModAnimationDefinitions.MODEL_RUN, limbSwing, limbSwingAmount, 2f,2.5f);
		this.animate(((BaphometEntity) entity).idleAnimationState, ModAnimationDefinitions.BAPHOMET_IDLE, ageInTicks, 1f);
		this.animate(((BaphometEntity) entity).attackAnimationState, ModAnimationDefinitions.BAPHOMET_ATTACK, ageInTicks, 1f);
	}
	private void applyHeadRotation(float NetHeadYaw, float HeadPitch) {
		NetHeadYaw = Mth.clamp(NetHeadYaw, -30.0F, 30.0F);
		HeadPitch = Mth.clamp(HeadPitch, -25.0F, 25.0F);

		this.skull.yRot = NetHeadYaw * ((float)Math.PI / 180F);
		this.skull.xRot = HeadPitch * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		baphomet.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return baphomet;
	}
}