/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.proxy;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Valquíria Anacleto
 */
public class GerenciadorDeDownload {
    
    public static ImageIcon download(String url, int width, int heigth) throws IOException{
        try {
            URL link = new URL(url);
            InputStream in = link.openStream();
            BufferedImage image = ImageIO.read(in);
            in.close();
            return new ImageIcon(image.getScaledInstance(heigth, width, Image.SCALE_SMOOTH));
        } catch (IOException exc) {
            throw new IOException("Verifique a internet e tente novamente!");
        }
    }
    
}
