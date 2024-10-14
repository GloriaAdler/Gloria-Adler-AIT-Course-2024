Тренировка заполнения полей
 
- компания (Company)
private String name; - если название компании
private long/int id; - если компания есть в каком-либо реестре.
                       long - примет только цифры, но если номер содержит в начале нули, они будут отброшены/int-примет все цифры
private String type; 
private int numberOfEmployee;
private double turnover;

- дерево (Tree)
private String id;
private String type;
private int age;
private String area;
private double height;

- здание (Building)
private String number;
private boolean type;
private int floors;
private int age;
private double price;

- письмо (Letter)
private String recipient;
private double weight;
private String type;
private boolean isConfirmed;
private double costOfDelivery;

- пользователь (User)
private String name;
private String password;
private String email;
private LocalDate birthDay; - LocalDate - особый класс в джаве, для дат.
private boolean gender; - но boolean, только если стандартное М и Ж