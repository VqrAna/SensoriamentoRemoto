/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presenter;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.plaf.metal.MetalBorders;
import model.proxy.GerenciadorDeCache;
import model.proxy.GerenciadorDeDownload;
import view.ImagemProxyView;

/**
 *
 * @author Valquíria Anacleto
 */
public final class ImagemPresenter {

    private ImagemProxyView tela;
    private GerenciadorDeCache gerenciadorCache;

    public ImagemPresenter() {
        tela = new ImagemProxyView();
        gerenciadorCache = new GerenciadorDeCache();

        tela.setLocationRelativeTo(tela.getParent());
        tela.setVisible(true);
        try {
            tela.getMiniatura1().setIcon(GerenciadorDeDownload.download("https://image.freepik.com/fotos-gratis/dcim-100media-dji-0073-jpg_392895-12396.jpg", 100, 100));
            tela.getMiniatura2().setIcon(GerenciadorDeDownload.download("https://upload.wikimedia.org/wikipedia/commons/d/db/Nasa_blue_marble.jpg", 100, 100));
            tela.getMiniatura3().setIcon(GerenciadorDeDownload.download("https://upload.wikimedia.org/wikipedia/commons/b/bc/Satelite_image_of_Malta.jpg", 100, 100));
            tela.getMiniatura4().setIcon(GerenciadorDeDownload.download("https://img.vixdata.io/pd/jpg-large/pt/sites/default/files/s/satelite-orbita-terrestre-1116-1400x800.jpg", 100, 100));
            tela.getMiniatura5().setIcon(GerenciadorDeDownload.download("https://www.gifex.com/imapa/americas/Satellite_Image_Photo_Rio_Janeiro_Brazil_2.jpg", 100, 100));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(tela, ex.getMessage());
        }
        Listeners(tela);
    }

    public void Listeners(ImagemProxyView tela) {
        tela.getMiniatura1().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    tela.getImagem().setIcon(gerenciadorCache.getProxy("Campo").exibir());
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(tela, ex.getMessage());
                } catch (NullPointerException exc) {
                    JOptionPane.showMessageDialog(tela, "Desculpa, a imagemProxy não foi localizada!!");
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                tela.getMiniatura1().setBorder(new MetalBorders.OptionDialogBorder());
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
                tela.getMiniatura1().setBorder(null);
            }
        });
        tela.getMiniatura2().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    tela.getImagem().setIcon(gerenciadorCache.getProxy("Terra").exibir());
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(tela, ex.getMessage());
                } catch (NullPointerException exc) {
                    JOptionPane.showMessageDialog(tela, "Desculpa, a imagem não foi localizada!!");
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                tela.getMiniatura2().setBorder(new MetalBorders.OptionDialogBorder());
            }

            @Override
            public void mouseExited(MouseEvent e) {
                tela.getMiniatura2().setBorder(null);
            }
        });
        tela.getMiniatura3().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    tela.getImagem().setIcon(gerenciadorCache.getProxy("Malta").exibir());
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(tela, ex.getMessage());
                } catch (NullPointerException exc) {
                    JOptionPane.showMessageDialog(tela, "Desculpa, a imagemProxy não foi localizada!!");
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                tela.getMiniatura3().setBorder(new MetalBorders.OptionDialogBorder());
            }

            @Override
            public void mouseExited(MouseEvent e) {
                tela.getMiniatura3().setBorder(null);
            }
        });
        tela.getMiniatura4().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    tela.getImagem().setIcon(gerenciadorCache.getProxy("Orbita").exibir());
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(tela, ex.getMessage());
                } catch (NullPointerException exc) {
                    JOptionPane.showMessageDialog(tela, "Desculpa, a imagemProxy não foi localizada!!");
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                tela.getMiniatura4().setBorder(new MetalBorders.OptionDialogBorder());
            }

            @Override
            public void mouseExited(MouseEvent e) {
                tela.getMiniatura4().setBorder(null);
            }
        });
        tela.getMiniatura5().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    tela.getImagem().setIcon(gerenciadorCache.getProxy("Rio").exibir());
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(tela, ex.getMessage());
                } catch (NullPointerException exc) {
                    JOptionPane.showMessageDialog(tela, "Desculpa, a imagemProxy não foi localizada!!");
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                tela.getMiniatura5().setBorder(new MetalBorders.OptionDialogBorder());
            }

            @Override
            public void mouseExited(MouseEvent e) {
                tela.getMiniatura5().setBorder(null);
            }
        });
    }

}
