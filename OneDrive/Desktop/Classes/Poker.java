public class Poker {
    private String name;
    private char gender;
    private double weight;
    private int rating;

public Poker(){
name="Felix Coetzee";
gender='M';
weight=52.5;
rating=1;

}
public Poker(String name,char gender,double weight,int rating){
    this.name=name;
    this.gender=gender;
    this.weight=weight;
    this.rating=rating;
}

public String getName(){
    return name;
}
public void  SetName(String name){
    this.name=name;
}
public char getGender(){
    return gender;
}
public void  SetGender(char gender){
    this.gender=gender;
}
 
public double getWeight(){
    return weight;
}

public void  setWeight(double weight){
    this.weight=weight;
}
public int getRating(){
    return rating;
}



public void  setRating(int rating){
    this.rating=rating;
}

public String toString(){
    String str;
    str="Name="+name+"\ngender="+gender+"\nweight="+weight+"\nrating="+rating;
    return str;
}
}



