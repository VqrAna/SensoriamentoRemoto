/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.IOException;
import javax.swing.ImageIcon;

/**
 *
 * @author Valquíria Anacleto
 */
public interface IImagem {
    
    public ImageIcon exibir() throws IOException ;
     public String getNome();

}
