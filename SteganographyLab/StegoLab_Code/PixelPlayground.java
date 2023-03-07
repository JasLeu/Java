package SteganographyLab.StegoLab_Code;
import java.awt.Color;

public class PixelPlayground {
    
    /**
     * Removes the blue from the picture.
     */
    public static Picture zeroBlue(Picture p) {
        Picture newPic = p;
        //TO DO
        return newPic;
    }

    public static void main(String[] args) {
        Picture beachPic = new Picture("beach.jpg");
        beachPic.explore();
        Picture beachPicNoBlue = zeroBlue(beachPic);
        beachPicNoBlue.explore();
    }
}
