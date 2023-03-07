
import java.awt.Color;

public class PixelPlayground {
    
    /**
     * Removes the blue from the picture.
     * @param <Picture>
     * @returns the picture without any blue
     */
    public static Picture zeroBlue(Picture p) {
        Picture newPic = new Picture(p);
        Pixel[][] pixels = newPic.getPixels2D();
        
        for (int i = 0; i < pixels.length; i++) {
            for (int j = 0; j < pixels[0].length; j++) {
                pixels[i][j].setBlue(0);
            }
        }

        /*
        for (Pixel[] row : pixels) {
            for (Pixel actualPixel : row) {
                actualPixel.setBlue(0);
            }
        }
        */

        return newPic;
    }

    /**
     * Keeps only the blue from the picture.
     * @param <Picture>
     * @returns the picture without any red or green
     */
    public static Picture keepOnlyBlue(Picture p) {
        Picture newPic = new Picture(p);
        Pixel[][] pixels = newPic.getPixels2D();

        for (Pixel[] row: pixels) {
            for (Pixel actualPixel : row) {
                actualPixel.setRed(0);
                actualPixel.setGreen(0);
            }
        }

        return newPic;
    }

    public static void main(String[] args) {
        Picture beachPic = new Picture("beach.jpg");
        beachPic.explore();
        Picture beachPicNoBlue = zeroBlue(beachPic);
        beachPicNoBlue.explore();
        //Picture beachPicOnlyBlue = keepOnlyBlue(beachPic);
        //beachPicOnlyBlue.explore();
    }
}
