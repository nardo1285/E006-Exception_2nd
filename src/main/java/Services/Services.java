package Services;

import Entities.Person;
import java.util.Scanner;

public class Services {

  Scanner read = new Scanner(System.in).useDelimiter("\n");

//• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
//al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
//Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
//O. Si no es correcto se deberá mostrar un mensaje

  /*this.name = name;
    this.age = age;
    this.sex = sex;
    this.weight = weight;
    this.height = height;*/


  public Person createPerson() {

    Person person = new Person();

    System.out.println(
        "Usted está a punto de cargar los datos de una nueva persona en el sistema" + "\n"
            + "Por favor ingrese los datos solicitados a continuación:");

    //CARGA DEL NOMBRE
    System.out.println("01 - Nombre de la persona: ");
    person.setName(read.next());

    //CARGA DE LA EDAD
    System.out.println("02 - Ingrese la edad: ");
    person.setAge(read.nextInt());

    //CARGA DEL SEXO
    System.out.println("03 - Seleccione M o F para el sexo: ");
    char aux = read.next().toUpperCase().charAt(0);

    while (aux != 'M' && aux != 'F') {
      System.out.println("Ingresó mal la letra, por favor seleccione M o F para el sexo: ");
      aux = read.next().toUpperCase().charAt(0);
    }
    person.setSex(aux);

    //CARGA DEL PESO [000.00]
    System.out.println("04 - Ingrese el peso en [000.00 kg]");
    person.setWeight(read.nextDouble());

    //CARGA DE LA ALTURA [000.00]
    System.out.println("05 - Ingrese la altura en [0.00 m]");
    person.setHeight(read.nextDouble());
  }


}

