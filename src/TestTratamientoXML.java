import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;

import model.Bicicleta;

public class TestTratamientoXML {

	public TestTratamientoXML() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		try {
			String xml = serializarConJAXB();
			System.out.print(xml);
			
			Bicicleta biciResp = unmarshellConJAXB(xml);
			biciResp.setMarca(biciResp.getMarca()+" - PRO");
			System.out.print(biciResp);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static Bicicleta unmarshellConJAXB(String xml) throws JAXBException {
		JAXBContext jaxbContext;
		jaxbContext = JAXBContext.newInstance(Bicicleta.class);					
		Unmarshaller u = jaxbContext.createUnmarshaller();				
		Bicicleta biciResp = (Bicicleta) u.unmarshal(new StringReader(xml));
		return biciResp;
	}

	private static String serializarConJAXB() throws ParserConfigurationException, JAXBException, PropertyException {

		Bicicleta bici = new Bicicleta();
		bici.setMarca("Cube");
		bici.setGrupo("105");
		bici.setIdBicicleta(Long.parseLong("11241"));

		JAXBContext jaxbContext = JAXBContext.newInstance(bici.getClass());
		Marshaller m = jaxbContext.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		m.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-1");
		StringWriter sw = new StringWriter();
		m.marshal(bici, sw);

		return sw.toString();
	}

}
