package homework_30_28_10.to_do_list;
//Задача 2. Начать реализацию приложения "Список дел".
//Использовать enum для организации меню (номер пункта, действие) приложения:
//добавить задачу
//посмотреть все задачи
//удалить задачу (по номеру)
//выйти из меню
public enum ToDoList {

    ADD_TASK(1, "Add task"),  VIEW_TASKS(2, "View all tasks."),  DELETE_TASK(3, "Delete task."), EXIT(4, "Exit menu.");

    private int number;
    private String description;// description - описание

    ToDoList(int number, String description) {
        this.number = number;
        this.description = description;
    }

    public int getNumber() {
        return number;
    }
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ToDoList{");
        sb.append("number=").append(number);
        sb.append(", description='").append(description).append('\'');
        sb.append('}');
        return sb.toString();
    }

    // Метод для получения задачи по номеру
    public static ToDoList fromNumber(int number) {
        for (ToDoList option : ToDoList.values()) {
            if (option.getNumber() == number) {
                return option;
            }
        }
        return null;
    }

}//end of class
