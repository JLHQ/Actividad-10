package actividad8cenjava;

/**
 *
 * @author Luis_
 */
public class Card {
    
    public enum Suit{
        Spades, Hearts, Clubs, Diamonds
    }
    public enum Color{
        Black, Red
    }
    public enum Value{
        Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Ace, Jack, Queen, King
    }
    
    private Suit suit;
    private Color color;
    private Value value;
    
    public Card(Suit palo, Color color, Value valor) {
        this.suit = palo;
        this.color = color;
        this.value = valor;
    }
     
    @Override
    public String toString(){
        return "{" + this.suit + "},{"
        + this.color + "},{" + this.value
        + "}";
    }
}
