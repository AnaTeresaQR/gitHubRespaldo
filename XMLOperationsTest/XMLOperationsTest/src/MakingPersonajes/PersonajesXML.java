/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MakingPersonajes;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Juan Miguel Arias Mejias
 */
public class PersonajesXML {

    public static final String PERSONAJES_FILE = "Personajes.xml";

    private DocumentBuilderFactory dbf;
    private DocumentBuilder db;
    private Document d;

    // Es el elemento raiz(Personajes)
    private Node root;

    public PersonajesXML() {
        init();
    }

    /**
     * Inicializa el documento
     */
    private void init() {
        try {

            dbf = DocumentBuilderFactory.newInstance();
            db = dbf.newDocumentBuilder();
            d = db.parse(new File(PERSONAJES_FILE));
            root = d.getElementsByTagName("personajes").item(0);

        } catch (ParserConfigurationException e) {
            System.err.println(e);
        } catch (IOException ex) {
            System.err.println(ex);
        } catch (SAXException ex) {
            System.out.println(ex);
        }
    }

    /**
     * Agrega un personaje
     */
    public void addPersonaje(Personaje p) throws TransformerException {

        // Creo nodo personaje
        Element personaje = d.createElement("personaje");

        // Creo el atributo del id
        personaje.setAttribute("id", String.valueOf(getCount() + 1));

        // Creo los subelementos del personaje
        Element nombre = d.createElement("nombre");
        nombre.appendChild(d.createTextNode(p.getNombre()));
        Element personalidad = d.createElement("personalidad");
        personalidad.appendChild(d.createTextNode(p.getPersonalidad()));
        Element foto = d.createElement("foto");
        foto.appendChild(d.createTextNode(p.encodingImage()));

        // Agrego los subelementos al personaje
        personaje.appendChild(nombre);
        personaje.appendChild(personalidad);
        personaje.appendChild(foto);

        // Agrego al personaje al XML
        root.appendChild(personaje);

        // Save info in the file
        save(d);
    }

    /**
     * Guarda el documento
     */
    private void save(Document d) throws TransformerConfigurationException, TransformerException {
        TransformerFactory tf = TransformerFactory.newInstance();

        Transformer t = tf.newTransformer();
        DOMSource ds = new DOMSource(d);

        StreamResult sr = new StreamResult(new File(PERSONAJES_FILE));
        t.transform(ds, sr);
    }

    /**
     * Indica cuantos personajes hay registrados
     */
    public int getCount() {
        NodeList list = d.getElementsByTagName("personaje");

        return list.getLength();
    }

    public Personaje getByID(int id) {

        Node personaje = d.getElementsByTagName("personaje").item(id - 1);
        NodeList attributes = personaje.getChildNodes();

        String nombre = "";
        String personalidad = "";
        String codeImg = "";

        for (int i = 0; i < attributes.getLength(); i++) {

            Node element = attributes.item(i);

            if ("nombre".equals(element.getNodeName())) {
                nombre = element.getTextContent();
            }
            if ("personalidad".equals(element.getNodeName())) {
                personalidad = element.getTextContent();
            }
            if ("foto".equals(element.getNodeName())) {
                codeImg = element.getTextContent();
            }
        }

        Personaje p = new Personaje(nombre, personalidad);
        p.decodImage(codeImg);

        return p;
    }

    public static void main(String[] args) throws TransformerException, IOException {

        PersonajesXML p = new PersonajesXML();
        BufferedImage img = ImageIO.read(new File("image.png"));
        final Personaje mickey = new Personaje("Ronaldo", "triste", img);
        p.addPersonaje(mickey);

        final Personaje personaje = p.getByID(1);
        JFrame frame = new JFrame();
        frame.add(new JPanel() {
            @Override
            public void paint(Graphics g) {
                this.setSize(700, 700);
                g.drawImage(personaje.getImg(), 10, 10, null);
            }
        });
        frame.setSize(700, 700);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
