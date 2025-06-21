package cristaldo.tp5.poo_gpi2a;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class CScrap {
    
    public void ScrapSitioWeb(JTextField urlSitio, JTable resultado ) {
        String url = urlSitio.getText();
        
        try {
            Document doc = Jsoup.connect(url).get(); // obtiene info de la URL
            System.out.println("Conexion Exitosa");
            
            // clases de etiquetas a buscar info
            Elements productos = doc.select("a.poly-component__title");
            Elements precio = doc.select("div.poly-price__current");
            Elements preciosOferta = doc.select("div.poly-component__price");
            
            // seteando tabla y nombre de valores de columnas
            DefaultTableModel modelo = new DefaultTableModel(new Object[] {"Titulo", "Precio", "Precio Oferta", "Enlace"}, 0);
            resultado.setModel(modelo);
            
            // limpieza de tabla
            modelo.setRowCount(0);
            
            for (int i = 0; i < productos.size(); i++) {
                // info a obtener de etiquetas
                String titulo = productos.get(i).text();
                String precioNormal = precio.get(i).select("span.andes-money-amount__fraction").first().text();
                String preciosOfertaFinal = preciosOferta.get(i).select("span.andes-money-amount__fraction").text();
                String enlace = productos.get(i).attr("href");
                
                // llenando columnas con info obtenida
                modelo.addRow(new Object[] {titulo, precioNormal, preciosOfertaFinal,enlace});
            }
            
        } catch (Exception e) {
            DefaultTableModel model = new DefaultTableModel(new Object[] {"Error", "Mensaje"}, 0);
            resultado.setModel(model);
            model.setRowCount(0);
            model.addRow(new Object[] {"Error", e.getMessage()});
        }
    }
}
