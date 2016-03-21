/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leerpersonaxml;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Juan
 */
public class LeerPersonaXML {

    // Crear
    private DocumentBuilderFactory factory;
    // Construir
    private DocumentBuilder builder;
    // Guardar
    Document document;
    // Nodo raiz
    Node root;
    // Lista personas
    ArrayList<Persona> lista;

    public LeerPersonaXML() throws ParserConfigurationException, SAXException, IOException {
        factory = DocumentBuilderFactory.newInstance();
        builder = factory.newDocumentBuilder();
        document = builder.parse(new File("personas.xml"));
        root = document.getElementsByTagName("personas").item(0);
        lista = new ArrayList<>();
    }

    public void load() {
        // Dame las personas
        NodeList nodelist = document.getElementsByTagName("persona");

        for (int i = 0; i < nodelist.getLength(); i++) {
            // Sera una persona
            Node person = nodelist.item(i);

            // Necesitamos acceder a la etiqueta de nombre y edad
            // Estas dos son hijas de la persona
            NodeList atributos = person.getChildNodes();
            String name = "";
            int edad = 0;

            // Recorremos sus hijos
            for (int j = 0; j < atributos.getLength(); j++) {
                Node element = atributos.item(j);

                // Encontramos la etiqueta de nombre
                if ("nombre".equals(element.getNodeName())) {
                    name = element.getTextContent();
                }

                // Encontramos la etiqueta de edad
                if ("edad".equals(element.getNodeName())) {
                    edad = Integer.parseInt(element.getTextContent());
                }
            }

            // Agregamos la persona
            lista.add(new Persona(name, edad));
        }
    }

    public String getList() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lista.size(); i++) {
            sb.append(lista.get(i).toString()).append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        LeerPersonaXML leer = new LeerPersonaXML();

        leer.load();
        System.out.println(leer.getList());

    }

}
