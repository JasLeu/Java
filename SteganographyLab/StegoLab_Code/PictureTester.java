public class PictureTester extends PixelPlayground {
    public static Picture negate(Picture p) {
        Picture newPic = new Picture(p);
        Pixel[][] pixels = newPic.getPixels2D();

        for (Pixel[] row: pixels) {
            for (Pixel actualPixel : row) {
                actualPixel.setRed(255-actualPixel.getRed());
                actualPixel.setRed(255-actualPixel.getGreen());
                actualPixel.setRed(255-actualPixel.getBlue());
            }
        }

        return newPic;
    }

    public static Picture grayScale(Picture p) {
        Picture newPic = new Picture(p);
        Pixel[][] pixels = newPic.getPixels2D();

        for (Pixel[] row: pixels) {
            for (Pixel actualPixel : row) {
                int average = (actualPixel.getRed() + actualPixel.getBlue() + actualPixel.getGreen())/3;
                actualPixel.setRed(average);
                actualPixel.setGreen(average);
                actualPixel.setBlue(average);
            }
        }

        return newPic;
    }

    public static void main(String[] args) {
        Picture beach = new Picture("beach.jpg");
        //Picture negated = negate(beach);
        //negated.explore();
        Picture gray = grayScale(beach);
        gray.explore();
    }
    
}
