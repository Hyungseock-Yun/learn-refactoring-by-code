package me.whiteship.refactoring;

public class GuardClauses {

  public int getPoints() {

    int result;

    if (isVip()) {
      result = vipPoint();
    } else if (isPlat()) {
      result = platPoint();
    } else {
      result = normalPoint();
    }

    return result;
  }

  private int normalPoint() { return 0; }

  private int platPoint() { return 0; }

  private boolean isPlat() { return true; }

  private int vipPoint() { return 0; }

  private boolean isVip() { return true; }

}
