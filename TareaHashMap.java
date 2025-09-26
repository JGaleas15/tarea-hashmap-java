/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
import java.util.HashMap;

public class TareaHashMap {

    public static void main(String[] args) {
        HashMap<String, Object> informacionPersonal = new HashMap<>();
        informacionPersonal.put("nombre", "Jefferson Galeas Salazar");
        informacionPersonal.put("edad",30);
        informacionPersonal.put("ciudad", "Lago Agrio");
        informacionPersonal.put("ciudad", "Lago Agrio");
        informacionPersonal.put("profesion", "Estudiante");
        if (!informacionPersonal.containsKey("telefono")) {
            informacionPersonal.putIfAbsent("telefono", "0999521111");
        }
        informacionPersonal.remove("edad");
        System.out.println("Contenido final del HashMap:");
        for (String clave : informacionPersonal.keySet()) {
            System.out.println(clave + ": " + informacionPersonal.get(clave));
        }
    }
}
