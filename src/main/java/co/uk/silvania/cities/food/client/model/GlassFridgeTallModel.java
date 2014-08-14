package co.uk.silvania.cities.food.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class GlassFridgeTallModel extends ModelBase
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
    ModelRenderer Shelf3;
    ModelRenderer Shelf4;
    ModelRenderer Shelf5;
    ModelRenderer Top;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer DoorWindow;
  
  public GlassFridgeTallModel()
  {
    textureWidth = 64;
    textureHeight = 128;
    
      BackWall = new ModelRenderer(this, 0, 47);
      BackWall.addBox(0F, 0F, 0F, 15, 32, 1);
      BackWall.setRotationPoint(-7.5F, -8F, 7F);
      BackWall.setTextureSize(64, 128);
      BackWall.mirror = true;
      setRotation(BackWall, 0F, 0F, 0F);
      LeftWall = new ModelRenderer(this, 0, 80);
      LeftWall.addBox(0F, 0F, 0F, 1, 32, 11);
      LeftWall.setRotationPoint(-7.5F, -8F, -4F);
      LeftWall.setTextureSize(64, 128);
      LeftWall.mirror = true;
      setRotation(LeftWall, 0F, 0F, 0F);
      RightWall = new ModelRenderer(this, 0, 80);
      RightWall.addBox(0F, 0F, 0F, 1, 32, 11);
      RightWall.setRotationPoint(6.5F, -8F, -4F);
      RightWall.setTextureSize(64, 128);
      RightWall.mirror = true;
      setRotation(RightWall, 0F, 0F, 0F);
      Base = new ModelRenderer(this, 0, 35);
      Base.addBox(0F, 0F, 0F, 13, 1, 11);
      Base.setRotationPoint(-6.5F, 23F, -4F);
      Base.setTextureSize(64, 128);
      Base.mirror = true;
      setRotation(Base, 0F, 0F, 0F);
      DoorLeftFrame = new ModelRenderer(this, 60, 33);
      DoorLeftFrame.addBox(0F, -14F, 0F, 1, 32, 1);
      DoorLeftFrame.setRotationPoint(-7.5F, 6F, -5F);
      DoorLeftFrame.setTextureSize(64, 128);
      DoorLeftFrame.mirror = true;
      setRotation(DoorLeftFrame, 0F, 0F, 0F);
      DoorFrameRight = new ModelRenderer(this, 60, 32);
      DoorFrameRight.addBox(14F, -14F, 0F, 1, 32, 1);
      DoorFrameRight.setRotationPoint(-7.5F, 6F, -5F);
      DoorFrameRight.setTextureSize(64, 128);
      DoorFrameRight.mirror = true;
      setRotation(DoorFrameRight, 0F, 0F, 0F);
      DoorFrameTop = new ModelRenderer(this, 0, 20);
      DoorFrameTop.addBox(1F, -14F, 0F, 13, 1, 1);
      DoorFrameTop.setRotationPoint(-7.5F, 6F, -5F);
      DoorFrameTop.setTextureSize(64, 128);
      DoorFrameTop.mirror = true;
      setRotation(DoorFrameTop, 0F, 0F, 0F);
      DoorFrameBottom = new ModelRenderer(this, 0, 20);
      DoorFrameBottom.addBox(1F, 17F, 0F, 13, 1, 1);
      DoorFrameBottom.setRotationPoint(-7.5F, 6F, -5F);
      DoorFrameBottom.setTextureSize(64, 128);
      DoorFrameBottom.mirror = true;
      setRotation(DoorFrameBottom, 0F, 0F, 0F);
      Shelf1 = new ModelRenderer(this, 0, 10);
      Shelf1.addBox(0F, 0F, 0F, 13, 1, 9);
      Shelf1.setRotationPoint(-6.5F, 18F, -2F);
      Shelf1.setTextureSize(64, 128);
      Shelf1.mirror = true;
      setRotation(Shelf1, 0F, 0F, 0F);
      Shelf2 = new ModelRenderer(this, 0, 10);
      Shelf2.addBox(0F, 0F, 0F, 13, 1, 9);
      Shelf2.setRotationPoint(-6.5F, 13F, -2F);
      Shelf2.setTextureSize(64, 128);
      Shelf2.mirror = true;
      setRotation(Shelf2, 0F, 0F, 0F);
      Shelf3 = new ModelRenderer(this, 0, 10);
      Shelf3.addBox(0F, 0F, 0F, 13, 1, 9);
      Shelf3.setRotationPoint(-6.5F, 8F, -2F);
      Shelf3.setTextureSize(64, 128);
      Shelf3.mirror = true;
      setRotation(Shelf3, 0F, 0F, 0F);
      Shelf4 = new ModelRenderer(this, 0, 10);
      Shelf4.addBox(0F, 0F, 0F, 13, 1, 9);
      Shelf4.setRotationPoint(-6.5F, 3F, -2F);
      Shelf4.setTextureSize(64, 128);
      Shelf4.mirror = true;
      setRotation(Shelf4, 0F, 0F, 0F);
      Shelf5 = new ModelRenderer(this, 0, 10);
      Shelf5.addBox(0F, 0F, 0F, 13, 1, 9);
      Shelf5.setRotationPoint(-6.5F, -2F, -2F);
      Shelf5.setTextureSize(64, 128);
      Shelf5.mirror = true;
      setRotation(Shelf5, 0F, 0F, 0F);
      Top = new ModelRenderer(this, 0, 23);
      Top.addBox(0F, 0F, 0F, 13, 1, 11);
      Top.setRotationPoint(-6.5F, -8F, -4F);
      Top.setTextureSize(64, 128);
      Top.mirror = true;
      setRotation(Top, 0F, 0F, 0F);
      Shape1 = new ModelRenderer(this, 0, 2);
      Shape1.addBox(14F, -2F, -0.5F, 1, 1, 1);
      Shape1.setRotationPoint(-7.5F, 6F, -5F);
      Shape1.setTextureSize(64, 128);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 0, 8);
      Shape2.addBox(14F, -2.5F, -1.5F, 1, 5, 1);
      Shape2.setRotationPoint(-7.5F, 6F, -5F);
      Shape2.setTextureSize(64, 128);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 0, 0);
      Shape3.addBox(14F, 1F, -0.5F, 1, 1, 1);
      Shape3.setRotationPoint(-7.5F, 6F, -5F);
      Shape3.setTextureSize(64, 128);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      DoorWindow = new ModelRenderer(this, 32, 47);
      DoorWindow.addBox(1F, -13F, 0F, 13, 30, 1);
      DoorWindow.setRotationPoint(-7.5F, 6F, -5F);
      DoorWindow.setTextureSize(64, 128);
      DoorWindow.mirror = true;
      setRotation(DoorWindow, 0F, 0F, 0F);
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
    Shelf3.render(f5);
    Shelf4.render(f5);
    Shelf5.render(f5);
    Top.render(f5);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    DoorWindow.render(f5);
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
