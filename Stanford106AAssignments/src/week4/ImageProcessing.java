package week4;

import acm.graphics.*;
import acm.program.*;
public class ImageProcessing extends GraphicsProgram {
   public void run() {
      GImage original = new GImage("Candle.gif");
      GImage rotated = rotateLeft(original);
      double x0 = getWidth() / 2 - original.getWidth() - 5;
      double y0 = (getHeight() - original.getHeight()) / 2;
      double x1 = getWidth() / 2 + 5;
      double y1 = (getHeight() - rotated.getHeight()) / 2;
      add(original, x0, y0);
      add(rotated, x1, y1);
}
/**
 * Creates a new image which consists of the bits in the original
 * rotated left by 90 degrees.
 * @param image The original image
 * @return The image rotated left by 90 degrees
 */
   private GImage rotateLeft(GImage image) {
      int[][] oldPixels = image.getPixelArray();
      int width = oldPixels[0].length;
      int height = oldPixels.length;
      int[][] newPixels = new int[width][height];
      for (int i = 0; i < height; i++) {
         for (int j = 0; j < width; j++) {
            newPixels[width - j - 1][i] = oldPixels[i][j];
} }
      return new GImage(newPixels);
   }
}