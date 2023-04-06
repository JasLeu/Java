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

    public static Picture mirrorVer1(Picture p) {
        Picture newPic = new Picture(p);
        Pixel[][] pixels = newPic.getPixels2D();

        for (int i = 0; i < pixels.length-1; i++) {
            for (int j = 0; j < pixels[0].length/2-1; j++) {
                pixels[i][pixels[0].length - j - 1].setColor(pixels[i][j].getColor());

            }
        }
        return newPic;
    }

    public static Picture mirrorVer2(Picture p) {
        Picture newPic = new Picture(p);
        Pixel[][] pixels = newPic.getPixels2D();

        for (int i = 0; i < pixels.length-1; i++) {
            for (int j = 0; j < pixels[0].length/2-1; j++) {
                pixels[i][j].setColor(pixels[i][pixels[0].length - j - 1].getColor());

            }
        }
        return newPic;
    }

    public static Picture mirrorHor1(Picture p) {
        Picture newPic = new Picture(p);
        Pixel[][] pixels = newPic.getPixels2D();

        for (int i = 0; i < pixels.length / 2 - 1; i++) {
            for (int j = 0; j < pixels[0].length - 1; j++) {
                pixels[pixels.length - i - 1][j].setColor(pixels[i][j].getColor());

            }
        }
        return newPic;
    }

    public static Picture mirrorHor2(Picture p) {
        Picture newPic = new Picture(p);
        Pixel[][] pixels = newPic.getPixels2D();

        for (int i = 0; i < pixels.length / 2 - 1; i++) {
            for (int j = 0; j < pixels[0].length - 1; j++) {
                pixels[i][j].setColor(pixels[pixels.length - i - 1][j].getColor());

            }
        }
        return newPic;
    }

    public static Picture mirrorDiagonal(Picture p) {
        Picture newPic = new Picture(p);
        Pixel[][] pixels = newPic.getPixels2D();

        for (int row = 0; row < pixels.length; row++) {
            for (int col = 0; col < pixels.length; col++) {

                pixels[row][col].setColor(pixels[col][row].getColor());

            }
        }
        return newPic;
    }

    public static Picture mirrorDiagonal2(Picture p) {
        Picture newPic = new Picture(p);
        Pixel[][] pixels = newPic.getPixels2D();

        for (int row = 0; row < pixels.length; row++) {
            for (int col = 0; col < pixels.length; col++) {

                pixels[col][row].setColor(pixels[pixels.length - row - 1][pixels.length-col].getColor());

            }
        }
        return newPic;
    }

    public static void main(String[] args) {
        Picture beach = new Picture("beach.jpg");
        //Picture negated = negate(beach);
        //negated.explore();
        //Picture gray = grayScale(beach);
        //gray.explore();
        //Picture mirrored = mirrorVer1(beach);
        //mirrored.explore();
        Picture mirrored = mirrorDiagonal2(beach);
        mirrored.explore();
    }
    
}
