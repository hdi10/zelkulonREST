package com.zelkulon.zelkulonREST.productcontrollersmoketests;



import com.zelkulon.zelkulonREST.core.domain.service.interfaces.WarehouseRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@ActiveProfiles("test")
@SpringBootTest
@AutoConfigureMockMvc
public class SmartphoneControllerTestsuite {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private WarehouseRepository warehouseRepository;

    /**
     * Test if a get on /smartphones returns statuscode 200 = OK
     * @throws Exception
     */
    @Test
    void  gutTest1() throws Exception {

        RequestBuilder request = MockMvcRequestBuilders.get("/smartphones");
        MvcResult result = this.mockMvc.perform(request).andReturn();
        assert  result.getResponse().getStatus() == 200;

    }

}
