package students;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Generates reply based on random selection from the initial list of replies
 *
 * @author Anna Khasanova
 */
public class AnswerGenerator {

    private static final List<String> answers = new ArrayList<String>() {
        {
            add("Конечно! Что за вопрос!");
            add("Хмм... ну попробуй....");
            add("Я бы не советовал, но решать тебе.");
            add("Можно, но ооочень осторожно");
            add("И думать забудь!");
            add("Ваш вопрос уже отправлен в ФСБ. Ждите, за вами выехали.");
        }
    };

    public static String generateReply() {
        final Random random = new Random();
        final int selected = random.nextInt(answers.size());
        return answers.get(selected);
    }
}
