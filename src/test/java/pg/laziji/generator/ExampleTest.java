package pg.laziji.generator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import pg.laziji.generator.constant.KeyConsts;
import pg.laziji.generator.model.TableItem;
import pg.laziji.generator.service.GeneratorService;

import javax.annotation.Resource;

@ActiveProfiles("postgresql")
@RunWith(SpringRunner.class)
@SpringBootTest
public class ExampleTest {

    @Resource
    private GeneratorService generatorService;

    @Test
    public void test() {
        TableItem tableName1 = TableItem.newBuilder().tableName("table1").dynamicPathVariable(KeyConsts.CLASS_NAME, "TableA").build();
        TableItem tableName2 = new TableItem("device");
        TableItem[] tableNames = new TableItem[]{tableName2};
        generatorService.generateZip(tableNames, "./output/device.zip");
    }
}
