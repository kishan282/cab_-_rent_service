package com.nks.unit;

import com.nks.admin_service.helper_utils.IdCreationLogicUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class IdCreationLogicUtilsTest {

    @InjectMocks
    private IdCreationLogicUtils idCreationLogic;

    @Test
    void testIdCreationLogic() {
        String id = idCreationLogic.idCreationLogic("kishan");
        System.out.println("Id generated: " + id);
        Assertions.assertNotNull(id);
    }
}
