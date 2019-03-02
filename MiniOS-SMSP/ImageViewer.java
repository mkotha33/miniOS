/**
 * This program opens an image file and displays it in the content pane.
 *
 */
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.io.IOException;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.Image;
import java.awt.Graphics;

public class ImageViewer extends JFrame implements Runnable
{
  Image image;
  public void run()
  {
    setSize(1300,1200);
    getContentPane().add(new ImagePanel());
    setVisible(true);
  }
  public static void main(String[] args)
  {
    ImageViewer iframe = new ImageViewer();
    javax.swing.SwingUtilities.invokeLater(iframe);
  }
  class ImagePanel extends JPanel
  {
    public void paintComponent(Graphics g)
    {
      try
      {
        image = ImageIO.read(new File("C:\\\\Users\\\\Sowmya Vasuki\\\\Pictures\\\\2016-10-02\\\\IMG_1103.JPG"));
      }
      catch(IOException ex)
      {
      }
      g.drawImage(image, 0, 0, null);
      
    }
  }
}