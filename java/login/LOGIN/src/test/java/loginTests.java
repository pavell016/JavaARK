import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.sql.Connection;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class loginTests {

    @BeforeAll
    static void setUp(){
        /*
        when(mockFactory.getConnection(anyString(), anyString(), anyString()))
                .thenReturn(mockConnection);

        // Act
        Connection conn = mockFactory.getConnection("jdbc:mysql://localhost:3306/db", "root", "");

        // Assert
        verify(mockFactory).getConnection("jdbc:mysql://localhost:3306/db", "root", "");
        assert conn != null;
        
         */
    }
    @Test
    void Connect("jdbc:mysql://localhost:3306/login_users","root",""){

    }

}
