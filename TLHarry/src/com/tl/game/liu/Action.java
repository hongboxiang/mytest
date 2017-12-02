package com.tl.game.liu;

@FunctionalInterface
public interface Action {
  String to(int n);

  static Action to(String str) {
    return n -> str;
  }

  static Action nop() {
    return n -> String.valueOf(n);
  }
}
