public class Die {
    private int sides;

    public Die (int inSides) { 
        sides = inSides;
    }

    public int throwDie () { 
        return (int) ((Math.random() * sides) + 1);
    }

    public static void main (String[] args) {
        Die d1 = new Die (6);
        System.out.println(d1.throwDie());
    }
}
