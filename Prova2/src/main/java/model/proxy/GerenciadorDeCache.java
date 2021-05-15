/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.proxy;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Valquíria Anacleto
 */
public class GerenciadorDeCache {
     private ArrayList<ImagemProxy> imagemProxy;
    
 public  GerenciadorDeCache()  {
         imagemProxy= new ArrayList();
        imagemProxy.add(new ImagemProxy("Campo", "https://image.freepik.com/fotos-gratis/dcim-100media-dji-0073-jpg_392895-12396.jpg"));
        imagemProxy.add(new ImagemProxy("Terra", "https://upload.wikimedia.org/wikipedia/commons/d/db/Nasa_blue_marble.jpg"));
        imagemProxy.add(new ImagemProxy("Malta", "https://upload.wikimedia.org/wikipedia/commons/b/bc/Satelite_image_of_Malta.jpg"));
        imagemProxy.add(new ImagemProxy("Orbita", "https://img.vixdata.io/pd/jpg-large/pt/sites/default/files/s/satelite-orbita-terrestre-1116-1400x800.jpg"));
        imagemProxy.add(new ImagemProxy("Rio", "https://www.gifex.com/imapa/americas/Satellite_Image_Photo_Rio_Janeiro_Brazil_2.jpg"));
    }


    public ImagemProxy getProxy(String nome) throws IOException {
        for (ImagemProxy proxy : imagemProxy) {
            if (proxy.getNomeArquivo().equalsIgnoreCase(nome)) {
                return proxy;
            }
        }
        return null;
    }
}
