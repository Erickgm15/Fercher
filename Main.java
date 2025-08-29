import Control.TiendaFercher;
import views.Dashbord;

public class Main {
    public static void main(String[] args) {
        try {
            new views.Dashbord();

            String urlApi = "https://jsonplaceholder.typicode.com/posts/99";
            String respuesta = TiendaFercher.obtenerProductos(urlApi);

            System.out.print("{\n");
            for (int i = 0; i < respuesta.length(); i++) {
                System.out.print(respuesta.charAt(i));
            }
            System.out.print("\n}");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}