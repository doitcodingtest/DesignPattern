public class Main {
    public static void main(String[] args) {
        Coffee espresoo = new BasicCoffee();
        System.out.println("에스프레소 구성: \t" + espresoo.add());

        Coffee americano = new Water(new BasicCoffee());
        System.out.println("아메리카노 구성: \t" + americano.add());

        Coffee cafeLatte = new Milk(new BasicCoffee());
        System.out.println("카페라떼 구성: \t" + cafeLatte.add());

        Coffee vanillaLatte = new Syrup(new Milk(new BasicCoffee()));
        System.out.println("바닐라 라떼 구성: \t" + vanillaLatte.add());

        Coffee decafAmericano = new Water(new Decaf(new BasicCoffee()));
        System.out.println("디카페인 구성: \t" + decafAmericano.add());

    }
}