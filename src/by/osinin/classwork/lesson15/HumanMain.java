package by.osinin.classwork.lesson15;

import java.util.Optional;

public class HumanMain {
    public static void main(String[] args) {
        Human human = new Human("Man", 10);
        Human father = new Human("Father", 40);
        Human mother = new Human("Mother", 35);
        Human anonim = new Human(null, 50);
        human.setFather(father); //присваеваем хуману отец
        human.setMother(mother); //присваеваем хуману мама
        System.out.println(human);
        System.out.println(anonim);
        System.out.println(human.getFather().getName()); //узнаем имя отца
        System.out.println(anonim.getName()); //узнать имя анонима
       // System.out.println(human.getFather().getFather().getName());
        if (human.getFather() != null &&
                human.getFather().getFather() != null &&
                human.getFather().getFather().getName() != null) {
            System.out.println(human.getFather().getFather().getName());
        } else {
            System.out.println("unknow name");
        }

        Optional<Human> fartherOpt = Optional.ofNullable(anonim.getFather());
        if (fartherOpt.isPresent()) {
            System.out.println(fartherOpt.get().getName());
        }

        fartherOpt.ifPresent(f -> System.out.println(f.getName()));
        //Human possibleFather = fartherOpt.orElseThrow();
        // Human possibleFather = fartherOpt.orElseThrow(() -> new RuntimeException("Here"));
        fartherOpt.ifPresentOrElse(fOpt -> System.out.println(fOpt.getName()),
                ()-> System.out.println("Anonim"));

        Human protector = new Human ("Prot", 100);
        Human ourDef = fartherOpt.orElse(protector);
        Optional.ofNullable(human.getFather()).orElse(getDefaultHuman());
        Optional.ofNullable(human.getFather()).orElseGet(() -> getDefaultHuman());

        fartherOpt.map(f -> f.getFather())
                .map(f-> f.getFather())
                .ifPresent(ded -> System.out.println(ded.getName()));

        Optional.ofNullable(human)
                .map(Human::getFather)
                .filter(f -> f.getName().startsWith("ab")) // f - this is father
                .ifPresent(f-> System.out.println(f));

        if (human.getFather() != null && human.getFather().getName() != null
        && human.getFather().getName().startsWith("ab")) {
            System.out.println(human.getFather());
        }

    }

    private static Human getDefaultHuman() {
        System.out.println("This is default human");
        return new Human("Prot", 100);
    }


}
