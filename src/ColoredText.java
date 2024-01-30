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
    public static final String ORANGE = "\u001B[38;5;208m";
    public static final String PURPLE = "\u001B[38;5;135m";
    public static final String PINK = "\u001B[38;5;205m";
    public static final String BROWN = "\u001B[38;5;130m";
    public static final String GRAY = "\u001B[38;5;240m";
    
    // Colores de fondo
    public static final String BLACK_BACKGROUND = "\u001B[40m";
    public static final String RED_BACKGROUND = "\u001B[41m";
    public static final String GREEN_BACKGROUND = "\u001B[42m";
    public static final String YELLOW_BACKGROUND = "\u001B[43m";
    public static final String BLUE_BACKGROUND = "\u001B[44m";
    public static final String MAGENTA_BACKGROUND = "\u001B[45m";
    public static final String CYAN_BACKGROUND = "\u001B[46m";
    public static final String WHITE_BACKGROUND = "\u001B[47m";
    public static final String ORANGE_BACKGROUND = "\u001B[48;5;208m";
    public static final String PURPLE_BACKGROUND = "\u001B[48;5;135m";
    public static final String PINK_BACKGROUND = "\u001B[48;5;205m";
    public static final String BROWN_BACKGROUND = "\u001B[48;5;130m";
    public static final String GRAY_BACKGROUND = "\u001B[48;5;240m";

    public static void main(String[] args) {
        //Impresion de texto en diferentes colores
        System.out.println("\t" + aplicarColor("Texto en rojo", RED));
        System.out.println("\t" + aplicarColor("Texto en verde", GREEN));
        System.out.println("\t" + aplicarColor("Texto en amarillo", YELLOW));
        System.out.println("\t" + aplicarColor("Texto en azul", BLUE));
        System.out.println("\t" + aplicarColor("Texto en magenta", MAGENTA));
        System.out.println("\t" + aplicarColor("Texto en cyan", CYAN));
        System.out.println("\t" + aplicarColor("Texto en blanco", WHITE));
        System.out.println("\t" + aplicarColor("Texto en naranja", ORANGE));
        System.out.println("\t" + aplicarColor("Texto en purpura", PURPLE));
        System.out.println("\t" + aplicarColor("Texto en rosado", PINK));
        System.out.println("\t" + aplicarColor("Texto en cafe", BROWN));
        System.out.println("\t" + aplicarColor("Texto en gris", GRAY)+"\n");
        //Impresion de texto con color de fondo
        System.out.println("\t" + aplicarBackgroundColor("Texto con fondo rojo", RED_BACKGROUND));
        System.out.println("\t" + aplicarBackgroundColor("Texto con fondo en verde", GREEN_BACKGROUND));
        System.out.println("\t" + aplicarBackgroundColor("Texto con fondo en amarillo", YELLOW_BACKGROUND));
        System.out.println("\t" + aplicarBackgroundColor("Texto con fondo en azul", BLUE_BACKGROUND));
        System.out.println("\t" + aplicarBackgroundColor("Texto con fondo en magenta", MAGENTA_BACKGROUND));
        System.out.println("\t" + aplicarBackgroundColor("Texto con fondo en cyan", CYAN_BACKGROUND));
        System.out.println("\t" + aplicarBackgroundColor("Texto con fondo en blanco", WHITE_BACKGROUND));
        System.out.println("\t" + aplicarBackgroundColor("Texto con fondo en naranja", ORANGE_BACKGROUND));
        System.out.println("\t" + aplicarBackgroundColor("Texto con fondo en purpura", PURPLE_BACKGROUND));
        System.out.println("\t" + aplicarBackgroundColor("Texto con fondo en rosado", PINK_BACKGROUND));
        System.out.println("\t" + aplicarBackgroundColor("Texto con fondo en cafe", BROWN_BACKGROUND));
        System.out.println("\t" + aplicarBackgroundColor("Texto con fondo en gris", GRAY_BACKGROUND) + "\n");
        //Impresion de texto con color de texto y fondo
        System.out.println("\t"+aplicarColorCompleto("Texto con fondo verde y letras rojas", RED, GREEN_BACKGROUND));
        System.out.println("\t"+aplicarColorCompleto("Texto con fondo azul y letras azules", BLUE, BLUE_BACKGROUND));
        System.out.println("\t"+aplicarColorCompleto("Texto con fondo azul y letras naranjas", ORANGE, BLUE_BACKGROUND));
        System.out.println("\t"+aplicarColorCompleto("Texto con fondo amarillo y letras azules", BLUE, YELLOW_BACKGROUND));
    }
    
    /**
     * Este metodo aplica color al fondo y al texto segun lo deseado, pero no es valido en todas las funcionalidades
     * @param text texto a editar
     * @param textColor
     * @param backgroundColor
     * @return texto editado con el color y fondo deseado
     */
    private static String aplicarColorCompleto(String text, String textColor,String backgroundColor ) {
        return  backgroundColor + textColor + text + RESET;
    }

    /**
     * Este metodo aplica un color de fondo deseado al texto utilizando codigo ANSI
     * @param text
     * @param backgroundColor
     * @return cadena con un color de fondo deseado
     */
    public static String aplicarBackgroundColor(String text, String backgroundColor) {
        return backgroundColor + text + RESET;
    }

    /**
     * Este metodo aplica un color deseado al texto utilizando codigo ANSI
     * @param text
     * @param color
     * @return cadena con un color de texto deseado
     */
    public static String aplicarColor(String text, String color) {
        return color + text + RESET;
    }

}

