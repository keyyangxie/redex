/**
 * Copyright (c) 2016-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */

package com.facebook.redex.test.proguard;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Beta extends Activity {

    private int wombatBeta;
    /*public Beta () {
        wombatBeta = 72;
    }*/

    @Override
    public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      TextView text = new TextView(this);
      wombatBeta = 5;

      All all = new All();
      text.setText(all.all());

      setContentView(text);
    }

    public int doubleWombatBeta() {
        return 2 * wombatBeta;
    }
}

class Hello {
  public String hello = "hello";

  public Hello() {}
  public Hello(int x) {}

  public String get() {
    return hello;
  }
}

class World extends Hello {
  public String world = "world";

  public String get() {
    return world;
  }
}

class All extends World {
  public String all() {
    return hello + " " + world;
  }
}

/*class Together {
  public String hello = "hello";
  public static int world = 1;
}*/
