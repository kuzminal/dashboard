package com.kuzmin.dasboard;

import com.kuzmin.dasboard.controller.CommentControllerTest;
import com.kuzmin.dasboard.repository.CommentRepoTest;
import com.kuzmin.dasboard.repository.UserRepoTest;
import com.kuzmin.dasboard.service.CommentServiceTest;
import com.kuzmin.dasboard.service.UserServiceTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@RunWith(Suite.class)
@Suite.SuiteClasses({CommentRepoTest.class, UserRepoTest.class,
        CommentControllerTest.class, CommentServiceTest.class, UserServiceTest.class})
class DasboardApplicationTests {
}
