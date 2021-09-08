class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");

    //  blue 24%, brown 13%, green 16%, orange 20%, red 13%, and yellow 14%.

    int numberOfBags = 11;
    int candyPerBag = 55;
    double blue = .24;
    double brown = .13;
    double green = .16;
    double orange = .2;
    double red = .13;
    double yellow = .14;

    int total = numberOfBags * candyPerBag;

    double numberOfBlues = total * blue;
    double numberOfBrowns = total * brown;
    double numberOfGreens = total * green;
    double numberOfOranges = total * orange;
    double numberOfReds = total * red;
    double numberOfYellows = total * yellow;

    System.out.println("blue: " + numberOfBlues);
    System.out.println("brown: " + numberOfBrowns);
    System.out.println("Green: " + numberOfGreens);
    System.out.println("Orange: " + numberOfOranges);
    System.out.println("Red: " + numberOfReds);
    System.out.println("Yellow: " + numberOfYellows);

    double sumofcolors = (numberOfBlues + numberOfBrowns + numberOfGreens + numberOfOranges + numberOfReds + numberOfYellows);

    System.out.println("Sum: " + sumofcolors);

    if (numberOfBlues < numberOfReds && numberOfReds > numberOfOranges){
      System.out.println("Blue under Browns and Red over orange");
    }

    if(numberOfBrowns >= numberOfGreens){
      System.out.println("Brown is greater than or equal to Green");
    }

    if (sumofcolors == total){
      System.out.println("Numbers match");
    }
  }
}