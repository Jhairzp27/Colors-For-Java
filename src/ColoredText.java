public class ColoredText {

    // Reset
    public static final String RESET = "\u001B[0m";

    // Colores del texto
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String MAGENTA = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    // Colores de fondo
    public static final String BLACK_BACKGROUND = "\u001B[40m";
    public static final String RED_BACKGROUND = "\u001B[41m";
    public static final String GREEN_BACKGROUND = "\u001B[42m";
    public static final String YELLOW_BACKGROUND = "\u001B[43m";
    public static final String BLUE_BACKGROUND = "\u001B[44m";
    public static final String MAGENTA_BACKGROUND = "\u001B[45m";
    public static final String CYAN_BACKGROUND = "\u001B[46m";
    public static final String WHITE_BACKGROUND = "\u001B[47m";

    // Colores adicionales del texto
    public static final String ORANGE = "\u001B[38;5;208m";
    public static final String PURPLE = "\u001B[38;5;135m";
    public static final String PINK = "\u001B[38;5;205m";
    public static final String BROWN = "\u001B[38;5;130m";
    public static final String GRAY = "\u001B[38;5;240m";

    // Colores adicionales de fondo
    public static final String ORANGE_BACKGROUND = "\u001B[48;5;208m";
    public static final String PURPLE_BACKGROUND = "\u001B[48;5;135m";
    public static final String PINK_BACKGROUND = "\u001B[48;5;205m";
    public static final String BROWN_BACKGROUND = "\u001B[48;5;130m";
    public static final String GRAY_BACKGROUND = "\u001B[48;5;240m";

    public static void main(String[] args) {
        // Ejemplo de impresión de texto en naranja
        System.out.println(applyColor("Texto en ", ORANGE));

        // Ejemplo de impresión de fondo en morado y texto en amarillo
        System.out.println(applyBackgroundColor("Texto", ORANGE_BACKGROUND));
    }

    // Métodos para aplicar colores
    public static String applyColor(String text, String color) {
        return color + text + RESET;
    }

    public static String applyBackgroundColor(String text, String backgroundColor) {
        return backgroundColor + text + RESET;
    }
}

