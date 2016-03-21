/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MakingPersonajes;

import com.sun.org.apache.xml.internal.security.exceptions.Base64DecodingException;
import com.sun.org.apache.xml.internal.security.utils.Base64;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Juan Miguel Arias Mejias
 */
public class Personaje {

    private String nombre;
    private String personalidad;
    private BufferedImage img;
    // 
//		<foto string-encoding="utf-8" bin-encoding="base64" img-type="png"></foto>

    public Personaje(String nombre, String personalidad, BufferedImage img) {
        this.nombre = nombre;
        this.personalidad = personalidad;
        this.img = img;
    }

    public Personaje(String nombre, String personalidad) {
        this.nombre = nombre;
        this.personalidad = personalidad;
    }

    public Personaje() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getPersonalidad() {
        return personalidad;
    }

    public String encodingImage() {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(img, "png", baos);
            baos.flush();
            String encodedImage = Base64.encode(baos.toByteArray());

            return encodedImage;

        } catch (IOException e) {
            return "Error encodingImage()";
        }
    }

    public void decodImage(String cod) {
        try {
            byte[] bytes = Base64.decode(cod);
            img = ImageIO.read(new ByteArrayInputStream(bytes));
        } catch (Base64DecodingException ex) {
            img = null;
            System.err.println(ex);
            ex.printStackTrace();
        } catch (IOException ex) {
            img = null;
            System.err.println(ex);
            ex.printStackTrace();
        }
    }

    public BufferedImage getImg() {
        return img;
    }

}
