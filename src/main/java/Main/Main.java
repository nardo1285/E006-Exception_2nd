package Main;

import Entities.ExceptionPerson;
import Entities.Person;
import Services.Services;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws ExceptionPerson {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    Services newService = new Services();

    //INICIO DEL SISTEMA
    System.out.println("SISTEMA DE CARGA DE PERSONAS");
    Person newPerson = newService.createPerson();

    System.out.println(newPerson.toString());

    //VERIFICACIÓN DE LA EDAD
    System.out.println("Verificación de la edad");
    if (newService.isOverAge(newPerson)) {
      System.out.println("Es mayor de edad");
    } else {
      System.out.println("Es menor de edad");
    }

  }
}
