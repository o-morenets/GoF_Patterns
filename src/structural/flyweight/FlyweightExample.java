package structural.flyweight;

import java.util.HashMap;

/**
 * Created by a-morenets (alexey.morenets@gmail.com) on 06.12.2016.
 */

/**
 * EnglishCharacter.java
 */
abstract class EnglishCharacter {
    protected char symbol;
    protected int width;
    protected int height;

    public void printCharacter() {
        System.out.println("Symbol = " + symbol + " Width = " + width + " Height = " + height);
    }
}

/**
 * CharacterA.java
 */
class CharacterA extends EnglishCharacter {
    public CharacterA() {
        symbol = 'A';
        width = 10;
        height = 20;
    }
}

/**
 * CharacterB.java
 */
class CharacterB extends EnglishCharacter {
    public CharacterB() {
        symbol = 'B';
        width = 20;
        height = 30;
    }
}

/**
 * CharacterC.java
 */
class CharacterC extends EnglishCharacter {
    public CharacterC() {
        symbol = 'C';
        width = 40;
        height = 50;
    }
}

/**
 * FlyweightFactory.java
 */
class FlyweightFactory {
    private HashMap<Integer, EnglishCharacter> characters = new HashMap<Integer, EnglishCharacter>();

    public EnglishCharacter getCharacter(int characterCode) {
        EnglishCharacter character = characters.get(new Integer(characterCode));
        if (character == null) {
            switch (characterCode) {
                case 1: {
                    character = new CharacterA();
                    break;
                }
                case 2: {
                    character = new CharacterB();
                    break;
                }
                case 3: {
                    character = new CharacterC();
                    break;
                }
            }
            characters.put(characterCode, character);
        }
        return character;
    }
}

/**
 * Класс, показывающий работу шаблона проектирования "Приспособленец".
 * FlyweightExample.java
 */
public class FlyweightExample {

    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        int[] characterCodes = {1, 2, 3};
        for (int nextCode : characterCodes) {
            EnglishCharacter character = factory.getCharacter(nextCode);
            character.printCharacter();
        }
    }

}