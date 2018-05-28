package com.numismatics;

import com.numismatics.model.entity.Monety;
import com.numismatics.repository.MonetRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Eoller on 28-May-18.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RepositoryIntegrationTest {

    @Autowired
    private MonetRepository monetRepository;

    @Test
    public void shouldGetById(){
        Monety result = monetRepository.getOne(1);
        Assert.assertEquals(1, result.getId().intValue() );
    }
}
