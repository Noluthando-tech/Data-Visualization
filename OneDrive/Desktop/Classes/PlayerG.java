import java.util.*;
public class PlayerG{
   public static void main (String[]args){
      
      Scanner kb=new Scanner(System.in);
      
      
      int player=7;
      int game=4;
      
      String[]playersName=new String[player];
      int[][]goal = new int[player][game];
      
      for(int i=0;i<player;i++){
         System.out.println("Enter your name"+(i+1));
         playersName[i]=kb.nextLine();
         for(int x=0;x<game;x++){
         
            System.out.println("Enter the goal score"+(x+1));
            goal[i][x]=kb.nextInt();}
      }
      kb.nextLine();
      }
         int[]goalScored=new int[playersName];
         for(int i=0; i<player;i++){
            int totalGoals=0;
            for(int x=0;x<game;x++){
               totalGoals+=goals[i][x];
            }
            totalGoalsByPlayers[i]=totalGoals;
            }
            System.out.println("The goal scored is by each player is");
            for(int i=0;i<player;i++){
               System.out.println(playersName[x]+"goal");
            }     
         }
   
