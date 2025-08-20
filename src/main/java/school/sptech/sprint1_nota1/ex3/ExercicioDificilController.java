package school.sptech.sprint1_nota1.ex3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioDificilController {

    @GetMapping("/ex-03/{n}")
    public ExercicioDificilResponse exercicioDificil(@PathVariable int n) {
        ExercicioDificilResponse numero = new ExercicioDificilResponse(0,0);


        int a = 0, b = 1;

        if (n <= 0) {
            return numero;
        }

        for (int i = 1; i <= n; i++){
            numero.enesimoTermo = b;
            numero.soma += numero.enesimoTermo;

            int proximo = a + b;
            a = b;
            b = proximo;
        }
        return numero;

    }
}
