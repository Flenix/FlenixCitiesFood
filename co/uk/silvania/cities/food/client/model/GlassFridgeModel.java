package co.uk.silvania.cities.food.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class GlassFridgeModel extends ModelBase
{
  //fields
    ModelRenderer BackWall;
    ModelRenderer LeftWall;
    ModelRenderer RightWall;
    ModelRenderer Base;
    ModelRenderer DoorLeftFrame;
    ModelRenderer DoorFrameRight;
    ModelRenderer DoorFrameTop;
    ModelRenderer DoorFrameBottom;
    ModelRenderer Shelf1;
    ModelRenderer Shelf2;
    ModelRenderer Top;
    ModelRenderer DoorWindow;
    ModelRenderer HandleStepHih;
    ModelRenderer andleStemLow;
    ModelRenderer Shape1;
  
  public GlassFridgeModel()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      BackWall = new ModelRenderer(this, 0, 47);
      BackWall.addBox(0F, 0F, 0F, 15, 16, 1);
      BackWall.setRotationPoint(-7.5F, 8F, 7F);
      BackWall.setTextureSize(64, 64);
      BackWall.mirror = true;
      setRotation(BackWall, 0F, 0F, 0F);
      LeftWall = new ModelRenderer(this, 40, 37);
      LeftWall.addBox(0F, 0F, 0F, 1, 16, 11);
      LeftWall.setRotationPoint(-7.5F, 8F, -4F);
      LeftWall.setTextureSize(64, 64);
      LeftWall.mirror = true;
      setRotation(LeftWall, 0F, 0F, 0F);
      RightWall = new ModelRenderer(this, 40, 37);
      RightWall.addBox(0F, 0F, 0F, 1, 16, 11);
      RightWall.setRotationPoint(6.5F, 8F, -4F);
      RightWall.setTextureSize(64, 64);
      RightWall.mirror = true;
      setRotation(RightWall, 0F, 0F, 0F);
      Base = new ModelRenderer(this, 0, 35);
      Base.addBox(0F, 0F, 0F, 13, 1, 11);
      Base.setRotationPoint(-6.5F, 23F, -4F);
      Base.setTextureSize(64, 64);
      Base.mirror = true;
      setRotation(Base, 0F, 0F, 0F);
      DoorLeftFrame = new ModelRenderer(this, 58, 33);
      DoorLeftFrame.addBox(0F, -7F, 0F, 2, 14, 1);
      DoorLeftFrame.setRotationPoint(-6.5F, 16F, -3.8F);
      DoorLeftFrame.setTextureSize(64, 64);
      DoorLeftFrame.mirror = true;
      setRotation(DoorLeftFrame, 0F, 0F, 0F);
      DoorFrameRight = new ModelRenderer(this, 58, 18);
      DoorFrameRight.addBox(11F, -7F, 0F, 2, 14, 1);
      DoorFrameRight.setRotationPoint(-6.5F, 16F, -3.8F);
      DoorFrameRight.setTextureSize(64, 64);
      DoorFrameRight.mirror = true;
      setRotation(DoorFrameRight, 0F, 0F, 0F);
      DoorFrameTop = new ModelRenderer(this, 0, 20);
      DoorFrameTop.addBox(2F, -7F, 0F, 9, 1, 1);
      DoorFrameTop.setRotationPoint(-6.5F, 16F, -3.8F);
      DoorFrameTop.setTextureSize(64, 64);
      DoorFrameTop.mirror = true;
      setRotation(DoorFrameTop, 0F, 0F, 0F);
      DoorFrameBottom = new ModelRenderer(this, 20, 20);
      DoorFrameBottom.addBox(2F, 6F, 0F, 9, 1, 1);
      DoorFrameBottom.setRotationPoint(-6.5F, 16F, -3.8F);
      DoorFrameBottom.setTextureSize(64, 64);
      DoorFrameBottom.mirror = true;
      setRotation(DoorFrameBottom, 0F, 0F, 0F);
      Shelf1 = new ModelRenderer(this, 0, 0);
      Shelf1.addBox(0F, 0F, 0F, 13, 1, 9);
      Shelf1.setRotationPoint(-6.5F, 18F, -2F);
      Shelf1.setTextureSize(64, 64);
      Shelf1.mirror = true;
      setRotation(Shelf1, 0F, 0F, 0F);
      Shelf2 = new ModelRenderer(this, 0, 10);
      Shelf2.addBox(0F, 0F, 0F, 13, 1, 9);
      Shelf2.setRotationPoint(-6.5F, 13F, -2F);
      Shelf2.setTextureSize(64, 64);
      Shelf2.mirror = true;
      setRotation(Shelf2, 0F, 0F, 0F);
      Top = new ModelRenderer(this, 0, 23);
      Top.addBox(0F, 0F, 0F, 13, 1, 11);
      Top.setRotationPoint(-6.5F, 8F, -4F);
      Top.setTextureSize(64, 64);
      Top.mirror = true;
      setRotation(Top, 0F, 0F, 0F);
      DoorWindow = new ModelRenderer(this, 44, 0);
      DoorWindow.addBox(2F, -6F, 0F, 9, 12, 1);
      DoorWindow.setRotationPoint(-6.5F, 16F, -3.8F);
      DoorWindow.setTextureSize(64, 64);
      DoorWindow.mirror = true;
      setRotation(DoorWindow, 0F, 0F, 0F);
      HandleStepHih = new ModelRenderer(this, 0, 0);
      HandleStepHih.addBox(11.5F, -1.5F, -0.5F, 1, 1, 1);
      HandleStepHih.setRotationPoint(-6.5F, 16F, -4F);
      HandleStepHih.setTextureSize(64, 64);
      HandleStepHih.mirror = true;
      setRotation(HandleStepHih, 0F, 0F, 0F);
      andleStemLow = new ModelRenderer(this, 0, 0);
      andleStemLow.addBox(11.5F, 1.5F, -0.5F, 1, 1, 1);
      andleStemLow.setRotationPoint(-6.5F, 16F, -4F);
      andleStemLow.setTextureSize(64, 64);
      andleStemLow.mirror = true;
      setRotation(andleStemLow, 0F, 0F, 0F);
      Shape1 = new ModelRenderer(this, 0, 0);
      Shape1.addBox(11.5F, -2F, -1.5F, 1, 5, 1);
      Shape1.setRotationPoint(-6.5F, 16F, -4F);
      Shape1.setTextureSize(64, 64);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    BackWall.render(f5);
    LeftWall.render(f5);
    RightWall.render(f5);
    Base.render(f5);
    DoorLeftFrame.render(f5);
    DoorFrameRight.render(f5);
    DoorFrameTop.render(f5);
    DoorFrameBottom.render(f5);
    Shelf1.render(f5);
    Shelf2.render(f5);
    Top.render(f5);
    DoorWindow.render(f5);
    HandleStepHih.render(f5);
    andleStemLow.render(f5);
    Shape1.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
