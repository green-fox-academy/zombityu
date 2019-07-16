package zoo;

public class Reptile extends Animal implements EggPlanter{


  protected Reptile(String name) {
    super(name);
  }

  @Override
  protected String getName() {
    return super.name;
  }

  @Override
  protected String breed() {
    return eggPlanter;
  }

  @Override
  protected String eat() {
    return null;
  }

  @Override
  protected String drink() {
    return null;
  }


}
