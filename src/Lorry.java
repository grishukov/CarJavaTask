

class Lorry extends Car {        // производный класс Lorry, обратим внимание на слово extends и Car это показывает, что мы лорри становится дочерним классом и перенимает от родительского класса функционал
     private int loadCap;           // инициализируем переменную грузоподьемности, мы также ее добавили для возврата в описании Лорри ниже в скобках

    public Lorry(String mark, double weight, int hPower, int loadCap) {    // это штука между скобками нужна для работы программы, по сутит мы тут просто указываем что должны получать перменные из родительского класса,
        super(mark, weight, hPower);        // модификатор "супер" как раз и дает понять что забирать переменные мы будем из родительского класса
//        this.loadCap = loadCap;
    }

    public void setLoadCap(int loadCap) {           // переназначение - изменение - установка грузоподъемности

        this.loadCap = loadCap;
    }

    public int getLoadCap() {                       // так как сделали приватной грузоподъемность получать ее для вывод в другом месте, например в мэйн  классе нужно по этому методу get

        return this.loadCap;
    }

    public void setMark(String mark) {              //переазначение марки

        this.mark = mark;
    }

    public String getMark() {

        return this.mark;
    }



}
