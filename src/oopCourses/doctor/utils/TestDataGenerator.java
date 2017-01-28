package oopCourses.doctor.utils;

/*import oopCourses.doctor.CityDistricts;
import oopCourses.doctor.Clinic;
import oopCourses.doctor.Doctor;
import oopCourses.doctor.Specialization;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static oopCourses.doctor.CityDistricts.getDistrictByCode;
import static oopCourses.doctor.Specialization.getSpecializationByCode;

public class TestDataGenerator {

    static List<String> names = Arrays.asList(
            "Стояна", "Мацал", "Хельга", "Маразмус", "Поджог", "Ушат", "Бидон", "Захват", "Рулон",
            "Букет", "Рекорд", "Залог", "Исход", "Люк", "Побег", "Парад", "Подрыв", "Полив", "Разгон", "Разгул",
            "Распил", "Удел", "Улов", "Газон", "Вагон", "Ашот", "Авас", "Гиви", "Гоги", "Коти", "Яйцеслав", "Арен", "Накатика",
            "Мояхата", "Томимо", "Тояма", "Джава", "Бибик", "Боян", "Гвидон", "Гугуш", "Гус", "Джаханпахлаван", "Дурбан",
            "Евпсихий", "Калкаш", "Кикос", "Мирсадик", "Нусрат", "Перун", "Пулюр", "Ривчик", "Херман", "Чобан",
            "Мешок", "Подсуд", "Друган", "Рекорд", "Погром", "Учет", "Черед", "Карман", "Налог", "Квартет", "Тамбур", "Обед",
            "Поход", "Потоп", "Камаз", "Разрез", "Барак", "Запой", "Курган");

    static List<String> surnames = Arrays.asList(
            "Такаев", "Сыроватаев", "Токосаев", "Пороялев", "Раков", "Забоев", "Вопросов", "Котиков", "Бестрескаев", "Наливаев",
            "Сараев", "Помоев", "Надоев", "Обоев", "Отстоев", "Успехов", "Помоев", "Изгоев", "Злодеев", "Устоев",
            "Прибоев", "Полетов", "Супругов", "Пикетов", "Налимов", "Плебеев", "Самшитов", "Козодоев", "Добегулиев",
            "Баранов", "Ковбоев", "Гамсалов", "Шариков", "Бабелов", "Мотузев", "Жуйводоев", "Шкраблюкоев", "Сипаев", "Сдоходов",
            "Хорметов", "Гасымов", "Абилов", "Хандурдиев", "Лалаев", "Дилбозов", "Азизов", "Дадашов", "Ломидзе", "Алмвердиев",
            "Алипанахов", "Бабаев", "Багиев", "Зингиров", "Лимонов", "Гобоев", "Допросов", "Морозов", "Гиббонов", "Гормонов",
            "Моллюсков", "Застоев", "Отбросов", "Батонов", "Фазанов", "Кошмаров", "Гусаров", "Гераклов"
    );

    static List<String> streets = Arrays.asList(
            "Ломоносова", "Тьмутараканская", "Тупиковая", "Последняя", "Кирпичная", "Декоммунизированная", "Гидности", "Седых", "Ровная", "Тарифная",
            "Бармалеева", "Боянова", "Банная", "Веселая", "Безымянная", "Перемоги", "Зрады", "Здобулыева", "Папередников", "Бибмы", "Шлеперов",
            "Валерчика", "Мемесовая", "Лурковая", "Конечная", "Стринговая", "Интовая", "Приватная", "Статичная", "Рандомная", "Панды", "Кастрюлевая",
            "Кислая", "Схронная", "Лалалаевская", "Попиисятная", "Шоколадная", "Братьев Кличко", "Гаврылюка", "Парасюка",
            "Шкиряка", "Абрикосовая", "Титушек", "Межигорьевая", "Мойданная", "Работунов", "Коммитная", "Релизная", "Тестовая", "Нулловая"
    );

    public static String getRandomName(){
        int index = new Random().nextInt(names.size());
        return names.get(index);
    }
    public static String getRandomSurname(){
        int index = new Random().nextInt(surnames.size());
        return surnames.get(index);
    }
    public static String getRandomAddress(){
        int index = new Random().nextInt(streets.size());
        return "Ул." + streets.get(index) + ", " + generateIntInRange(1, 200);
    }

    public static String getRandomClinicName(){
        return "Клиника проф. " +  (getRandomSurname() + "a").toUpperCase();
    }

    public static Specialization getRandomSpecialization(){
        Specialization minimalCode = Collections.min(Arrays.asList(Specialization.values()));
        Specialization maximalCode = Collections.max(Arrays.asList(Specialization.values()));

        int randomValidSpecializationCode = generateIntInRange(minimalCode.getSpecializationCode(), maximalCode.getSpecializationCode());
        return getSpecializationByCode(randomValidSpecializationCode);
    }

    public static CityDistricts getRandomDistrict(){
        CityDistricts minimalCode = Collections.min(Arrays.asList(CityDistricts.values()));
        CityDistricts maximalCode = Collections.max(Arrays.asList(CityDistricts.values()));

        int randomValidDistrictCode = generateIntInRange(minimalCode.getCityDistrictCode(), maximalCode.getCityDistrictCode());
        return getDistrictByCode(randomValidDistrictCode);
    }


    public static int generateIntInRange(int minimum, int maximum){
        Random rand = new Random();
        return  minimum + rand.nextInt((maximum - minimum) + 1);
    }

    public static Doctor getRandomDoctorWithSpecialization(Specialization specialization){
        return new Doctor(getRandomName(), getRandomSurname(), specialization);
    }
    public static Clinic getRandomClinicAtDistrict(CityDistricts district){
        return new Clinic(getRandomClinicName(), district, getRandomAddress());

    }
}*/
