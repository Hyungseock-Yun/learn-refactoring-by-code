package me.whiteship.refactoring;

public class GuardClauses {

  public int getPoints() {
    // 조건을 걸어 먼저 return 시킴. 이것이 보호구문.
    if (isVip()) return vipPoint();
    if (isPlat()) return platPoint();

    return normalPoint();
  }

  private int normalPoint() { return 0; }

  private int platPoint() { return 0; }

  private boolean isPlat() { return true; }

  private int vipPoint() { return 0; }

  private boolean isVip() { return true; }

}
