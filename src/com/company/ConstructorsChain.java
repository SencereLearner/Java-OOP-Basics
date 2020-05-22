package com.company;

public class ConstructorsChain {
  private int x;
  private int y;
  private int width;
  private int height;

  public ConstructorsChain(int x) {
    this(x, 10, 20, 30);
  }

  public ConstructorsChain(int width, int height) {
    this(1, 5, width, height);
  }

  public ConstructorsChain(int x, int y, int width, int height) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }
}
