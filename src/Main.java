public class Main {
    public static void main(String[] args) {

      Cow cow1 = new Cow(490,5,"heifer - female of cow", "Rosy");
      Cow cow2 = new Cow(420,3,"heifer - female of cow", "Zoya");
      Cow cow3 = new Cow(370,2,"heifer - female of cow", "Rosi");
      Cow cow4 = new Cow(700,7,"heifer - female of cow", "Elfi");
      Cow cow5 = new Cow(550,6,"heifer - female of cow", "Amy");
      Sheep sheep1 = new Sheep(60, 4, "ewe - female", "Molly");
      Sheep sheep2 = new Sheep(45, 3, "ewe - female", "Silly");
      Sheep sheep3 = new Sheep(15, 1, "ewe - female", "Lulu");
      Horse horse1 = new Horse(300, 7, "stallion - male", "Spirit");
      Horse horse2 = new Horse(600, 8, "stallion - male", "Leo");


      Cow [] cows = {cow1, cow2, cow3, cow4, cow5};
      Sheep [] sheeps = {sheep1, sheep2, sheep3};
      Horse [] horses = {horse1, horse2};
      Farm farm1 = new Farm(cows, sheeps, horses, "Farm1");
      System.out.println(farm1);

      System.out.println("*****************************************************************************************");

      Cow [] cow = {cow5};
      Sheep [] sheep = {sheep1};
      Horse [] horse = {horse1};
      Farm farm2 = new Farm(cow, sheep, horse, "Farm2");
      System.out.println(farm2);






    }
}