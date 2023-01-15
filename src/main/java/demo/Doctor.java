package demo;


import org.springframework.stereotype.Component;

@Component
public class Doctor implements Staff {



    @Override
    public void display() {
        System.out.println("this is doctor class");
    }



}
