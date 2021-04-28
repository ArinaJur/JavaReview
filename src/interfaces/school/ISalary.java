package interfaces.school;

public interface ISalary {

    int BASE_HOURS_SET = 18;
    int TEACHER_COUNSELOR = 1;
    int TEACHER_TUTOR = 2;
    double FOR_TC_PER_WEEK = 50;
    double HOURLY_WAGE_PER_TEACHER = 40;

    double getBaseSalary();
    double getSalaryPerMonth();
    double getSalary();

    default double getTaxesPerMonth() {
        return getSalaryPerMonth() * 30/100;
    };
}

// обычная рабочая неделя = 40
// 2 ставки = 36 часов , 1,5 ставки = 27 часов, 0.5 ставки = 9 часов
// классный руководитель + $50;

