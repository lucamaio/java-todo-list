package Shared;

import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class ConfigurazioneXML {

    private int portaServer;
    private String dbUrl;
    private String dbUsername;
    private String dbPassword;

    public ConfigurazioneXML(String percorsoFile) {
        try {
            File xmlFile = new File(percorsoFile);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);

            doc.getDocumentElement().normalize();

            portaServer = Integer.parseInt(
                doc.getElementsByTagName("porta").item(0).getTextContent()
            );

            dbUrl = doc.getElementsByTagName("url").item(0).getTextContent();
            dbUsername = doc.getElementsByTagName("username").item(0).getTextContent();
            dbPassword = doc.getElementsByTagName("password").item(0).getTextContent();

        } catch (Exception e) {
            System.err.println("Errore nella lettura del file XML: " + e.getMessage());
        }
    }

    public int getPortaServer() {
        return portaServer;
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public String getDbUsername() {
        return dbUsername;
    }

    public String getDbPassword() {
        return dbPassword;
    }
}
