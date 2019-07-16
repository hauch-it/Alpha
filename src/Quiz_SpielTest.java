import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Quiz_SpielTest extends Quiz_Spiel {

  @Test
  void main() {

    try{
      Quiz_Spiel window = new Quiz_Spiel();
    }catch(Exception e){
        System.out.println(e.toString());
    }


  }

  @Test
  void actionPerformed() {
    if(textfield_4.getText().startsWith("C")  || textfield_4.getText().startsWith("c") ){
      System.out.println("Richtig");
    }else{
      System.out.println("Falsch gedrückt");

    }





  }
}