import com.amazonaws.codesamples.Application;
import com.amazonaws.codesamples.user.User;
import com.amazonaws.codesamples.user.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest(classes = Application.class)
public class UserRepositoryTests {

    @Autowired
    private UserRepository sut;

    @Test
    public void select(){

        List<User> result = sut.findAll();

        System.out.println(result.size());
    }

}
