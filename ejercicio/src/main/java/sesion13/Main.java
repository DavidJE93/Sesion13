package sesion13;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Jesus", "Gutierrrez Perez", "j@gmail.com", 10);

        Gson gson = new Gson();
        String json = gson.toJson(p);
        System.out.println(json);
    }
}