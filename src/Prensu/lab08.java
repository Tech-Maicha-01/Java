// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class lab08 {
   public lab08() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter the number of elements: ");
      int var2 = var1.nextInt();
      int[] var3 = new int[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         System.out.print("Enter element " + (var4 + 1) + ": ");
         var3[var4] = var1.nextInt();
      }

      System.out.print("Enter 'asc' for ascending or 'desc' for descending sort: ");
      String var9 = var1.next().toLowerCase();

      int var6;
      int var7;
      for(int var5 = 0; var5 < var2 - 1; ++var5) {
         for(var6 = 0; var6 < var2 - var5 - 1; ++var6) {
            if (var9.equals("asc") && var3[var6] > var3[var6 + 1] || var9.equals("desc") && var3[var6] < var3[var6 + 1]) {
               var7 = var3[var6];
               var3[var6] = var3[var6 + 1];
               var3[var6 + 1] = var7;
            }
         }
      }

      System.out.println("Sorted array in " + var9 + "ending order:");
      int[] var10 = var3;
      var6 = var3.length;

      for(var7 = 0; var7 < var6; ++var7) {
         int var8 = var10[var7];
         System.out.print("" + var8 + " ");
      }

      var1.close();
   }
}
