/**
 * Class Cat
 * 
 * @author  Sergey Iryupin
 * @version 0.4 dated Mar 24, 2017
 */
class Cat extends Animal implements Swimable, Jumpable {
    private int swim_limit;
    private float jump_limit;

    Cat(String name) {
        this.name = name;
        super.run_limit = 100;
        swim_limit = 60;
        jump_limit = 2.8f;
    }

    @Override
    public String voice() {
        return "meow";
    }

    @Override
    public boolean swim(int length) {
        return swim_limit > length;
    }

    @Override
    public boolean jump(float height) {
        return jump_limit > height;
    }
}