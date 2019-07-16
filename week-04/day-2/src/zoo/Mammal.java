package zoo;

public class Mammal extends Animal {


  protected Mammal(String name) {
    super(name);
  }

  @Override
  protected String getName() {
    return this.name;
  }

  @Override
  protected String breed() {
    return "pushing miniature versions out.";
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
