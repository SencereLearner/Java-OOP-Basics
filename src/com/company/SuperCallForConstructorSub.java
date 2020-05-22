package com.company;

public class SuperCallForConstructorSub extends SuperCallForConstructorParent{
    private int width;
    private int height;

    public SuperCallForConstructorSub(int x, int y) {
      this(x, y, 0, 0);
    }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }

  public SuperCallForConstructorSub(int x, int y, int width, int height) {
    super(x, y);
    this.width = width;
    this.height = height;
  }
}
