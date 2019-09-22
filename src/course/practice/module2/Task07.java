package course.practice.module2;

import java.math.MathContext;

/**
 * Написать программу для фабрики по производству зонтов:
 * которая расчитает площадь материала небходимого для изготовления одного зонта. Для изготовления
 * зонта используется материал в форме круга. Известено:
 *
 * @param diameter - диаметр зонта, который необходимо изготовить
 */
public class Task07 {
	public static void main(String[] args) {
		//FIXME
		// Переменные, которые можно изменять для проверки различных вариантов входных параметров
		int diameter = 10;

		// Код необходимый для тестирования, не изменять
		diameter = (args.length == 1) ? Integer.valueOf(args[0]) : diameter;

		//TODO
		// Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
		System.out.println(Math.pow (diameter / 2, 2) * Math.PI);
	}
}