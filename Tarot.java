import java.util.Scanner; // for user input in main
import java.util.ArrayList; // for arraylists

public class Tarot {
	private boolean major, upright;
	private ArrayList<String> romanNum, majorList, suitList;
	
	public Tarot() { // constructor
        major = true;
        upright = true;

        // initializes the private instance vars with diff lists describing the cards roman numeral, major arcana names, and suits
        romanNum = new ArrayList<>();
        String[] numerals = {"Ace", "I", "II", "III", "IV", "V", "VI", "VII", "VII", "IX", "X", "Page", "Knight", "Queen", "King"};
        for (String num : numerals) {
            romanNum.add(num);
        }

        majorList = new ArrayList<>();
        String[] majors = {"Fool", "Magician", "High Priestess", "Empress", "Hierophant", "Lovers", "Chariot", "Stength", "Hermit", "Wheel Of Fortune", "Justice", "Hanged Man", "Death", "Temperance", "Devil", "Tower", "Star", "Moon", "Sun", "Judgement", "World", "King of Swords", "Emperor", "Knight of Swords"};
        for (String maj : majors) {
            majorList.add(maj);
        }

        suitList = new ArrayList<>();
        String[] suits = {"Wands","Swords", "Cups", "Pentacles"};
        for (String s : suits) {
            suitList.add(s);
        }
	}

	public String pullingCard() {
        int majorMin = (int)(Math.random() * 100);// [0,99]
        int upDown = (int)(Math.random() * 2); // [0,1]
        
        // adding Math.random function to distinguish major versus minor cards
        if (majorMin < 28) {
            major = true;
        } 
        else {
            major = false;
        }

        // adding Math.random function to tell if card is pulled rightside up or upside down 
        if (upDown > 0) {
            upright = true;
        } 
        else {
            upright = false;
        }

        if (major == true) {
            //pulls out a random major card
            int pullMajor = (int)(Math.random() * 23); // [0,22] -> 23 strings in majorList
            String newCard = majorList.get(pullMajor);
            majorArcana(newCard); // prints info
            if (upright) {
                System.out.println("(Upright)");
            }
            else {
                System.out.println("(Reverse)");
            }
            return ""; 
        } 
        else {
            //pulls out a random roman numeral
            int pullRomanNum = (int)(Math.random() * 15); // [0,14] -> 15 strings in romanNum
            String newNum = romanNum.get(pullRomanNum);
            romanNum(newNum);

            // pulls out a random suit
            int pullSuit = (int)(Math.random() * 4); // [0,3] -> 4 strings in suitList
            String newSuit = suitList.get(pullSuit);
            cardSuit(newSuit);
            if (upright) {
                System.out.println("(Upright)");
            }
            else {
                System.out.println("(Reverse)");
            }
            return ""; 
        }
	}

	public void majorArcana(String pulledCard) { 
        //the conditional below prints out a description based on the card you pull

        if (pulledCard.equals("Fool")) {
            System.out.println("You pulled the Fool. This card represents new beginnings, spontaneity, and a free spirit.");
        } else if (pulledCard.equals("Magician")) {
            System.out.println("You pulled the Magician. This card symbolizes manifestation, resourcefulness, and power.");
        } else if (pulledCard.equals("High Priestess")) {
            System.out.println("You pulled the High Priestess. This card stands for intuition, mystery, and divine feminine energy.");
        } else if (pulledCard.equals("Empress")) {
            System.out.println("You pulled the Empress. This card represents abundance, nurturing, and fertility.");
        } else if (pulledCard.equals("Emperor")) {
            System.out.println("You pulled the Emperor. This card symbolizes authority, structure, and stability.");
        } else if (pulledCard.equals("Hierophant")) {
            System.out.println("You pulled the Hierophant. This card stands for tradition, spiritual wisdom, and conformity.");
        } else if (pulledCard.equals("Lovers")) {
            System.out.println("You pulled the Lovers. This card represents love, harmony, and partnerships.");
        } else if (pulledCard.equals("Chariot")) {
            System.out.println("You pulled the Chariot. This card symbolizes control, willpower, and victory.");
        } else if (pulledCard.equals("Strength")) {
            System.out.println("You pulled Strength. This card represents courage, inner strength, and determination.");
        } else if (pulledCard.equals("Hermit")) {
            System.out.println("You pulled the Hermit. This card symbolizes introspection, solitude, and inner guidance.");
        } else if (pulledCard.equals("Wheel of Fortune")) {
            System.out.println("You pulled the Wheel of Fortune. This card represents fate, karma, and cycles of life.");
        } else if (pulledCard.equals("Justice")) {
            System.out.println("You pulled Justice. This card symbolizes fairness, truth, and law.");
        } else if (pulledCard.equals("Hanged Man")) {
            System.out.println("You pulled the Hanged Man. This card stands for letting go, new perspectives, and surrender.");
        } else if (pulledCard.equals("Death")) {
            System.out.println("You pulled Death. This card represents transformation, endings, and new beginnings.");
        } else if (pulledCard.equals("Temperance")) {
            System.out.println("You pulled Temperance. This card symbolizes balance, moderation, and patience.");
        } else if (pulledCard.equals("Devil")) {
            System.out.println("You pulled the Devil. This card stands for temptation, addiction, and materialism.");
        } else if (pulledCard.equals("Tower")) {
            System.out.println("You pulled the Tower. This card represents sudden change, upheaval, and revelation.");
        } else if (pulledCard.equals("Star")) {
            System.out.println("You pulled the Star. This card symbolizes hope, inspiration, and serenity.");
        } else if (pulledCard.equals("Moon")) {
            System.out.println("You pulled the Moon. This card stands for illusion, fear, and the subconscious.");
        } else if (pulledCard.equals("Sun")) {
            System.out.println("You pulled the Sun. This card represents positivity, fun, and success.");
        } else if (pulledCard.equals("Judgement")) {
            System.out.println("You pulled Judgement. This card symbolizes reflection, reckoning, and awakening.");
        } else if (pulledCard.equals("World")) {
            System.out.println("You pulled the World. This card stands for completion, achievement, and fulfillment.");
        } else {
            System.out.println("Card not recognized.");
        }	
    }
	
    public void romanNum(String num){
        // the conditional below prints a description for the Card rank you pull

        if (num.equals("Ace")) {
            System.out.println("You pulled the Ace. This symbolizes pure potential, beginnings, and the seed of something new.");
        } else if (num.equals("I")) {
            System.out.println("You pulled a Minor Arcana with Roman Numeral I. This symbolizes new beginnings, potential, and a spark of energy.");
        } else if (num.equals("II")) {
            System.out.println("You pulled a Minor Arcana with Roman Numeral II. This symbolizes balance, duality, and decision-making.");
        } else if (num.equals("III")) {
            System.out.println("You pulled a Minor Arcana with Roman Numeral III. This symbolizes growth, collaboration, and creation.");
        } else if (num.equals("IV")) {
            System.out.println("You pulled a Minor Arcana with Roman Numeral IV. This symbolizes stability, structure, and rest.");
        } else if (num.equals("V")) {
            System.out.println("You pulled a Minor Arcana with Roman Numeral V. This symbolizes conflict, change, and challenge.");
        } else if (num.equals("VI")) {
            System.out.println("You pulled a Minor Arcana with Roman Numeral VI. This symbolizes harmony, victory, and generosity.");
        } else if (num.equals("VII")) {
            System.out.println("You pulled a Minor Arcana with Roman Numeral VII. This symbolizes perseverance, reflection, and reevaluation.");
        } else if (num.equals("VIII")) {
            System.out.println("You pulled a Minor Arcana with Roman Numeral VIII. This symbolizes movement, mastery, and progress.");
        } else if (num.equals("IX")) {
            System.out.println("You pulled a Minor Arcana with Roman Numeral IX. This symbolizes fulfillment, solitude, and nearing completion.");
        } else if (num.equals("X")) {
            System.out.println("You pulled a Minor Arcana with Roman Numeral X. This symbolizes endings, culmination, and completion of a cycle.");
        } else if (num.equals("Page")) {
            System.out.println("You pulled the Page. This symbolizes youthful energy, curiosity, and messages or beginnings in learning.");
        } else if (num.equals("Knight")) {
            System.out.println("You pulled the Knight. This symbolizes action, movement, pursuit of goals, and dedication.");
        } else if (num.equals("Queen")) {
            System.out.println("You pulled the Queen. This symbolizes nurturing mastery, emotional intelligence, and mature feminine energy.");
        } else if (num.equals("King")) {
            System.out.println("You pulled the King. This symbolizes leadership, authority, mastery, and mature masculine energy.");
        } else {
            System.out.println("Card not recognized.");
        }
	}

    public void cardSuit(String suit){

        //the conditionals below describe the suit behavior of the pulled card
        if (suit.equals("Wands")) {
            System.out.print("You pulled a Minor Arcana card from the suit of Wands.");
            System.out.println(" Wands represent creativity, passion, inspiration, ambition, and taking action.");
        } else if (suit.equals("Cups")) {
            System.out.print("You pulled a Minor Arcana card from the suit of Cups.");
            System.out.println(" Cups represent emotions, intuition, relationships, and the subconscious.");
        } else if (suit.equals("Swords")) {
            System.out.print("You pulled a Minor Arcana card from the suit of Swords.");
            System.out.println(" Swords represent intellect, communication, truth, conflict, and decisions.");
        } else if (suit.equals("Pentacles")) {
            System.out.print("You pulled a Minor Arcana card from the suit of Pentacles.");
            System.out.println(" Pentacles represent the material world: finances, work, health, and physical reality.");
        } else {
            System.out.println("Suit not recognized.");
        }
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Tarot Card Reader! Before we begin, what is your name?");
        String name = input.nextLine();

        System.out.println("Are you familiar with Tarot, " + name + "? (Yes/No)");
        String familiar = input.nextLine();
        if (familiar.toLowerCase().equals("yes") || familiar.toLowerCase().equals("y")) {
            System.out.println("Great! In this Tarot reading, we will be drawing 3 standard Tarot cards.");
        }
        else {
            System.out.println("Tarot is a system of 78 cards used to for divination and fortune telling. The cards are split into Major Arcana (broad, significant experiences) and Minor Arcana (detailed, immediate experiences). Minor Arcana is further organized into roman numerals and suits. Both types have a chance to be reversed, meaning its qualities are diminished, undeveloped, or blocked.");
        }

        System.out.println("Now, we shall begin. Let us look into your future, " + name + "...");

        Tarot tarot = new Tarot();

        System.out.print("First, ");
        tarot.pullingCard();

        System.out.print("Second, ");
        tarot.pullingCard();

        System.out.print("Third, ");
        tarot.pullingCard();

        input.close();
    }
}