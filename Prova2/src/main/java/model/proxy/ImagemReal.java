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
class ImagemReal implements IImagem {  // Default não é visivel fora do pacote

    private final String nomeArquivo;
    private ImageIcon imagem;
    private final String url;

    public ImagemReal(String NomeArquivo, String url) throws IOException {
        this.nomeArquivo = NomeArquivo;

        this.url = url;
        carregar(url);

    }

    public void carregar(String url) throws IOException {

        System.out.println("Carregando a imagem " + nomeArquivo + ".jpg");

        imagem = GerenciadorDeDownload.download(url, 730, 810);

    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String getNome() {
        return nomeArquivo;
    }

    @Override
    public ImageIcon exibir() {
        System.out.println("Exibindo a imagem " + nomeArquivo + ".jpg");
        return imagem;
    }

}
