package CollectionsMethods;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Card[] cardArray = new Card[13];
        Card aceOfHearts = Card.getFaceCard(Card.Suit.HEART, 'A');
        Arrays.fill(cardArray, aceOfHearts);
        Card.printDeck(Arrays.asList(cardArray), "Aces of Hearts", 1);

        List<Card> cards = new ArrayList<>(52);
        Collections.fill(cards, aceOfHearts);
        System.out.println("--------ArrayList filled with Ace of Hearts using Collections.fill----------");
        // note that below prints an empty array because when creating a new ArrayList with
        // an initial capacity of 52, does not create the 52 elements to be populated, therefore
        // Collections.fill is attempting to fill an ArrayList with zero elements.
        System.out.println(cards);
        System.out.println("cards.size() = " + cards.size());

        List<Card> acesOfHearts = Collections.nCopies(13, aceOfHearts);
        System.out.println("----Printing Aces of Hearts after using Collections.nCopies----");
        Card.printDeck(acesOfHearts, "Aces of Hearts", 1);

        Card kingOfClubs = Card.getFaceCard(Card.Suit.CLUB, 'K');
        List<Card> kingsOfClubs = Collections.nCopies(13, kingOfClubs);
        System.out.println("----Printing Kings of Clubs after using Collections.nCopies----");
        Card.printDeck(kingsOfClubs, "KingsOfClubs", 1);

        Collections.addAll(cards, cardArray);
        Collections.addAll(cards, cardArray);
        Card.printDeck(cards, "Card Collection with Aces added", 2);

        Collections.copy(cards, kingsOfClubs);
        Card.printDeck(cards, "Card Collection with Kings copied", 2);

        cards = List.copyOf(kingsOfClubs);
        Card.printDeck(cards, "List Copy of Kings", 1);

        List<Card> deck = Card.getStandardDeck();
        Card.printDeck(deck);

        Collections.shuffle(deck);
        Card.printDeck(deck, "Shuffled Deck", 4);

        Collections.reverse(deck);
        Card.printDeck(deck, "Reversed previously shuffled Deck of Cards", 4);

        var sortingAlgorithm = Comparator.comparing(Card::rank)
                .thenComparing(Card::suit);
        Collections.sort(deck, sortingAlgorithm);
        Card.printDeck(deck, "Standard Deck sorted by rank, suit", 13);

        Collections.reverse(deck);
        Card.printDeck(deck, "sorted by rank, suit reversed:", 13);

        // note that after deck is reverse sorted above, the kings start at index 4 - 7.  The subList method is called
        // from index 4 - 8 which gets all the kings. When using subList, the ending index is not inclusive, so
        // we're really pulling 4 - 7).
        List<Card> kings = new ArrayList<>(deck.subList(4, 8));
        Card.printDeck(kings, "Kings in deck", 1);

        // same as above only pulling tens
        List<Card> tens = new ArrayList<>(deck.subList(16, 20));
        Card.printDeck(tens, "Tens in deck", 1);

        // if you want to search for the starting index of tens in the deck
        int subListIndex = Collections.indexOfSubList(deck, tens);
        System.out.println("sublist index for tens = " + subListIndex);
        // checks if list contains tens, result = true
        System.out.println("Contains = " + deck.containsAll(tens));

        // checks if deck has elements in common with tens
        // returns false if it does have elements in common, false if it doesn't.  The below returns false since
        // deck and tens have elements in common.
        boolean disjoint = Collections.disjoint(deck, tens);
        System.out.println("disjoint = " + disjoint);
        // the below returns true since tens and kings don't share elements in common.
        boolean disjoint2 = Collections.disjoint(tens, kings);
        System.out.println("disjoint2 = " + disjoint2);
    }
}
