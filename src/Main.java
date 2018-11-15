import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    static BufferedImage image = null;


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        if(args[1] != null){
            try {
                image = ImageIO.read(new File(System.getProperty("user.dir")+"/src/" +args[0]));
            }catch(IOException e){
                System.out.println("IOException");
            }
        }else{
            System.out.println("args is null");
            System.exit(1);
        }

        String answer = new String();

        System.out.println("Would you like to embed or extract?");
        answer = scan.next();

        if(answer.equals("embed")){
            File fileToEmbed = new File( System.getProperty("user.dir")+"/src/" +args[1]);
            embed(image, fileToEmbed);
        }else if(answer.equals("extract")){
            File output = extract(image);


        }else{
            System.out.println("bad answer. Exiting...");
            System.exit(2);
        }

    }

    private static File extract(BufferedImage image) {

        return null;
    }

    private static void embed(BufferedImage image, File fileToEmbed) {
        //System.out.println("works");
        BufferedImage userImage = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_3BYTE_BGR);
        Graphics2D graphics   = userImage.createGraphics();
        graphics.drawRenderedImage(image, null);
        graphics.dispose();

        //byte[] userImageBytes = getBytes(userImage);
        

    }

    private static byte[] getBytes(BufferedImage userImage) {

        return null;
    }
}
