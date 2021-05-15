
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.proxy;

import java.io.IOException;
import javax.swing.ImageIcon;
import model.IImagem;

/**
 *
 * @author Valquíria Anacleto
 */
public class ImagemProxy implements IImagem {
    GerenciadorDeCache gerenciadorCache;
    GerenciadorDeDownload gerenciadorDownload;
    private ImagemReal imagemReal;
    private final String nomeArquivo;
    private final String url;

    

    public ImagemProxy(String NomeArquivo, String url) {
        this.nomeArquivo = NomeArquivo;
        this.url = url;
    
       
    }
    public String getNomeArquivo() {
        return nomeArquivo;
    }

    @Override
    public ImageIcon exibir()throws IOException {

        if ((imagemReal == null)&&(gerenciadorCache==null)&& (gerenciadorDownload==null)) {
            imagemReal = new ImagemReal(nomeArquivo, url);
        } 

         return imagemReal.exibir();

        }
       

    

    @Override
    public String getNome() {
        return nomeArquivo;
    }

}
