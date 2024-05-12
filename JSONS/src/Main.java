public class Main {
    public static void main(String[] args) {
       //JSON CON LUCHADORES DE LA WWE
        String jsonArrayString = "[" +
                "{" +
                "\"nombre\": \"John Cena\"," +
                "\"edad\": 44," +
                "\"casado\": true," +
                "\"hobbies\": [\"levantamiento de pesas\", \"actuación\", \"filantropía\"]" +
                "}," +
                "{" +
                "\"nombre\": \"The Rock\"," +
                "\"edad\": 49," +
                "\"casado\": false," +
                "\"hobbies\": [\"actuación\", \"producción\", \"fitness\"]" +
                "}" +
                "]";
        System.out.println(jsonArrayString);
    }
    //EJEMPLO DE JSON CON PELICULAS DE RYAN GOSLING
    String jsonArrayString = "[" +
            "{" +
            "\"nombre\": \"La La Land\"," +
            "\"año\": 2016," +
            "\"director\": \"Damien Chazelle\"," +
            "\"hobbies\": [\"actuación\", \"bailar\"]" +
            "}," +
            "{" +
            "\"nombre\": \"Drive\"," +
            "\"año\": 2011," +
            "\"director\": \"Nicolas Winding Refn\"," +
            "\"hobbies\": [\"actuación\", \"conducir\"]" +
            "}" +
            "]";
}
