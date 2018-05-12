import java.io.*;
import java.util.Scanner;

public class cowsay{

public static void main(String args[]){
  //scan(args[0]);
  String quote="";
  String quoteLine = "    \\\n" +
  "     \\\n" +
  "      \\";

  for(int i = 2; i < args.length; i++)
  {
    quote+=args[i]+" ";
  }
  if (args.length < 1){
    System.out.println("No input");
  }
  else{

  switch(args[0]){
  case "-l":
    System.out.print("Cows available: \ncow kitty moose turkey tux" + "\n");
    break;

  case "-f":
       if(args.length < 2){
         System.out.println("No filename given.");
       }
       else{

      switch(args[1]){

      case " ":
        System.out.println("No filename given.");
        break;

      case "cow":
        System.out.println(quote+"\n" + quoteLine);
        scan("cow.cow");
        break;

      case "kitty":
        System.out.println(quote+"\n" + quoteLine);
        scan("kitty.cow");
        break;

      case "moose":
        System.out.println(quote+"\n" + quoteLine);
        scan("moose.cow");
        break;

      case "turkey":
        System.out.println(quote+"\n" + quoteLine);
        scan("turkey.cow");
        break;

      case "turtle":
        System.out.println(quote+"\n" + quoteLine);
        scan("turtle.cow");
        break;

      case "tux":
        System.out.println(quote+"\n" + quoteLine);
        scan("tux.cow");
        break;

      default:
        System.out.println("Could not find "+args[1]+" cow!");
        break;
      }
    }

      break;

    default:
    String temp2="";
    for(int j = 0; j < args.length; j++)
    {
      temp2+=args[j]+" ";
    }
    System.out.println(temp2+"\n" + quoteLine);
    scan("cow.cow");
    break;
  }
}
}


public static void scan (String args){

  File myFile = new File(args);

  String body = "";
  String lines = "\n";

  try{
    Scanner scan = new Scanner(myFile);

    while(scan.hasNextLine()){
      body = scan.nextLine();
      System.out.print(body + lines);
    }
    scan.close();
  }
  catch (IOException ee){
    return;
  }
}
}
