public class Character {
    String characterName, characterType;
    int hitpoints;

    public Character(){
        characterName = "";
        characterType = "";
        hitpoints = -1;
    }

    public Character(String characterName, String characterType, int hitpoints){
        this.characterName = characterName;
        this.characterType = characterType;
        this.hitpoints = hitpoints;
    }

    public Character(Character character){
        this.characterName = character.getCharacterName();
        this.characterType = character.getCharacterType();
        this.hitpoints = character.getHitpoints();
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getCharacterType() {
        return characterType;
    }

    public void setCharacterType(String chatacterType) {
        this.characterType = chatacterType;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }
}
