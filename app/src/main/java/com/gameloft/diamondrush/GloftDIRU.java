package com.gameloft.diamondrush;

import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;

public final class GloftDIRU extends MIDlet {
   // $VF: renamed from: a byte[]
   public static byte[] field_92 = null;
   // $VF: renamed from: a i
   public class_8 field_93;
   // $VF: renamed from: a javax.microedition.lcdui.Display
   public Display field_94;

   public GloftDIRU() {
      field_92 = this.getAppProperty("MIDlet-Version").getBytes();
      this.field_93 = new class_8(this);
   }

   public final void startApp() throws MIDletStateChangeException {
      if (this.field_94 == null) {
         this.field_94 = Display.getDisplay(this);
      }

      this.field_94.setCurrent(this.field_93);
      this.field_93.method_295();
   }

   public final void pauseApp() {
      this.field_93.method_294();
      this.notifyPaused();
   }

   public final void destroyApp(boolean var1) throws MIDletStateChangeException {
      this.notifyDestroyed();
   }

   // $VF: renamed from: a () void
   public final void method_61() {
      class_8.method_292();
      this.field_93.field_357.method_4();
      this.method_62();

      try {
         this.destroyApp(true);
      } catch (MIDletStateChangeException var2) {
      }
   }

   // $VF: renamed from: b () void
   private void method_62() {
      this.field_93 = null;
      this.field_94 = null;
      System.gc();
   }
}
