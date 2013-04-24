package pt.webdetails.cgg;

import java.awt.image.RenderedImage;
import java.io.IOException;
import java.io.OutputStream;
import javax.imageio.ImageIO;

/**
 * @author pdpi
 */
public class Java2DChart implements Chart
{
  private RenderedImage buffer;

  public Java2DChart(final RenderedImage buffer)
  {
    if (buffer == null)
    {
      throw new NullPointerException();
    }
    this.buffer = buffer;
  }

  public RenderedImage getBuffer()
  {
    return buffer;
  }

  public void renderAsPng(final OutputStream out) throws IOException
  {
    ImageIO.write(buffer, "png", out);
  }

  public void renderAsSVG(final OutputStream out) throws IOException
  {
    throw new IOException("Unsupported output type: SVG");
  }
}