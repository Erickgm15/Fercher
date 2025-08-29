package Control;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;



public class TiendaFercher {
    
    public static String obtenerProductos (String urlApi){
        //Crea un String (texto) con más opciones
        StringBuilder resultado = new StringBuilder();
        //Pbjeto para crear una conexion Http
        HttpURLConnection conexion = null;
        
        try{

            //Convierte un String a un Url
            URL url = new URL("https://jsonplaceholder.typicode.com/posts//99");

            //Configuracion para la conexion Http
            conexion = (HttpURLConnection) url.openConnection();
            conexion.setRequestMethod("GET");
            conexion.setConnectTimeout(5000);
            conexion.setReadTimeout((5000));
            conexion.connect();


            //Verficar respuesta del servidor
            int code = conexion.getResponseCode();
            System.out.println(code);

            try (BufferedReader br = new BufferedReader(new InputStreamReader(conexion.getInputStream(),StandardCharsets.UTF_8))
            ){
                String linea;
                while ((linea = br.readLine()) != null ) {
                    resultado.append(linea).append('\n');
                }
            }

        }


        catch (Exception e){
            System.out.println("Error" + e);
        }
        
        return resultado.toString();
 }


}