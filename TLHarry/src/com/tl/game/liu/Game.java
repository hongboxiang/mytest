package com.tl.game.liu;


import static com.tl.game.liu.Action.*;
import static com.tl.game.liu.Matcher.*;
import static com.tl.game.liu.Rules.*;

public final class Game {
  public static Rule spec(int n1, int n2, int n3) {
    Rule r_n1 = atom(times(n1), to("Fizz"));
    Rule r_n2 = atom(times(n2), to("Buzz"));
    Rule r_n3 = atom(times(n3), to("Whizz"));

    Rule r2 = allof(r_n1, r_n2, r_n3);
    Rule r3 = atom(contains(n1), to("Fizz"));
    Rule rd = atom(always(true), nop());

    return anyof(r3, r2, rd);
  }
} 