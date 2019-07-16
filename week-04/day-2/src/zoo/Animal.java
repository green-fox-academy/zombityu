package zoo;

public abstract class Animal {
  String name;
  int age;
  String gender;

  protected Animal(String name) {
    this.name = name;

  }

  protected abstract String getName();
  protected abstract String breed();
  protected abstract String eat();
  protected abstract String drink();


}
