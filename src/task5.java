Scanner scanner = new Scanner(System.in);
void main(){
  MainMenu();
}

void PerformCalculations(){
  System.out.println("Введите основание и высоту, разделяя их пробелом.");
  double a;
  double h;
  if (scanner.hasNextDouble()) {
    a = scanner.nextDouble();
    if (scanner.hasNextDouble()) {
      h = scanner.nextDouble();

      double s = a * h / 2;
      System.out.println("Площадь прямоугольного треугольника равна " + s);
    } else {
      System.out.println("Вы ввели не число (pos=2).");
    }

  } else {
    System.out.println("Вы ввели не число (pos=1).");
  }
}

void ChooseNextAction(int command) {
  String InfoProgMsg = "Данная программа вычисляет площадь прямоугольного треугольника";
  String InfoDevMsg = "Данная программа разработана в ходе практики по Современным Языкам Программирования.";

  switch (command){
    case 1:
      PerformCalculations();
      break;
    case 2:
      System.out.println(InfoProgMsg);
      break;
    case 3:
      System.out.println(InfoDevMsg);
      break;
    case -1:
      System.out.println("Выход из программы.");
      break;
    default:
      System.out.println("Неверная команда.");
  }
}

void MainMenu(){
  int command = 0;
  while (command != -1){
    System.out.println("Привет. Это программа для вычисления площади прямоугольного треугольника.");
    System.out.println("Введите команду:\n1 - Выполнить расчет\n2 - Информация о программе\n3 - Информация о разработчике\n-1 - Выход");
    command = scanner.nextInt();
    ChooseNextAction(command);
  }
}
