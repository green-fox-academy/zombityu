package Counter;

public class Counter {
    int number;
    int initialValue;


    Counter( int number){
       this.number = number;
       this.initialValue = number;
    }

    Counter (){
        number = 0;
    }

    void add (){
        number++;
    }

   void add (int addNumber){
       this.number = addNumber;
   }

   int get(){
       return number;
   }

   void reset(){
        this.number = this.initialValue;
   }

}
